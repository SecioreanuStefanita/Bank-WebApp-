<%@ page import="repositories.UserRepository" %><%--
  Created by IntelliJ IDEA.
  User: Steph
  Date: 5/20/2020
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>




    .overlay {
        height: 100%;
        width: 0;
        position: fixed;
        z-index: 1;
        top: 0;
        left: 0;
        background-color: rgb(0,0,0);
        background-color: rgba(0,0,0, 0.9);
        overflow-x: hidden;
        transition: 0.5s;
    }

    .overlay-content {
        position: relative;
        top: 25%;
        width: 100%;
        text-align: center;
        margin-top: 30px;
    }

    .overlay a {
        padding: 8px;
        text-decoration: none;
        font-size: 36px;
        color: #818181;
        display: block;
        transition: 0.3s;
    }

    .overlay a:hover, .overlay a:focus {
        color:#39cccc;
    }

    .overlay .closebtn {
        position: absolute;
        top: 20px;
        right: 45px;
        font-size: 60px;
    }

    @media screen and (max-height: 450px) {
        .overlay a {font-size: 20px}
        .overlay .closebtn {
            font-size: 40px;
            top: 15px;
            right: 35px;
        }
    }


    body {
        font-family: Arial;
        font-size: 17px;
        padding: 8px;
    }

    * {
        box-sizing: border-box;
    }

    .row {
        display: -ms-flexbox; /* IE10 */
        display: flex;
        -ms-flex-wrap: wrap; /* IE10 */
        flex-wrap: wrap;
        margin: 0 -16px;
    }

    .col-25 {
        -ms-flex: 25%; /* IE10 */
        flex: 25%;
    }

    .col-50 {
        -ms-flex: 50%; /* IE10 */
        flex: 50%;
    }

    .col-75 {
        -ms-flex: 75%; /* IE10 */
        flex: 75%;
    }

    .col-25,
    .col-50,
    .col-75 {
        padding: 0 16px;

    }

    .container {
        background-color: #f2f2f2;
        padding: 5px 20px 15px 20px;
        border: 1px solid lightgrey;
        border-radius: 3px;
    }

    input[type=text] {
        width: 100%;
        margin-bottom: 20px;
        padding: 12px;
        border: 1px solid #ccc;
        border-radius: 3px;
    }

    label {
        margin-bottom: 10px;
        display: block;
    }

    .icon-container {
        margin-bottom: 20px;
        padding: 7px 0;
        font-size: 24px;
    }

    .btn {
        background-color: #39cccc;
        color: white;
        padding: 12px;
        margin: 10px 0;
        border: none;
        width: 100%;
        border-radius: 3px;
        cursor: pointer;
        font-size: 17px;
    }

    .btn:hover {
        background-color: #39cccc;
    }

    a {
        color: #2196F3;
    }

    hr {
        border: 1px solid lightgrey;
    }

    span.price {
        float: right;
        color: grey;
    }

    /* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
    @media (max-width: 800px) {
        .row {
            flex-direction: column-reverse;
        }
        .col-25 {
            margin-bottom: 20px;
        }
    }
</style>
<html>
<head>
</head>
<body>

<p style="font-size: 30px;text-align: center;position: center;padding-top: 10px;" align="center">
<div id="myNav" class="overlay">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <div class="overlay-content">
        <a href="/mainpagehello?userName=<%=request.getParameter("userName") %>">Pagina Hello</a>
        <a href="/Date Personale?userName=<%=request.getParameter("userName") %>">Date Personale</a>
        <a href="/AdaugareCont?userName=<%=request.getParameter("userName") %>">Adaugare Cont</a>
    </div>
</div>
<span style="font-size:30px;cursor:pointer;alignment:center;text-align: center;" onclick="openNav()">&#9776; Open Menu </span>
<div class="row">
    <div class="col-75">
        <div class="container">
            <form action="/Date Personale" method="post">

                <div class="row">
                    <div class="col-50">
                        <h3>Date Personale</h3>
                        <input type="hidden" name="userName" value="<%=request.getAttribute("name")%>">
                        <label for="fname"><i class="fa fa-user"></i> Nume Complet</label>
                        <input type="text" id="fname" name="fname" placeholder="<%=UserRepository.getNume_completByUsername(request.getParameter("userName"))%>">
                        <label for="email"><i class="fa fa-envelope"></i> Email</label>
                        <input type="text" id="email" name="email" placeholder="<%=UserRepository.getEmailByUsername(request.getParameter("userName"))%>">
                        <label for="adr"><i class="fa fa-address-card-o"></i> Adresa</label>
                        <input type="text" id="adr" name="adr" placeholder="<%=UserRepository.getAdresaByUsername(request.getParameter("userName"))%>">
                        <label for="city"><i class="fa fa-institution"></i> Oras</label>
                        <input type="text" id="city" name="city" placeholder="<%=UserRepository.getOrasByUsername(request.getParameter("userName"))%>">

                        <div class="row">
                            <div class="col-50">
                                <label for="state">Localitate</label>
                                <input type="text" id="state" name="state" placeholder="<%=UserRepository.getLocalitateByUsername(request.getParameter("userName"))%>">
                            </div>
                            <div class="col-50">
                                <label for="zip">Zip</label>
                                <input type="text" id="zip" name="zip" placeholder="<%=UserRepository.getZipByUsername(request.getParameter("userName"))%>">
                            </div>
                        </div>
                    </div>

                </div>
                <input type="submit" name="btn_submit" value="Actualizeaza Date Personale" class="btn">
            </form>
        </div>
    </div>

</div>



</body>
</html>

<script> function openNav() {
    document.getElementById("myNav").style.width = "30%";
}

function closeNav() {
    document.getElementById("myNav").style.width = "0%";
}</script>
