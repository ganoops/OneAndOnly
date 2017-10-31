<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>One & Only</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="${path }/js/jquery-3.2.1.js"></script>
</head>
<body>

	<style>
		.search-img-fluid{width:100%} /* 이미지 크기 */
		.search-margin-bottom-20{padding-bottom:20px} /* 이미지 패딩 */
		.search-padding-bottom-50{padding-top:50px}
		span{font-size:17px}
		.detail-span{padding-right:30px}
		#detail-padding h1{padding-left:13px}
		#detail-padding2{padding-left:13px}
		
		*{margin: 0 auto;
		  padding: 0;
		  list-style:none;
		  }
		
		.modify_profile{
			background:none; border:1px solid #dbdbdb; padding:5px 10px; font-size:15px; color:#444;
			border-radius:5px;
		}	
		.detail_btn1{
			background:#ffe3e7; border:0px; font-size:13px; width:30px; height:30px;
		}
		.detail_btn2{
			background:white; border:0px; font-size:5px;width:30;height:30px;
		}
		
		.profileBtn{
			padding:5px 10px; font-size:15px;
			border-radius:5px;
			outline:none;
		}
		.followingBtn{
			background:none; border:1px solid #dbdbdb;
		}
		.followBtn{
			background:#3897f0;
			border:none;
			color:white;
		}
	</style>
	<!-- 내 계정프로필이 아닐경우 -->
	
	<c:choose>
		<c:when test="${followCheck == 0 }"><c:set var="profileClass" value="followBtn"/></c:when>
		<c:otherwise><c:set var="profileClass" value="followingBtn"/></c:otherwise>
	</c:choose>
	<!-- 상세계정 프로필 부분 -->
	<div class="container">
		<div class="row" >
		
			<div >
				<img class=" col-md-4 search-padding-bottom-50 search-margin-bottom-20 " src="${path }/save/${user['profile_pic']}" alt="" >
		
			</div>
			
			<div class="col-md-8 search-padding-bottom-50" id="detail-padding">
				<h1> ${user['nickname']} 
				<!-- 로그인 한 회원이면 -->
				<c:choose>
					<c:when test="${user['email'] eq userEmail}">
						<input type="button" value="프로필 편집" class="modify_profile">
						<!-- <input type="button" value="▼" class="detail_btn1"> 
						<input type="button" value="●●●" class="detail_btn2"> -->
					</c:when>
					<c:otherwise>
						<input type="button" value="팔로잉" class="profileBtn ${profileClass}" id="profileBtnID" data-email="${user['email'] }">
					</c:otherwise>
				</c:choose>
				
				</h1>
			<div class="col-md-8 ">
				<span> 게시물 </span> <span class="detail-span" > ${board.size() } </span>
				<span> 팔로워 </span> <span class="detail-span followerView"> ${follower}  </span>
				<span> 팔로우 </span> <span> ${follow}  </span>	
				</h4>
			</div>
			<br><br>
			<div id="detail-padding2">
				<br>${user['introduce']}
			</div>
				
			</div>
		</div>
	</div>
	
	
	<!-- 게시물검색 Grid Section -->
    <section id="portfolio">
      <div class="container">
        
        
        <div class="row">
        	<c:forEach items="${board }" var="bb">
	          <div class="col-md-4 search-margin-bottom-20" >
	            <a class="portfolio-link" href="#portfolioModal1" data-toggle="modal">
	              <div class="caption">
	                <div class="caption-content">
	                  <i class="fa fa-search-plus fa-3x"></i>
	                </div>
	              </div>
	              <img class="search-img-fluid" src="${path }/save/${bb.photo}" alt="" >
	            </a>
	          </div>
          </c:forEach>
              
        </div><!-- row End -->
        
      </div>
    </section>
    
<script>
	$("#profileBtnID").on("click",function(){
		//만약 following중이면
		var uu = "DeleteFollow";
		var fo = $(".followerView").text();
		
		if($(this).hasClass("followingBtn")){
			$(this).removeClass("followingBtn");
			$(this).addClass("followBtn");
			alert("언팔");
		}else{//follow
			$(this).removeClass("followBtn");
			$(this).addClass("followingBtn");
			uu = "InsertFollow";
			alert("팔로우");
		}
		$.ajax({
			type:"post",
			url:'${path}'+"/oao?command="+uu,
			data:{email:$(this).attr("data-email")},
			success:function(e){
				if(e == 1){
					$(".followerView").text(parseInt(fo)+1);
				}else if(e == 2){
					$(".followerView").text(parseInt(fo)-1);
				}
			},
			error:function(err){
				
			}
			
		});
		
	});
</script>	

</body>
</html>