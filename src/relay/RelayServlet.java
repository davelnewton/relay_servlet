package relay;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RelayServlet extends javax.servlet.http.HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String command = request.getParameter("command");
        System.out.println("=> command='" + command + "'");

        String url = "/" + command;
        String encodedUrl = response.encodeRedirectURL(url);
        System.out.println("   url=" + url);
        System.out.println("   encodedUrl=" + encodedUrl);
        response.sendRedirect(encodedUrl);
    }
}
