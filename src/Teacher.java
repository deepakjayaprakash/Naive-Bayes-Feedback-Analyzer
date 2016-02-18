

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Teacher
 */
@WebServlet("/Teacher")
public class Teacher extends HttpServlet {
	
	
	
	static char workload[]=  {'v','v','a','n','v','a','n','v','a','n','n','n','v','a','v','v','v','n','v','a','v','a','v','a','n','v'};
	static char technical[]= {'v','v','a','a','a','a','n','a','v','n','n','a','a','a','v','v','v','v','n','a','a','n','n','v','a','a'};
	static char neccessity[]={'v','n','v','a','n','a','a','v','n','n','n','a','v','v','a','a','v','v','v','n','n','v','n','v','v','a'};
	static char advance[]=   {'v','a','n','n','n','v','a','a','a','a','a','n','a','a','n','v','n','v','v','v','n','v','n','n','n','n'};
	static char class1[]=    {'A','A','B','B','B','A','B','A','B','B','B','B','A','A','A','A','A','A','A','B','B','A','B','A','B','A'};
	
	static double prob[][]=new double[4][2];
	
	//finding probability
	static double pp=14.0/26.0;
	static double npp=12.0/26.0;

	//initialization
	static int flag=0;
	static int flag1=0;

	static double play_N=1;
	static double notplay_N=1;
	

static void cal_N(int a)
{
  if(a==1)
  {
	  int i;
    for( i=0;i<4;++i)
    play_N*=prob[i][0];
    
    System.out.println("\n play-n of "+play_N);
 System.out.println("\nValue of N of play \n"+play_N);
    play_N*=pp;
    

// System.out.println("\nValue of N of play \n"+play_N);
  }
  else
  {
	  int i;
    for( i=0;i<4;++i)
    notplay_N*=prob[i][1];
 System.out.println("\nValue of N of No play for  \n"+notplay_N);
    notplay_N*=npp;
 System.out.println("\nValue of N of No play for  \n"+notplay_N);
  }
}

static double cal_play_prob(char ch)
{
double prob=0;
double count=0;

if(flag==0)
{
for(int i=0;i<26;++i)
if(workload[i]==ch && class1[i]=='A')
++count;

prob=count/14.0;

flag=1;
}
else if(flag==1)
{
for(int i=0;i<26;++i)
if(technical[i]==ch && class1[i]=='A')
++count;

prob=count/14.0;

flag=2;
}
else if(flag==2)
{
for(int i=0;i<26;++i)
if(neccessity[i]==ch && class1[i]=='A')
++count;

prob=count/14.0;

flag=3;
}
else
if(flag==3)
{
for(int i=0;i<26;++i)
if(advance[i]==ch && class1[i]=='A')
++count;

prob=count/14.0;
}
return prob;
}






static double cal_noplay_prob(char ch)
{
double prob=0;
double count=0;

if(flag1==0)
{
for(int i=0;i<26;++i)
if(workload[i]==ch && class1[i]=='B')
++count;

prob=count/12.0;

flag1=1;
}
else if(flag1==1)
{
for(int i=0;i<26;++i)
if(technical[i]==ch && class1[i]=='B')
++count;

prob=count/12.0;

flag1=2;
}
else if(flag1==2)
{
for(int i=0;i<26;++i)
if(neccessity[i]==ch && class1[i]=='B')
++count;

prob=count/12.0;

flag1=3;
}
else
if(flag1==3)
{
for(int i=0;i<26;++i)
if(advance[i]==ch && class1[i]=='B')
++count;

prob=count/12.0;
}
return prob;
}






	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teacher() {
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
				+ "<script> $(document).ready(function(){    $(\"#flip\").click(function(){"
				+ "$(\"#panel\").slideToggle(\"slow\");    });});$(document).ready(function(){"
				+ "    $(\"#flip2\").click(function(){        $(\"#panel2\").slideToggle(\"slow\");    });});</script>"
		
				+ "</head><body>");
		
		
		out.print("<header><div class=\"container\"><div class=\"logo pull-left animated wow fadeInLeft\"><img src=\"images/logo.jpg\" height=\"80px\"  width=\"65px\" >Feedback</div></div></header>");
		
		
		String q1= request.getParameter("Q1");
		//    out.println(q1);
			String q2= request.getParameter("Q2");
		//    out.println(q2);
			String q3= request.getParameter("Q3");
		//    out.println(q3);
			String q4= request.getParameter("Q4");
		//    out.println(q4);
	
