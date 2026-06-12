<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
</head>

<body>

<h2>User Registration</h2>

<form action="registerProcess.jsp" method="post">

    Name:
    <input type="text" name="name" required>
    <br><br>

    Email:
    <input type="email" name="email" required>
    <br><br>

    Username:
    <input type="text" name="username" required>
    <br><br>

    Password:
    <input type="password" name="password" required>
    <br><br>

    Confirm Password:
    <input type="password" name="confirmPassword" required>
    <br><br>

    Gender:
    <input type="radio" name="gender" value="Male"> Male
    <input type="radio" name="gender" value="Female"> Female
    <br><br>

    Country:
    <select name="country">
        <option value="USA">USA</option>
        <option value="Nepal">Nepal</option>
        <option value="India">India</option>
    </select>

    <br><br>

    <button type="submit">Register</button>

</form>

</body>
</html>