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

	<!-- 상세계정 프로필 부분 -->
	<div class="container">
		<div class="row" >
		
			<div >
				<img class=" col-md-4 search-padding-bottom-50 search-margin-bottom-20 " src="${path }/img/cabin.png" alt="" >
		
			</div>
			
			<div class="col-md-8 search-padding-bottom-50" id="detail-padding">
				<h1> ojeee 
				<input type="button" value="팔로잉" 
				style="background:#ffe3e7; border:0px; font-size:18px; width:100px; height:30px; ">
				<input type="button" value="▼"
				style="background:#ffe3e7; border:0px; font-size:13px; width:30px; height:30px;"> 
				<input type="button" value="●●●" 
				style="background:white; border:0px; font-size:5px;width:30;height:30px">
				
				</h1>
				
			<div class="col-md-8 ">
				<span> 게시물 </span> <span class="detail-span" > 3,890 </span>
				<span> 팔로워 </span> <span class="detail-span"> 579천 </span>
				<span> 팔로우 </span> <span> 1 </span>	
				</h4>
			</div>
			<br><br>
			<div id="detail-padding2">
				<br>안녕하세요 오블리인니다아 데헷
			</div>
				
			</div>
		</div>
	</div>
	
	
	<!-- 게시물검색 Grid Section -->
    <section id="portfolio">
      <div class="container">
        
        
        <div class="row">
          <div class="col-md-4 search-margin-bottom-20" >
            <a class="portfolio-link" href="#portfolioModal1" data-toggle="modal">
              <div class="caption">
                <div class="caption-content">
                  <i class="fa fa-search-plus fa-3x"></i>
                </div>
              </div>
              <img class="search-img-fluid" src="${path }/img/cabin.png" alt="" >
            </a>
          </div>
          <div class="col-md-4 search-margin-bottom-20">
            <a class="portfolio-link" href="#portfolioModal2" data-toggle="modal">
              <div class="caption">
                <div class="caption-content">
                  <i class="fa fa-search-plus fa-3x"></i>
                </div>
              </div>
              <img class="search-img-fluid" src="${path }/img/cake.png" alt="">
            </a>
          </div>
          <div class="col-md-4 search-margin-bottom-20">
            <a class="portfolio-link" href="#portfolioModal3" data-toggle="modal">
              <div class="caption">
                <div class="caption-content">
                  <i class="fa fa-search-plus fa-3x"></i>
                </div>
              </div>
              <img class="search-img-fluid" src="${path }/img/circus.png" alt="">
            </a>
          </div>
          <div class="col-md-4 search-margin-bottom-20">
            <a class="portfolio-link" href="#portfolioModal4" data-toggle="modal">
              <div class="caption">
                <div class="caption-content">
                  <i class="fa fa-search-plus fa-3x"></i>
                </div>
              </div>
              <img class="search-img-fluid" src="${path }/img/game.png" alt="">
            </a>
          </div>
          <div class="col-md-4 search-margin-bottom-20">
            <a class="portfolio-link" href="#portfolioModal5" data-toggle="modal">
              <div class="caption">
                <div class="caption-content">
                  <i class="fa fa-search-plus fa-3x"></i>
                </div>
              </div>
              <img class="search-img-fluid" src="${path }/img/safe.png" alt="">
            </a>
          </div>
          <div class="col-md-4 search-margin-bottom-20">
            <a class="portfolio-link" href="#portfolioModal6" data-toggle="modal">
              <div class="caption">
                <div class="caption-content">
                  <i class="fa fa-search-plus fa-3x"></i>
                </div>
              </div>
              <img class="search-img-fluid" src="${path }/img/submarine.png" alt="">
            </a>
          </div>
        </div>
      </div>
    </section>
	
</body>
</html>