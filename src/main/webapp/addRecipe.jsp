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
            <div class="col-lg-12 mx-auto text-center mb-5">
                <div class="bg-primary  p-5 mx-auto text-center mb-5">
                    <form action="addRecipe" method="post" class="form-inline" id="addForm">
                        <div class="row g-3">
                            <div class="col-6">
                                <label for="recipeName" class="text-dark">Recipe Name:</label>
                                <input type="text" id="recipeName" class="form-control bg-light border-0 px-4" name="recipeName" placeholder="Recipe name" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="calories" class="text-dark">Calories:</label>
                                <input type="number" id="calories" class="form-control bg-light border-0 px-4" name="calories" placeholder="0" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="protein" class="text-dark">Protein:</label>
                                <input type="number" id="protein" class="form-control bg-light border-0 px-4" name="protein" placeholder="0" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="carbohydrates" class="text-dark">Carbohydrates:</label>
                                <input type="number" id="carbohydrates" class="form-control bg-light border-0 px-4" name="carbohydrates" placeholder="0" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="fat" class="text-dark">Fat:</label>
                                <input type="number" id="fat" class="form-control bg-light border-0 px-4" name="fat" placeholder="0" style="height: 55px;">
                            </div>
                            <div class="col-6">
                                <label for="totalTime" class="text-dark">Total Time to make (in minutes):</label>
                                <input type="number" id="totalTime" class="form-control bg-light border-0 px-4" name="totalTime" placeholder="0" style="height: 55px;">
                            </div>
                            <div class="col-3">
                                <label for="type" class="text-dark">Choose a category: </label>

                                <select name="type" id="type">
                                    <option value="breakfast">Breakfast</option>
                                    <option value="lunch">Lunch</option>
                                    <option value="dinner">Dinner</option>
                                    <option value="snack">Snack</option>
                                    <option value="drink">Drink</option>
                                </select>
                            </div>
                            <div class="col-3">
                                <label for="serving" class="text-dark">Serving:</label>
                                <input type="number" id="serving" class="form-control bg-light border-0 px-4" name="serving" placeholder="0" style="height: 55px;">
                            </div>
                            <div class="col-12">
                                <label for="ingredients" class="text-dark">Ingredients:</label><br>
                                <textarea id="ingredients" name="ingredients" rows="6" cols="50" placeholder="Please put one ingredient on each line in this format: 1 cup flour"></textarea>
                            </div>
                            <div class="col-12">
                                <label for="directions" class="text-dark">Directions:</label><br>
                                <textarea id="directions" name="directions" rows="10" cols="125" placeholder="Please put one direction on each line in this format: 1 Direction here (new line)"></textarea>
                            </div>
                            <div class="col-3 mx-auto text-center mb-5" >
                                <button class="btn btn-secondary w-100 py-3" type="submit" name="submit" value="addRecipe">Add Recipe</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<c:import url="footer.jsp"/>
</body>
</html>
