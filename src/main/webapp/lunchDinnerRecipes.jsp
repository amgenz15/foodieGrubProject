<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<c:set var="title" value="Search Results"/>

<html>
<body>
<c:import url="topbar.jsp"/>
<c:import url="navbar.jsp"/>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="myTable" class="display">
        <thead>
        <th>Recipe Name:</th>
        <th>Calories:</th>
        <th>Protein:</th>
        <th>Carbohydrates:</th>
        <th>Fat:</th>
        <th>Total Time:</th>
        <th>Type:</th>
        <th>Serving:</th>
        </thead>
        <tbody>
        <c:forEach var="recipe" items="${recipes}">
            <tr>
                <td>${recipe.recipeName}</td>
                <td>${recipe.calories}</td>
                <td>${recipe.protein}</td>
                <td>${recipe.carbohydrates}</td>
                <td>${recipe.fat}</td>
                <td>${recipe.totalTimeInMin}</td>
                <td>${recipe.type}</td>
                <td>${recipe.serving}</td>
                <td><button type="submit" name="submit" value="recipeDetails">View Details</button></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<c:import url="footer.jsp"/>
</body>
</html>
