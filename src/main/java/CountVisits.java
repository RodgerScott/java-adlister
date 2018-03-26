import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

    @WebServlet(name = "CountVisits", urlPatterns = "/counter")
    public class CountVisits extends HttpServlet {

        private int counter = 0;

        protected void doGet(HttpServletRequest req, HttpServletResponse res) {
            try {
                counter += 1;
                res.setContentType("text/html");
                PrintWriter out = res.getWriter();
                out.println("<h1>Hello, Jorld!</h1> <h2>This is tricky</h2>");
                out.print("<h3>Counter " + counter + "</h3>");

                } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

