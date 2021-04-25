package controler;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SaveStudentServlet",urlPatterns = "/save")
public class SaveStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id= request.getParameter("id");
        String name= request.getParameter("name");
        int age= Integer.parseInt(request.getParameter("age"));
        String address= request.getParameter("address");
        Student student= new Student(id,name,age,address);
        StudentService studentService=new StudentServiceImpl();
        studentService.saveStudent(student);
        response.sendRedirect("list");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request,response);
    }
}
