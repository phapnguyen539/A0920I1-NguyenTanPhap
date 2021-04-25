package tao_web_thoi_gian;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "Servlet_thoi_gian", urlPatterns = "/hello")
public class Servlet_thoi_gian extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("hello world ");
        printWriter.println("<html>");
        Date today = new Date();
        printWriter.println("<h1>"+ today +"</h1>");
        printWriter.println("</html>");
    }
}
