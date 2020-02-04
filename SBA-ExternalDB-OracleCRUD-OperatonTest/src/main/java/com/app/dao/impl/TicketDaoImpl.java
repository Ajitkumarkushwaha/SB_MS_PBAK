package com.app.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
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
		int count = jt.update(CREATE_TICKET, ticket.getTicketId(), ticket.getTicketCode(), ticket.getTicketFare(),
				ticket.getGst(), ticket.getTotal());
		return count;
	}

	@Override
	public Integer updateTicket(Ticket ticket) {
		int count = jt.update(UPDATE_TICKET, ticket.getTicketCode(), ticket.getTicketFare(), ticket.getGst(),
				ticket.getTotal(), ticket.getTicketId());
		return count;
	}

	@Override
	public Integer cancelTicket(Integer ticketId) {
		int count = jt.update(CANCEL_TICKET, ticketId);
		return count;
	}

	@Override
	public Ticket getOneTicket(Integer ticketId) {
		Ticket ticket = jt.queryForObject(GET_ONE_TICKET, (rs, rowNum) -> {
			Ticket tic = new Ticket();
			tic.setTicketId(rs.getInt("ticketId"));
			tic.setTicketCode(rs.getString("ticketCode"));
			tic.setTicketFare(rs.getDouble("ticketFare"));
			tic.setGst(rs.getDouble("gst"));
			tic.setTotal(rs.getDouble("total"));
			return tic;
		}, ticketId);

		return ticket;
	}

	@Override
	public List<Ticket> getAllTicket() {
		List<Ticket> listTicket = jt.query(GET_ALL_TICKET, (rs, rowNum) -> {
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

	/**
	 * Batch Update
	 */
	/*
	 * @Override public int[] saveTicket(List<Ticket> ticket) { List<Object[]>
	 * ticList = ticket.stream().map(tic-> new Object[] {
	 * tic.getTicketId(),tic.getTicketCode(),tic.getTicketFare(),tic.getGst(),tic.
	 * getTotal() }).collect(Collectors.toList());
	 * 
	 * int[] batchUpdate = jt.batchUpdate(CREATE_TICKET, ticList); return
	 * batchUpdate; }
	 */
	/**
	 * Batch Update Operation Using Anonymous InnerClass
	 */
	@Override
	public int[] saveTicket(List<Ticket> ticket) {
		return jt.batchUpdate(CREATE_TICKET, new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Ticket tic = ticket.get(i);
				ps.setInt(1, tic.getTicketId());
				ps.setString(2, tic.getTicketCode());
				ps.setDouble(3, tic.getTicketFare());
				ps.setDouble(4, tic.getGst());
				ps.setDouble(5, tic.getTotal());

			}

			@Override
			public int getBatchSize() {
				return ticket.size();
			}
		});

	}

}
