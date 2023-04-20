<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>
    <form action="/score/detail">
        <h1>${score.name}님 성적 정보</h1>
        <ul>
            <li># 국어: ${score.kor} 점</li>
            <li># 영어: ${score.eng}점</li>
            <li># 수학: ${score.math} 점</li>
            <li># 총점: ${score.total}점</li>
            <li># 평균: ${score.average}점</li>
            <li># 학점: ${score.grade} </li>
        </ul>
    </form>



</body>

</html>