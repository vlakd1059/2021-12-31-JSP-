package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Maketable")
public class Ex06Maketable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		// ����ڰ� �Է��� ���ڸ� ������ ����
		int room = Integer.parseInt(request.getParameter("room"));

		out.print("<html>");
		out.print("<head><title>�� ����</title></head>");
		out.print("<body>");
		out.print("<table border='1'>");
		out.print("<tr>");
		for (int i = 1; i <= room; i++) {
			out.print("<td>" + i + "</td>");
		}
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");

	}

}
