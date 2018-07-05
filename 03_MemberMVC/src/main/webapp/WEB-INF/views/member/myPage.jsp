<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	ModelAndView view=new ModelAndView();
	ex)view.addObject("mem",m);
	사용시 ${mem.name} 
 --%>
<form action="/mUpdate.do" method="post">
아이디:<input type="text" readonly name="userId" value="${mem.userId}"> <br>
비밀번호:<input type="password" name="userPw" value="${mem.userPw}"><br>
이름:<input type="text" readonly name="userName" value="${mem.userName}"><br>
전화번호:<input type="text" name="userPhone" value="${mem.userPhone}"><br>
<input type="submit" value="회원정보변경" />
</form>


</body>
</html>