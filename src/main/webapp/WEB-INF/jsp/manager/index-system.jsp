﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>网站后台管理系统  </title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="/resources/assets/css/font-awesome.min.css" />
		<!--[if IE 7]>
		  <link rel="stylesheet" href="/resources/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="/resources/assets/css/ace.min.css" />
		<link rel="stylesheet" href="/resources/assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="/resources/assets/css/ace-skins.min.css" />
        <link rel="stylesheet" href="/resources/css/style.css"/>
		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="/resources/assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="/resources/assets/js/ace-extra.min.js"></script>
		<!--[if lt IE 9]>
		<script src="/resources/assets/js/html5shiv.js"></script>
		<script src="/resources/assets/js/respond.min.js"></script>
		<![endif]-->
        <!--[if !IE]> -->
		<script src="/resources/js/jquery-1.9.1.min.js"></script>
		<!-- <![endif]-->
		<!--[if IE]>
         <script sstype="text/javascript">
         	window.jQuery || document.write("<script src='/resources/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
		</script>
        <![endif]-->
		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='/resources/assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
		</script>
		<script src="/resources/assets/js/bootstrap.min.js"></script>
		<script src="/resources/assets/js/typeahead-bs2.min.js"></script>
		<!--[if lte IE 8]>
		  <script src="/resources/assets/js/excanvas.min.js"></script>
		<![endif]-->
		<script src="/resources/assets/js/ace-elements.min.js"></script>
		<script src="/resources/assets/js/ace.min.js"></script>
        <script src="/resources/assets/layer/layer.js" type="text/javascript"></script>
		<script src="/resources/assets/laydate/laydate.js" type="text/javascript"></script>
        <script src="/resources/js/jquery.nicescroll.js" type="text/javascript"></script>
        
<script type="text/javascript">	
 $(function(){ 
 var cid = $('#nav_list> li>.submenu');
	  cid.each(function(i){ 
       $(this).attr('id',"Sort_link_"+i);
   
    })  
 })
 jQuery(document).ready(function(){ 	
    $.each($(".submenu"),function(){
	var $aobjs=$(this).children("li");
	var rowCount=$aobjs.size();
	var divHeigth=$(this).height();
    $aobjs.height(divHeigth/rowCount);	  	
  }); 
    //初始化宽度、高度

    $("#main-container").height($(window).height()-76); 
	$("#iframe").height($(window).height()-140); 
	 
	$(".sidebar").height($(window).height()-99); 
    var thisHeight = $("#nav_list").height($(window).outerHeight()-173); 
	$(".submenu").height();
	$("#nav_list").children(".submenu").css("height",thisHeight);
	
    //当文档窗口发生改变时 触发  
    $(window).resize(function(){
	$("#main-container").height($(window).height()-76); 
	$("#iframe").height($(window).height()-140);
	$(".sidebar").height($(window).height()-99); 
	
	var thisHeight = $("#nav_list").height($(window).outerHeight()-173); 
	$(".submenu").height();
	$("#nav_list").children(".submenu").css("height",thisHeight);
  });
    $(document).on('click','.iframeurl',function(){
                var cid = $(this).attr("name");
				var cname = $(this).attr("title");
                $("#iframe").attr("src",cid).ready();
				$("#Bcrumbs").attr("href",cid).ready();
				$(".Current_page a").attr('href',cid).ready();	
                $(".Current_page").attr('name',cid);
				$(".Current_page").html(cname).css({"color":"#333333","cursor":"default"}).ready();	
				$("#parentIframe").html('<span class="parentIframe iframeurl"> </span>').css("display","none").ready();	
				$("#parentIfour").html('').css("display","none").ready();
      });
});
 /******/
  $(document).on('click','.link_cz > li',function(){
	$('.link_cz > li').removeClass('active');
	$(this).addClass('active');
});
/*******************/

/*********************点击事件*********************/
$( document).ready(function(){
  $('#nav_list,.link_cz').find('li.home').on('click',function(){
	$('#nav_list,.link_cz').find('li.home').removeClass('active');
	$(this).addClass('active');
  });												
//时间设置
  function currentTime(){ 
    var d=new Date(),str=''; 
    str+=d.getFullYear()+'年'; 
    str+=d.getMonth() + 1+'月'; 
    str+=d.getDate()+'日'; 
    str+=d.getHours()+'时'; 
    str+=d.getMinutes()+'分'; 
    str+= d.getSeconds()+'秒'; 
    return str; 
} 

setInterval(function(){$('#time').html(currentTime)},1000); 
//修改密码
$('.change_Password').on('click', function(){
    layer.open({
    type: 1,
	title:'修改密码',
	area: ['300px','300px'],
	shadeClose: true,
	content: $('#change_Pass'),
	btn:['确认修改'],
	yes:function(index, layero){		
		   if ($("#password").val()==""){
			  layer.alert('原密码不能为空!',{
              title: '提示框',				
				icon:0,
			    
			 });
			return false;
          } 
		  if ($("#Nes_pas").val()==""){
			  layer.alert('新密码不能为空!',{
              title: '提示框',				
				icon:0,
			    
			 });
			return false;
          } 
		   
		  if ($("#c_mew_pas").val()==""){
			  layer.alert('确认新密码不能为空!',{
              title: '提示框',				
				icon:0,
			    
			 });
			return false;
          }
		    if(!$("#c_mew_pas").val || $("#c_mew_pas").val() != $("#Nes_pas").val() )
        {
            layer.alert('密码不一致!',{
              title: '提示框',				
				icon:0,
			    
			 });
			 return false;
        }   
		 else{			  
			  layer.alert('修改成功！',{
               title: '提示框',				
			icon:1,		
			  }); 
			  layer.close(index);      
		  }	 
	}
    });
});
  $('#Exit_system').on('click', function(){
      layer.confirm('是否确定退出系统？', {
      		btn: ['是','否'] ,//按钮
	  		icon:2,
	  },
		function(){
	  		window.location.href="${pageContext.request.contextPath}/login-system.jsp";
	    });
});
});
function link_operating(name,title){
                var cid = $(this).name;
				var cname = $(this).title;
                $("#iframe").attr("src",cid).ready();
				$("#Bcrumbs").attr("href",cid).ready();
				$(".Current_page a").attr('href',cid).ready();	
                $(".Current_page").attr('name',cid);
				$(".Current_page").html(cname).css({"color":"#333333","cursor":"default"}).ready();	
				$("#parentIframe").html('<span class="parentIframe iframeurl"> </span>').css("display","none").ready();	
				$("#parentIfour").html(''). css("display","none").ready();		
      
    
}
</script>	
	</head>
	<body>
		<div class="navbar navbar-default" id="navbar">
        <script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>
			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="#" class="navbar-brand">
						<small>					
						<%--<img src="/resources/images/logo.png" width="470px">--%>
							<h2 style="line-height: 80px">UU购物管理系统</h2>
						</small>
					</a><!-- /.brand -->
				</div><!-- /.navbar-header -->
				<div class="navbar-header operating pull-left">
				
				</div>
			   <div class="navbar-header pull-right" role="navigation">
               <ul class="nav ace-nav">	
                <li class="light-blue">
				<a data-toggle="dropdown" href="#" class="dropdown-toggle">
				 <span  class="time"><em id="time"></em></span><span class="user-info"><small>欢迎光临,</small>${supermanager.managerName}</span>
				 <i class="icon-caret-down"></i>
				</a>
				<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
				 <li><a href="javascript:void(0)" name="/supermanager/admin_info.do" title="个人信息" class="iframeurl"><i class="icon-user"></i>个人资料</a></li>
				 
				 <li class="divider"></li>
				 <li><a href="javascript:void(0)" id="Exit_system"><i class="icon-off"></i>退出</a></li>
				</ul>
			   </li>
	          </ul>
             </div>
			</div>
		</div>
		<div class="main-container" id="main-container">
        <script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>
			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>
				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>
					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<a class="btn btn-success">
								<i class="icon-signal"></i>
							</a>

							<a class="btn btn-info">
								<i class="icon-pencil"></i>
							</a>

							<a class="btn btn-warning">
								<i class="icon-group"></i>
							</a>

							<a class="btn btn-danger">
								<i class="icon-cogs"></i>
							</a>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>

							<span class="btn btn-info"></span>

							<span class="btn btn-warning"></span>

							<span class="btn btn-danger"></span>
						</div>
					</div><!-- #sidebar-shortcuts -->
					<div id="menu_style" class="menu_style">
					<ul class="nav nav-list" id="nav_list">
				     <li class="home"><a href="javascript:void(0)" name="/pageJump/home.do" class="iframeurl" title=""><i class="icon-home"></i><span class="menu-text"> 系统首页 </span></a></li>
                     <li><a href="#" class="dropdown-toggle"><i class="icon-desktop"></i><span class="menu-text"> 商品管理 </span><b class="arrow icon-angle-down"></b></a>
					   <ul class="submenu">
                         <li class="home"><a  href="javascript:void(0)" name="/product/Products_List.do"  title="产品类表" class="iframeurl"><i class="icon-double-angle-right"></i>商品列表</a></li>
						</ul>
					</li>
					<li>
					<a href="#" class="dropdown-toggle"><i class="icon-picture "></i><span class="menu-text"> 图片管理 </span><b class="arrow icon-angle-down"></b></a>
						<ul class="submenu">
						<li class="home"><a href="javascript:void(0)" name="/carouselMapController/advertising.do" title="广告管理" class="iframeurl"><i class="icon-double-angle-right"></i>广告管理</a></li>
						<!-- <li class="home"><a href="javascript:void(0)" name="Sort_ads.html" title="分类管理"  class="iframeurl"><i class="icon-double-angle-right"></i>分类管理</a></li> -->
							</ul>
						</li>
					<li>
					<a href="#" class="dropdown-toggle"><i class="icon-list"></i><span class="menu-text"> 交易管理 </span><b class="arrow icon-angle-down"></b></a>
                    <ul class="submenu">
                    <li class="home"><a href="javascript:void(0)" name="/pageJump/transaction.do" title="交易信息"  class="iframeurl"><i class="icon-double-angle-right"></i>交易信息</a></li>
					<li class="home"><a href="javascript:void(0)" name="/pageJump/Order_Chart.do" title="交易订单（图）"  class="iframeurl"><i class="icon-double-angle-right"></i>交易订单(图)</a></li>
                    <li class="home"><a href="javascript:void(0)" name="/ordermanager/order.do" title="交易金额"  class="iframeurl"><i class="icon-double-angle-right"></i>交易金额</a></li>
                   </ul>
				  </li>
                  <li>
					<a href="#" class="dropdown-toggle"><i class="icon-user"></i><span class="menu-text"> 用户管理 </span><b class="arrow icon-angle-down"></b></a>
                    <ul class="submenu">
                    <li class="home"><a href="javascript:void(0)" name="/supermanager/userlist.do" title="用户列表"  class="iframeurl"><i class="icon-double-angle-right"></i>用户列表</a></li>
                   </ul>
				  </li>
				  <li><a href="#" class="dropdown-toggle"><i class="icon-laptop"></i><span class="menu-text"> 店铺管理 </span><b class="arrow icon-angle-down"></b></a>
							<ul class="submenu">
								<li class="home"><a href="javascript:void(0)" name="/storeController/Shop_list.do" title="店铺列表" class="iframeurl"><i class="icon-double-angle-right"></i>店铺列表</a></li>
							</ul>
						</li>

                        <li><a href="#" class="dropdown-toggle"><i class="icon-group"></i><span class="menu-text"> 卖家管理 </span><b class="arrow icon-angle-down"></b></a>
							<ul class="submenu">
                                <li class="home"><a href="javascript:void(0)" name="/storeController/administrator.do" title="卖家列表" class="iframeurl"><i class="icon-double-angle-right"></i>卖家列表</a></li>
							</ul>
						</li>
						
						<li><a href="javascript:void(0)" name="/supermanager/admin_info.do" title="个人信息" class="iframeurl"><i class="icon-group"></i><span class="menu-text">个人信息</span></a></li>
					</ul>
					</div>
					<script type="text/javascript">
           $("#menu_style").niceScroll({  
	        cursorcolor:"#888888",  
	        cursoropacitymax:1,  
         	touchbehavior:false,  
	        cursorwidth:"5px",  
	        cursorborder:"0",  
	        cursorborderradius:"5px"  
            }); 
          </script>
					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>
                    <script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>

				<div class="main-content">
                <script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>
					<div class="breadcrumbs" id="breadcrumbs">
						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="/pageJump/index-system.do">首页</a>
							</li>
							<li class="active"><span class="Current_page iframeurl"></span></li>
                            <li class="active" id="parentIframe"><span class="parentIframe iframeurl"></span></li>
							<li class="active" id="parentIfour"><span class="parentIfour iframeurl"></span></li>
						</ul>
					</div>
                    
                 <iframe id="iframe" style="border:0; width:100%; background-color:#FFF;"name="iframe" frameborder="0" src="/pageJump/home.do"></iframe>
			<!-- /.page-content -->
				</div><!-- /.main-content -->

	</div><!-- /.main-container-inner -->
			
		</div>
         <!--底部样式-->
       
         <div class="footer_style" id="footerstyle">  
		 <script type="text/javascript">try{ace.settings.check('footerstyle' , 'fixed')}catch(e){}</script>
          <p class="l_f"></p>
          <p class="r_f">地址：晋中市大学街319号<a href="#" target="_blank">太原师范</a></p>
         </div>
         <!--修改密码样式-->
         <div class="change_Pass_style" id="change_Pass">
            <ul class="xg_style">
             <li><label class="label_name">原&nbsp;&nbsp;密&nbsp;码</label><input name="原密码" type="password" class="" id="password"></li>
             <li><label class="label_name">新&nbsp;&nbsp;密&nbsp;码</label><input name="新密码" type="password" class="" id="Nes_pas"></li>
             <li><label class="label_name">确认密码</label><input name="再次确认密码" type="password" class="" id="c_mew_pas"></li>              
            </ul>          
         </div>
        <!-- /.main-container -->
		<!-- basic scripts -->
		
</body>
</html>

