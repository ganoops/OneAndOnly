<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>
	
	<style>
   *{
      margin:0 auto;
      padding:0;
   }
   #pop{
      position:fixed;
      width:100%;
      height:100%;
      background:rgba(0,0,0,0.8);
      z-index:99;
   }
   .pop_center{
      width:50%;
      height:65%;
      background:white;
      position:relative;
      top:50%;
      transform:translateY(-50%);
   }
   .pop_img{
   		background:black;
   		width:63%;
   		height:100%;
   		float:left;
   		
   }
   #board_img{
   		width:100%;
   		height:100%;
   		
   }
   .nick{
   		width:37%;
   		float:right;
   		background:white;
   		margin-top:20px
   }
   #nick_img{
   		width:30%;
   		height:50%;
   		position:relative;
   		padding-left:20px;
   		float:left;
   		
   		
   }
   
   .nick span{
   		float:left;
   		margin-left:20px
   }
   .pop_content{
   		float:right;
   		width:37%;
   		height:55%;
   		border-top:1px solid #e8e5e5;
   		border-bottom:1px solid #e8e5e5;
   		margin-top:10px;
   		
   		
   }
   .like{
   		height:20%;
   		width:37%;
   		float:right;
   		border-bottom:1px solid #e8e5e5;
   		
   }
   .like_icon{
   		font-size:26px;
   }
   .exit{
   		width:100%;
   		height:50px;
   		font-size:30px;
   		color:white;
   		text-align: right;
   }
   
   
</style>
<div id="pop">
	<div class="exit">
		<i class="glyphicon glyphicon-remove"></i>
	</div>
   <div class="pop_center">
   
	   	<div class="pop_img">
	   		<img src="${path }/img/ten.jpg" id="board_img">
	   	</div>
	   	
	   	<div class="nick">
	   		<div class="nick_content">
		   		<img src="${path }/img/cake.png" id="nick_img" >
		   		<span> O jeee </span>
	   		</div>
	   	</div>
	   	
	   	<div class="pop_content">
	   		<span> O jeee </span><span> #공태은 </span>
	   	</div>
	   	
	   	<div class="like">
	   		<div class="like_icon">
	   			<i class="glyphicon glyphicon-heart-empty"></i>
	   			<i class="glyphicon glyphicon-pencil"></i>
	   		</div>
	   		
	   		<div class="like_content">
	   			<span> 좋아요 </span><span> 1908 </span>
	   		</div>
	   		
	   		<div class="date">
	   		<span>11월 11일</span>
	   		</div>
	   	</div>
	   	
	   	<div class="comment">
	   		<input type="text" placeholder="댓글달기" 
	   		style="width:350px;height:50px;border:none;outline:none"
	   		>
	   	</div>
	   
   
   </div>
</div>

</body>
</html>