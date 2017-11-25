

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adds
 */
@WebServlet("/adds")
public class adds extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adds() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s = request.getParameter("num1");
		String s1 = request.getParameter("num2");
		int num1=Integer.parseInt(s);
		int num2=Integer.parseInt(s1);
		int sum = num1 + num2;
		PrintWriter out = response.getWriter();
		out.println("Sum = "+sum);
		out.println("<br><a href='index.html'>back to home</a>");
		
		
				
	}

}
