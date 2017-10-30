<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>One & Only</title>
<link href="${path}/css/style.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="${path}/js/jquery-3.2.1.js"></script>
</head>
<body>
<header class="container-fuild fixed navbar-fixed-top" id="navbar">
	<div class="container-fuild">
		<div class="container">
			<div class="row">
				<!-- logo -->  
				<div class="col-md-2 logo">
					<img src="${path}/img/logo4.png" alt="logo" width="65%">
				</div>
				<!-- search -->
				<div class="col-md-4 col-md-offset-2 search">
					<form method="post" action="">
						<div class="input-group stylish-input-group">
							<select class="form-control" name="type" style="width:90px">
								<option value="사용자">사용자</option>
								<option value="태그">태그</option>
								<option value="내용">내용</option>
							</select>
							
							<div class="input-group custom-search-form">
	                            <input type="text" class="form-control" name="search" placeholder="Search...">
	                                <span class="input-group-btn">
	                                    <button class="btn btn-default" type="submit">
	                                      <i class="glyphicon glyphicon-search">search</i>
	                                    </button>
	                                </span>
	                        </div>
		                </div>
	                </form>
				</div>
				<!-- icons -->
				<div class="col-md-2 col-md-offset-2 navIcons">
					<a href="${path}/oao?command=SelectUser&userEmail=a@aa"><i class="glyphicon glyphicon-th-large"></i></a>
					<a href=""><i class="glyphicon glyphicon-camera"></i></a>
					<a href=""><i class="glyphicon glyphicon-heart"></i></a>
					<a href="${path}/oao?command=SelectUser&userEmail=${sessionScope.userEmail}"><i class="glyphicon glyphicon-user"></i></a>
				</div>
			</div><!-- row End -->
		</div>
	</div>
</header>

<div class="container-fuild news-content">
	<div class="container">
		<div class="row">
			
			<!-- view -->
			<div class="col-md-6 col-md-offset-3 news-view">
				<div class="news-view-wrap">
					<!-- photo -->
					<div class="news-view-img">
						<img src="" alt="">
					</div>
					<!-- content(name,heart) -->
					<div class="news-view-content">
						<a href="">김수아</a>
						<a href="#"><i class="glyphicon glyphicon-heart-empty"></i></a>
					</div>
				</div>
			</div>
			
			<!-- view -->
			<div class="col-md-6 col-md-offset-3 news-view">
				<div class="news-view-wrap">
					<!-- photo -->
					<div class="news-view-img">
						<img src="" alt="">
					</div>
					<!-- content(name,heart) -->
					<div class="news-view-content">
						<a href="">김수아</a>
						<a href="#"><i class="glyphicon glyphicon-heart-empty"></i></a>
					</div>
				</div>
			</div>
			
			<!-- view -->
			<div class="col-md-6 col-md-offset-3 news-view">
				<div class="news-view-wrap">
					<!-- photo -->
					<div class="news-view-img">
						<img src="" alt="">
					</div>
					<!-- content(name,heart) -->
					<div class="news-view-content">
						<a href="">김수아</a>
						<a href="#"><i class="glyphicon glyphicon-heart-empty"></i></a>
					</div>
				</div>
			</div>
			
			
		</div><!-- row End -->
	</div>
</div><!-- news-content End -->

<script>
	//하트 클릭시
	$(document).on("click",".news-view-content a:last-child",function(e){
		e.preventDefault();
		var ii = $(this).find("i");
		if(ii.hasClass("glyphicon-heart-empty")){
			ii.attr("class","glyphicon glyphicon-heart");
			$(this).css("color","red");
		}else{
			ii.attr("class","glyphicon glyphicon-heart-empty");
			$(this).css("color","#555");
		}
	});
	
</script>
</body>
</html>