import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class TshirtClass
 */
@WebServlet("/Tax_search")
public class Tax_search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int n =100;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tax_search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub 
		  response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	        String id=request.getParameter("id");
	       
	        out.println("<html>");
	       out.println("<head><title>Information</title></head>");
	        out.println("<body bgcolor=\"#e6f7ff\">");
         String qu="";
         
         	        try {
	                   Class.forName("com.mysql.jdbc.Driver").newInstance();
	                   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tax1", "root", "root");
	                 
	                  
	                	   Statement stmt= conn.createStatement();
	                       
	                     
	                       
	                    qu="select * from taxpayer where id="+id+";";
	                       ResultSet rs =stmt.executeQuery(qu);
	                   out.println("<center><table border=2>");
	                   out.println("<tr>");
	                   out.print("<td>Person_No  </td>");
	                   out.print("<td>NAME  </td>");
	                   out.print("<td>AGE  </td>");
	                   out.print("<td>PHONE  </td>");
	                   out.print("<td>EMAIL  </td>");
	                   out.print("<td>ADDRESS  </td>");
	                   out.print("<td>GENDER  </td>");
	                   out.print("<td>INCOME</td>");
	                   out.print("<td>TAX_AMOUNT</td>");
	                   out.println("</tr></br>");
	                   
	        
	                  
	                   while(rs.next()){
	                   //int v=0;
	                   out.println("<tr>");
	                   int  v=rs.getInt("id");
	                   //v=v+1;
	                       out.print("<td>"+v+"</td>");
	                       out.print("<td>"+rs.getString("name")+"</td>");
	                       out.print("<td>"+rs.getString("age")+"</td>");
	                       out.print("<td>"+rs.getString("phone")+"</td>");
	                       out.print("<td>"+rs.getString("email")+"</td>");
	                       out.print("<td>"+rs.getString("address")+"</td>");
	                       out.print("<td>"+rs.getString("gender")+"</td>");
	                       out.print("<td>"+rs.getString("income")+"</td>");
	                       out.print("<td>"+rs.getString("taxamount")+"</td>");



	                       out.println("</tr>");
	                   }
	                   out.println("</table></center>");
	                   out.println("<br></br>");
	                   out.println("<center><a href=\"index_search.html\">Click here</a> to enter new search data</center>");
	                   out.println("<center><br></br><a href=\"Index.html\">Click here</a> to go to the main page</center>");
	                   out.println("</body></html>");
	                  
	                   
	        }
	        catch (Exception e){
	        e.printStackTrace();
	        }
	            }
	}