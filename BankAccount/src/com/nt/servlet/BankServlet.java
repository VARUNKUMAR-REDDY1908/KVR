package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class BankServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=null;
		String name=null;
		int balance=0;
				int age=0;
		pw=res.getWriter();
		res.setContentType("text/html");
		name=req.getParameter("pname");
		age=Integer.parseInt(req.getParameter("page"));
		balance=Integer.parseInt(req.getParameter("Amount"));
	if(balance>=500&&age>=18){
		pw.println("<h1 style='color:green;text-align:center'>Mr. " + name + " You Are Eligible For Opening Account</h1>");
		
	}
	else {
		pw.println("<h1 style='color:red;text-align:center'>Mr. " + name + " You Aren't Eligible For Opening Account</h1>");
	}
pw.println("<br><a href='http://localhost:7777/BankAccount/input.html' ><img src='images/home.jpg' ></a>");
	pw.close();
	}
}



