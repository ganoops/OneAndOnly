$(document).on('click', '#close-preview', function(){ 
    $('.image-preview').popover('hide');
    // Hover befor close the preview
    $('.image-preview').hover(
        function () {
           $('.image-preview').popover('show');
        }, 
         function () {
           $('.image-preview').popover('hide');
        }
    );    
});

$(function() {
    // Create the close button
    var closebtn = $('<button/>', {
        type:"button",
        text: 'x',
        id: 'close-preview',
        style: 'font-size: initial;',
    });
    closebtn.attr("class","close pull-right");
    // Set the popover default content
    $('.image-preview').popover({
        trigger:'manual',
        html:true,
        title: "<strong>Preview</strong>"+$(closebtn)[0].outerHTML,
        content: "There's no image",
        placement:'bottom'
    });
    // Clear event
    $('.image-preview-clear').click(function(){
        $('.image-preview').attr("data-content","").popover('hide');
        $('.image-preview-filename').val("");
        $('.image-preview-clear').hide();
        $('.image-preview-input input:file').val("");
        $(".image-preview-input-title").text("Browse"); 
    }); 
    // Create the preview image
    $(".image-preview-input input:file").change(function (){     
        var img = $('<img/>', {
            id: 'dynamic',
            width:250,
            height:200
        });      
        var file = this.files[0];
        var reader = new FileReader();
        // Set preview image into the popover data-content
        reader.onload = function (e) {
            $(".image-preview-input-title").text("Change");
            $(".image-preview-clear").show();
            $(".image-preview-filename").val(file.name);
            img.attr('src', e.target.result);
            img.attr('class', "img-circle");
            $(".image-preview").attr("data-content",$(img)[0].outerHTML).popover("show");
        }        
        reader.readAsDataURL(file);
        
        
    });  
    
    $("#update").click(function(){
    	var url = $("#url").val();
    	var nicknameCheck = $("#nicknameCheckResult").text();
    	if(nicknameCheck.indexOf("이미")!= -1){
    		alert("닉네임을 확인하세요");
    		return;
    	}
		$("#updateForm").ajaxForm({
			type: "post", 
			url: url, 
			dataType: "text",
			success: function(result){
				alert(result+"");
			},
			error: function(err){
				alert("회원 수정 오류요~ " + err);
			} 
		});
		$("#updateForm").submit();
		location.reload();
	});
    
    $("#nickname").keyup(function(){
    	var path = $("#path").val();
    	var originNickname = $("#originNickname").val();
    	if(originNickname==$(this).val()){
    		$("#nicknameCheckResult").html("");
    		return;
    	}
    	$.ajax({
			type : "post",	//전송방식(get, post)
			url : "oao",	//서버 주소
			data : "command=nicknameCheck&nickname="+$(this).val(), 	//서버에게 보낼 데이터(param 정보)
			dataType : "text",	//서버가 보내온 데이터 타입(text, html, xml, json)
			success : function(result){
				$("#nicknameCheckResult").html(result);
			},	//성공했을 때 콜백 함수
			error : function(err){
				alert('오류가 발생했어요~' + err);
			} 	//실패했을 때 콜백 함수
		});
	});
   
});