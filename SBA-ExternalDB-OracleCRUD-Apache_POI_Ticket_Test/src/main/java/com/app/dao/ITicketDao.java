package com.app.dao;

import java.util.List;

import com.app.model.Ticket;

public interface ITicketDao {
	
	public Integer createTicket(Ticket ticket);
	public int[] saveTicket(List<Ticket> ticket);
	public Integer updateTicket(Ticket ticket);
	public Integer  cancelTicket(Integer ticketId);
	public Ticket getOneTicket(Integer ticketId); 
	public List<Ticket> getAllTicket(); 

}
