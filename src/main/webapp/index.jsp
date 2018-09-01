<%--
  Created by IntelliJ IDEA.
  User: tyq
  Date: 2018/8/26
  Time: 14:08
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
    <title>UU购物</title>
    <link rel="shortcut icon" type="image/x-icon" href="theme/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="theme/css/home.css">

    <script type="text/javascript" src="theme/js/jquery.js"></script>
    <script type="text/javascript" src="theme/js/index.js"></script>
    <script type="text/javascript" src="theme/js/js-tab.js"></script>
    <script type="text/javascript" src="theme/js/MSClass.js"></script>
    <script type="text/javascript" src="theme/js/jcarousellite.js"></script>
    <script type="text/javascript" src="theme/js/top.js"></script>
    <script type="text/javascript">
        $(function(){
            var  getname = $("#sucesslogin").children("a").text();
            if(getname.length > 0){
                $("#sucesslogin").show()
                $("#successregister").show()
                $(".hdin").css('visibility','visible');
                $("#dologin").hide()
                $("#doregister").hide()

            }

        });
    </script>
</head>
<body>


<div>
    <div id="moquu_wxin" class="moquu_wxin"><a href="javascript:void(0)"><div class="moquu_wxinh"></div></a></div>
    <!-- <div id="moquu_wshare" class="moquu_wshare"><a href="javascript:void(0)" style="text-indent:0"><div class="moquu_wshareh"><img src="theme/icon/moquu_wshare.png" width="100%"></div></a></div> -->
    <div id="moquu_wmaps"><a href="javascript:void(0)" class='moquu_wmaps'></a></div>
    <a id="moquu_top" href="javascript:void(0)"></a>
</div>

<!--- header begin-->
<header id="pc-header">
    <div class="BHeader">
        <div class="yNavIndex">
            <ul class="BHeaderl">
                <li id="pc-nav" class="menu hdin" style="visibility: hidden"><a href="#" class="tit">我的商城</a>
                    <div class="subnav">
                        <a href="my-d.do">我的订单</a>
                        <a href="my-s.do">我的收藏</a>
                        <a href="my-user.do">账户安全</a>
                        <a href="my-add.do">地址管理</a>
                        <a href="my-p.do">我要评价</a>
                    </div>
                </li>
                <li id="dologin" ><a href="login.do" style="color:#ea4949;">请登录</a> </li>
                <li id="sucesslogin" style="display: none;"><a href="#" style="color:#ea4949;">${sessionScope.username}</a> </li>
                <li class="headerul">|</li>
                <li id="doregister" ><a href="register.do">免费注册</a> </li>
                <li id="successregister" style="display: none;"><a href="/logout.do">退出登录</a> </li>
                <li class="headerul">|</li>
                <li><a href="/shopController/login-business.do">商家登陆</a></li>
            </ul>
        </div>
    </div>

    <div class="container clearfix">
        <div class="header-logo fl"><h1><a href="index.do"><img src="theme/icon/logo.png"></a> </h1></div>
        <div class="head-form fl">
            <form class="clearfix">
                <input type="text" class="search-text" accesskey="" id="key" autocomplete="off"  placeholder="洗衣机">
                <button class="button" onclick="search('key');return false;">搜索</button>
            </form>
        </div>
        <div class="header-cart fr hdin" style="visibility: hidden"><a href="shopcart.do"><img src="theme/icon/car.png"></a> <i class="head-amount">${sessionScope.CurrUserShopCarCommdiNun}</i></div>
        <div class="head-mountain"></div>
    </div>
    <div class="yHeader">
        <div class="yNavIndex">
            <div class="pullDown">
                <h2 class="pullDownTitle">
                    全部商品分类
                </h2>
                <ul class="pullDownList">
                    <li>
                        <i class="listi2"></i>
                        <a href="all-class.do?oneClass=数码" target="_blank">数码</a>
                        <span></span>
                    </li>
                    <li>
                        <i class="listi5"></i>
                        <a href="all-class.do?oneClass=服装" target="_blank">服装</a>
                        <span></span>
                    </li>

                </ul>
                <div class="yMenuListCon">
                    <div class="yMenuListConin">
                        <div class="yMenuLCinList fl">
                            &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;<a href="/erji-class.do?oneClass=数码&erJiClass=手机">手机</a>
                            &nbsp; &nbsp; &nbsp;<a href="javascript:void(0)">电脑</a>

                        </div>
                    </div>

                    <div class="yMenuListConin">
                        <div class="yMenuLCinList fl">
                            &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;<a href="javascript:void(0)">男鞋</a>
                            &nbsp; &nbsp; &nbsp;<a href="javascript:void(0)">女鞋</a>

                        </div>
                    </div>
                </div>
            </div>
            <ul class="yMenuIndex">
                <li><a href="all-class.do?oneClass=数码" target="_blank">服装城</a></li>
                <li><a href="all-class.do?oneClass=服装" target="_blank">数码城</a></li>
                <li><a href="/all-cl.do" target="_blank">全部商品</a></li>

            </ul>

        </div>
    </div>
