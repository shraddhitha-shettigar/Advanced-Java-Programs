//Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.


package com.primenumber;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/primeNumber")
public class PrimeNumberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try {
            // Get the number from the form
            int number = Integer.parseInt(request.getParameter("number"));
            
            // Validate input
            if (number < 0) {
                throw new IllegalArgumentException("Please enter a positive number.");
            }

            // Check if the number is prime
            boolean isPrime = true;
            if (number == 0 || number == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Generate HTML response
            out.println("<html>");
            out.println("<head><title>Prime Number Result</title></head>");
            out.println("<body>");
            out.println("<h2>Prime Number Checker</h2>");
            
            // Output the result
            if (isPrime) {
                out.println("<p>" + number + " is a prime number.</p>");
            } else {
                out.println("<p>" + number + " is not a prime number.</p>");
            }

            // Provide a link to go back to the input form
            out.println("<br><a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            displayError(out, "Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            displayError(out, e.getMessage());
        }
    }

    private void displayError(PrintWriter out, String message) {
        out.println("<html>");
        out.println("<head><title>Error</title></head>");
        out.println("<body>");
        out.println("<div style='color: red;'>");
        out.println("<h2>Error</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<a href='index.html'>Try Again</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}

