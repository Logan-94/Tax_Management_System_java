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
 * Servlet implementation class Tax
 */
@WebServlet("/Tax")
public class Tax extends HttpServlet {
    private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    int n=100;
    public Tax() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws IOException{
    		
    		}

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        String gender=request.getParameter("gender");
        String id=request.getParameter("id");
        String income=request.getParameter("income");
        String amount=request.getParameter("amount");
        out.println("<html>");
        out.println("<head><title>Tax Record</title></head>");
        out.println("<body bgcolor=\"#ffffe6\">");
        try {
                   Statement stmt;
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tax1", "root", "root");
                   
                  
                       stmt= conn.createStatement();
                       n=n+1;
                       String qu;
                       qu="insert into taxpayer values('"+n+"','"+name+"','"+age+"','"+phone+"','"+address+"','"+gender+"','"+id+"','"+email+"','"+income+"','"+amount+"');";
                    
                      
                        
                      
                      
                       stmt.executeUpdate(qu);
                       out.println("<br></br><hr></hr>");
                       out.println("<h1><center>You have successfully entered the data :)<br></h1></center>");
                       out.println("<center><a href=\"TFile.jsp\">Click here</a> to enter new data</center>");
                       out.println("<br></br>");
                       out.println("<center><a href=\"Index.html\">Click here</a> to go to the main page</center>");
   
                   out.println("<br></br><hr></hr></body></html>");
                   
        }
        catch (Exception e){
        e.printStackTrace();
        }
            }

}