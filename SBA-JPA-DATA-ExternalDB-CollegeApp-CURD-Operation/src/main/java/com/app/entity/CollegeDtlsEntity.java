/* Copyright (c) 2020,  KBM GROUP and/or its affiliates. All rights reserved.
 * KBM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * 
 * 
 * 
 * 
 * 
 */
package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author AJIT KUMAR
 * @since 2020
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "COLLEGE_DTLS")

public class CollegeDtlsEntity {

	@Id
	@Column(name = "COLLEGE_CODE")
	private String collegeCode;
	@NonNull
	@Column(name = "COLLEGE_NAME")
	private String collegeName;
	@NonNull
	@Column(name = "COLLEGE_LOC")
	private String collegeLoc;
	@NonNull
	@Column(name = "AFFILATED_BY_UNIVERSITY")
	private String affilatedByUnv;
	@NonNull
	@Column(name = "YEAR_OF_ESTABLISH")
	private Integer yearOfEstablish;
	@NonNull
	@Column(name = "COLLEGE_CHAIRMAN_NAME")
	private String collegeChairManName;
	@NonNull
	@Column(name = "COLLEGE_DIRECTOR_NAME")
	private String collegeDirectorName;
	@NonNull
	@Column(name = "NO_OF_COURSES")
	private Integer noOfCourses;
	@NonNull
	@Column(name = "NO_OF_FACULTIES")
	private Integer noOfFaculties;
	@NonNull
	@Column(name = "NO_OF_STUDENTS")
	private Integer noOfStudents;
}
