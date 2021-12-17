package crupoperations;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		String empid = req.getParameter("empid");
		
		BatchFour delete = new BatchFour();
		delete.setEMP_ID(empid);
		
		DataBaseJava.deleteData(delete);
		
	}
}
