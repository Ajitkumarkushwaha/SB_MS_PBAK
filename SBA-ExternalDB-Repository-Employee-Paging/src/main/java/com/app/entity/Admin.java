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

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "ADMIN_MASTER")
public class Admin {

	@Id
	@Column(name = "ADMIN_ID")
	private Integer adminId;
	@NonNull
	@Column(name = "ADMIN_NAME")
	private String adminName;
	@NonNull
	@Column(name = "ADMIN_DEPT")
	private String adminDept;
	@NonNull
	@Column(name = "ADMIN_MON_NO")
	private Long adminMobNo;
}
