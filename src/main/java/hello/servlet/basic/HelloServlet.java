package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
    서블릿 요청 응답 해보기
 */

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username"); //쿼리 파라미터 조회
        System.out.println("username = " + username);

        //Content-Type 헤더정보에 들어감
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().write("Hello " + username);
    }
}
