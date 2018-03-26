import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private int counter = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            counter += 1;
            String name = req.getParameter("name");
            String reset = req.getParameter("reset");
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            if (name == null) {
                name = "World";
            }
            out.println("<h1>Hello " + name + "</h1>" + "<h2>This is tricky</h2>");
            out.print("<h3>Counter " + counter + "</h3>");
            if (reset.equalsIgnoreCase("reset") ) {
                counter = 0;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
