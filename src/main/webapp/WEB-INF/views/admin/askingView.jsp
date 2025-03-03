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
div.answering-container{margin-left:600px; cursor:pointer; color:rgb(255, 153, 153);}
</style>
<script>
function fn_goAskingList(){
	if("${memberLoggedIn }" != ""){
		var memberId= "${memberLoggedIn.memberId }";
		location.href = "${pageContext.request.contextPath}/admin/askingList.do?boardWriter="+memberId;	
	}else if("${sellerLoggedIn }" != ""){
		var sellerId = "${sellerLoggedIn.sellerId }";
		location.href = "${pageContext.request.contextPath}/admin/askingList.do?boardWriter="+sellerId;
	}else if("${sellerLoggedIn }" == "" && "${memberLoggedIn }" == ""){
		alert("로그인 후 이용 가능합니다.");
		return;
	}
}
function fn_goQnaList(){
	location.href = "${pageContext.request.contextPath}/admin/qnaboard.do";
}
function goAnswer(boardNo,boardRef){
	location.href = "${pageContext.request.contextPath }/admin/answeringView.do?boardNo="+boardNo+"&boardRef="+boardRef;
}
</script>


<div id="head-container">
	<div id="qna" class="alert-light" onclick="fn_goQnaList();">FAQ</div> <div id="asking" class="alert-info" onclick="fn_goAskingList();">1:1문의</div>
</div>

 	<div id="board-container">
		<input type="text" class="form-control" placeholder="제목" name="boardTitle" id="boardTitle" value="${board.boardTitle }" required>
		<br />
		<div class="form-control" name="boardContent" placeholder="내용" style="border:none; height:300px;" required>${board.boardContent }</div>
	</div>
	
	<c:if test="${not empty boardRefList }">
		<c:forEach items="${boardRefList }" var="ref">
			<c:if test="${board.boardNo == ref.boardRef}">
				<div class="answering-container" onclick="goAnswer('${ref.boardNo }','${ref.boardRef }'); " > 답변보러가기 </div>
			</c:if>
		</c:forEach>
	</c:if>
	


<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>