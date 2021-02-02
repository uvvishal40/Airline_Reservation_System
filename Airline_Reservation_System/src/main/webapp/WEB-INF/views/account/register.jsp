<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>
</head>
<body>

<h1>Register</h1>

<form method="post">
    <label for="username">
        Username:
        <input type="text" id="username" name="username">
    </label>
    <br/>

    <label for="email">
        Email:
        <input type="email" id="email" name="email">
    </label>
    <br/>

    <label for="password">
        Password:
        <input type="password" id="password" name="password">
    </label>
    <br/>

    <label for="register">
        <button type="submit" id="register" name="register">Register</button>
    </label>
</form>

</body>
</html>