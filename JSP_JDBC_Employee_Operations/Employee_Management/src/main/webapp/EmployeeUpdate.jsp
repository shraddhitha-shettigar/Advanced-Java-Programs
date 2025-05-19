<%--
Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively
--%>


<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>
</head>
<body>
    <h2>Update Employee Details</h2>

    <form method="post">
        <label>Emp No:</label>
        <input type="text" name="empno" required /><br/><br/>

        <label>Emp Name:</label>
        <input type="text" name="empname" required /><br/><br/>

        <label>Basic Salary:</label>
        <input type="text" name="basicsalary" required /><br/><br/>

        <input type="submit" value="Update Employee" />
    </form>

    <hr/>

<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement ps = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC", "root", "");

        if (empno != null && empname != null && basicsalary != null) {
            String sql = "UPDATE Emp SET Emp_Name = ?, BasicSalary = ? WHERE Emp_no = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, empname);
            ps.setDouble(2, Double.parseDouble(basicsalary));
            ps.setInt(3, Integer.parseInt(empno));

            int rows = ps.executeUpdate();

            if (rows > 0) {
                out.println("<p style='color:green;'>Employee updated successfully.</p>");
            } else {
                out.println("<p style='color:red;'>Employee with Emp No " + empno + " not found.</p>");
            }
        }

        // Now fetch and display all employee records
        out.println("<h2>All Employee Records</h2>");
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<table border='1'>");
        out.println("<tr><th>Emp No</th><th>Emp Name</th><th>Basic Salary</th></tr>");
        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("Emp_no") + "</td>");
            out.println("<td>" + rs.getString("Emp_Name") + "</td>");
            out.println("<td>" + rs.getDouble("BasicSalary") + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");

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