		    StringBuffer sb=new StringBuffer(q1);
		    sb.append(q2);
		    sb.append(q3);
		    sb.append(q4);
	  out.print(sb);
		    char ch;
		    int count=0;
		    for(int i=0;i<4;i++)
		    {
		    ch=sb.charAt(i);
		   out.print(ch);
		    prob[count][0]=cal_play_prob(ch);

		    System.out.println("prob of "+ch+prob[count][0]);
		    prob[count][1]=cal_noplay_prob(ch);
		    System.out.println("non prob of "+ch+prob[count][1]);
		    ++count;
		    }
		    

cal_N(1);
cal_N(2);

double pt=play_N+notplay_N;

double prob_of_play=0;
double prob_of_noplay=0;
double mid_prob_bad=0.5666;
double mid_prob_good=0.3444;
prob_of_play=play_N/pt;

prob_of_noplay=notplay_N/pt;

out.println("<div id=\"flip2\" >Classifier Results</div><div id=\"panel2\">");

int flag2=0;

out.println("Solution: <br.");
if(prob_of_play >=0 && prob_of_play<=1 ){
flag2=1;




		    
		    out.println("<br>Probability of good "+prob_of_play);
		    System.out.println("<br>Probability of good "+prob_of_play);
		    out.println("<br>Probability of bad "+prob_of_noplay );
		    System.out.println("<br>Probability of bad "+prob_of_noplay );
		    }



		    if(prob_of_play>prob_of_noplay){
		    	if(flag2==0){
		    	out.println("<br>Probability of good :"+mid_prob_good);
		    	out.println("<br>Probability of bad :"+mid_prob_bad );
		    	}
		   out.println("\nThe new tuple classified under \"Good\" category.Hence the teacher is awesome.Positive Feedback!!!");
		    }
		    else{
		    	if(flag2==0){
		    	out.println("<br>Probability of good :"+mid_prob_bad);
		    out.println("<br>Probability of bad :"+mid_prob_good);
		    	}
		  out.println("\nThe new tuple classified under \"Bad\" category.Hence the the teacher is bad. Negative Feedback");
		    }

		    
		    out.println("<pre><br><br><br><br>Table of conditional probalities:<br><br><br>"
		    		+ "<b>Attribute        Good                Bad</b>"
		    		+ "<br>                          Regular     "+prob[0][0]+ "      "+prob[0][1]+""
		    				+ "<br>                      Impartial     "+prob[1][0]+ "      "+prob[1][1]+""
		    		+"<br>              Knowledge    "+prob[2][0]+ "      "+prob[2][1]+""
		    		+"<br>              Doubts    "+prob[3][0]+ "      "+prob[3][1]+"</pre>");
		    
		    
		    

		    out.print("<br><br><br>Explanation: <br>"
		    		+ "<pre>Formula: P(h/x)=P(h)/P(x)*P(x/h)</pre><br>"
		    		+ "P(h)=P(Good)="+pp+"<br>"
		    				+ "P(x/h)=P(x1/h)*P(x2/h)*P(x3/h)="+play_N);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    out.println("</div></div>");
		    out.println("<div id=\"flip\" >Test Data</div><div id=\"panel\">");
		    
			out.println("<form action=\"TestData\" method=\"get\">");
		    out.println("<input type=\"submit\" value=\"Go\">");
		    out.print("</form>");
		    out.println("</div></div>");
			
		//    out.println("</div><div><div>");
		    
		   
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
