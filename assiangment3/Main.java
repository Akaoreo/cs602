import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    String title = "Welcome to my Store";
		int radio = -1;
	    String gender = "";
	    String firstname = request.getParameter("firstName");
	    String lastname = request.getParameter("lastName");

	    
		try { 
			radio = Integer.parseInt(request.getParameter("radio1")); 
		} catch (Exception e) { 
			gender = "Please select gender";
		}
		if (firstname == "" || lastname == "") {
			radio= 0;
		}
		switch(radio) {
		case 0: gender = "please enter full name";break;
		case 1: gender = "Thank you " +"Mr."+ firstname + lastname;break;
		case 2: gender = "Thank you " +"Ms."+ firstname + lastname;break;
		default: gender = "please choose a gender";
		}
		
		
	    out.println("<html>\n"+
	    		"<head><title>" + title + "</title></head>\n" +
	    		"<body bgcolor=\"#FDF5E6\">\n" +
	    		"<h1 align=\"center\">" + title + "</h1>\n" +
	    		"<ul>\n" +
	    		 gender+ "</body></html>");
	    
	    }
