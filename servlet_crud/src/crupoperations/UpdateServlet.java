package crupoperations;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req , HttpServletResponse res)
	{
		String empid = req.getParameter("empid");
		String empname = req.getParameter("empname");
		//String phnum = req.getParameter("empnum");
		
		BatchFour four = new BatchFour();
		four.setEMP_ID(empid);
		four.setEMP_NAME(empname);
		//four.setPHONE_NUM(phnum);
		
		DataBaseJava.updateData(four);
	}
}
