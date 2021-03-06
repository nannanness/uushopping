<%--
  Created by IntelliJ IDEA.
  User: tyq
  Date: 2018/8/26
  Time: 20:38
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
    <title>商城快讯</title>
    <link rel="shortcut icon" type="image/x-icon" href="../theme/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="../theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="../theme/css/member.css">
    <script type="text/javascript" src="../theme/js/jquery.js"></script>
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
        <div class="header-logo fl"><h1><a href="#"><img src="../theme/icon/logo.png"></a> </h1></div>
        <div class="member-title fl"><h2></h2></div>
        <div class="head-form fl">
            <form class="clearfix">
                <input type="text" class="search-text" accesskey="" id="key" autocomplete="off"  placeholder="洗衣机">
                <button class="button" onclick="search('key');return false;">搜索</button>
            </form>

        </div>

    </div>
</header>
<!-- header End -->

<div class="containers"><div class="pc-nav-item"><a href="index.do">首页</a> &gt; <a href="new.do">商城快讯</a></div></div>

<!-- 商城快讯 begin -->
<section id="member">
    <div class="member-center clearfix">
        <div class="member-left fl">
            <div class="member-apart clearfix">
                <div class="fl"><a href="#"><img src="../theme/img/bg/mem.png"></a></div>
                <div class="fl">
                    <p>用户名：</p>
                    <p><a href="#">亚里士多德</a></p>
                    <p>搜悦号：</p>
                    <p>389323080</p>
                </div>
            </div>
            <div class="member-lists">
                <dl>
                    <dt>我的商城</dt>
                    <dd><a href="my-d.do">我的订单</a></dd>
                    <dd><a href="my-s.do">我的收藏</a></dd>
                    <dd><a href="my-user.do">账户安全</a></dd>
                    <dd><a href="my-p.do">我的评价</a></dd>
                    <dd><a href="my-add.do">地址管理</a></dd>
                </dl>
                <dl>
                    <dt>客户服务</dt>
                    <dd><a href="request.do">退货申请</a></dd>
                    <dd><a href="retreat.do">退货/退款记录</a></dd>
                </dl>
                <dl>
                    <dt>我的消息</dt>
                    <dd class="cur"><a href="new.do">商城快讯</a></dd>

                </dl>
            </div>
        </div>
        <div class="member-right fr">
            <div class="member-head">
                <div class="member-heels fl"><h2>商城快讯</h2></div>
            </div>
            <div class="member-border">
                <div class="member-form clearfix">
                    <form>
                        <input type=text class="text-news" placeholder="商城快讯关键字">
                        <input type="button" class="button-btn" value="搜索">
                    </form>
                </div>
                <div class="member-entry">
                    <div class="member-issue clearfix">
                        <span>标题</span>
                        <span>发布时间</span>
                    </div>
                    <ul>
                        <li class="clearfix"><div><a href="#">不做女汉字换季护肤保卫战</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">买JBL耳机送上古世纪游戏炫酷时装礼包 </a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">日韩美妆爆品低至1折起,不做女汉字换季护肤保卫战</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">愚人节整蛊玩具低至19</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">文艺蓝牙音箱 火热众筹中 </a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">金秋献礼，热销投影送激光笔，指定机型送安装！ </a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">男装跨店满299减60,赶快行动吧～！～～～</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">愚人节整蛊玩具低至19</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">文艺蓝牙音箱 火热众筹中 </a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">金秋献礼，热销投影送激光笔，指定机型送安装！ </a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">男装跨店满299减60,赶快行动吧～！～～～</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">无线立式吸尘器仅￥399 ！</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">无线立式吸尘器仅￥399 ！</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">赏春盛宴 大牌春装1折起 </a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">放价旅游 红包免费领，点到你手软！</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">1元加价购台湾高粱美酒热销中 ！</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">1元加价购台湾高粱美酒热销中</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">愚人节整蛊玩具低至19</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">文艺蓝牙音箱 火热众筹中 </a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">金秋献礼，热销投影送激光笔，指定机型送安装！ </a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">男装跨店满299减60,赶快行动吧～！～～～</a></div><div>2015-03-31 17:23:20</div></li>
                        <li class="clearfix"><div><a href="#">无线立式吸尘器仅￥399 ！</a></div><div>2015-03-31 17:23:20</div></li>
                    </ul>
                </div>
                <div class="member-pages clearfix">
                    <div class="fr pc-search-g">
                        <a href="#" class="fl pc-search-f">上一页</a>
                        <a class="current" href="#">1</a>
                        <a href="javascript:;">2</a>
                        <a href="javascript:;">3</a>
                        <a href="javascript:;">4</a>
                        <a href="javascript:;">5</a>
                        <a href="javascript:;">6</a>
                        <a href="javascript:;">7</a>
                        <span class="pc-search-di">…</span>
                        <a onclick="SEARCH.page(3, true)" href="javascript:;" class="pc-search-n" title="使用方向键右键也可翻到下一页哦！">下一页</a>
                        <span class="pc-search-y">
                        <em>  共20页    到第</em>
                        <input type="text" placeholder="1" class="pc-search-j">
                        <em>页</em>
                        <a class="confirm" href="#">确定</a>
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
