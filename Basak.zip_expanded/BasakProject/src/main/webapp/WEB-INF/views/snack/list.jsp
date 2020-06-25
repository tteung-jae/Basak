<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!doctype html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link href="<c:url value='/resources/img/icon.png'/>" rel="shortcut icon" type="image/x-icon">
<title>SEARCH</title>
</head>
<body>
<div class="card" style="background-image:url(<c:url value='/resources/img/list_bg.jpg'/>);
						background-repeat : no-repeat;
						background-size : cover;">
	<%@ include file="../menu.jsp" %>
	<br><br>
	<div class="container-sm">
		<div class="d-flex justify-content-around">
		    <select class="btn btn-secondary btn-lg active" onchange="if(this.value) location.href=(this.value);" aria-pressed="true">
		    	<option value="/snack" selected>종류</option>
		    	<c:forEach var="snackCate" items="${snackCate}">
		    		<option value="/snack?category=${snackCate.snackCategory}">${snackCate.snackCategory}</option>
		    	</c:forEach>
		    </select>
		    <select class="btn btn-secondary btn-lg active" onchange="if(this.value) location.href=(this.value);" aria-pressed="true">
		    	<option value="/snack" selected>브랜드</option>
		    	<c:forEach var="snackCom" items="${snackCom}">
		    		<option value="/snack?company=${snackCom.snackCompany}">${snackCom.snackCompany}</option>
		    	</c:forEach>
		    </select>
		</div>
	</div>
	<br><br><br>
	<div class="container-md">
		<div class="row row-cols-2 row-cols-md-4 ">
			<c:forEach var="snack" items="${snackid}">
				<span class="border">
					<a href="/snack/info/${snack.snackId}" class="btn btn-link text-muted">
	  					<div class="col mb-4">
	    					<div style="width: 14rem;">
	   							<img src="<c:url value='/resources/img/snack/${snack.snackIMG}'/>" class="card-img-top"  alt="..." width="50" height="150">
	     					<div class="card-body ">
	       						<h5 class="card-title">${snack.snackNAME}</h5>
	      					</div>
	    					</div>
	  					</div>
	  				</a>
	  			</span>
	  		</c:forEach>  
		</div>
	<br><br><br>
	</div>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>
