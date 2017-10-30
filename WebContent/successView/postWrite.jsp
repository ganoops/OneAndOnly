<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex, nofollow">
	<link rel="stylesheet" href="css/style.css">
    <title>post-write</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
   <script>
   $(function(){
	   $(".blue-button").click(function(){
		   $.ajax({
				success : function(result){
					$(".blue-button").text("수정하기");
				}, 
				error : function(err){
					console.log(err+"에러 발생");	
				}	
			});
	   });//button function end
	   //.fileImg div and img
	   var fileImgWidth =  $(".fileImg").width();
	   var fileImgDivWidth = $(".fileImg>div").width();
	   var fileImgDivLeft = (fileImgWidth/2) - (fileImgDivWidth/2);
	   $(".fileImg>div").height(fileImgDivWidth); //div height
	   $(".fileImg>div").css({
		   "left": fileImgDivLeft+"px"
	   });
	   
	   $(".post-write .card").on("mouseover",function(){
		   if($(".fileImg>div").is(":animated")){
			   return false;}else{
		   	$(".fileImg>div").fadeIn();
		   	
		   }
	   });
	   $(".post-write .card").on("mouseleave",function(){
		   $(".fileImg>div").fadeOut(); 
	   });
	   $(".post-write .fileImgNo").click(function(){
		    $("#file1").click();
	   		$(".imgDiv").remove();
	   		$(".fileImgYes").attr("src","img/bg.jpg");
	   });
   });
   
   </script>
</head>
<body>
	<div class="post-write">
    <div class="container">
            <a href="#">
                <div class="col-lg-4">
                    <div class="card">
                    	<div class="fileImg">
	                        <div class ="imgDiv"><img id ="images" src="img/upload.jpg" class="fileImgNo"></div>
	                        <img id ="images" src="" class="fileImgYes">
	                        <input type=file id="file1" style="display: none;">
                        </div>
                        <p><textarea name="content" rows="10" style="width:100%; border: 0;"
                        placeholder="글은 여기에 작성해주세요..."></textarea>
                        </p>
                        <a href="#" class="blue-button">작성하기</a>
                    </div>
                </div>
            </a>
    </div>
</div>
</body>
</html>
