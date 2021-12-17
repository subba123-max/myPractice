package crupoperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		PrintWriter out  = res.getWriter();
		System.out.println("insert data");
		String name = req.getParameter("empname");
		String id = req.getParameter("empid");
		String mail = req.getParameter("empmail");
		String phnum = req.getParameter("empnum");
		
		BatchFour insert = new BatchFour ();
		insert.setEMP_NAME(name);
		insert.setEMP_ID(id);
		insert.setEMP_MAIL(mail);
		insert.setPHONE_NUM(phnum);
		
		DataBaseJava.insertData(insert);
		
		
	}
}
