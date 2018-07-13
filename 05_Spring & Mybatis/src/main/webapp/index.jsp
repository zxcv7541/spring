<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
	function chk(){
		if(confirm("정말 탈퇴하시겠습니까?")){
			location.href="/deleteMember.do";
		}else
			{
			location.href="index.jsp";
			}
	}
</script>
<c:if test="${empty sessionScope.member.userId}">
<form action="/login.do" method="post">
Id:<input type="text" class="form-control" name="userId">
PW:<input type="text" class="form-control" name="userPw">
<input type="submit" class="btn btn-primary" value="로그인">
<a href="/enrollPage.do">회원가입</a>
</form>
</c:if>

<c:if test="${not empty sessionScope.member.userId}">
<h1>${sessionScope.member.userName}님 환영합니다.</h1>
<a href="/logout.do">로그아웃</a><br>
<a href="/myInfo.do">마이정보 보기</a><br>
<a onclick="chk();" style="cursor:pointer;">회원 탈퇴</a><br>
<c:if test="${sessionScope.member.userId eq 'admin' }">
<a href="/memberAll.do">전체회원 보기[관리자 전용]</a>
</c:if>

</c:if>


</body>

</html>