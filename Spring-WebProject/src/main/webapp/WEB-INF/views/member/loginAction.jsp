<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.jsp" %>
<script type="text/javascript">
	$(document).ready(function(){
		$("#errorMsgArea").text('${msg}');	
	});
</script>



<section class="section__content">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">로그인을 환영합니다.</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="/main" method="get">
                           		<button type=submit>메인페이지</button><br>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    </section>
<jsp:include page="../includes/footer.jsp"/>


