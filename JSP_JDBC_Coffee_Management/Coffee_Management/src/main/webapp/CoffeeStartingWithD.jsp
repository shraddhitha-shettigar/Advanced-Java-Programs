<%--
Read all the existing records from the table coffee which is from the database test and query
coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively
--%>

<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee Products Starting with 'D'</title>
</head>
<body>

<h2>Coffee Products with Names Starting with 'D'</h2>

<%
    // Database connection details
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    String password = "";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(query);

        out.println("<table border='1'><tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

        boolean found = false;
        while (rs.next()) {
            found = true;
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("coffee_name") + "</td>");
            out.println("<td>" + rs.getInt("price") + "</td>");
            out.println("</tr>");
        }

        if (!found) {
            out.println("<tr><td colspan='3'>No coffee found starting with 'D'</td></tr>");
        }

        out.println("</table>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        e.printStackTrace();
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>

</body>
</html>
