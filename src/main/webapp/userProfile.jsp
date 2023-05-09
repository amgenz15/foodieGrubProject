<%@include file="taglib.jsp"%>
<html>

<c:import url="head.jsp"/>
<body role="document">
<c:import url="topbar.jsp"/>
<c:import url="registeredUserNavbar.jsp"/>

<c:forEach var="user" items="${userToDisplay}">
    <div>
        <div>
            <div>
                <h3>${user.username} Profile!</h3>
            </div>
            <div>
                <p>First Name: ${user.firstName}</p>
                <p>Last Name: ${user.lastName}</p>
                <p>Full Name: ${user.fullName}</p>
                <p>Email: ${user.email}</p>
            </div>
            <div>
                <form action="user" name="user" mathod="GET">
                    <input type="hidden" id="userId" name="userId" value="${userId}">
                    <button type="submit" name="submit" value="editUser">Edit Profile</button>
                </form>
            </div>
        </div>
    </div>
</c:forEach>


<c:import url="footer.jsp"/>
</body>
</html>