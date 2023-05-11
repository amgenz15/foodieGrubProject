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



<c:import url="footer.jsp"/>
</body>
</html>