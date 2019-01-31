<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">    
		<table class="table table-bordered">
			<tbody>
				<tr>
					<td>프로젝트 이름</td>
					<td>${map.project.project_name }</td>
				</tr>
				<tr>
					<td>프로젝트 내용</td>
					<td>${map.content.content }</td>
				</tr>
				<tr>
					<td>시작날짜</td>
					<td><fmt:formatDate value="${map.project.start_date }" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<td>마감날짜</td>
					<td><fmt:formatDate value="${map.project.end_date }" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<td>상태</td>
					<td>${map.project.progress }</td>
				</tr>
			</tbody>
		</table>
		
		<div class="col-sm-offset-2 col-sm-10">
			<a href="${pageContext.request.contextPath}/project/modify?project_no=${map.project.project_no }" class="btn btn-success btn-sm" role="button">수정</a>
			<a href="#" class="btn btn-warning btn-sm" role="button">삭제</a>
			<a href="${pageContext.request.contextPath}/project/list" class="btn btn-default btn-sm" role="button">돌아가기</a>
		</div>
	</div>	
</body>
</html>