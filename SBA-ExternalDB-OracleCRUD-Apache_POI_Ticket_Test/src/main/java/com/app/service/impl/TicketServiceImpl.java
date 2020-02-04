package com.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ITicketDao;
import com.app.model.Ticket;
import com.app.service.ITicketService;

@Service
public class TicketServiceImpl implements ITicketService {

	
	@Autowired
	private ITicketDao dao;
	@Override
	public Integer createTicket(Ticket ticket) {
		Double ticketFare = ticket.getTicketFare();
		ticket.setGst(ticketFare*18/100.0);
		ticket.setTotal((ticketFare*18/100.0)+ticketFare);
		return dao.createTicket(ticket);
	}

	@Override
	public Integer updateTicket(Ticket ticket) {
		Double ticketFare = ticket.getTicketFare();
		ticket.setGst(ticketFare*18/100.0);
		ticket.setTotal((ticketFare*18/100.0)+ticketFare);
		return dao.createTicket(ticket);
	}

	@Override
	public Integer cancelTicket(Integer ticketId) {
		return dao.cancelTicket(ticketId);
	}
	@Override
	public Ticket getOneTicket(Integer ticketId) {
		
		return dao.getOneTicket(ticketId);
	}
	@Override
	public List<Ticket> getAllTicket() {
		
		return dao.getAllTicket();
	}

	@Override
	public int[] saveTicket(List<Ticket> ticket) {
		ticket =ticket.stream().map(tic->{
			tic.setGst(tic.getTicketFare()*18/100);
			tic.setTotal((tic.getTicketFare()*18/100)+tic.getTicketFare());
			return tic;
		}).collect(Collectors.toList());
		return dao.saveTicket(ticket);
	}


}
