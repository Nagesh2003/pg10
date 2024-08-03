import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.*;
public class ReadCookieServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// Get all cookies from the request
Cookie[] cookies = request.getCookies();
// Find the cookie with name "EMPID"
String empId = null;
if (cookies != null) {
for (Cookie cookie : cookies) {
if (cookie.getName().equals("EMPID")) {
empId = cookie.getValue();
break;
}
}
}
// Respond with the value of the cookie
response.setContentType("text/html");
if (empId != null) {
response.getWriter().println("EMPID: " + empId);
} else {
response.getWriter().println("No cookie found with name EMPID");
}
}
}