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
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "CUSTOMER_DTLS")
public class CustomerDtlsEntity {

	@Id
	@Column(name = "CUSTOMER_ID")
	private Integer customerId;
	@NonNull
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "CUSTOMER_MOB_NO")
	private Long customerMobNo;
	@NonNull
	@Column(name = "CUSTOMER_ADDRESS")
	private String customerAddress;

}
