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
Id:<input type="text" name="userId">
PW:<input type="text" name="userPw">
<input type="submit" value="로그인">
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