</header>
<!-- header End -->

<!--- banner begin-->
<section id="pc-banner">
    <div class="yBanner">
        <div class="banner" id="banner" >
            <a href="javascript:;" class="d1" style="background:url(theme/img/ad/banner1.jpg) center no-repeat;background-color: #f01a38; padding-left:180px;"></a>
            <a href="javascript:;" class="d1" style="background:url(theme/img/ad/banner2.jpg) center no-repeat;background-color: #a96ae3; padding-left:180px;"></a>
         <div class="d2" id="banner_id">
                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ul>
            </div>
        </div>
        <div style="text-align:center;clear:both"></div>
    </div>
</section>
<!-- banner End -->

<!-- 商城资讯 begin -->
<section id="pc-information">
    <div class="containers">
        <div class="pc-info-mess  clearfix" style="position: relative;">
            <h2 class="fl" style="margin-right:20px;">商城快讯</h2>
            <div id="MarqueeDiv" class="MarqueeDiv">
                <a href="new.do">[特惠]新一代Moto 360智能手表登陆</a>
                <a href="new.do">[特惠]洗护节 跨品牌满199减100</a>
                <a href="new.do">[特惠]仁怀政府开启“仁怀酱香酒馆”</a>
                <a href="new.do">[特惠]洗护节 跨品牌满199减100</a>
                <a href="new.do">逛商城赚话费，商城通信51城全线抢购 </a>
                <a href="new.do">文艺蓝牙音箱 火热众筹中 </a>
                <a href="new.do">[公告]第1000家商城帮服务店落户遵义</a>
                <a href="new.do">[特惠]新一代Moto 360智能手表登陆</a>
                <a href="new.do">[特惠]新一代Moto 360智能手表登陆</a>
                <a href="new.do">[特惠]新一代Moto 360智能手表登陆</a>
            </div>
            <a href="new.do" style="position: absolute;right: 15px;top: 0;"> 更多资讯</a>
        </div>
    </div>
</section>
<!-- 商城资讯 End -->

<!-- 卖场推荐 begin -->
<div class="container-c time-lists clearfix">
    <div class="time-list fl">
        <div class="time-title time-clear"><h2>卖场推荐</h2><a href="javascript:;" class="pc-spin fr">换一换</a> </div>
        <div class="time-poued clearfix">
            <a href="#"><img src="theme/img/ad/a2.png"></a>
            <a href="#"><img src="theme/img/ad/a3.png"></a>
            <a href="#"><img src="theme/img/ad/a4.png"></a>
            <a href="#"><img src="theme/img/ad/a5.png"></a>
        </div>
    </div>
    <div class="news-list fr">
        <div class="time-title time-clear"><h2>今日值得购买</h2></div>
        <div class="news-right"><a href="#"><img src="theme/img/ad/a1.png"></a></div>
    </div>
</div>
<!-- 卖场推荐 End -->

