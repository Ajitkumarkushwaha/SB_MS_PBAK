package com.app.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.app.model.Ticket;

@Component
public class TicketUtils {


	public boolean writeToExcel(List<Ticket> ticket){
		boolean status = false;
		try {
			
			//1.Create Work Book
			Workbook book = new XSSFWorkbook();
			//2.Create Sheet In Above Workbook
			Sheet s = book.createSheet("TICKET");
			//3. Create Head and Body
			setHead(s);
			setBody(s,ticket);
			//4. write to one file
			book.write(new FileOutputStream("G:\\Raghu_Sir\\TestData\\out_tic.xlsx"));
			status=true;
			book.close();
		} catch (Exception e) {
		
		e.printStackTrace();
		}
	
	return status;
}

		
		private void setHead(Sheet s) {
			Row r=s.createRow(0);
			r.createCell(0).setCellValue("ID");
			r.createCell(1).setCellValue("NAME");
			r.createCell(2).setCellValue("FEE");
			r.createCell(3).setCellValue("COURSE");
			r.createCell(4).setCellValue("DISCOUNT");
		}
		private void setBody(Sheet sheet,List<Ticket> list) {
			Row r=null;
			int count=1;
			for(Ticket s:list) {
				r=sheet.createRow(count++);
				r.createCell(0).setCellValue(s.getTicketId());
				r.createCell(1).setCellValue(s.getTicketCode());
				r.createCell(2).setCellValue(s.getTicketFare());
				r.createCell(3).setCellValue(s.getGst());
				r.createCell(4).setCellValue(s.getTotal());
			}

		
	}
	
	public List<Ticket> readFromExcel() {
		List<Ticket> ticket = null;
		ticket = new ArrayList<Ticket>();
		try {
			File file = new File("G:\\Raghu_Sir\\TestData\\tic.xlsx");
			// 1. Read Excel File As WorkBook
			Workbook book = new XSSFWorkbook(file);
			//2 Read Existed Sheet From Above Workbook
			Sheet s = book.getSheet("ETICKET");
			// 3. read rows
			Iterator<Row> itr = s.iterator();
			while (itr.hasNext()) {
				Row r = itr.next();
				// Read Data from one row-> Student obj
				// ->added to List stds
				ticket.add(new Ticket(
					    (int)r.getCell(0).getNumericCellValue(),
						r.getCell(1).getStringCellValue(),
						r.getCell(2).getNumericCellValue()));
			}
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ticket;
	}

}
