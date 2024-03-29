<%--
  Created by IntelliJ IDEA.
  User: amgenz
  Date: 3/22/23
  Time: 9:45 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg bg-primary navbar-dark shadow-sm py-3 py-lg-0 px-3 px-lg-5">
    <a href="index.jsp" class="navbar-brand d-flex d-lg-none">
        <h1 class="m-0 display-4 text-secondary"><span class="text-white">Foodie</span>Grub</h1>
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <div class="navbar-nav mx-auto py-0">
            <a href="index.jsp" class="nav-item nav-link">Home</a>
            <a href="displayRecipes" class="nav-item nav-link">Browse All Recipes</a>
            <div>
                <form action="searchRecipe" method="get" class="form-inline" id="searchForm">
                    <input type="text" id="searchRecipeName" name="searchRecipeName" placeholder="Search a recipe name...">
                    <button type="submit" name="submit" value="search">Search</button>
                </form>
            </div>
        </div>
    </div>
</nav>
