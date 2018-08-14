import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConfirmServlet")
public class ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Enumeration<String> inputs=request.getParameterNames();
		while(inputs.hasMoreElements())
		{
			String name=inputs.nextElement();
			String value=request.getParameter(name);
			out.println("<h2>form name "+name+" form value "+value+"</h2><br>");
		}
		
		
//		String name=request.getParameter("name");
//		out.println("welcome "+name);
		
	}

}
