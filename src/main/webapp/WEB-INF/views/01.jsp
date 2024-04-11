<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>값출력</h4>
	${iVal } <br>
	${lVal } <br>
	${fVal } <br>
	${bVal } <br>
	${sVal } <br>

	<h4>객체출력</h4>
	--${obj }-- <br>
	${vo.no } <br>
	${vo.name } <br>

	<h4>Map객체출력</h4>
	${m.iVal } <br>
	${m.lVal } <br>
	${m.fVal } <br>
	
	<h4>리터럴</h4>
	${10 } <br>
	${"hello" } <br>
	${false } <br>
	
	<h4>산술연산</h4>
	${10 + 10 } <br>
	${iVal + 10 } <br>

	<h4>관계연산</h4>
	${iVal < 20 } <br>
	${iVla > 20 } <br>
	${iVla == 20 } <br>
	${iVla != 20 } <br>
	
	${obj == null } <br>
	${empty obj } <br>
	${not empty obj } <br>

	<h4>논리연산</h4>
	${iVal < 10 && lVal > 100 } <br>
	${iVal < 10 || lVal > 100 } <br>
	
	<h4>요청 파라미터</h4>
	${param.no } <br>
	${param.email } <br>
	
	<h4>Context path</h4>
	${pageContext.request.contextPath }
	
</body>
</html>