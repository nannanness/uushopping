<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
 <link href="../resources/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="../resources/css/style.css"/>
        <link href="../resources/assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="../resources/assets/css/ace.min.css" />
        <link rel="stylesheet" href="../resources/font/css/font-awesome.min.css" />
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="../resources/assets/css/ace-ie.min.css" />
		<![endif]-->
        <!--引入CSS-->
        <link rel="stylesheet" type="text/css" href="/resources/css/webuploader.css">

		<script src="../resources/js/jquery-1.9.1.min.js"></script>
		<script src="../resources/assets/js/typeahead-bs2.min.js"></script>
        <script src="../resources/js/lrtk.js" type="text/javascript" ></script>
		<script src="../resources/assets/js/jquery.dataTables.min.js"></script>
		<script src="../resources/assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="../resources/assets/layer/layer.js" type="text/javascript" ></script>
        <script type="text/javascript" src="../resources/Widget/swfupload/swfupload.js"></script>
        <script type="text/javascript" src="../resources/Widget/swfupload/swfupload.queue.js"></script>
        <script type="text/javascript" src="../resources/Widget/swfupload/swfupload.speed.js"></script>
        <script type="text/javascript" src="../resources/Widget/swfupload/handlers.js"></script>
        <!--引入JS-->
        <script type="text/javascript" src="/resources/js/webuploader.js"></script>
        <title>广告管理</title>
</head>

<body>
<div class=" clearfix" id="advertising">
  <div class="Ads_list" style="width: 94%;margin: 0 10px;">
      <div id="img_demo">

      </div>
     <div class="border clearfix">
       <span class="l_f">
            <a href="javascript:void(0)" id="ads_add" class="btn btn-warning" style="max-width: 111px;max-height: 46px;margin: 0 5px;padding: 3px 10px;border: 5px solid #ffb752;background-color:#ffb752;"><i class="fa fa-plus"></i> 添加广告</a>
            <a href="javascript:void(0)" id="ads_delete" class="btn btn-danger"><i class="fa fa-trash"></i> 批量删除</a>
       </span>
       <span class="r_f">共：<b>${carouselMaplist.size()}</b>条广告</span>
     </div>
      <div class="Ads_lists">
          <table class="table table-striped table-bordered table-hover" id="sample-table">
              <thead>
              <tr>
                  <th width="25px"><label><input type="checkbox" class="ace" id="total"><span class="lbl"></span></label></th>
                  <th width="80px">ID</th>
                  <th width="150px">状态</th>
                  <th width="50px">序号</th>
                  <th width="220px">图片</th>
                  <th width="180px">加入时间</th>
                  <th width="150px">操作</th>
              </tr>
              </thead>
              <tbody id="all_ad">
              <c:forEach var="carouselMap" items="${carouselMaplist}">
                  <tr>
                      <td class="checkbox_all"><label><input type="checkbox" name="checkOne" class="ace single" value="${carouselMap.carouselMapId}"><span class="lbl"></span></label></td>
                      <td class="carouselMapId">${carouselMap.carouselMapId}</td>
                      <td class="carouselMapFlag">${carouselMap.carouselMapFlag}</td>
                      <td class="carouselMapOrder"><b>${carouselMap.carouselMapOrder}</b></td>
                      <td><span class="ad_img"><img src="${carouselMap.carouselMapAddress}"  width="100%" height="100%"/></span></td>
                      <td>${carouselMap.carouselMapDate}</td>
                      <td class="td-manage">
                          <a title="设置为显示" href="javascript:;"  class="btn btn-xs btn-success btn_show"><i class="fa fa-check  bigger-120"></i></a>
                          <a title="设置为隐藏" href="javascript:;"  class="btn btn-xs btn-warning btn_hidden" ><i class="fa fa-trash  bigger-120"></i></a>
                      </td>
                  </tr>
              </c:forEach>
              </tbody>
          </table>
      </div>
 </div>
</div>
</body>
</html>
<script>
    // 复选框的全选和全不选
    $(function() {
        $("#total").click(function() {
            $(".single").prop("checked", this.checked); // this指代的你当前选择的这个元素的JS对象
        });

        $("#ads_delete").click(function () {
            var arr = [];
            $("#all_ad :checked").each(function(i){
                arr[i] = $(this).val();
            });
            if(arr.length > 0){
                var jsonCheckId = arr.join(",");
                $.get(
                    '/carouselMapController/delete.do',
                    {"jsonCheckId":jsonCheckId},
                    function (data) {
                        alert("删除成功！")
                        location.reload(true);
                    },
                    "json"
                )
            }
        })
    });
