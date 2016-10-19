package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.MemberVo;

@WebServlet("/04")
public class _04Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request scope
		MemberVo memberVo2 = new MemberVo();
		memberVo2.setNo(10l);
		memberVo2.setEmail("2@2.2");
		memberVo2.setName("@@");
		request.setAttribute("memberVo2", memberVo2);
		
		// session scope
		MemberVo memberVo3 = new MemberVo();
		memberVo3.setNo(11l);
		memberVo3.setEmail("3@3.3");
		memberVo3.setName("##");
		request.getSession(true).setAttribute("memberVo3", memberVo3);
		
		// application scope
		MemberVo memberVo4 = new MemberVo();
		memberVo4.setNo(12l);
		memberVo4.setEmail("4@4.4");
		memberVo4.setName("%%");
		request.getServletContext().setAttribute("memberVo4", memberVo4);
		
		request.getRequestDispatcher( "/view/04.jsp" ).forward( request, response );
	}
}
