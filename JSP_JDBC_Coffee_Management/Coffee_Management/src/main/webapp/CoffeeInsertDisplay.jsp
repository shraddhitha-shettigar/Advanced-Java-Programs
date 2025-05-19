<%--
Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively
--%>


<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee Management</title>
</head>
<body>

<h2>Insert New Coffee Product</h2>
<form method="post" action="">
    ID: <input type="number" name="id" required><br><br>
    Coffee Name: <input type="text" name="coffee_name" required><br><br>
    Price: <input type="number" name="price" required><br><br>
    <input type="submit" value="Add Coffee">
</form>

<%
    // Database credentials
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    String password = ""; // Adjust based on your local setup

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    // Read form inputs
    String idStr = request.getParameter("id");
    String coffeeName = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    try {
        // Load JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        // Insert coffee only if form was submitted
        if (idStr != null && coffeeName != null && priceStr != null) {
            int id = Integer.parseInt(idStr);
            int price = Integer.parseInt(priceStr);

            String insertSQL = "INSERT INTO coffee (id, coffee_name, price) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, id);
            pstmt.setString(2, coffeeName);
            pstmt.setInt(3, price);
            pstmt.executeUpdate();
        }

        // Display all coffee records
        String selectSQL = "SELECT * FROM coffee";
        stmt = conn.createStatement();
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
