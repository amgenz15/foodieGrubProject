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
            <h6 class="text-primary text-uppercase">Contact Us</h6>
            <h1 class="display-5">Please Feel Free To Contact Us</h1>
        </div>
        <div class="row g-0">
            <div class="col-lg-7">
                <div class="bg-primary h-100 p-5">
                    <form>
                        <div class="row g-3">
                            <div class="col-6">
                                <label for="firstName">First Name:</label>
                                <input type="text" id="firstName" class="form-control bg-light border-0 px-4" name="firstName" style="height: 55px;">
                            </div>
                            <div class="col-6">
                                <label for="lastName">Last Name:</label>
                                <input type="text" id="lastName" class="form-control bg-light border-0 px-4" name="lastName" style="height: 55px;">
                            </div>
                            <div class="col-12">
                                <label for="fullName">Full Name:</label>
                                <input type="text" id="fullName" class="form-control bg-light border-0 px-4" name="fullName" style="height: 55px;">
                            </div>
                            <div class="col-12">
                                <label for="email">Email:</label>
                                <input type="text" id="email" class="form-control bg-light border-0 px-4" name="email" style="height: 55px;">
                            </div>
                            <div class="col-12">
                                <button class="btn btn-secondary w-100 py-3" type="submit" name="submit" value="updateUser">Update Profile</button>
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


