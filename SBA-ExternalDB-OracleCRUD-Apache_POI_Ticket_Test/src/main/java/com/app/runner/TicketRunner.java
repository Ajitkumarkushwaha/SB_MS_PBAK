package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.app.model.Ticket;
import com.app.service.ITicketService;
import com.app.utils.TicketUtils;


/**
 * 
 * @author AJIT KUMAR
 *
 */

@Component
public class TicketRunner implements ApplicationRunner {

	@Autowired
	private ITicketService ticketService;
	@Autowired
	private TicketUtils util;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		//Ticket ticket = new Ticket();
		/**
		 * Create The Ticket
		 */
		
		List<Ticket> list= util.readFromExcel();
		ticketService.saveTicket(list);
		System.out.println("done");
		/*
		List<Ticket> allTicketList = ticketService.getAllTicket();
		boolean message = util.writeToExcel(allTicketList);
		
		System.out.println(message);
		*/
	}

}
