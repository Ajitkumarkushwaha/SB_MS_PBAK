package com.app.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ITicketDao;
import com.app.mapper.TicketRowMapper;
import com.app.model.Ticket;

@Repository
public class TicketDaoImpl implements ITicketDao {

	@Autowired
	private JdbcTemplate jt;
	private static final String CREATE_TICKET = "INSERT INTO TICKET_15273 VALUES(?,?,?,?,?)";
	private static final String UPDATE_TICKET = "UPDATE TICKET_15273 SET TICKETCODE=?,TICKETFARE=?,GST=?,TOTAL=? WHERE TICKETID=?";
	private static final String CANCEL_TICKET = "DELETE FROM TICKET_15273 WHERE TICKETID=?";
	private static final String GET_ONE_TICKET = "SELECT * FROM TICKET_15273 WHERE TICKETID=?";
	private static final String GET_ALL_TICKET = "SELECT * FROM TICKET_15273";
	@Override
	public Integer createTicket(Ticket ticket) {
		int count = jt.update(CREATE_TICKET, ticket.getTicketId(),ticket.getTicketCode(),ticket.getTicketFare(),ticket.getGst(),ticket.getTotal());
		return count;
	}

	@Override
	public Integer updateTicket(Ticket ticket) {
		int count = jt.update(UPDATE_TICKET, ticket.getTicketCode(),ticket.getTicketFare(),ticket.getGst(),ticket.getTotal(),ticket.getTicketId());
		return count;
	}

	@Override
	public Integer cancelTicket(Integer ticketId) {
		int count = jt.update(CANCEL_TICKET, ticketId);
		return count;
	}
	@Override
	public Ticket getOneTicket(Integer ticketId) {
		Ticket ticket = jt.queryForObject(GET_ONE_TICKET,(rs,rowNum)->{
			Ticket tic = new Ticket();
			tic.setTicketId(rs.getInt("ticketId"));
			tic.setTicketCode(rs.getString("ticketCode"));
			tic.setTicketFare(rs.getDouble("ticketFare"));
			tic.setGst(rs.getDouble("gst"));
			tic.setTotal(rs.getDouble("total"));
			return tic;
		} , ticketId);
		
		return ticket;
	}
	@Override
	public List<Ticket> getAllTicket() {
		List<Ticket> listTicket = jt.query(GET_ALL_TICKET, (rs,rowNum)->{
			Ticket tic = new Ticket();
			tic.setTicketId(rs.getInt("ticketId"));
			tic.setTicketCode(rs.getString("ticketCode"));
			tic.setTicketFare(rs.getDouble("ticketFare"));
			tic.setGst(rs.getDouble("gst"));
			tic.setTotal(rs.getDouble("total"));
			return tic;
		});
		return listTicket;
	}

	@Override
	public int[] saveTicket(List<Ticket> ticket) {
		List<Object[]> args = ticket.stream().map(tic-> new Object[] {
			tic.getTicketId(),
			tic.getTicketCode(),
			tic.getTicketFare(),
			tic.getGst(),
			tic.getTotal()
			
		}).collect(Collectors.toList());
		
		int[] batchUpdate = jt.batchUpdate(CREATE_TICKET, args);
		return batchUpdate;
	}
}
