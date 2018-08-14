import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h1>"+"Request object Info: " +"<br>");
   		out.println("<b>Method:</b> "+ request.getMethod()+"<br>");
   		out.println("<b>Request URI: </b>"+ request.getRequestURI()+"<br>");
   		out.println("<b>Protocol: </b>" + request.getProtocol()+"<br>");
   		out.println("<b>PathInfo: </b>" + request.getPathInfo()+"<br>");
   		out.println("<b>Remote Address: </b>" + request.getRemoteAddr()+ "</h1>"+"<br>");	}

}
