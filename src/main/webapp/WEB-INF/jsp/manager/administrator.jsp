<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
         <link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="/resources/css/style.css"/>
        <link href="/resources/assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="/resources/assets/css/ace.min.css" />
        <link rel="stylesheet" href="/resources/font/css/font-awesome.min.css" />
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="/resources/assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="/resources/js/jquery-1.9.1.min.js"></script>
        <script src="/resources/assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="/resources/Widget/Validform/5.3.2/Validform.min.js"></script>
		<script src="/resources/assets/js/typeahead-bs2.min.js"></script>
		<script src="/resources/assets/js/jquery.dataTables.min.js"></script>
		<script src="/resources/assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="/resources/assets/layer/layer.js" type="text/javascript" ></script>
		<script src="/resources/js/lrtk.js" type="text/javascript" ></script>
         <script src="/resources/assets/layer/layer.js" type="text/javascript"></script>
        <script src="/resources/assets/laydate/laydate.js" type="text/javascript"></script>
<title>管理员</title>
</head>

<body>
<div class="page-content clearfix">
  <div class="administrator">
       <div class="d_Confirm_Order_style">
    <div class="search_style">
		<form action="/storeController/search.do" method="post">
			<ul class="search_content clearfix">
				<li><label class="l_f">卖家名称</label><input  name="text" type="text"  class="text_add" placeholder=""  style=" width:400px"/></li>
				<li style="width:90px;"><button type="submit"  id="btn_search" class="btn_search"><i class="fa fa-search"></i>查询</button></li>
			</ul>
		</form>
    </div>
    <!--操作-->
     <div class="border clearfix">
       <span class="l_f">
        <a href="javascript:void(0)" id="administrator_add" class="btn btn-warning"><i class="fa fa-plus"></i> 添加卖家</a>
       </span>
       <span class="r_f">共：<b>${list.size()}</b>人</span>
     </div>
     <!--管理员列表-->
     <div class="clearfix administrator_style" id="administrator">
      <div class="table_menu_list"  id="testIframe" style="width: 94% ; margin: 0 10px">
           <table class="table table-striped table-bordered table-hover" id="sample_table">
		<thead>
		 <tr>
				<th width="25px"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
				<th width="150px">店铺编号</th>
				<th width="150px">姓名</th>
				<th width="150px">手机</th>
				<th width="150px">邮箱</th>
                <th width="100px">店铺</th>
				<th width="150px">加入时间</th>
				<th width="70px">状态</th>                
				<th width="220px">操作</th>
			</tr>
		</thead>
	<tbody>
	<c:forEach var="store" items="${list}">
		<tr>
			<td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td>
			<td class="storeId">${store.storeId}</td>
			<td>${store.storeMan}</td>
			<td>${store.storePhone}</td>
			<td>${store.storeEmail}</td>
			<td>${store.storeName}</td>
			<td>${store.storeDate}</td>
			<td class="td-status"><span class="label label-success radius">${store.storeFlag}</span></td>
			<td class="td-manage">
				<a title="上架店铺" href="javascript:void(0);" class="btn btn-xs btn-success pass"><i class="fa fa-check  bigger-120"></i></a>
				<a title="挂起店铺" href="javascript:void(0);" class="btn btn-xs btn-info hang" ><i class="fa fa-edit bigger-120"></i></a>
				<a title="下架店铺" href="javascript:void(0);" class="btn btn-xs btn-warning Obtained" ><i class="fa fa-trash  bigger-120"></i></a>
			</td>
		</tr>
	</c:forEach>
    </tbody>
    </table>
      </div>
     </div>
  </div>
