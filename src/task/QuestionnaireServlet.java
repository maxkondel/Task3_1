package task;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class QuestionnaireServlet extends HttpServlet {

    static int question1_YES = 0;
    static int question1_NO = 0;
    static int question2_YES = 0;
    static int question2_NO = 0;


    static final String TEMPLATE = "html" +
            "<head><title>task</title></head>" +
            "<body>%s</body></html>";


    public  void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {

        final String name = req.getParameter("name");
        final String surname = req.getParameter("surname");
        final String age = req.getParameter("age");

        final String q1 = req.getParameter("question1");
        final String q2 = req.getParameter("question2");

        if (q1.equals("yes")) question1_YES++;
            else question1_NO++;
        if (q2.equals("yes")) question2_YES++;
            else question2_NO++;

        String res = "<p>Question 1: "+ question1_YES + " times YES, " +  question1_NO + " times NO </p>";
        res +="<p>Question 2: "+ question2_YES + " times YES, " +  question2_NO + " times NO </p>";

        resp.getWriter().println(String.format(TEMPLATE, res));
    }

}
