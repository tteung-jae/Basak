<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<div class="container-fluid">
	<nav class="navbar navbar-expand-lg navbar-light">
		<input type="image" src="<c:url value='/resources/img/logo.png'/>" onclick="location.href='/'" class="rounded float-right" width="230" alt="..."/>	
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
	    	<ul class="navbar-nav mr-auto">
	   			<li class="nav-item active">
	   				<input type="image" src="<c:url value='/resources/img/search.png'/>" onclick="location.href='/snack'" class="rounded float-right ml-5" width="130" alt="..."/>	
	    		</li>
	    	</ul>
	    	
	    	<c:if test="${member == null}">
				<input type="image" src="<c:url value='/resources/img/add.png'/>" onclick="location.href='/member/write.do'" class="rounded float-right mr-3" width="30" alt="..."/>	
				<input type="image" src="<c:url value='/resources/img/user.png'/>" onclick="location.href='/member/login.do'" class="rounded float-right" width="30" alt="..."/>	
	    	</c:if>
	    	<c:if test="${member != null}">
	    		<button class="btn btn-dark mr-3">${member.memberName}</button>
		    	<input type="image" src="<c:url value='/resources/img/logout.png'/>" onclick="location.href='/member/logout.do'" class="rounded float-right" width="30" alt="..."/>
		    </c:if>
		</div>
	</nav>
</div>