<div class="time-lists clearfix">
    <div class="time-list time-list-w fl">
        <div class="time-title time-clear"><h2>热卖区</h2><div class="pc-font fl"></div><a class="pc-spin fr" href="javascript:;">换一换</a> </div>
        <div class="time-border">
            <div class="yScrollList">
                <div class="yScrollListIn">
                    <div style="display:block;" class="yScrollListInList yScrollListInList1">
                        <ul>
                            <li>
                                <a href="">
                                    <img src="theme/img/pd/p1.png">
                                    <p class="head-name pc-pa10">TP-LINK TL-WN725N 微型150M无线USB网卡</p>
                                    <p class="label-default">3.45折</p>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="theme/img/pd/p2.png">
                                    <p class="head-name pc-pa10">TP-LINK TL-WN725N 微型150M无线USB网卡</p>
                                    <p class="label-default">3.45折</p>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="theme/img/pd/p3.png">
                                    <p class="head-name pc-pa10">TP-LINK TL-WN725N 微型150M无线USB网卡</p>
                                    <p class="label-default">3.45折</p>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="theme/img/pd/p4.png">
                                    <p class="head-name pc-pa10">TP-LINK TL-WN725N 微型150M无线USB网卡</p>
                                    <p class="label-default">3.45折</p>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="theme/img/pd/p5.png">
                                    <p class="head-name pc-pa10">TP-LINK TL-WN725N 微型150M无线USB网卡</p>
                                    <p class="label-default">3.45折</p>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <img src="theme/img/pd/p6.png">
                                    <p class="head-name pc-pa10">TP-LINK TL-WN725N 微型150M无线USB网卡</p>
                                    <p class="label-default">3.45折</p>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="containers main-banner"><a href="#"><img src="theme/img/ad/br1.jpg" width="1200" height="105"></a> </div>
<div class="time-lists  clearfix">
    <div class="time-list time-list-w fl">
        <div class="time-title time-clear-f2"><h2>美容护肤</h2>
            <ul class="brand-tab H-table1 clearfix fr" id="H-table1">
                <li class="cur"><a href="javascript:void(0);">男装</a></li>
                <li><a href="javascript:void(0);">女装</a></li>
                <li><a href="javascript:void(0);">鞋靴</a></li>
                <li><a href="javascript:void(0);">箱包</a></li>
                <li><a href="javascript:void(0);">内衣配饰</a></li>
                <li><a href="javascript:void(0);">珠宝首饰</a></li>
                <li><a href="javascript:void(0);">奢品礼品</a></li>
                <li><a href="javascript:void(0);">奢华腕表</a></li>
            </ul>
        </div>
        <div class="time-border time-border-h clearfix">
            <div class="brand-img fl">
                <ul>
                    <li><a href="#"><img src="theme/img/ad/p1.png" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p2.png" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p3.png" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p4.png" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p5.png" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p6.png" width="125" height="47"></a></li>
                </ul>
            </div>
            <div class="brand-bar fl"><a href="#"><img src="theme/img/ad/bar1.jpg" width="300" height="476"></a> </div>
            <div class="brand-poa fl">
                <div class="brand-poa H-over1 clearfix">
                    <ul>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar1.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品一羊毛蚕丝被一羊毛蚕丝被一羊毛蚕丝被一羊毛蚕丝被一羊毛蚕丝被</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar2.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar3.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar4.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar5.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar1.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                    </ul>
                </div>
                <div class="brand-poa H-over1 clearfix" style="display:none;">
                    <ul>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar1.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品一羊毛蚕丝被一羊毛蚕丝被一羊毛蚕丝被一羊毛蚕丝被一羊毛蚕丝被</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar2.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar3.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar4.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar5.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/bar1.png"></a></div>
                            <div class="brand-title"><a href="#">罗莱家纺 暖融二合一羊毛蚕丝被 床上用品</a> </div>
                            <div class="brand-price">￥599.00 </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="containers main-banner"><a href="#"><img src="theme/img/ad/br1.jpg" width="1200" height="105"></a> </div>

