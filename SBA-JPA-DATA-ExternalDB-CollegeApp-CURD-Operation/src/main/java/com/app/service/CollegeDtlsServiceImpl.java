/* Copyright (c) 2020,  KBM GROUP and/or its affiliates. All rights reserved.
 * KBM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * 
 * 
 * 
 * 
 * 
 */
package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.CollegeDtlsEntity;
import com.app.exception.CollgeDetailsNotFoundException;
import com.app.repositrory.CollegeDtlsRepository;

/**
 * 
 * @author AJIT KUMAR
 * @since 2020
 *
 */

@Service
public class CollegeDtlsServiceImpl implements CollegeDtlsService {

	@Autowired
	private CollegeDtlsRepository collegeRepository;

	/**
	 * 
	 * @param entity
	 * @see call The saveCollegeDetails Method
	 * @return If Records Are Inserted Then It Will Return True Other Wise It Will
	 *         Return False
	 */
	@Override
	public boolean saveCollegeDetails(CollegeDtlsEntity entity) {
		return collegeRepository.save(entity) != null;
	}

	/**
	 * 
	 * @param entity
	 * @see call The saveCollegeDetails Method
	 * @return If Records Are Updated Then It Will Return True Other Wise It Will
	 *         Return False
	 */
	@Override
	public boolean updateCollegeDetails(CollegeDtlsEntity entity) {
		return collegeRepository.save(entity) != null;
	}

	/**
	 * @see call The getAllCollegeDetails Methos
	 * @return If Records Are Existed Then It Will Return All Records
	 */
	@Override
	public List<CollegeDtlsEntity> getAllCollegeDetials() {
		List<CollegeDtlsEntity> collegeDetails = collegeRepository.findAll();
		if (collegeDetails == null) {
			throw new CollgeDetailsNotFoundException("College Details Are Not Found");
		}
		return collegeDetails;
	}

	/**
	 * @param collegeName
	 * @see call deleteById And Remove The College Details Based On College COde
	 */

	@Override
	public void removeCollegeDetailsByCode(String collegeCode) {
		collegeRepository.deleteById(collegeCode);
	}

	/**
	 * @param collegeName
	 * @see call getCollegeDetailsByCollegeName method
	 * @return it will return College Details Based On College Name
	 */
	@Override
	public List<CollegeDtlsEntity> getCollegeDetailsByCollegeName(String collgeName) {
		List<CollegeDtlsEntity> collgeDetals = collegeRepository.findByCollegeName(collgeName);
		if (collgeDetals == null) {
			throw new CollgeDetailsNotFoundException("Collge Details Are Not Found Please Try Another");
		}
		return collgeDetals;
	}

	/**
	 * @param collegeCode
	 * @see call getCollegeDetailsByCollegeCode method
	 * @return it will return College Details Based On College Code
	 */
	@Override
	public List<CollegeDtlsEntity> getCollegeDetailsByCollegeCode(String collgeCode) {
		List<CollegeDtlsEntity> collegeDetails = collegeRepository.findByCollegeCode(collgeCode);
		if (collegeDetails == null) {
			throw new CollgeDetailsNotFoundException("Collge Details Are Not Found Please Try Another");
		}
		return collegeDetails;
	}
	
	/**
	 * @param collegeLoc
	 * @see call getCollegeDetailsByCollegeLoc method
	 * @return it will return College Details Based On College Location
	 */
	@Override
	public List<CollegeDtlsEntity> getCollegeDetailsByCollegeLoc(String collegeLoc) {
		List<CollegeDtlsEntity> collegeDetails = collegeRepository.findByCollegeLoc(collegeLoc);
		if (collegeDetails == null) {
			throw new CollgeDetailsNotFoundException("Any Colleges Are Not Found In This Location");
		}
		return collegeDetails;	
	}
}