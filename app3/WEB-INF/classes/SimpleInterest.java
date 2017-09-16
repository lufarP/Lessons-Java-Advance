import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SimpleInterest extends HttpServlet
{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		PrintWriter out=null;
		try
		{
			res.setContentType("text/html");
			out=res.getWriter();
			double principal=Double.parseDouble(req.getParameter("principal"));
			double rate=Double.parseDouble(req.getParameter("rate"));
			int month=Integer.parseInt(req.getParameter("month"));
			double simpleInterest=principal*rate*month/100;
			month+=12*Integer.parseInt(req.getParameter("year"));
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Simple Interest</h1><br>");
			out.println("Principal          : "+principal );		
			out.println("<br>Rate           : "+rate );
			out.println("<br>Time in months : "+month );
			out.println("<br>SimpleInterest : "+simpleInterest );
			out.println("<br><a href=index.html>index</a>");
			out.println("</body>");
			out.println("</html>");
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		finally
		{
			out.close();
		}
		
	}
}
