<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>One & Only</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
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
			
	</style>
	
	<c:choose>
		<c:when test="${user['email'] eq userEmail}"></c:when>
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
						<input type="button" value="팔로잉" 
						style="background:#ffe3e7; border:0px; font-size:18px; width:100px; height:30px; ">
						<input type="button" value="▼"
						style="background:#ffe3e7; border:0px; font-size:13px; width:30px; height:30px;"> 
						<input type="button" value="●●●" 
						style="background:white; border:0px; font-size:5px;width:30;height:30px">
					</c:when>
					<c:otherwise>
						<input type="button" value="팔로잉" id = "follow"
						style="background:blue; border:0px; font-size:18px; width:100px; height:30px; ">
					</c:otherwise>
				</c:choose>
				
				</h1>
			<div class="col-md-8 ">
				<span> 게시물 </span> <span class="detail-span" > ${board.size() } </span>
				<span> 팔로워 </span> <span class="detail-span"> ${follower}  </span>
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
	
</body>
</html>