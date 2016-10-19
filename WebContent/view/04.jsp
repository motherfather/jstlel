<%@page import="vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	MemberVo vo = new MemberVo();
	vo.setName("둘리");
	
	pageContext.setAttribute("memberVo", vo);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>객체 접근</h3>
	${requestScope.memberVo.no }
	<br>
	${requestScope.memberVo.email }
	<br>
	${requestScope.memberVo.name }
	<br>
	==============scope test 01=================
	<br>
	page scope : ${pageScope.memberVo.name }	
	<br>
	request scope : ${requestScope.memberVo.name }
	<br>
	session scope : ${sessionScope.memberVo.name }
	<br>
	application scope : ${applicationScope.memberVo.name }
	<br>
	==============scope test 02=================
	<br>
	page scope : ${memberVo.name }	
	<br>
	request scope : ${memberVo2.name }
	<br>
	session scope : ${memberVo3.name }
	<br>
	application scope : ${memberVo4.name }
</body>
</html>