<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<fmt:requestEncoding value="UTF-8" />
<jsp:include page="/WEB-INF/views/common/header.jsp">
	<jsp:param value="배달의 신" name="pageTitle" />
</jsp:include>

<style>
div#board-container input{width:400px; margin:0 auto; text-align:center;}
div#board-container div{width:400px; margin:0 auto; }

table#tbl-board tr th{text-align:center;}
table#tbl-board tr td{text-align:center;}
a {text-decoration:none;}
div#head-container{margin:70px auto; width : 900px; height:50px;}
div#qna{margin-left : -40px; width : 450px; height : 50px; text-align : center; font-weight : bold;cursor : pointer;display: table-cell;vertical-align: middle;}
div#asking{margin-top:-50px; margin-left : 500px; width : 450px; height : 50px; text-align : center; font-weight : bold; cursor : pointer;display: table-cell;vertical-align: middle;}
input#boardTitle{font-weight : bold;}
</style>
<script>
function fn_goAskingForm(){
	location.href = "${pageContext.request.contextPath}/admin/askingForm.do";
}
function fn_goQnaList(){
	location.href = "${pageContext.request.contextPath}/admin/boardList.do";
}
</script>


<div id="head-container">
	<div id="qna" class="alert-info" onclikc="fn_goQnaList();">FAQ</div> <div id="asking" class="alert-light" onclick="fn_goAskingForm();">1:1문의</div>
</div>

 	<div id="board-container">
		<input type="text" class="form-control" placeholder="제목" name="boardTitle" id="boardTitle" value="${board.boardTitle }" required>
		<br />
		<div class="form-control" name="boardContent" placeholder="내용" style="border:none; height:300px;" required>${board.boardContent }</div>
	</div>


<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>