</div>
 <!--添加管理员-->
 <div id="add_administrator_style" class="add_menber" style="display:none">
    <form action="/storeController/add_store.do" method="post" id="form-admin-add">
		<div class="form-group">
			<label class="form-label"><span class="c-red">*</span>店铺：</label>
			<div class="formControls">
				<input type="text" class="input-text" value="" placeholder="" id="user-name" name="storeName" datatype="*2-16" nullmsg="用户名不能为空">
			</div>
			<div class="col-4"> <span class="Validform_checktip"></span></div>
		</div>
		<div class="form-group">
			<label class="form-label"><span class="c-red">*</span>店主：</label>
			<div class="formControls">
				<input type="text" class="input-text" value="" placeholder="" id="" name="storeMan" datatype="*2-16" nullmsg="用户名不能为空">
			</div>
			<div class="col-4"> <span class="Validform_checktip"></span></div>
		</div>
		<div class="form-group">
			<label class="form-label"><span class="c-red">*</span>初始密码：</label>
			<div class="formControls">
			<input type="password" placeholder="密码" name="storePassword" id="storePassword" autocomplete="off" value="" class="input-text" datatype="*6-20" nullmsg="密码不能为空">
			</div>
			<div class="col-4"> <span class="Validform_checktip"></span></div>
		</div>
		<div class="form-group">
			<label class="form-label "><span class="c-red">*</span>确认密码：</label>
			<div class="formControls ">
		<input type="password" placeholder="确认新密码" autocomplete="off" class="input-text Validform_error" errormsg="您两次输入的新密码不一致！" datatype="*" nullmsg="请再输入一次新密码！" recheck="storePassword" id="storePassword2" name="storePassword2">
			</div>
			<div class="col-4"> <span class="Validform_checktip"></span></div>
		</div>
		<div class="form-group">
			<label class="form-label "><span class="c-red">*</span>手机：</label>
			<div class="formControls ">
				<input type="text" class="input-text" value="" placeholder="" id="userTel" name="storePhone" datatype="m" nullmsg="手机不能为空">
			</div>
			<div class="col-4"> <span class="Validform_checktip"></span></div>
		</div>
		<div class="form-group">
			<label class="form-label"><span class="c-red">*</span>邮箱：</label>
			<div class="formControls ">
				<input type="text" class="input-text" placeholder="@" name="storeEmail" id="email" datatype="e" nullmsg="请输入邮箱！">
			</div>
			<div class="col-4"> <span class="Validform_checktip"></span></div>
		</div>
		<div class="form-group">
			<label class="form-label">角色：</label>
			<div class="formControls "> <span class="select-box" style="width:150px;">
				<select class="select" name="admin-role" size="1">
					<option value="0">店主</option>
				</select>
				</span> </div>
		</div>
		<div class="form-group">
			<label class="form-label">店铺介绍：</label>
			<div class="formControls">
				<textarea name="storeIntroduction" cols="" rows="" class="textarea" placeholder="说点什么.100个字符以内" dragonfly="true" onkeyup="checkLength(this);"></textarea>
				<span class="wordage">剩余字数：<span id="sy" style="color:Red;">100</span>字</span>
			</div>
			<div class="col-4"> </div>
		</div>
		<div> 
        <input class="btn btn-primary radius" type="submit" id="Add_Administrator" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
        </div>
	</form>
   </div>
 </div>
</body>
</html>
<script type="text/javascript">
jQuery(function($) {
		var oTable1 = $('#sample_table').dataTable( {
		"aaSorting": [[ 1, "asc" ]],//默认第几个排序
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
			});

</script>
<script type="text/javascript">
$(function() { 
	$("#administrator").fix({
		float : 'left',
		//minStatue : true,
		skin : 'green',	
		durationTime :false,
		spacingw:50,//设置隐藏时的距离
	    spacingh:270,//设置显示时间距
	});

	$(".pass").click(function () {
        var index = $(".pass").index($(this));
		var flag = $(".td-status").eq(index).children().text();
		var storeId = $(".storeId").eq(index).text();
		alert(flag);
		if("审核中" == flag || "挂起" == flag){
            $.get(
                '/storeController/pass.do',
                {"storeId":storeId},
                function (data) {
					if("true" == data["flag"]){
                        $(".td-status").eq(index).children().text("已通过");
                    }
                },
                "json"
            )
		}else {
            alert("该店铺不能上架！");
		}
    });
    $(".hang").click(function () {
        var index = $(".hang").index($(this));
        var flag = $(".td-status").eq(index).children().text();
        var storeId = $(".storeId").eq(index).text();
        if("已通过" == flag){
            $.get(
                '/storeController/hang.do',
                {"storeId":storeId},
                function (data) {
                    if("true" == data["flag"]){
                        $(".td-status").eq(index).children().text("挂起");
                    }
                },
                "json"
            )
        }else {
            alert("该店铺不能挂起！");
        }
    });
    $(".Obtained").click(function () {
        var index = $(".Obtained").index($(this));
        var flag = $(".td-status").eq(index).children().text();
        var storeId = $(".storeId").eq(index).text();
        if("已下架" != flag){
            $.get(
                '/storeController/Obtained.do',
                {"storeId":storeId},
                function (data) {
                    if("true" == data["flag"]){
                        $(".td-status").eq(index).children().text("已下架");
                    }
                },
				"json"
            )
        }else {
            alert("该店铺已经下架！");
        }
    });
});
//字数限制
function checkLength(which) {
	var maxChars = 100; //
	if(which.value.length > maxChars){
	   layer.open({
	   icon:2,
	   title:'提示框',
	   content:'您输入的字数超过限制!',	
    });
		// 超过限制的字数了就将 文本框中的内容按规定的字数 截取
		which.value = which.value.substring(0,maxChars);
		return false;
	}else{
		var curr = maxChars - which.value.length; //250 减去 当前输入的
		document.getElementById("sy").innerHTML = curr.toString();
		return true;
	}
};
//初始化宽度、高度
 laydate({
    elem: '#start',
    event: 'focus' 
});

/*添加店主*/
$('#administrator_add').on('click', function(){
	layer.open({
    type: 1,
	title:'添加店主',
	area: ['700px',''],
	shadeClose: false,
	content: $('#add_administrator_style'),
	
	});
})
	//表单验证提交
var validDemo = $("#form-admin-add").Validform({
	 	tiptype:2,
		callback:function(data){
		//form[0].submit();
		if(data.status==1){ 
                layer.msg(data.info, {icon: data.status,time: 1000}, function(){ 
                    location.reload();//刷新页面 
                    });   
            } 
            else{ 
                layer.msg(data.info, {icon: data.status,time: 3000}); 
            } 		  
			var index =parent.$("#iframe").attr("src");
			parent.layer.close(index);
		}
	});

</script>

