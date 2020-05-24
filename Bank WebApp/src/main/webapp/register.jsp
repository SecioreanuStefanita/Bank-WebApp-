<%--
  Created by IntelliJ IDEA.
  User: Steph
  Date: 5/19/2020
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    html{
        height: 100%;
    }

    body {
        mergin: 0;
        padding: 0;
        font-family: 'Arial', sans-serif;
        background: linear-gradient(#141e30, #243b55);
    }

    .login-box {
        position: absolute;
        top: 50%;
        left: 50%;
        width: 400px;
        padding: 40px;
        transform: translate(-50%, -50%);
        background: rgba(0,0,0,.5);
        box-sizing: border-box;
        box-shadow: 0 15px 25px rgba(0,0,0,.6);
        border-radius: 10px;
    }

    .login-box h2 {
        margin: 0 0 30px;
        padding: 0;
        color: #F1EEE6;
        text-align: center;
    }

    .login-box .user-box {
        position: relative;
    }

    .login-box .user-box input {
        width: 100%;
        padding: 10px 0;
        font-size: 16px;
        color: #F1EEE6;
        margin-bottom: 30px;
        border: none;
        border-bottom: 1px solid #F1EEE6;
        outline: none;
        background: transparent;
    }

    .login-box .user-box label {
        position: absolute;
        top: 0;
        left: 0;
        padding: 10px 0;
        font-size: 16px;
        color: #F1EEE6;
        pointer-events: none;
        transition: .5s;
    }

    .login-box .user-box input:focus ~ label, .login-box .user-box input:valid ~ label {
        top: -20px;
        left: 0px;
        color: #03E9F4;
        font-size: 12px;
    }


    .login-box form a {
        position: relative;
        display: inline-block;
        padding: 10px 20px;
        color: #03E9F4;
        font-size: 16px;
        text-decoration: none;
        text-transform: uppercase;
        overflow: hidden;
        transition: .5s;
        margin-top: 40px;
        letter-spacing: 4px;
    }

    .login-box form a:hover {
        background: #03E9F4;
        color: #F1EEE6;
        border-radius: 5px;
        box-shadow: 0 0 5px #03E9F4,
        0 0 25px #03E9F4,
        0 0 50px #03E9F4,
        0 0 100px #03E9F4;
    }

    .login-box a span {
        position: absolute;
        display: block;
    }

    .login-box a span:nth-child(1) {
        top: 0;
        left: -100%;
        width: 100%;
        height: 2px;
        background: linear-gradient(90deg, transparent, #03e9f4);
        animation: btn-anim1 1s linear infinite;
    }

    @keyframes btn-anim1 {
        0% {
            left: -100%;
        }
        50%,100% {
            left: 100%;
        }
    }

    .login-box span:nth-child(2) {
        top: -100%;
        right: 0;
        width: 2px;
        height: 100%;
        background: linear-gradient(180deg, transparent, #03E9F4);
        animation: btn-anim2 1s linear infinite;
        animation-delay: .25s;
    }

    @keyframes btn-anim2 {
        0%{
            top: -100%;
        }
        50%,100% {
            top: 100%;
        }
    }

    .login-box span:nth-child(3){
        bottom: 0;
        tight: -100%;
        width: 100%;
        height: 2px;
        background: linear-gradient(270deg, transparent, #03E9F4);
        animation: btn-anim3 1s linear infinite;
        animation-delay: .5s;
    }

    @keyframes btn-anim3 {
        0%{
            right: -100%;
        }
        50%,100% {
            right: 100%;
        }
    }

    .login-box span:nth-child(4) {
        bottom: -100%;
        left: 0;
        width: 2px;
        height: 100%;
        background: linear-gradient(360deg, transparent, #30E9F4);
        animation: btn-anim4 1s linear infinite;
        animation-dealy: .75s;
    }

    @keyframes btn-anim4 {
        0% {
            bottom: -100%;
        }
        50%,100% {
            bottom: 100%;
        }
    }

    input[type=text] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        box-sizing: border-box;
    }

    input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        box-sizing: border-box;
    }
    input[type=submit] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        box-sizing: border-box;
        border-top-left-radius: 15px;
        border-top-right-radius: 15px;
        border-bottom-right-radius: 15px;
        border-bottom-left-radius: 15px;
        background: #ECAE34;
    }


</style>


<html>

<body>
<div class="login-box">
    <h2>Register</h2>

    <form align="center" method="post" action="/register">
        <input type="text" id="name" name="name" placeholder="Enter your username..."><br>
        <input type="password" id="password" name="password" placeholder="Enter your password..."><br>
        <input type="text" id="Nume_Complet" name="name" placeholder="Nume Complet..."><br>
        <input type="text" id="Email" name="name" placeholder="Email..."><br>
        <input type="text" id="Adresa" name="name" placeholder="Adresa..."><br>
        <input type="text" id="Oras" name="name" placeholder="Oras..."><br>
        <input type="text" id="Localitate" name="name" placeholder="Localitate..."><br>
        <input type="text" id="Zip" name="name" placeholder="Zip..."><br>
        <input type="submit" value="Register">
    </form>
</div>
</body>
</html>
