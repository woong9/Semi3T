<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id ="loginArea">
<jsp:include page="${loginPage }"></jsp:include>
</div>

GO HOME!


<jsp:include page="${contentPage }"></jsp:include>
</body>
</html>