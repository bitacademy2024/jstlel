package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _03Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<UserVo> list = new ArrayList<>();
		
		UserVo vo = null;
		
		vo = new UserVo();
		vo.setNo(1L);
		vo.setName("둘리");
		list.add(vo);
		
		vo = new UserVo();
		vo.setNo(2L);
		vo.setName("마이콜");
		list.add(vo);
		
		vo = new UserVo();
		vo.setNo(3L);
		vo.setName("또치");
		list.add(vo);
		
		request.setAttribute("list", list);
		
		request
			.getRequestDispatcher("/WEB-INF/views/03.jsp")
			.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
