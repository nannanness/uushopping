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
        <link rel="stylesheet" href="../resources/assets/css/ace.min.css" />
        <link rel="stylesheet" href="../resources/assets/css/font-awesome.min.css" />
        <link rel="stylesheet" href="../resources/Widget/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
        <link href="../resources/Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />
		<!--[if IE 7]>
		  <link rel="stylesheet" href="../resources/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="../resources/assets/css/ace-ie.min.css" />
		<![endif]-->
	    <script src="../resources/js/jquery-1.9.1.min.js"></script>
        <script src="../resources/assets/js/bootstrap.min.js"></script>
        <script src="../resources/assets/js/typeahead-bs2.min.js"></script>
		<!-- page specific plugin scripts -->
		<script src="../resources/assets/js/jquery.dataTables.min.js"></script>
		<script src="../resources/assets/js/jquery.dataTables.bootstrap.js"></script>
        <script type="text/javascript" src="../resources/js/H-ui.js"></script>
        <script type="text/javascript" src="../resources/js/H-ui.admin.js"></script>
        <script src="../resources/assets/layer/layer.js" type="text/javascript" ></script>
        <script src="../resources/assets/laydate/laydate.js" type="text/javascript"></script>
        <script type="text/javascript" src="../resources/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
        <script src="../resources/js/lrtk.js" type="text/javascript" ></script>
        <script src="/resources/assets/layer/layer.js" type="text/javascript"></script>
        <script src="/resources/assets/laydate/laydate.js" type="text/javascript"></script>
<title>商品列表</title>
</head>
<body>
<div class="page-content clearfix">
    <div class="administrator">
        <div class="d_Confirm_Order_style">
            <div class="search_style">
                <form action="/product/search.do" method="post">
                    <ul class="search_content clearfix">
                        <li><label class="l_f">商品名称</label><input  name="text" type="text"  class="text_add" placeholder=""  style=" width:400px"/></li>
                        <li style="width:90px;"><button type="submit"  id="btn_search" class="btn_search"><i class="fa fa-search"></i>查询</button></li>
                    </ul>
                </form>
            </div>
            <!--操作-->
            <div class="border clearfix">
                <span class="l_f">共：<b>${Businesslist.size()}</b>个商品</span>
            </div>
            <!--管理员列表-->
            <div class="clearfix administrator_style" id="administrator">
                <div class="table_menu_list"  id="testIframe" style="width: 94% ; margin: 0 10px">
                    <table class="table table-striped table-bordered table-hover" id="sample_table">
                        <thead>
                        <tr>
                            <th width="25px"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
                            <th width="150px">商品编号</th>
                            <th width="130px">商品名称</th>
                            <th width="100px">单价</th>
                            <th width="150px">所属地区</th>
                            <th width="150px">累计销量</th>
                            <th width="130px">审核状态</th>
                            <th width="180px">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="product" items="${Businesslist}">
                            <tr>
                                <td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td>
                                <td class="commodityId">${product.commodityId}</td>
                                <td>${product.commodityName}</td>
                                <td>${product.commodityPrice}</td>
                                <td>${product.commodityFrom}</td>
                                <td>${product.salesVolume}</td>
                                <td class="td-status"><span class="label label-success radius">${product.commodityFlag}</span></td>
                                <td class="td-manage">
                                    <a title="上架商品" href="javascript:void(0);" class="btn btn-xs btn-success pass"><i class="fa fa-check  bigger-120"></i></a>
                                    <a title="挂起商品" href="javascript:void(0);" class="btn btn-xs btn-info hang" ><i class="fa fa-edit bigger-120"></i></a>
                                    <a title="下架商品" href="javascript:void(0);" class="btn btn-xs btn-warning Obtained" ><i class="fa fa-trash  bigger-120"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
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

        $(document).on('click','.pass',pass());
        $(document).on('click','.hang',hang());
        $(document).on('click','.Obtained',Obtained());
        function pass(){
            alert("pass=============");
            var index = $(".pass").index($(this));
            var flag = $(".td-status").eq(index).children().text();
            var commodityId = $(".commodityId").eq(index).text();
            alert(flag);
            if("审核中" == flag || "挂起" == flag){
                $.get(
                    '/product/pass.do',
                    {"commodityId":commodityId},
                    function (data) {
                        if("true" == data["flag"]){
                            $(".td-status").eq(index).children().text("上架中");
                        }
                    },
                    "json"
                )
            }else {
                alert("该店铺不能上架！");
            }
        };
        function hang() {
            var index = $(".hang").index($(this));
            var flag = $(".td-status").eq(index).children().text();
            var commodityId = $(".commodityId").eq(index).text();
            if("上架中" == flag){
                $.get(
                    '/product/hang.do',
                    {"commodityId":commodityId},
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
        };
        function Obtained() {
            var index = $(".Obtained").index($(this));
            var flag = $(".td-status").eq(index).children().text();
            var commodityId = $(".commodityId").eq(index).text();
            if("已下架" != flag){
                $.get(
                    '/product/Obtained.do',
                    {"commodityId":commodityId},
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
        };
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