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
        <div class="row g-0">
            <div class="col-lg-7">
                <div class="bg-primary h-100 p-5">
                    <form>
                        <div class="row g-3">
                            <input type="hidden" id="userId" name="userId" value="${userId}">
                            <div class="col-6">
                                <label for="firstName">First Name:</label>
                                <input type="text" id="firstName" value="${firstName}"  class="form-control bg-light border-0 px-4" name="firstName" style="height: 55px;">
                            </div>
                            <div class="col-6">
                                <label for="lastName">Last Name:</label>
                                <input type="text" id="lastName" value="${lastName}" class="form-control bg-light border-0 px-4" name="lastName" style="height: 55px;">
                            </div>
                            <div class="col-12">
                                <label for="fullName">Full Name:</label>
                                <input type="text" id="fullName" value="${fullName}" class="form-control bg-light border-0 px-4" name="fullName" style="height: 55px;">
                            </div>
                            <div class="col-12">
                                <label for="email">Email:</label>
                                <input type="text" id="email" value="${email}" class="form-control bg-light border-0 px-4" name="email" style="height: 55px;">
                            </div>
                            <div class="col-12">
                                <button class="btn btn-secondary w-100 py-3" type="submit" name="submit" value="editUser">Update Profile</button>
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


