<%--
  Created by IntelliJ IDEA.
  User: amgenz
  Date: 3/22/23
  Time: 9:42 PM
--%>
<%@include file="taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container-fluid px-5 d-none d-lg-block">
    <div class="row gx-5 py-3 align-items-center">
        <div class="col-lg-3">
            <div class="d-flex align-items-center justify-content-start">
                <img src="./images/foodieIcon.png" id="logoIcon" class="img-thumbnail img-fluid" alt="Foodie Grub Icon">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="d-flex align-items-center justify-content-center">
                <a href="index.html" class="navbar-brand ms-lg-5">
                    <h1 class="m-0 display-4 text-primary"><span class="text-secondary">Foodie</span>Grub</h1>
                </a>
            </div>
        </div>
        <div class="col-lg-3">
            <div class="d-flex align-items-center justify-content-end">
                <img src="./images/userIcon.png" id="userIcon" class="img-thumbnail img-fluid m-2" alt="User Icon">
                <c:choose>
                    <c:when test="${empty userName}">
                        <a href="./logIn" class="m-1">Log In</a>
                    </c:when>
                    <c:otherwise>
                        <p><a href="userProfile.jsp">Welcome ${userName}</a></p><br>
                        <p><a href="./logOut">Log Out</a></p>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </div>
</div>
