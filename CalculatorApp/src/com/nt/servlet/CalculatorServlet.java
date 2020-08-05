package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
@Override
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	PrintWriter pw=null;
	String pval=null;
	float val1=0f,val2=0f;
	Calendar calendar=null;
	pw=res.getWriter();
	res.setContentType("text/html");
	pval=req.getParameter("s1");
	if(!pval.equalsIgnoreCase("link1")&&!pval.equalsIgnoreCase("link2")) {
	val1=Float.parseFloat(req.getParameter("t1"));
	val2=Float.parseFloat(req.getParameter("t2"));	
}
	else {
		calendar=Calendar.getInstance();
	}
	if(pval.equalsIgnoreCase("ADD")) {
		pw.println("<h1 style='color:blue'>Addition::"+(val1+val2)+"</h1>");
	}
	else if(pval.equalsIgnoreCase("SUB")) {
		pw.println("<h1 style='color:blue'>Subtraction::"+(val1-val2)+"</h1>");
	}
	else if(pval.equalsIgnoreCase("MUL")) {
		pw.println("<h1 style='color:blue'>Multiplication::"+(val1*val2)+"</h1>");
	}
	else if(pval.equalsIgnoreCase("DIV")) {
		pw.println("<h1 style='color:blue'>Division::"+(val1/val2)+"</h1>");
	}
	else if(pval.equalsIgnoreCase("link1")) {
		pw.println("<h1 style='color:blue'>Current Day In the Year::"+calendar.get(Calendar.DAY_OF_YEAR)+"</h1>");
	}
	else{
		pw.println("<h1 style='color:blue'>Current week In the Year::"+calendar.get(Calendar.WEEK_OF_YEAR)+"</h1>");
	}
	pw.println("<br><a href='form.html'><img src='images/home.gif' width='100' height='80'></a>");	
pw.close();
}
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException {
	doPost(req,res);
}


}