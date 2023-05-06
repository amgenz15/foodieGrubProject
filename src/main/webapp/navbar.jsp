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
            <a href="index.html" class="nav-item nav-link">Home</a>
            <a href="browseAll.html" class="nav-item nav-link">Browse All Recipes</a>
            <div class="nav-item dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Browse Recipes</a>
                <div class="dropdown-menu m-0">
                    <a href="breakfastRecipes.jsp" class="dropdown-item">Breakfast</a>
                    <a href="brunchRecipes.jsp" class="dropdown-item">Brunch</a>
                    <a href="lunchDinnerRecipes.jsp" class="dropdown-item">Lunch/Dinner</a>
                    <a href="snackRecipes.jsp" class="dropdown-item">Snacks</a>
                    <a href="drinkRecipes.jsp" class="dropdown-item">Drinks</a>
                </div>
            </div>
            <div>
                <form action="searchRecipe" method="get" class="form-inline" id="searchForm">
                    <input type="text" id="searchRecipeName" name="searchRecipeName" placeholder="Search a recipe name...">
                    <button type="submit" name="submit" value="search"><i class="fa fa-search"></i></button>
                </form>
            </div>
        </div>
    </div>
</nav>
