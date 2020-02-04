package com.app.model;

import lombok.Data;

@Data
public class Ticket {
	private Integer ticketId;
	private String ticketCode;
	private Double ticketFare;
	private Double gst;
	private Double total;

}
