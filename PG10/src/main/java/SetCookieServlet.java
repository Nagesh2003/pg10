import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.*;
public class SetCookieServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// Create a cookie
Cookie cookie = new Cookie("EMPID", "AN2356");
// Set cookie properties
cookie.setMaxAge(3600); // Cookie expires in 1 hour
cookie.setPath("/"); // Cookie is accessible from the root path
// Add cookie to the response
response.addCookie(cookie);
// Inform the user that the cookie is set
response.setContentType("text/html");
response.getWriter().println("Cookie 'EMPID' with value 'AN2356' is set.");
}
}