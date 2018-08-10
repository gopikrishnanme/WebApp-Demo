import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Lifecycledemo")
public class Lifecycledemo extends GenericServlet {
   	public void init(ServletConfig config) throws ServletException {	
   		System.out.println("init method");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		System.out.println("service method");
	
	}
	public void destroy() {	
		System.out.println("destroy");
	}




}
