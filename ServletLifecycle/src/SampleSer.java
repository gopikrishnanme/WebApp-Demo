import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleSer")
public class SampleSer extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
			res.setContentType("text/html"); // set header field first
			PrintWriter pw = res.getWriter(); // then get writer & write response data
			
			String name=req.getParameter("uname");
			int age=Integer.parseInt(req.getParameter("age"));
			
			req.setAttribute("un", name);
			
			RequestDispatcher rd;
			if(age>18)
			{
				rd=req.getRequestDispatcher("SuccessSer");
				rd.forward(req, res);
			}
			else
			{
				rd=req.getRequestDispatcher("FailSer");
				rd.forward(req, res);
			}
			
			pw.println("<H3>" + "Welcome " + name +" your age is"+age+"</H3>");
			pw.close(); //closes the writer
	}
}
	
	
	
	
	
