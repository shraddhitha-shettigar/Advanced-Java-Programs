<%--
Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively.
--%>

<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Employees Starting with 'S'</title>
</head>
<body>
    <h2>Delete Employees with Names Starting with 'S'</h2>

    <form method="post">
        <label>Enter starting letter (e.g., S):</label>
        <input type="text" name="startLetter" maxlength="1" required />
        <input type="submit" value="Delete Records" />
    </form>

    <hr/>

<%
    String startLetter = request.getParameter("startLetter");

    Connection conn = null;
    Statement stmt = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC", "root", "");

        if (startLetter != null && !startLetter.isEmpty()) {
            // Delete employees whose names start with the given letter
            String deleteQuery = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
            ps = conn.prepareStatement(deleteQuery);
            ps.setString(1, startLetter + "%");
            int deleted = ps.executeUpdate();

            out.println("<p style='color:green;'>" + deleted + " record(s) deleted where name starts with '" + startLetter + "'.</p>");
        }

        // Generate the salary report
        out.println("<h2>Salary Report</h2>");
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        while (rs.next()) {
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>");
            out.println("Emp_No : " + rs.getInt("Emp_no") + "<br/>");
            out.println("Emp_Name: " + rs.getString("Emp_Name") + "<br/>");
            out.println("Basic : " + rs.getDouble("BasicSalary") + "<br/>");
        }
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (ps != null) ps.close(); } catch (Exception e) {}
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>

</body>
</html>
