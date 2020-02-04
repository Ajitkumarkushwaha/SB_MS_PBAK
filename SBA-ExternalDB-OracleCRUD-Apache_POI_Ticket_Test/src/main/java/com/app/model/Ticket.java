package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
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
public class Ticket {
	@NonNull
	private Integer ticketId;
	@NonNull
	private String ticketCode;
	@NonNull
	private Double ticketFare;
	private Double gst;
	private Double total;

}
