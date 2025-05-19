<%--
Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively
--%>

<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Coffee Product</title>
</head>
<body>

<h2>Delete Coffee Product by ID</h2>
<form method="post" action="">
    Enter Coffee ID to Delete: <input type="number" name="id" required>
    <input type="submit" value="Delete">
</form>

<%
    // Database connection details
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    String password = "";

    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    // Get the ID from form input
    String idStr = request.getParameter("id");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        // Perform delete operation if form is submitted
        if (idStr != null) {
            int id = Integer.parseInt(idStr);
            String deleteSQL = "DELETE FROM coffee WHERE id=?";
            pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                out.println("<p style='color:green;'>Coffee product with ID " + id + " deleted successfully.</p>");
            } else {
                out.println("<p style='color:red;'>No coffee product found with ID " + id + ".</p>");
            }
        }

        // Display all remaining records
        stmt = conn.createStatement();
        String selectSQL = "SELECT * FROM coffee";
        rs = stmt.executeQuery(selectSQL);

        out.println("<h2>All Coffee Records</h2>");
        out.println("<table border='1'><tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("coffee_name") + "</td>");
            out.println("<td>" + rs.getInt("price") + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        e.printStackTrace();
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>

</body>
</html>
