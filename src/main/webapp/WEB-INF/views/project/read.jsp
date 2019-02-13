<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../include/header.jsp" %>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<section>
	<div class="readWrap">
	<div class="alert alert-success">
  			<strong>PROJECT DETAIL VIEW:</strong>&nbsp;&nbsp;해당 프로젝트에 대한 상세 정보를 볼 수 있습니다.
	</div>
		<div id="tableWrap">
			<table class="table table-bordered" id="projectTable">
				<tbody>
					<tr>
						<td class='col-sm-2'>프로젝트 이름</td>
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
			
			<div class="form-group" id="btnWrap">
				<div class="col-sm-offset-2 col-sm-10">
					<a href="${pageContext.request.contextPath}/project/modify?project_no=${map.project.project_no }" class="btn btn-success" role="button">수정</a>
					<a href="#" class="btn btn-warning" role="button" id="del">삭제</a>
					<a href="${pageContext.request.contextPath}/project/list" class="btn btn-default" role="button">돌아가기</a>
				</div>
			</div>
		</div>
		
		<!-- 삭제할 때 post 방식으로 보내기 위해서 번호 hidden으로 실어서 보냄 -->
		<form action="" method="post" id="f1">
			<input type="hidden" name="project_no" value="${map.project.project_no }" >		
		</form>
	</div>
</section>
	
<script>
	$(function(){
		$("#del").click(function(){
			var delConfirm = confirm("삭제하시겠습니까?");
			
			if(delConfirm){
				$("#f1").attr("action", "remove");
				$("#f1").submit();
			}
			return false;
		})
	})
</script>

<%@ include file="../include/footer.jsp" %>