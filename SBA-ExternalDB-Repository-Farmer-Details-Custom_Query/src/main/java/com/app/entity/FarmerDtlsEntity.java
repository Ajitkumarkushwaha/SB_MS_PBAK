package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
 *
 */

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "FARMER_DETAILS")
public class FarmerDtlsEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "FARMER_AADHAR_NO")
	private Long farmerAadhar;
	@NonNull
	@Column(name = "FARMER_CODE")
	private String farmerCode;
	@NonNull
	@Column(name = "FARMER_NAME")
	private String farmerName;
	@NonNull
	@Column(name = "FARMER_ADDRESS")
	private String farmerAddress;
	@NonNull
	@Column(name = "FARMER_MOB_NO")
	private Long farmerMobNo;

}
