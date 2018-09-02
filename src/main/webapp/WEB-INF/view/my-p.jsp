<%--
  Created by IntelliJ IDEA.
  User: tyq
  Date: 2018/8/26
  Time: 20:33
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
    <meta content="UU购物, 购物, 大家电, 手机" name="keywords">
    <meta content="UU购物，购物商城。" name="description">
    <title>用户系统我的评价</title>
    <link rel="shortcut icon" type="image/x-icon" href="../theme/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="../theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="../theme/css/member.css">
    <script type="text/javascript" src="../theme/js/jquery.js"></script>
    <script type="text/javascript">
        $(function(){
            $(".tit").mouseenter(function(){
                $(".subnav").show();
            })
            $(".subnav").mouseleave(function(){
                $(".subnav").hide();
            })
        })
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
        <div class="header-logo fl"><h1><a href="index.do"><img src="../theme/icon/logo.png"></a> </h1></div>
        <div class="member-title fl"><h2></h2></div>
        <div class="head-form fl">
            <form class="clearfix">
                <input type="text" class="search-text" accesskey="" id="key" autocomplete="off"  placeholder="洗衣机">
                <button class="button" onclick="search('key');return false;">搜索</button>
            </form>

        </div>
        <!-- <div class="header-cart fr"><a href="#"><img src="../theme/icon/car.png"></a> <i class="head-amount">99</i></div> -->
    </div>
</header>
<!-- header End -->

<div class="containers"><div class="pc-nav-item"><a href="index.do">首页</a> &gt; <a href="new.do">商城快讯</a></div></div>

<!-- 商城快讯 begin -->
<section id="member">
    <div class="member-center clearfix">
        <div class="member-left fl">
            <div class="member-apart clearfix">
                <div class="fl"><a href="#"><img src="${sessionScope.userimg}"></a></div>
                <div class="fl">
                    <p>用户名：</p>
                    <p><a href="#">${sessionScope.username}</a></p>
                    <p>搜悦号：</p>
                    <p>${sessionScope.userId}</p>
                </div>
            </div>
            <div class="member-lists">
                <dl>
                    <dt>我的商城</dt>
                    <dd><a href="my-d.do">我的订单</a></dd>
                    <dd><a href="my-s.do">我的收藏</a></dd>
                    <dd><a href="my-user.do">账户安全</a></dd>
                    <dd class="cur"><a href="my-p.do">我的评价</a></dd>
                    <dd><a href="my-add.do">地址管理</a></dd>
                </dl>
                <dl>
                    <dt>客户服务</dt>
                    <dd><a href="request.do">退货申请</a></dd>
                    <dd><a href="retreat.do">退货/退款记录</a></dd>
                </dl>
                <dl>
                    <dt>我的消息</dt>
                    <dd><a href="new.do">商城快讯</a></dd>

                </dl>
            </div>
        </div>
        <div class="member-right fr">
            <div class="member-head">
                <div class="member-heels fl"><h2>我的评价</h2></div>
            </div>
            <div class="member-border">
                <div class="member-column clearfix">
                    <span class="co1">商品信息</span>
                    <span class="co2">购买时间</span>
                    <span class="co3">评价状态</span>
                </div>
                <div class="member-class clearfix">
                    <ul>
                        <li class="clearfix">
                            <div class="sp1">
                                <span class="gr1"><a href="#"><img width="60" height="60" about="" title="" src="../theme/img/pd/m1.png"></a></span>
                                <span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
                                <span class="gr3">X1</span>
                            </div>
                            <div class="sp2">2015 - 09 -  02</div>
                            <div class="sp3"><a href="#">发表评价</a> </div>
                        </li>
                    </ul>
                </div>
                <div class="member-setup clearfix">
                    <ul>
                        <li class="clearfix">
                            <div class="member-score fl"><i class="reds">*</i>评分：</div>
                            <div class="member-star fl">
                                <ul>
                                    <li class="on"></li>
                                    <li class="on"></li>
                                    <li></li>
                                    <li></li>
                                    <li></li>
                                </ul>
                            </div>
                            <div class="member-judge fr"><input type="checkbox"> 匿名评价</div>
                        </li>

                        <li class="clearfix">
                            <div class="member-score fl"><i class="reds">*</i>商品评价：</div>
                            <div class="member-star fl">
                                <textarea maxlength="200"></textarea>
                            </div>
                        </li>
                        <li class="clearfix">
                            <div class="member-score fl">晒单：</div>
                            <div class="member-star fl">
                                <a href="#"><img src="../theme/img/pd/m2.png"></a>
                                <a href="#"><img src="../theme/img/pd/m2.png"></a>
                                <a href="#"><img src="../theme/img/pd/m2.png"></a>
                            </div>
                        </li>
                        <li class="clearfix">
                            <div style="padding-left:85px;">最多可以增加<i class="reds">10</i>张</div>
                        </li>
                    </ul>
                </div>
                <div class="member-class clearfix">
                    <ul>
                        <li class="clearfix">
                            <div class="sp1">
                                <span class="gr1"><a href="#"><img width="60" height="60" about="" title="" src="../theme/img/pd/m1.png"></a></span>
                                <span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
                                <span class="gr3">X1</span>
                            </div>
                            <div class="sp2">2015 - 09 -  02</div>
                            <div class="sp3"><a href="#">发表评价</a> </div>
                        </li>
                        <li class="clearfix">
                            <div class="sp1">
                                <span class="gr1"><a href="#"><img width="60" height="60" about="" title="" src="../theme/img/pd/m1.png"></a></span>
                                <span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
                                <span class="gr3">X1</span>
                            </div>
                            <div class="sp2">2015 - 09 -  02</div>
                            <div class="sp3"><a href="#">发表评价</a> </div>
                        </li>
                        <li class="clearfix">
                            <div class="sp1">
                                <span class="gr1"><a href="#"><img width="60" height="60" about="" title="" src="../theme/img/pd/m1.png"></a></span>
                                <span class="gr2"><a href="#">红米Note2 标准版 白色 移动4G手机 双卡双待</a></span>
                                <span class="gr3">X1</span>
                            </div>
                            <div class="sp2">2015 - 09 -  02</div>
                            <div class="sp3"><a href="#">发表评价</a> </div>
                        </li>
                    </ul>
                </div>
                <div class="member-pages clearfix">
                    <div class="fr pc-search-g">
                        <a class="fl pc-search-f" href="#">上一页</a>
                        <a href="#" class="current">1</a>
                        <a href="javascript:;">2</a>
                        <a href="javascript:;">3</a>
                        <a href="javascript:;">4</a>
                        <a href="javascript:;">5</a>
                        <a href="javascript:;">6</a>
                        <a href="javascript:;">7</a>
                        <span class="pc-search-di">…</span>
                        <a title="使用方向键右键也可翻到下一页哦！" class="pc-search-n" href="javascript:;" onclick="SEARCH.page(3, true)">下一页</a>
                        <span class="pc-search-y">
                        <em>  共20页    到第</em>
                        <input type="text" class="pc-search-j" placeholder="1">
                        <em>页</em>
                        <a href="#" class="confirm">确定</a>
                    </span>

                    </div>
                </div>

            </div>
        </div>
    </div>
</section>
<!-- 商城快讯 End -->

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
                <li><a href="#">服务中心</a> </li>
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
                <li><a href="#">服务中心 </a> </li>
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
                <li><a href="#">服务中心 </a> </li>
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
                <li><a href="#">服务中心 </a> </li>
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
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>帮助中心</h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>新手指导</h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
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
