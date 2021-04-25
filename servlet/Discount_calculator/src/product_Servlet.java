import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "product_Servlet",urlPatterns = "/sanpham")
public class product_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float sanpham= Float.parseFloat(request.getParameter("sanpham"));
        float tile= Float.parseFloat(request.getParameter("gia"));

        double discount= sanpham * tile *0.01;
        PrintWriter writer= response.getWriter();
        writer.println("San pham:"+ sanpham);
        writer.println("Gia sp"+tile);
        writer.println("Ti le chiet khau"+ discount);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
