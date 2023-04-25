<%--
  Created by IntelliJ IDEA.
  User: amgenz
  Date: 3/22/23
  Time: 9:45 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg bg-primary navbar-dark shadow-sm py-3 py-lg-0 px-3 px-lg-5">
    <a href="index.html" class="navbar-brand d-flex d-lg-none">
        <h1 class="m-0 display-4 text-secondary"><span class="text-white">Foodie</span>Grub</h1>
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <div class="navbar-nav mx-auto py-0">
            <a href="index.html" class="nav-item nav-link active">Home</a>
            <a href="about.html" class="nav-item nav-link">About</a>
            <div class="nav-item dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Browse Recipes</a>
                <div class="dropdown-menu m-0">
                    <a href=".html" class="dropdown-item">Breakfast</a>
                    <a href=".html" class="dropdown-item">Lunch</a>
                    <a href=".html" class="dropdown-item">Dinner</a>
                    <a href=".html" class="dropdown-item">Snacks</a>
                    <a href=".html" class="dropdown-item">Drinks</a>
                </div>
            </div>
            <form action="searchRecipe">
                <div>
                    <label for="searchRecipeName">Search Recipes:</label>
                    <input type="text" id="searchRecipeName" name="searchRecipeName" >

                </div>
                <button type="submit" name="submit" value="search">Search</button>
            </form>
        </div>
    </div>
</nav>
