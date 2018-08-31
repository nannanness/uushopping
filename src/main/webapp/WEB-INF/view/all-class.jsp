<%--
  Created by IntelliJ IDEA.
  User: dell00
  Date: 2018/8/31
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
    <meta name="renderer" content="webkit">
    <title>uu购物</title>
    <link rel="shortcut icon" type="image/x-icon" href="theme/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="theme/css/home.css"> <script type="text/javascript" src="theme/js/jquery.js"></script>
    <script type="text/javascript" src="theme/js/index.js"></script>
    <script type="text/javascript" src="theme/js/js-tab.js"></script>
    <script type="text/javascript" src="theme/js/MSClass.js"></script>
    <script type="text/javascript" src="theme/js/jcarousellite.js"></script>
    <script type="text/javascript" src="theme/js/top.js"></script>
    <script type="text/javascript">
        $(function () {
            var getname = $("#sucesslogin").children("a").text();
            if (getname.length > 0) {
                alert(getname)
                $("#sucesslogin").show()
                $("#successregister").show()
                $(".hdin").css('visibility', 'visible');
                $("#dologin").hide()
                $("#doregister").hide()

            }

        });
    </script>

</head>
<body>
<jsp:include page="index_head.jsp" flush="true"></jsp:include>
<!-- header End -->

<div class="containers"><div class="pc-nav-item"><a href="#">全部分类 </a> &gt; <a href="#">${oneClass}</a></div></div>

<div class="containers clearfix">
    <div class="fl">
        <div id="firstpane" class="menu_list">
            <h2>所有类目</h2>
            <h3 class="menu_head current">手机</h3>
            <h3 class="menu_head">电脑</h3>
            <h3 class="menu_head"></h3>
        </div>
    </div>
    <div class="pc-info fr">
        <div class="pc-term">
            <dl class="pc-term-dl clearfix">
                <dt>店铺：</dt>
                <dd><a href="#">三星（SAMSUNG）</a></dd>
                <dd><a href="#">华为（HUAWEI）</a></dd>
                <dd><a href="#">联想（lenovo）</a></dd>
                <dd><a href="#">索尼（SONY）</a></dd>
                <dd><a href="#">飞利浦（Philips）</a></dd>
                <dd><a href="#">Apppc-search clearfixle</a></dd>
                <dd><a href="#">小米（MI）</a></dd>
                <dd><a href="#">HTC</a></dd>
                <dd><a href="#">酷派（Coolpad）</a></dd>
                <dd><a href="#">诺基亚（NOKIA）</a></dd>
                <dd><a href="#">中兴（ZTE）</a></dd>
            </dl>
            <div>
                <a href="#">更多</a>
            </div>

            <div class="pc-line"></div>
        </div>
        <div class="pc-term">
            <div class="clearfix pc-search-p">
                <div class="fl pc-search-e"><a href="#" class="cur">销量</a><a href="#">价格</a><a href="#">评价</a><a href="#">上架时间</a></div>
            </div>
        </div>
        <div class="time-border-list pc-search-list clearfix">
            <ul class="clearfix">
                <li>
                    <a href="#"> <img src="../theme/img/pd/hot2.png"></a>
                    <p class="head-name"><a href="#">小米 4 2GB内存版 白色 移动4G手机不锈钢金属边框</a> </p>
                    <p><span class="price">￥138.00</span></p>
                    <p class="head-futi clearfix"><span class="fl">好评度：90% </span> <span class="fr">100人购买</span></p>
                    <p class="clearfix"><span class="label-default fl">抢购</span> <a href="#" class="fr pc-search-c">收藏</a> </p>
                </li>

                <li>
                    <a href="#"> <img src="../theme/img/pd/hot2.png"></a>
                    <p class="head-name"><a href="#">小米 4 2GB内存版 白色 移动4G手机不锈钢金属边框</a> </p>
                    <p><span class="price">￥138.00</span></p>
                    <p class="head-futi clearfix"><span class="fl">好评度：90% </span> <span class="fr">100人购买</span></p>
                    <p class="clearfix"><span class="label-default fl">抢购</span> <a href="#" class="fr pc-search-c">收藏</a> </p>
                </li>

            </ul>
            <div class="clearfix">
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
        <div class="pc-search-re clearfix">
            <dl>
                <dt>重新搜索</dt>
                <dd>
                    <input type="text" value="三星"  id="key-re-search" class="text">
                    <input type="button" value="搜&nbsp;索" id="btn-re-search" class="button">
                </dd>
            </dl>
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
</body>
</html>
