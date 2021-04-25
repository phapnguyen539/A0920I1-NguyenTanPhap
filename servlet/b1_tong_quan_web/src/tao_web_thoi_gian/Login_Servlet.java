package tao_web_thoi_gian;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login_Servlet", urlPatterns = "/dangnhap")
public class Login_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        PrintWriter write= response.getWriter();
        if("admin".equals(username)&& "admin".equals(password)){
            write.println("<h1> Wellcom"+ username+"to website</h1>");
        }else {
            write.println("<h1>login error</h1>");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/dang_nhap.jsp");
        dispatcher.forward(request, response);
    }
}
