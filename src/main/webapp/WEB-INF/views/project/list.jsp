<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../include/header.jsp" %>
<section>
	<div class="listWrap">
  	<div class="alert alert-warning">
  		<strong>PROJECT LIST:</strong>&nbsp;&nbsp;저장되어 있는 프로젝트 리스트를 볼 수 있습니다.
	</div>
	<p id="btnRegistWrap"><button type="button" class="btn btn-danger btn-sm" id="btnRegist">새 프로젝트 등록</button></p>
		
		<table class="table table-hover table-bordered">
			<thead>
			<tr class="active">
				<th class="text-center">프로젝트 이름</th>
				<th class="text-center">시작날짜</th>
				<th class="text-center">종료날짜</th>
				<th class="text-center">상태</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="projectVO">
					<tr>
						<td><a href="${pageContext.request.contextPath}/project/read?project_no=${projectVO.project_no }">${projectVO.project_name }</a></td>
						<td class="text-center"><fmt:formatDate value="${projectVO.start_date }" pattern="yyyy-MM-dd"/></td>
						<td class="text-center"><fmt:formatDate value="${projectVO.end_date }" pattern="yyyy-MM-dd"/></td>
						<td class="text-center">${projectVO.progress }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</section>
<script>
	$(function(){
		$("#btnRegist").click(function(){
			location.href = "${pageContext.request.contextPath}/project/register";
		})
	})
</script>

<%@ include file="../include/footer.jsp" %>
