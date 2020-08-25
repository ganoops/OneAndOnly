<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<c:set var="userEmail" value="test@naver.com" scope="session"/>
<c:set var="path" value="${pageContext.request.contextPath}" scope="application" />
<title>Insert title here</title>
</head>
<body>
	<h1>One and Only go</h1>
	<a href="${path}/oao?command=insert">do something</a>
	<a href="${path}/oao?command=SelectBoard">newsfeed</a>
</body>
</html>