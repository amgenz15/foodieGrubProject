<%@include file="taglib.jsp"%>
<html>

<c:import url="head.jsp"/>
<body role="document">
<c:import url="topbar.jsp"/>
<c:import url="registeredUserNavbar.jsp"/>


<div>
    <div>
        <div>
            <h3>Welcome ${user.username}! Here is your profile!</h3>
            </div>
            <div>
                <p>First Name: ${user.firstName}</p>
                <p>Last Name: ${user.lastName}</p>
                <p>Full Name: ${user.fullName}</p>
                <p>Email: ${user.email}</p>
            </div>
            <div>
                <form action="editUser" name="user" method="GET">
                    <input type="hidden" id="userId" name="userId" value="${user.id}">
                    <button type="submit" name="submit" value="editUser">Edit Profile</button>
                </form>
            </div>
    </div>
</div>
<br><br>
<div class="container-fluid">
    <table id="recipeTable" class="display">
        <thead>
        <th>Recipe Name:</th>
        <th>Calories:</th>
        <th>Protein:</th>
        <th>Carbohydrates:</th>
        <th>Fat:</th>
        <th>Total Time:</th>
        <th>Type:</th>
        <th>Serving:</th>
        <th></th>
        </thead>
        <tbody>
        <c:forEach var="recipe" items="${userRecipes}">
            <tr>
                <td>${recipe.recipeName}</td>
                <td>${recipe.calories}</td>
                <td>${recipe.protein}</td>
                <td>${recipe.carbohydrates}</td>
                <td>${recipe.fat}</td>
                <td>${recipe.totalTimeInMin}</td>
                <td>${recipe.type}</td>
                <td>${recipe.serving}</td>
                <td>
                    <form action="deleteRecipe" name="recipe" method="GET">
                        <input type="hidden" id="recipeId" name="recipeId" value="${recipe.id}">
                        <button type="submit" name="submit" value="deleteRecipe">Delete</button>
                    </form>
                </td>

            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>



<c:import url="footer.jsp"/>
</body>
</html>