<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Insert title here</title>
<style type="text/css">
.image-preview-input {
    position: relative;
    overflow: hidden;
    margin: 0px;    
    color: #333;
    background-color: #fff;
    border-color: #ccc;    
}
.image-preview-input input[type=file] {
	position: absolute;
	top: 0;
	right: 0;
	margin: 0;
	padding: 0;
	font-size: 20px;
	cursor: pointer;
	opacity: 0;
	filter: alpha(opacity=0);
}
.image-preview-input-title {
    margin-left:2px;
}
</style>
<script type="text/javascript" src="${path}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${path}/js/jquery.form.min.js"></script>
<script type="text/javascript" src="${path}/js/userUpdate.js"></script>
<script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="row">
	    
	    <div class=" col-xs-12 col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 ">
	   		<!--  col-md-8 col-md-offset-2 -->
	      	<!--  col-xs-12 col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 -->
    		<h1>Edit Profile</h1>
    		<hr>
    		<form action="" method="post" id="updateForm" enctype="multipart/form-data">
    		<input type="hidden" value="${path}/oao?command=UpdateUser&email=${user.email}" id="url"/>
    		<input type="hidden" value="${path}" id="path"/>
    			<div class="form-group">
	    		     <img src="${path}/save/${user.email}/${user.profile_pic}" class="img-circle center-block" alt="profile" width="200px" height="200px" id="profile_pic">
    		    </div>
    			<div class="form-group">
		            <div class="input-group image-preview">
		                <input type="text" class="form-control image-preview-filename" disabled="disabled" placeholder="Browse Your New Profile Pic" name="newProfilePic"> <!-- don't give a name === doesn't send on POST/GET -->
		                <span class="input-group-btn">
		                    <!-- image-preview-clear button -->
		                    <button type="button" class="btn btn-default image-preview-clear" style="display:none;">
		                        <span class="glyphicon glyphicon-remove"></span> Clear
		                    </button>
		                    <!-- image-preview-input -->
		                    <div class="btn btn-default image-preview-input">
		                        <span class="glyphicon glyphicon-folder-open"></span>
		                        <span class="image-preview-input-title">Browse</span>
		                        <input type="file" accept="image/png, image/jpeg, image/gif" name="file" value="${user.profile_pic}"/> <!-- rename it -->
		                    </div>
		                </span>
		            </div><!-- /input-group image-preview [TO HERE]--> 
                    
    		    </div>
    		    
    		    <div class="form-group">
    		        <label for="email">email<span class="require">*</span> </label>
    		        <input type="email" class="form-control" name="email" value="${user.email}" readonly/>
    		    </div>
    		    
    			<div class="form-group">
    		        <label for="nickname">계정명(nickname)<span class="require">*</span></label>
    		        <input type="text" class="form-control" name="nickname" value="${user.nickname}" id="nickname"/>
    		        <input type="hidden" value="${user.nickname}" id="originNickname"/>
    		      	<span id="nicknameCheckResult"></span>
    		    </div>
    		   
    		     <div class="form-group">
    		        <label for="phone">전화번호<span class="require">*</span><small>('-' 없이 입력하세요.)</small></label>
    		        <input type="text" class="form-control" name="phone" value="${user.phone}"/>
    		    </div>
    		    
    		    <div class="form-group">
    		        <label for="introduction">자기소개</label>
    		        <textarea rows="5" class="form-control" name="introduce" >${user.introduce}</textarea>
    		    </div>
    		    
    		    <div class="form-group">
    		        <p><span class="require">*</span> - required fields</p>
    		    </div>
    		    
    		    <div class="form-group">
    		        <input type="button" id="update" class="btn btn-primary" value="프로필 수정">
    		    </div>
    		    
    		</form>
		</div>
		
	</div>
</div>
</body>
</html>