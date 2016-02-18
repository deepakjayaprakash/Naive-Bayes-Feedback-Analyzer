

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestData
 */
@WebServlet("/TestData")
public class TestData extends HttpServlet {
	

static char workload[]=  {'v','v','a','n','v','a','n','v','a','n','n','n','v','a','v','v','v','n','v','a','v','a','v','a','n','v'};
static char technical[]= {'v','v','a','a','a','a','n','a','v','n','n','a','a','a','v','v','v','v','n','a','a','n','n','v','a','a'};
static char neccessity[]={'v','n','v','a','n','a','a','v','n','n','n','a','v','v','a','a','v','v','v','n','n','v','n','v','v','a'};
static char advance[]=   {'v','a','n','n','n','v','a','a','a','a','a','n','a','a','n','v','n','v','v','v','n','v','n','n','n','n'};
static char class1[]=    {'A','A','B','B','B','A','B','A','B','B','B','B','A','A','A','A','A','A','A','B','B','A','B','A','B','A'};
// training set



	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		 String cust_uname=request.getParameter("uname");
	     String cust_pwd=request.getParameter("pwd");

	     
		out.print("<!DOCTYPE html><html><head><title>that's my spot.com</title>"
				+ "<link href=\"css/style3.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />"
				+ "<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\"><link rel=\"css/bootstrap.min.css\"><link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' /><link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate.css\"/>"
				+ "<script src=\"js/jquery.min.js\"></script>"
				+ " <script src=\"js/bootstrap.min.js\"></script>"
				+ "<script type=\"text/javascript\" src=\"js/wow.js\"></script>"
				+ "<script src=\"js/wow.min.js\"></script>"
				+ "<script>new WOW().init();</script>"
				+ "</head><body>");
		
		out.print("<header><div class=\"container\"><div class=\"logo pull-left animated wow fadeInLeft\"><img src=\"images/logo.jpg\" height=\"80px\"  width=\"65px\" >That's my spot</div></div></header>");
		
	

	//	out.println("<div class=\"container\">  <div class=\"row\">   <div class=\"form_bg\"> ");
	
		out.println("Table<br>");
		out.println("Workload &nbsp;&nbsp;&nbsp;   Technical&nbsp;&nbsp;    Necessity&nbsp;&nbsp;      Advance     &nbsp;&nbsp;Class<br>");
		for(int i=0;i<26;++i)
		{
		out.println("<pre>"+workload[i]+"         "+technical[i]+"        "
				+ ""+neccessity[i]+ "        "+advance[i]+"            "
						+ ""+class1[i]+"</pre><br>");
	out.println();
		}
		
		//	    out.println("</div><div><div>");
			 
				out.println("<body><html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
