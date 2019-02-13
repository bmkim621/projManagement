<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">

<section>
	<div class="registerWrap">
	
		<div class="alert alert-info">
  			<strong>REGIST NEW PROJECT:</strong>&nbsp;&nbsp;새로운 프로젝트를 등록합니다. 아래에 있는 내용들을 모두 입력해주세요.
		</div>
		
			<div id="formWarp">
			<form class="form-horizontal" action="register" method="post" role="form" id="registForm">
				<div class="form-group">
					<label class="control-label col-sm-2" for="project_name">프로젝트 이름</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="project_name" placeholder="프로젝트 이름을 입력하세요." name="project_name">
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2" for="comment">프로젝트 내용</label>
					<div class="col-sm-8">
						<textarea class="form-control" rows="5" id="comment" name="content"></textarea>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2" for="start_date">시작날짜</label>
					<div class="col-xs-4">
						<input type="text" class="form-control" id="start_date" placeholder="시작날짜 선택하기" name="start_date" readonly="readonly">
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2" for="end_date">마감날짜</label>
					<div class="col-xs-4">
						<input type="text" class="form-control" id="end_date" placeholder="마감날짜 선택하기" name="end_date" readonly="readonly">
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2" for="progress">상태</label>
						<div class="col-xs-4">
							<select class="form-control" id="progress" name="progress">
								<option value="준비">준비</option>
								<option value="진행중">진행중</option>
								<option value="종료">종료</option>
								<option value="보류">보류</option>
							</select>
						</div>
	      		</div>
	
				<!-- 버튼 -->
				<div class="form-group" id="btnWrap">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-primary" id="btnSave">저장</button>
						<button type="reset" class="btn btn-danger">취소</button>
					</div>
				</div>
			</form>
			</div>
	</div>
</section>

<!-- 스크립트 -->
<!-- Datepicker -->
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function(){
		$("#start_date").datepicker({
			minDate : 0,
			maxDate : "+2M"
		});
		$("#start_date").datepicker("option", "dateFormat", "yy-mm-dd");
		
		$("#end_date").datepicker({
			minDate : 1,
			maxDate : "+2M 15D"
		})
		$("#end_date").datepicker("option", "dateFormat", "yy-mm-dd");
	})
</script>

<%@ include file="../include/footer.jsp" %>
