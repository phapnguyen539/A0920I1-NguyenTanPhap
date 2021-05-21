<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 5/3/2021
  Time: 8:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        header {
            position: relative;
        }

        .shopping-mall {
            margin-top: auto;
            font-variant: small-caps;
        }

        .shopping-mall > h1 {
            font-family: Impact;
            font-size: 50px;
            color: white;
            letter-spacing: 0.3px;
            text-shadow: 0 0 2px black;
            padding-bottom: 0px;
            border-bottom: 1px dotted gray;
            margin: 0px;
            width: 49%;
        }

        .shopping-mall > h5 {
            margin-top: 5px;
            letter-spacing: 0.5px;
            font-size: small;
        }

        .poly-cart {
            margin-top: 5px;
        }

        .poly-cart ul {
            padding: 0px;
            margin: 0px;
            list-style: none;
            font-variant: small-caps;
        }

        .poly-cart .panel-heading strong {
            font-variant: small-caps;
            font-size: larger;
            text-shadow: 0 0 2px darkgray;
        }

        .poly-prod {
            text-align: center;
            padding: 5px;
        }

        .poly-prod .panel-body img {
            height: 150px;
            max-width: 95%;
        }

        .card-title {
            margin-top: 0;
            margin-bottom: 0;
            font-size: 16px;
            color: inherit;
        }

        a.list-group-item, button.list-group-item {
            color: #555;
        }
    </style>
</head>
<body>
<div class="container" style="height: auto">
    <header class="row">
        <div class="col-sm-8 shopping-mall">
            <h1>Online shopping mall</h1>
            <h5>The center point of the professional programming</h5>
        </div>
        <img class="col-sm-4" src="images/header-object.png"/>
    </header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03"
                aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="#">Navbar</a>

        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Disabled</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
    <div class="row">
        <article class="col-sm-9">
            <div class="row">
                <div class="col-sm-3 poly-prod">
                    <div class="card card-default">
                        <div class="card-header">
                            <h4 class="card-title">
                                Nokia
                            </h4>
                        </div>
                        <div class="card-body">
                            <img src="images/computer.png"/></div>
                        <div class="card-footer">
                            $ 100.25
                        </div>
                    </div>
                </div>
                <div class="col-sm-3 poly-prod">
                    <div class="card card-default">
                        <div class="card-header">
                            <h4 class="card-title">
                                Nokia
                            </h4>
                        </div>
                        <div class="card-body">
                            <img src="images/computer.png"/></div>
                        <div class="card-footer">
                            $ 100.25
                        </div>
                    </div>
                </div>
                <div class="col-sm-3 poly-prod">
                    <div class="card card-default">
                        <div class="card-header">
                            <h4 class="card-title">
                                Nokia
                            </h4>
                        </div>
                        <div class="card-body">
                            <img src="images/computer.png"/></div>
                        <div class="card-footer">
                            $ 100.25
                        </div>
                    </div>
                </div>
                <div class="col-sm-3 poly-prod">
                    <div class="card card-default">
                        <div class="card-header">
                            <h4 class="card-title">
                                Nokia
                            </h4>
                        </div>
                        <div class="card-body">
                            <img src="images/computer.png"/></div>
                        <div class="card-footer">
                            $ 100.25
                        </div>
                    </div>
                </div>
                <div class="col-sm-3 poly-prod">
                    <div class="card card-default">
                        <div class="card-header">
                            <h4 class="card-title">
                                Nokia
                            </h4>
                        </div>
                        <div class="card-body">
                            <img src="images/computer.png"/></div>
                        <div class="card-footer">
                            $ 100.25
                        </div>
                    </div>
                </div>
            </div>
        </article>
        <aside class="col-sm-3">
            <div class="poly-cart">
                <div class="card">
                    <div class="card-body">
                        <img class="col-sm-5" src="images/shoppingcart.gif"/>
                        <ul class="col-sm-7">
                            <li>100 items</li>
                            <li>$56.8</li>
                            <li><a href="#">Xem giỏ hàng</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="card card-default">
                <div class="card-body">
                    <form>
                        <input placeholder="Keywords" class="form-control"/>
                    </form>
                </div>
            </div>
            <div class="card">
                <div class="card-header">
                    <span class="glyphicon glyphicon-th-list"></span>
                    <strong>Chủng Loại</strong>
                </div>
                <div class="list-group">
                    <a href="#" class="list-group-item">Điện thoại di động</a>
                    <a href="#" class="list-group-item">Máy tính xách tay</a>
                    <a href="#" class="list-group-item">Máy tính để bàn</a>
                    <a href="#" class="list-group-item">Quạt máy</a>
                    <a href="#" class="list-group-item">Tivi</a>
                    <a href="#" class="list-group-item">Tủ lạnh</a>
                </div>
            </div>
        </aside>
    </div>
    <footer class="card">
        <div class="card-header text-center">
            <p>CodeGym &copy; 2017</p>
        </div>
    </footer>
</div>

</body>
</html>
