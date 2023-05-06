<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/28/23
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="taglib.jsp"%>
<html>

<c:import url="head.jsp"/>
<body>
<c:import url="topbar.jsp"/>
<c:import url="navbar.jsp"/>
<div class="container-fluid py-5">
    <div class="container">
        <div class="mx-auto text-center mb-5" style="max-width: 500px;">
            <h1 class="display-5">Add a custom recipe!</h1>
        </div>
        <div class="row g-0">
            <div class="col-lg-7">
                <div class="bg-primary h-100 p-5">
                    <form action="addRecipe" method="get" class="form-inline" id="addForm">
                        <div class="row g-3">
                            <div class="col-6">
                                <label for="recipeName">Recipe Name:</label>
                                <input type="text" id="recipeName" class="form-control bg-light border-0 px-4" name="recipeName" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="calories">Calories:</label>
                                <input type="number" id="calories" class="form-control bg-light border-0 px-4" name="calories" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="protein">Protein:</label>
                                <input type="number" id="protein" class="form-control bg-light border-0 px-4" name="protein" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="carbohydrates">Carbohydrates:</label>
                                <input type="number" id="carbohydrates" class="form-control bg-light border-0 px-4" name="carbohydrates" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="fat">Fat:</label>
                                <input type="number" id="fat" class="form-control bg-light border-0 px-4" name="fat" style="height: 55px;">
                            </div>
                            <div class="col-6">
                                <label for="totalTime">Total Time to make (in minutes):</label>
                                <input type="number" id="totalTime" class="form-control bg-light border-0 px-4" name="totalTime" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="type">Choose a category: </label>

                                <select name="type" id="type">
                                    <option value="breakfast">Breakfast</option>
                                    <option value="brunch">Brunch</option>
                                    <option value="lunchDinner">Lunch/Dinner</option>
                                    <option value="snack">Snack</option>
                                    <option value="drink">Drink</option>
                                </select>
                            </div>
                            <div class="col-3">
                                <label for="serving">Serving:</label>
                                <input type="number" id="serving" class="form-control bg-light border-0 px-4" name="serving" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="ingredients">Ingredients:</label>
                                <textarea id="" name="" rows="" cols="" placeholder=""></textarea>
                            </div>
                            <div class="col-3">
                                <label for="fat">Fat:</label>
                                <input type="number" id="fat" class="form-control bg-light border-0 px-4" name="fat" style="height: 55px;">
                            </div>
                        </div>
                    </form>
                </div>
            </div>

<c:import url="footer.jsp"/>
</body>
</html>
