<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<fmt:requestEncoding value="UTF-8" />
<jsp:include page="/WEB-INF/views/common/header.jsp">
	<jsp:param value="배달의 신" name="pageTitle" />
</jsp:include>

<!-- Custom fonts for this template-->
<link href="${pageContext.request.contextPath }/resources/css/fontawesome-free/css/all.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

<!-- Custom styles for this template-->
<link href="${pageContext.request.contextPath }/resources/css/sb-admin-2.css" rel="stylesheet">

<style>
div#event-container{width:700px; margin:30px auto; text-align:center;}
div#event-container input{margin-bottom:15px;}
#tblEvent th{width:150px; vertical-align:middle}
#tblEvent td{width:550px;}
</style>

<script>
$(function(){
	$("#collapsePages").addClass("show");	
	$("#eventControl").addClass("active");	
	$("#toDoList").addClass("active");	
});
function fileDownload(oName, rName){
	//한글파일명이 있을 수 있으므로, 명시적으로 encoding
	oName = encodeURIComponent(oName);
	location.href="${pageContext.request.contextPath}/board/fileDownload.do?oName="+oName+"&rName="+rName;
}
</script>

<!-- Page Wrapper -->
  <div id="wrapper">

	<jsp:include page="/WEB-INF/views/admin/sideBar.jsp"></jsp:include>

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <div id="event-container">
			<form name="eventFrm" action="${pageContext.request.contextPath }/admin/updateEvent.do" method="post" onsubmit="return validate();" enctype="multipart/form-data">
				<table class="table table-bordered" id="tblEvent">
					<tr>
						<th>이벤트 제목</th>
						<td>${event.eventTitle }</td>
					</tr>
					<tr>
						<th>이벤트 내역</th>
						<c:if test="${event.discount < 1.0}">
							<td>${100-(event.discount*100)}% 할인</td>
						</c:if>
						<c:if test="${event.discount > 1.0}">
							<td>${event.discount }원 할인</td>
						</c:if>
						
					</tr>
					<tr>
						<th>쿠폰 개수</th>
						<td>${event.amount }</td>
					</tr>
					<tr>
						<th>이벤트 시작일</th>
						<td>${event.startDate }</td>
					</tr>
					<tr>
						<th>이벤트 종료일</th>
						<td>${event.endDate }</td>
					</tr>
					<tr>
						<th>썸네일</th>
						<td><img src="${pageContext.request.contextPath }/resources/upload/event/${event.eventSmall }" width="500px" /></td>
					</tr>
					<tr>
						<th>컨텐츠</th>
						<td><img src="${pageContext.request.contextPath }/resources/upload/event/${event.eventBig }" width="500px" /></td>
					</tr>
					
				</table>
			
				<br />
				<input type="submit" class="btn btn-outline-success" value="수정/삭제" >
			</form>
		  </div>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin-2.min.js"></script>

