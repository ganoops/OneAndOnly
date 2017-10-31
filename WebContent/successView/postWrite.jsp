<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex, nofollow">
	<link rel="stylesheet" href="${path }/css/style.css">
    <title>post-write</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
   
</head>
<body>
	<div class="post-write">
    <div class="container">
        <div class="col-lg-4">
            <div class="card">
            	<form method="post" action="${path}/oao?command=InsertBoard" enctype="multipart/form-data">
	            	<div class="fileImg">
		                 <div class ="imgDiv">
		                 	<img id ="images" src="${path }/img/upload.jpg" class="fileImgNo">
		                 </div>
		                 <img id ="images" src="" class="fileImgYes">
		                 <input type=file id="file1" name="file" style="display: none;">
	                </div>
	                
	                <p><textarea name="content" rows="10" style="width:100%; border: 0;"
	                placeholder="글은 여기에 작성해주세요..." required></textarea>
	                </p>
	                
	                <button type="button" class="blue-button">작성하기</button>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
   $(function(){
	   /*  $(".blue-button").click(function(){
		   $.ajax({
				success : function(result){
					$(".blue-button").text("수정하기");
				}, 
				error : function(err){
					console.log(err+"에러 발생");	
				}	
			});
	   });//button function end */
	   
	   var imgDivWidth = $(".imgDiv").width();
	   var chk = 0;
	   $(".imgDiv").height(imgDivWidth);
	
	   $(".imgDiv, .fileImgYes").click(function(){
		   $("#file1").click();
	   });
	   
	   //이미지 미리보기
	   $("#file1").on("change",function(e){
		   
		   //이미지 파일 확인
		   if(!this.files[0].type.match("image/*")){
			   alert("이미지파일만 업로드 가능합니다");
			   return;
		   }
		   //이미지 미리보기
		   if(this.files && this.files[0]){
			   var reader = new FileReader();
			   
			   reader.onload = function(ee){ 
				   $(".imgDiv").css("display","none");
				   $(".fileImgYes").css("display","block");
				   $(".fileImgYes").attr("src",ee.target.result); 
				   chk = 1;
			   }
			   reader.readAsDataURL(this.files[0]);
		   }
		   
	   });
	   
	   $(".blue-button").click(function(){
		   if($(this).parents("form").find("textarea").val().trim() == ""){
			   alert("글을 작성해주세요!");
		   }else if(chk == 1){
			   $(this).parents("form").submit();
		   }else{
			   alert("이미지를 올려주세요!");
		   }
	   });
	   
	   //.fileImg div and img
	   /* var fileImgWidth =  $(".fileImg").width();
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
	   		$(".fileImgYes").attr("src","${path }/img/bg.jpg");
	   }); */
	   
   });
   
</script>

</body>
</html>
