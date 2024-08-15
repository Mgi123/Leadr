<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
   
    
   <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        .header {
            background-color: #4CAF50;
            color: white;
            text-align: center;
            padding: 10px 0;
            border-bottom: 4px solid #388E3C; /* Border at the bottom */
        }
        .footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px 0;
            border-top: 4px solid #222; /* Border at the top */
            position: fixed;
            width: 100%;
            bottom: 0;
        }
        .login-box {
            width: 300px;
            margin: 80px auto;
            background-color: #fff;
            padding: 20px;
            box-shadow: 0px 0px 10px 0px #aaa;
            border-radius: 8px;
            border: 2px solid #4CAF50; /* Border around the login box */
        }
        .login-box h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
        .login-box input[type="text"],
        .login-box input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .login-box input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin-top: 10px;
        }
        .login-box input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="header">
    <h1>Leads Management System</h1>
</div>

<div class="login-box">
    <h2>Login</h2>
    <form action="/login" method="post" class="login">
        <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
    </form>
</div>

<div class="footer">
    <p>© 2024 My Website. All rights reserved.</p>
</div>

</body>
</html>
