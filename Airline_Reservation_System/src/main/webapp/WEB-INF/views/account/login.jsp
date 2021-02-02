<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<body>

<h1>Login</h1>

<form method="post">
    <label for="username">
        Username:
        <input type="text" id="username" name="username">
    </label>
    <br/>

    <label for="password">
        Password:
        <input type="password" id="password" name="password">
    </label>
    <br/>

    <label for="login">
        <button type="submit" id="login" name="login">Login</button>
    </label>

    <a href="/account/forgot">Forgot Password ??</a>
</form>

</body>
</html>