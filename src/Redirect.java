import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class Redirect extends HttpServlet {
    private static int count=0;
    private static int size=0;
    private static Random random = new Random();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        count++;
        size = random.nextInt(10);
        Date date = new Date();

        req.setAttribute("font_size",size);
        req.setAttribute("current_date",date.toString());
        req.setAttribute("current_count",count);
        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
