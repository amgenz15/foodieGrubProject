<%@include file="taglib.jsp"%>
<html>
<body>

<h2>Foodie Grub Project</h2>

<form action="searchRecipe">
    <c:choose>
        <c:when test="${empty userName}">
            <a href = "logIn">Log in</a>
        </c:when>
        <c:otherwise>
            <h3>Welcome ${userName}</h3>
        </c:otherwise>
    </c:choose>
    <div>
        <label for="searchRecipeName">Search By Recipe Name:</label>
        <input type="text" id="searchRecipeName" name="searchRecipeName" >

    </div>
    <button type="submit" name="submit" value="search">Search</button>
    <button type="submit" name="submit" value="viewAll">View All Recipes</button>
</form>

</body>
</html>
