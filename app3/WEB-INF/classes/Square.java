import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Square extends HttpServlet
{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		PrintWriter out=null;
		try
		{
			res.setContentType("text/html");
			out=res.getWriter();
			double num=Double.parseDouble(req.getParameter("number"));
			double result=Math.pow(num,2);
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Square</h1><br>");
			out.println("Number : "+num+" Square : "+result );
			out.println("<br><a href=index.html>index</a>");
			out.println("</body>");
			out.println("</html>");
			
		}
		catch(Exception e)
		{
			out.println(e);
			 e.printStackTrace();


		
		}
		finally
		{
			out.close();
		}
		
	}
}