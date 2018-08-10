

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FailSer")
public class FailSer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // set header field first
		PrintWriter pw = response.getWriter(); // then get writer & write response data
		
		
		pw.println("<h1>fail page</h1>");
		
		pw.print("<h1>"+request.getParameter("uname")+"</h1>");
		pw.print("<h1>"+request.getParameter("age")+"</h1>");
	}

}







