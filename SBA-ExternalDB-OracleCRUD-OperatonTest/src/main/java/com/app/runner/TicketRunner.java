package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.app.model.Ticket;
import com.app.service.ITicketService;

@Component
public class TicketRunner implements ApplicationRunner {

	@Autowired
	private ITicketService ticketService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Ticket ticket = new Ticket();
		/**
		 * Create The Ticket
		 */
		/*
		ticket.setTicketId(10000025);
		ticket.setTicketCode("TIC1015");
		ticket.setTicketFare(800.0);
		ticketService.createTicket(ticket);
		System.out.println("Your Ticket Details Is Saved:-");
		 */
		/**
		 * updateTicketDetails
		 */
		/*	ticket.setTicketId(10000021);
		ticket.setTicketCode("TIC1210");
		ticket.setTicketFare(100.0);
		ticketService.updateTicket(ticket);
		System.out.println("Your Ticket Details Are Saved:-");
		 */

		/**
		 * cancelTicket
		 */
		/*ticketService.cancelTicket(10000021);
		System.out.println("Your Request Is Accepted For Cancelation Of Ticket You Will Get Confirmation Message Very Soon..");*/
		/**
		 * get one Ticket 
		 */
		/*
		Ticket ticketDetails = ticketService.getOneTicket(1000001);
		System.out.println(ticketDetails);
		*/
		/**
		 * get all ticket
		 * 
		 */
	/*
		List<Ticket> allTicketList = ticketService.getAllTicket();
		allTicketList.stream().forEach(System.out::println);
		*/
		/**
		 * Batch Update
		 */
		int[] saveTicket = ticketService.saveTicket(Arrays.asList(
				new Ticket(111,"TIC111",200.0),
				new Ticket(222,"TIC222",400.0),
				new Ticket(333,"TIC333",600.0)
				));
		System.out.println(saveTicket.length+" Records Are Inserted");
	}

}
