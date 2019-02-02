<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
@import url('https://fonts.googleapis.com/css?family=Noto+Sans+KR:400');
	.col-sm-12{
		margin: 0 auto;
		margin-bottom: 20px;
	}
	
	#temp, .registerWrap, .listWrap, .readWrap, .modifyWrap{
		margin-top: 20px;
		font-family: 'Noto Sans KR', sans-serif;
	}
	
	*{
		font-family: 'Noto Sans KR', sans-serif;
	}
	
	#projImg{
		width: 80%;
	}
	
	div#imgWrap{
		text-align: center;
	}
	
	#footerWrap{
		clear: both;
		color: snow;
		background-color: dimgray;
		margin-top: 20px;
		padding-top: 25px;
		width: 100%;
		text-align: center;
		height: 100px;
	}
	
	div.container{
		height: 700px;
	}
	
	section{
		padding: 10px;
		height: 580px;
		overflow: hidden;
	}
	
	#formWarp, #tableWrap{
		background-color: whitesmoke;
		padding: 20px;
		height: 475px;
	}
	
	#registForm, #modifyForm{
		padding-top: 20px;
		padding-left: 125px;
	}
	
	#btnWrap{
		padding-left: 300px;
		padding-top: 30px;
	}
	
	#btnSave, #btnModify{
		margin-right: 10px;
	}
	
	#btnRegistWrap{
		text-align: right;
	}
	
	#projectTable tbody{
		background-color: white;
	}
	
	#projectTable{
		width: 900px;
		margin-left: 100px;
		margin-top: 20px;
	}
	
	#del{
		margin-right: 10px;
		margin-left: 10px;
	}
	
</style>

</head>
<body>
	<div class="container">
		<div class="row">
	   		<div class="col-sm-12" style="background-color:#353535;">
	   			<h3 style="color:gainsboro;">SPMS(Simple Project Management System)</h3>
	   		</div>
 		</div>
 		
		<ul class="nav nav-tabs">
			<li class="active"><a href="${pageContext.request.contextPath}"><b>Home</b></a></li>
			<li><a href="${pageContext.request.contextPath}/project/register"><b>새 프로젝트 등록하기</b></a></li>
			<li><a href="${pageContext.request.contextPath}/project/list"><b>프로젝트 리스트보기</b></a></li>
		</ul>

</body>
</html>