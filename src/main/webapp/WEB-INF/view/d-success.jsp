<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tyq
  Date: 2018/8/26
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
    <meta name="renderer" content="webkit">
    <title>订单提交成功</title>
    <link rel="shortcut icon" type="image/x-icon" href="../theme/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="../theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="../theme/css/home.css">
    <script type="text/javascript" src="../theme/js/jquery.js"></script>
    <script type="text/javascript" src="../js/js-tab.js"></script>
    <script>
        $(function(){

            $("#H-table li").each(function(i){
                $(this).click((function(k){
                    var _index = k;
                    return function(){
                        $(this).addClass("cur").siblings().removeClass("cur");
                        $(".H-over").hide();
                        $(".H-over:eq(" + _index + ")").show();
                    }
                })(i));
            });
            $("#H-table1 li").each(function(i){
                $(this).click((function(k){
                    var _index = k;
                    return function(){
                        $(this).addClass("cur").siblings().removeClass("cur");
                        $(".H-over1").hide();
                        $(".H-over1:eq(" + _index + ")").show();
                    }
                })(i));
            });
        });
    </script>
    <script type="text/javascript">
        (function(a){
            a.fn.hoverClass=function(b){
                var a=this;
                a.each(function(c){
                    a.eq(c).hover(function(){
                        $(this).addClass(b)
                    },function(){
                        $(this).removeClass(b)
                    })
                });
                return a
            };
        })(jQuery);

        $(function(){
            $("#pc-nav").hoverClass("current");
        });
    </script>

</head>
<body>

<!--- header begin-->
<header id="pc-header">
    <div class="BHeader">
        <div class="yNavIndex">
            <ul class="BHeaderl">
                <li><a href="my-d.do">订单查询</a> </li>
                <li class="headerul">|</li>
                <li><a href="my-s.do">我的收藏</a> </li>
                <li class="headerul">|</li>
                <li id="pc-nav" class="menu"><a href="#" class="tit">我的商城</a>
                    <div class="subnav">
                        <a href="my-user.do">账户安全</a>
                        <a href="my-add.do">地址管理</a>
                        <a href="my-p.do">我要评价</a>
                    </div>
                </li>

            </ul>
        </div>
    </div>
    <div class="container clearfix">
        <div class="header-logo fl" style="width:212px;"><h1><a href="index.do"><img src="../theme/icon/logo.png"></a></h1></div>
        <div class="pc-order-titlei fl"><h2>填写订单</h2></div>
        <div class="pc-step-title fl">
            <ul>
                <%--<li class="cur2"><a href="#">1 . 我的购物车</a></li>--%>
                <li class="cur2"><a href="#">1 . 填写核对订单</a></li>
                <li class="cur"><a href="#">2 . 成功提交订单</a></li>
            </ul>
        </div>
    </div>

</header>
<!-- header End -->


<!-- 订单提交成功 begin-->
<section>
    <div class="containers">
        <div class="pc-order-title"><h3>您的订单已提交成功!</h3></div>
        <div class="pc-border">
            <div class="pc-order-text">
                <p>订单提交成功，请您尽快付款！   订单号 ：<em>${orderId}</em></p>
                <p class="reds"><em>请您在提交订单后24小时内完成付款，否则订单自动取消。</em></p>
            </div>
            <div class="pc-line"></div>
            <c:forEach items="${userOIS}" var="ois">
            <div class="pc-order-text">
                <p>商品名称：${ois.commodityName}  </p>
                <p>收货地址：${ois.userAddress} 收货人：${ois.username} ${ois.userPhone}</p>
            </div>
            </c:forEach>
        </div>
    </div>
</section>
<!-- 订单提交成功 End-->
<div class="pc-buying clearfix" style="margin-top:30px">
    <div class="time-list time-list-w fl">
        <div class="time-title">
            <ul class="brand-tab H-table H-table-shop clearfix fl" id="H-table">

            </ul>
            <span class="pc-order-price">总价：￥${allSum}</span>
        </div>
    </div>
</div>

<!--- footer begin-->
<div class="aui-footer-bot">
    <div class="time-lists aui-footer-pd clearfix">
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="../theme/icon/icon-d1.png"></span>
                <em>消费者权益</em>
            </h4>
            <ul>
                <li><a href="#">保障范围 </a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <%--<li><a href="#">服务中心</a> </li>--%>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="../theme/icon/icon-d2.png"></span>
                <em>新手上路</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="../theme/icon/icon-d3.png"></span>
                <em>保障正品</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="../theme/icon/icon-d1.png"></span>
                <em>消费者权益</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
    </div>
    <div style="border-bottom:1px solid #dedede"></div>
    <div class="time-lists aui-footer-pd time-lists-ls clearfix">
        <div class="aui-footer-list clearfix">
            <h4>购物指南</h4>
            <ul>
                <li><a href="#">保障范围 </a> </li>
                <li><a href="#">购物流程</a> </li>
                <li><a href="#">会员介绍 </a> </li>
                <li><a href="#">生活旅行</a> </li>
                <li><a href="#"> 常见问题 </a> </li>
                <li><a href="#"> 联系客服购物指南 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>特色服务</h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>帮助中心</h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>新手指导</h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>

                <li><a href="#">服务中心</a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
    </div>
</div>
<!-- footer End -->
</body>
</html>
