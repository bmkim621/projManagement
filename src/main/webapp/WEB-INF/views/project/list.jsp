<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<table class="table table-hover table-bordered">
			<thead>
			<tr class="info">
				<th class="text-center">프로젝트 이름</th>
				<th class="text-center">시작날짜</th>
				<th class="text-center">종료날짜</th>
				<th class="text-center">상태</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="projectVO">
					<tr>
						<td>${projectVO.project_name }</td>
						<td class="text-center"><fmt:formatDate value="${projectVO.start_date }" pattern="yyyy-MM-dd"/></td>
						<td class="text-center"><fmt:formatDate value="${projectVO.end_date }" pattern="yyyy-MM-dd"/></td>
						<td class="text-center">${projectVO.progress }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>