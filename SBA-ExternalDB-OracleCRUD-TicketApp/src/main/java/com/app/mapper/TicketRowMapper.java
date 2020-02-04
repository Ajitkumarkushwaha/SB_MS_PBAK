package com.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.model.Ticket;

public class TicketRowMapper implements RowMapper<Ticket> {

	@Override
	public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ticket ticket = new Ticket();
		ticket.setTicketId(rs.getInt(1));
		ticket.setTicketCode(rs.getString(2));
		ticket.setTicketFare(rs.getDouble(3));
		ticket.setGst(rs.getDouble(4));
		ticket.setTotal(rs.getDouble(5));
		return ticket;
	}

}
