import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	super.init();
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
PrintWriter pw = resp.getWriter();

	String userName = req.getParameter("un");
	String passWord = req.getParameter("pwd");
	
	if(userName.equals("Anubhuti") && passWord.equals("Anu"))
	{
System.out.println("Welcome: "+userName);
pw.write("<h1>Valid User</h1>");
	}
	else
	{
		pw.write("<h1>InValid User</h1>");

	}
}
}
