<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="/resources/css/style.css"/>
    <link href="/resources/assets/css/codemirror.css" rel="stylesheet">
    <link rel="stylesheet" href="/resources/assets/css/ace.min.css" />
    <link rel="stylesheet" href="/resources/assets/css/font-awesome.min.css" />
    <!--[if IE 7]>
    <link rel="stylesheet" href="/resources/assets/css/font-awesome-ie7.min.css" />
    <![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/resources/assets/css/ace-ie.min.css" />
    <![endif]-->
    <script src="/resources/assets/js/jquery.min.js"></script>

    <!-- <![endif]-->

    <!--[if IE]>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <![endif]-->

    <!--[if !IE]> -->

    <script type="text/javascript">
        window.jQuery || document.write("<script src='/resources/assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
    </script>

    <!-- <![endif]-->

    <!--[if IE]>
    <script type="text/javascript">
        window.jQuery || document.write("<script src='/resources/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
    </script>
    <![endif]-->

    <script type="text/javascript">
        if("ontouchend" in document) document.write("<script src='/resources/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
    </script>
    <script src="/resources/assets/js/bootstrap.min.js"></script>
    <script src="/resources/assets/js/typeahead-bs2.min.js"></script>
    <!-- page specific plugin scripts -->
    <script src="/resources/assets/js/jquery.dataTables.min.js"></script>
    <script src="/resources/assets/js/jquery.dataTables.bootstrap.js"></script>
    <script type="text/javascript" src="/resources/js/H-ui.js"></script>
    <script type="text/javascript" src="/resources/js/H-ui.admin.js"></script>
    <script src="/resources/assets/layer/layer.js" type="text/javascript" ></script>
    <script src="/resources/assets/laydate/laydate.js" type="text/javascript"></script>
    <title>用户列表</title>
</head>

<body>
<div class="page-content clearfix">
    <div id="Member_Ratings">
        <div class="d_Confirm_Order_style">
            <div class="search_style">
            </div>
            <!---->
            <!---->
            <div class="table_menu_list">
                <table class="table table-striped table-bordered table-hover" id="sample-table">
                    <thead>
                    <tr>
                        <th width="25"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
                        <th width="80">ID</th>
                        <th width="100">用户名</th>
                        <th width="80">性别</th>
                        <th width="120">手机</th>
                        <th width="150">邮箱</th>
                        <th width="">地址</th>
                        <th width="180">加入时间</th>

                        <th width="70">状态</th>
                        <th width="250">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${ul}" var="u">
                    <tr>
                        <td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td>
                        <td class="userId">${u.userId}</td>
                        <td><u style="cursor:pointer" class="text-primary" onclick="member_show('张三','/pageJump/member-show.do','10001','500','400')">${u.username}</u></td>
                        <td>${u.userSex}</td>
                        <td>${u.userPhone}</td>
                        <td>${u.userEmail}</td>
                        <td class="text-l">${u.userAddress}</td>
                        <td>${u.userRegistrationDate}</td>

                        <td class="td-status"><span class="label label-success radius">已启用</span></td>
                        <td class="td-manage">
                            <a   href="javascript:;" title="启用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                            <a title="停用" href="javascript:;"  class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
<script>
    jQuery(function($) {
        var oTable1 = $('#sample-table').dataTable( {
            "aaSorting": [[ 1, "desc" ]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
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

    $(".btn-warning").on('click',function () {
        //获取当前所选的按钮
        var index = $(".btn-warning").index($(this));
        //获取userId的值
        var userId = $(".userId").eq(index).text();
        //获取状态的值
        var status = $(".td-status").eq(index).text();
        if(status == "已启用"){
            $.get(
                "/supermanager/ajax.do",
                {"userId":userId},
                function(data){
                    //判断拿到的数据
                    if(data["userFlag"] == "stop"){
                        $(".td-status").eq(index).text("已停用");
                    }
                },
        "json"
            )
        }else{
            alert("该用户已被停用")
        }

    })
    $(".btn-success").on('click',function () {
        //获取当前所选的按钮
        var index = $(".btn-success").index($(this));
        //获取userId的值
        var userId = $(".userId").eq(index).text();
        //获取状态的值
        var status = $(".td-status").eq(index).text();
        if(status == "已停用"){
            $.get(
                "/supermanager/ajax.do",
                {"userId":userId},
                function(data){
                    //判断拿到的数据
                    if(data["userFlag"] == "stop"){
                        $(".td-status").eq(index).text("已启用");
                    }
                },
                "json"
            )
        }else{
            alert("该用户已被启用")
        }

    })
</script>