<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<c:set var="title" value="Search Results"/>

<html>
<body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table>
        <tbody>
        <c:forEach var="recipe" items="${recipes}">
            <tr>
                <td>Recipe Name: ${recipe.recipeName}</td>
                <td>Calories: ${recipe.calories}</td>
                <td>Protein: ${recipe.protein}</td>
                <td>Carbohydrates: ${recipe.carbohydrates}</td>
                <td>Fat: ${recipe.fat}</td>
                <td>Total Time: ${recipe.totalTimeInMin}</td>
                <td>Type: ${recipe.type}</td>
                <td>Servings: ${recipe.serving}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>