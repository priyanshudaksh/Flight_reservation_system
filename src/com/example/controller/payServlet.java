package com.example.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.extra.PDFCreate;
import com.example.pojo.Flight;
import com.example.pojo.Orders;
import com.example.pojo.Test;
import com.example.pojo.User;
import com.example.service.FlightService;
import com.example.service.FlightServiceImpl;
import com.example.service.OrderService;
import com.example.service.OrderServiceImpl;
import com.itextpdf.text.DocumentException;

@WebServlet("/payServlet")
public class payServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FlightService fs = new FlightServiceImpl();
		OrderService os = new OrderServiceImpl();
		Flight flight = null;
		Random random = new Random();
		HttpSession session=request.getSession();  
		System.out.println("Post");
		String id1 = request.getParameter("id");
		String s=Character.toString(id1.charAt(0));
		int fid = Integer.parseInt(s);
		System.out.println(fid);
        String uname = (String) session.getAttribute("name");
        int uid = (int) session.getAttribute("id");
        flight = fs.findName(fid);
        String fname = flight.getFname();
        String source = flight.getSource();
        String destination = flight.getDestination();
        LocalDate doj = flight.getDoj();
        LocalTime toj = flight.getTime();
        Double amount = flight.getFare();
        int passangers = (int)session.getAttribute("seats");
        //System.out.println(passangers);
        String cateogory = flight.getCateogory();
        int radix = random.nextInt(100);
        Test get = new Test();
        int seat = get.seat(radix);
        session.setAttribute("passenger", seat);
        Orders ord = new Orders(-1, uid, uname, fid, fname, source, destination, seat, doj, toj, amount, LocalDate.now(), cateogory, passangers);
        //int status1 = fs.update(fid, passangers);
        int status = os.storeOrder(ord);
        System.out.println(status);
        try {
			PDFCreate.Create(ord);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        request.getRequestDispatcher("bookingsuccess.jsp").forward(request, response);
        
	}

	

}
