

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xml.internal.security.utils.RFC2253Parser;

/**
 * Servlet implementation class Sign_in_Customer
 */
@WebServlet("/Sign_in_Customer")
public class Sign_in_Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sign_in_Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		 String cust_uname=request.getParameter("uname");
	     String cust_pwd=request.getParameter("pwd");

	 	out.print("<!DOCTYPE html><html><head><title>Easy Feedback</title>"
				+ "<link href=\"css/style3.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />"
				+ "<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\"><link rel=\"css/bootstrap.min.css\"><link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' /><link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate.css\"/>"
				+ "<script src=\"js/jquery.min.js\"></script>"
				+ " <script src=\"js/bootstrap.min.js\"></script>"
				+ "<script type=\"text/javascript\" src=\"js/wow.js\"></script>"
				+ "<script src=\"js/wow.min.js\"></script>"
				+ "<script>new WOW().init();</script>"
				+ "<script> $(document).ready(function(){    $(\"#flip\").click(function(){"
				+ "$(\"#panel\").slideToggle(\"slow\");    });});$(document).ready(function(){"
				+ "    $(\"#flip2\").click(function(){        $(\"#panel2\").slideToggle(\"slow\");    });});</script>"
		
				+ "</head><body>");
		
		out.print("<header><div class=\"container\"><div class=\"logo pull-left animated wow fadeInLeft\"><img src=\"images/logo.jpg\" height=\"80px\"  width=\"65px\" >Easy Feedback</div></div></header>");
		
	
	//	out.println("<div id=\"text\">");
	
		
		
		
		out.println("<div id=\"flip2\" >Course exit survey</div><div id=\"panel2\">");

		out.println("<div class=\"container\">  <div class=\"row\">   <div class=\"form_bg\"> ");
out.println("<form action=\"OP\" method=\"get\">");	
//out.print("<div style=\"text-align:center\" >");
			    out.println("Is the weightage given to the subject reasonable when compared to the workload:"
			    		+ " : <select name=\"Q1\">");
			    out.println("<option value=\"v\">"+"Agree</option>");
			    out.println("<option value=\"a\">"+"Neither Agree not disagree</option>");
			    out.println("<option value=\"n\">"+"Disagree</option>");
			
			    out.println("</select><br>");
			    
			    

			    out.println("Has the course improved your overall technical skills :"
			    		+ " : <select name=\"Q2\">");
			    out.println("<option value=\"v\">"+"Agree</option>");
			    out.println("<option value=\"a\">"+"Neither Agree not disagree</option>");
			    out.println("<option value=\"n\">"+"Disagree</option>");
			
			    out.println("</select><br>");
			    
			    
			    

			    out.println("Would you say this course is very much necessary to the programme:"
			    		+ " : <select name=\"Q3\">");
			    out.println("<option value=\"v\">"+"Agree</option>");
			    out.println("<option value=\"a\">"+"Neither Agree not disagree</option>");
			    out.println("<option value=\"n\">"+"Disagree</option>");
			
			    out.println("</select><br>");
			    
			    
			    

			    out.println("Would you suggest that this course must be given even more importance(credits) in the next year:"
			    		+ " : <select name=\"Q4\">");
			    out.println("<option value=\"v\">"+"Agree</option>");
			    out.println("<option value=\"a\">"+"Neither Agree not disagree</option>");
			    out.println("<option value=\"n\">"+"Disagree</option>");
			
			    out.println("</select><br>");
			    
			    
			    
			    
			    out.println("<input type=\"submit\" value=\"Submit\"></form>");
			   out.println("</div></div></div>");
			
			    out.println("</div></div>");
			    
			    
			    out.println("<div id=\"flip\" >Faculty Feedback</div><div id=\"panel\">");
			    
	   out.println("<div class=\"container\">  <div class=\"row\">   <div class=\"form_bg\"> ");
	   
	   
				out.println("<form action=\"Teacher\" method=\"get\">");
			
					    out.println("Do you feel that the faculty regular to the class: "
					    		+ " : <select name=\"Q1\">");
					    out.println("<option value=\"v\">"+"Agree</option>");
					    out.println("<option value=\"a\">"+"Neither Agree not disagree</option>");
					    out.println("<option value=\"n\">"+"Disagree</option>");
					
					    out.println("</select><br>");
					    
					    

					    out.println("Would you say that the teacher is impartial to all the students: "
					    		+ " : <select name=\"Q2\">");
					    out.println("<option value=\"v\">"+"Agree</option>");
					    out.println("<option value=\"a\">"+"Neither Agree not disagree</option>");
					    out.println("<option value=\"n\">"+"Disagree</option>");
					
					    out.println("</select><br>");
					    
					    
					    

					    out.println("Do you feel the faculty has sound knowledge about the subject: "
					    		+ " : <select name=\"Q3\">");
					    out.println("<option value=\"v\">"+"Agree</option>");
					    out.println("<option value=\"a\">"+"Neither Agree not disagree</option>");
					    out.println("<option value=\"n\">"+"Disagree</option>");
					
					    out.println("</select><br>");
					    
					    
					    

					    out.println("Does the encourage the students to ask doubts: "
					    		+ " : <select name=\"Q4\">");
					    out.println("<option value=\"v\">"+"Agree</option>");
					    out.println("<option value=\"a\">"+"Neither Agree not disagree</option>");
					    out.println("<option value=\"n\">"+"Disagree</option>");
					
					    out.println("</select><br>");
					    
					    
					    
					    
					    out.println("<input type=\"submit\" value=\"Submit\"><form>");
			    
	   out.println("</div></div></div>");
			    
			    out.println("</div></div>");
			    
		
				out.println("<body><html>");
		
			
					
			
					
	}

}