<div class="time-lists clearfix">
    <div class="time-list fl">
        <div class="time-title time-clear"><h2>好店推荐 </h2></div>
        <div class="time-border time-border-h clearfix">
            <div class="fl shop-img">
                <div class="shop-title"><a href="#"><img src="theme/img/ad/shop1.png"></a></div>
                <div class="shop-text"><h2>熊太子坚果炒货金冠店铺...</h2> <p>[正品 有赠品 如实描述]</p></div>
                <div class="shop-work clearfix"><a href="#"><img src="theme/img/ad/shop2.png"></a><a href="#"><img src="theme/img/ad/shop3.png"></a> </div>
            </div>
            <div class="shop-bar clearfix fl">
                <ul>
                    <li>
                        <div class="shop-icn"><a href="#"><img src="theme/img/ad/shop4.png"></a></div>
                        <div class="shop-tex"><a href="#">阿迪王品牌店铺</a> </div>
                    </li>
                    <li>
                        <div class="shop-icn"><a href="#"><img src="theme/img/ad/shop4.png"></a></div>
                        <div class="shop-tex"><a href="#">阿迪王品牌店铺</a> </div>
                    </li>
                    <li>
                        <div class="shop-icn"><a href="#"><img src="theme/img/ad/shop4.png"></a></div>
                        <div class="shop-tex"><a href="#">阿迪王品牌店铺</a> </div>
                    </li>
                    <li>
                        <div class="shop-icn"><a href="#"><img src="theme/img/ad/shop4.png"></a></div>
                        <div class="shop-tex"><a href="#">阿迪王品牌店铺</a> </div>
                    </li>
                    <li>
                        <div class="shop-icn"><a href="#"><img src="theme/img/ad/shop4.png"></a></div>
                        <div class="shop-tex"><a href="#">阿迪王品牌店铺</a> </div>
                    </li>
                    <li>
                        <div class="shop-icn"><a href="#"><img src="theme/img/ad/shop4.png"></a></div>
                        <div class="shop-tex"><a href="#">阿迪王品牌店铺</a> </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="news-list fr">
        <div class="time-title time-clear"><h2>店铺销量top排行</h2></div>
        <div style="border-left:none;" class="time-border time-border-h">
            <ul class="shop-top">
                <li class="clearfix">
                    <div class="shop-name fl"><a href="#"><img src="theme/img/ad/top1.png"></a></div>
                    <div class="shop-titl fl"><p><b>NO.1 阿卡官方旗舰店</b></p> <p>梦想会喜欢 <span class="fr red">已售出：3000+</span></p> </div>
                </li>
                <li class="clearfix">
                    <div class="shop-name fl"><a href="#"><img src="theme/img/ad/top1.png"></a></div>
                    <div class="shop-titl fl"><p><b>NO.1 阿卡官方旗舰店</b></p> <p>梦想会喜欢 <span class="fr red">已售出：3000+</span></p> </div>
                </li>
                <li class="clearfix">
                    <div class="shop-name fl"><a href="#"><img src="theme/img/ad/top1.png"></a></div>
                    <div class="shop-titl fl"><p><b>NO.1 阿卡官方旗舰店</b></p> <p>梦想会喜欢 <span class="fr red">已售出：3000+</span></p> </div>
                </li>
                <li class="clearfix">
                    <div class="shop-name fl"><a href="#"><img src="theme/img/ad/top1.png"></a></div>
                    <div class="shop-titl fl"><p><b>NO.1 阿卡官方旗舰店</b></p> <p>梦想会喜欢 <span class="fr red">已售出：3000+</span></p> </div>
                </li>
                <li class="clearfix">
                    <div class="shop-name fl"><a href="#"><img src="theme/img/ad/top1.png"></a></div>
                    <div class="shop-titl fl"><p><b>NO.1 阿卡官方旗舰店</b></p> <p>梦想会喜欢 <span class="fr red">已售出：3000+</span></p> </div>
                </li>
            </ul>
        </div>
    </div>
</div>



<div class="aui-footer-bot">
    <div class="time-lists aui-footer-pd clearfix">
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="theme/icon/icon-d1.png"></span>
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
                <span><img src="theme/icon/icon-d2.png"></span>
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
                <span><img src="theme/icon/icon-d3.png"></span>
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
                <span><img src="theme/icon/icon-d1.png"></span>
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
<script type="text/javascript">banner()</script>
</body>
</html>
