package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 1. 객체의 Scope: 객체가 존재하는 범위
		 * 2. 객체가 오래 지속되는 순서
		 *    Application Scope > Session Scope > Request Scope > Page Scope
		 * 3. EL이 이름으로 객체를 찾는 순서
		 *    Application Scope < Session Scope < Request Scope < Page Scope
		 */
		
		
		// request scope
		UserVo vo1 = new UserVo();
		vo1.setNo(1L);
		vo1.setName("둘리1");
		request.setAttribute("vo", vo1);
		
		// session scope
		UserVo vo2 = new UserVo();
		vo2.setNo(2L);
		vo2.setName("둘리2");
		request.getSession().setAttribute("vo", vo2);
		
		// application scope
		UserVo vo3 = new UserVo();
		vo3.setNo(3L);
		vo3.setName("둘리3");
		request.getServletContext().setAttribute("vo", vo3);
		
		
		request
			.getRequestDispatcher("/WEB-INF/views/02.jsp")
			.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
