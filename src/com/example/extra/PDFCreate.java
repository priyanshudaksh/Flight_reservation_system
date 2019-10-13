package com.example.extra;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.example.pojo.Orders;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFCreate {
	public static void Create(Orders ord) throws FileNotFoundException, DocumentException {
			System.out.println("Reached");
			// create a new document
			Document document = new Document(PageSize.A4, 20, 20, 20, 20);
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\lenovo\\Desktop\\java\\Flight_reservation_system\\WebContent\\Tickets\\Ticket"+ord.getUsername()+ord.getSeats()+".pdf"));
			Font normal = FontFactory.getFont(FontFactory.TIMES, 12, BaseColor.BLACK);
			Font small = FontFactory.getFont(FontFactory.TIMES, 10, BaseColor.DARK_GRAY);
			Font hexaware = FontFactory.getFont(FontFactory.TIMES, 14, BaseColor.BLUE);
			document.open();
			document.add(new Paragraph("Welcome To Hexa Airways" , hexaware));
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			document.add(new Paragraph("Hello " + ord.getUsername(), normal));
			document.add(new Paragraph("PNR "+"In the Process",normal));
			document.add(new Paragraph("Flight Name: " + ord.getFlightname(), normal));
			document.add(new Paragraph("Date of Journey:" + ord.getDoj(),normal));
			document.add(new Paragraph("Time: "+ord.getToj(), normal));
			document.add(new Paragraph("Seat No. " + ord.getSeats(), normal));
			document.add(new Paragraph("Flight From: "+ ord.getSource(),normal));
			document.add(new Paragraph("Flight Upto: "+ ord.getDestination(),normal));
			document.add(new Paragraph("Fare "+ ord.getAmount(),normal));
			document.add(new Paragraph("No. of Passangers. "+ ord.getPassangers(),normal));
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			document.add(new Paragraph("*if there are more than one passanger than seat number will be one after another", small));
			document.add(new Paragraph("**This is a system generated ticket that doesn't needs seal or signature", small));
			document.add(new Paragraph("**For any concerns please contact adminstration or mail us at ----@----", small));
			document.close();
			System.out.println("Done");
		} 
	  }
	 
