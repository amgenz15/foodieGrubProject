<%@include file="taglib.jsp"%>
<html>

<c:import url="head.jsp"/>
<body role="document">
<c:import url="topbar.jsp"/>
<c:import url="navbar.jsp"/>

  <div>
      <div>
          <div>
              <h3>${recipe.recipeName}</h3>
          </div>
          <div>
              <h5>Nutrition Information:</h5>
              <p>Calories: ${recipe.calories}</p>
              <p>Protein: ${recipe.protein}</p>
              <p>Carbohydrates: ${recipe.carbohydrates}</p>
              <p>Fats: ${recipe.fat}</p>
          </div>
          <div>
              <h5>Quick Facts:</h5>
              <p>Total Time to make (in minutes): ${recipe.totalTimeInMin}</p>
              <p>Servings: ${recipe.serving}</p>
              <p>Type: ${recipe.type}</p>
          </div>
      </div>
  </div>
    <div>
        <ul>
            <c:forEach var="ingredient" items="${recipe.ingredients}">
                <li>${ingredient.ingredientAmount} ${ingredient.ingredientAmountMeasurement} ${ingredient.ingredient}</li>
            </c:forEach>
        </ul>
    </div>
    <div>
        <ol>
            <c:forEach var="instruction" items="${recipe.instructions}">
                <li>${instruction.instruction}</li>
            </c:forEach>
        </ol>
    </div>



<c:import url="footer.jsp"/>
</body>
</html>