</script>
<script>
    // $("#total").click(function () {
    //     var flag = $(this)[0].checked;
    //     alert(flag)
    //     if(flag == true){
    //         $(".single").attr("checked",true);
    //     }else if(flag == false){
    //         $(".single").attr("checked",false);
    //     }
    //
    // })
    
    $(".btn_show").on('click',function () {
        var index = $(".btn_show").index($(this));
        var carouselMapId = $(".carouselMapId").eq(index).text();
        var carouselMapFlag = $(".carouselMapFlag").eq(index).text();
        var count;
        var temp;
        var arr = [];
        $(".carouselMapOrder").each(function (i) {
            arr[i] = $(this).text();
        });
        for(var i = 0;i <= 5; i++ ){
            count = i;
            temp = $.inArray(""+i,arr);
            if(temp == -1){
                break;
            }
        }
        if(carouselMapFlag == "隐藏中" && temp == -1){
            $.get(
                "/carouselMapController/show.do",
                {
                    "carouselMapId":carouselMapId,
                    "carouselMapOrder":count
                },
                function (data) {
                    if(data["flag"] == "show"){
                        $(".carouselMapFlag").eq(index).text("显示中");
                        $(".carouselMapOrder").eq(index).children().text(data["order"]);
                    }
                },
                "json"
            )
        }else if(temp != -1){
            alert("已经显示五张，不可再显示其它图片！")
        }else {
            alert("该图片已经显示!")
        }
    });
    $(".btn_hidden").on('click',function () {
        var index = $(".btn_hidden").index($(this));
        var carouselMapId = $(".carouselMapId").eq(index).text();
        var carouselMapFlag = $(".carouselMapFlag").eq(index).text();
        if(carouselMapFlag == "显示中"){
            $.get(
                "/carouselMapController/hidden.do",
                {"carouselMapId":carouselMapId},
                function (data) {
                    if(data["flag"] == "hidden"){
                        $(".carouselMapFlag").eq(index).text("隐藏中");
                        $(".carouselMapOrder").eq(index).children().text(0);
                    }
                },
                "json"
            )
        }else {
            alert("该图片已经隐藏！")
        }
    });
</script>
<script>
    // 初始化Web Uploader
    var uploaderAd = WebUploader.create({
        // 选完文件后，是否自动上传。
        auto: true,
        // swf文件路径
        swf: '/resources/js/Uploader.swf',
        // 文件接收服务端。
        server: '/carouselMapController/upload_ad.do',
        // 选择文件的按钮。可选。
        // 内部根据当前运行是创建，可能是input元素，也可能是flash.
        pick: '#ads_add',
        // 只允许选择图片文件。
        accept: {
            title: 'Images',
            extensions: 'gif,jpg,jpeg,bmp,png',
            mimeTypes: 'image/*'
        }
    });

    uploaderAd.on( 'fileQueued', function( file ) {
        var $li = $(
            '<div id="' + file.id + '" class="file-item thumbnail">' +
            '<img >' +
            '</div>'
            ),
        $img = $li.find('img');
        $('#img_demo').html('');
        $('#img_demo').append( $li );
        // 创建缩略图
        // 如果为非图片文件，可以不用调用此方法。
        // thumbnailWidth x thumbnailHeight 为 100 x 100
        // uploaderAd.makeThumb( file, function( error, src ) {
        //     if ( error ) {
        //         $img.replaceWith('<span>不能预览</span>');
        //         return;
        //     }
        //     $img.attr( 'src', src );
        // },600 );
    });
    // 文件上传成功，给item添加成功class, 用样式标记上传成功。
    uploaderAd.on( 'uploadSuccess', function( file ) {
        alert("上传成功！")
        location.reload(true);
    });
</script>
<script>
jQuery(function($) {
				var oTable1 = $('#sample-table').dataTable( {
				"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,2,3,4,5,7,8,]}// 制定列不参与排序
		] } );
				
				
				$('table th input:checkbox').on('click' , function(){
					var that = this;
					$(this).closest('table').find('tr > td:first-child input:checkbox')
					.each(function(){
						this.checked = that.checked;
						$(this).closest('tr').toggleClass('selected');
					});
						
				});
			
			
				$('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
				function tooltip_placement(context, source) {
					var $source = $(source);
					var $parent = $source.closest('table')
					var off1 = $parent.offset();
					var w1 = $parent.width();
			
					var off2 = $source.offset();
					var w2 = $source.width();
			
					if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
					return 'left';
				}
			})
</script>
