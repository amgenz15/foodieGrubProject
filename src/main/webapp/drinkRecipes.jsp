<%@include file="taglib.jsp"%>

<html>
<%@include file="head.jsp"%>
<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#recipeTable').DataTable();
    });
</script>
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
                <form action="recipeDetails" name="recipe" mathod="GET">
                    <input type="hidden" id="recipeId" name="recipeId" value="${recipe.id}">
                    <button type="submit" name="submit" value="recipeDetails">View Details</button>
                </form>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<c:import url="footer.jsp"/>
</body>
</html>

