<%--
  Created by IntelliJ IDEA.
  User: dell00
  Date: 2018/8/31
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="shortcut icon" type="image/x-icon" href="../theme/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="../theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="../theme/css/home.css">

    <script type="text/javascript" src="../theme/js/jquery.js"></script>
    <script type="text/javascript" src="../theme/js/index.js"></script>
    <script type="text/javascript" src="../theme/js/js-tab.js"></script>
    <script type="text/javascript" src="../theme/js/MSClass.js"></script>
    <script type="text/javascript" src="../theme/js/jcarousellite.js"></script>
    <script type="text/javascript" src="../theme/js/top.js"></script>
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
<!--- header begin-->
<jsp:include page="index_head.jsp" flush="true"></jsp:include>
<!-- header End -->
<div class="containers clearfix">
    <div class="pc-nav-item fl"><a href="/index.do" class="pc-title">首页</a> &gt;<a href="#"> 所有货架</a></div>

</div>
<div class="containers">
    <div class="pc-nav-rack clearfix">
        <ul>
            <li><a href="all-class.do?oneClass=数码">数码</a></li>
            <li><a href="all-class.do?oneClass=服装">服装</a></li>
        </ul>
    </div>
    <div>
        <div class="pc-nav-title"><h3>数码</h3></div>
        <div class="pc-nav-digit clearfix">
            <ul>
                <li>
                    <div class="digit1"><a href="/page.do"><img src="../theme/img/pd/yue.png"></a></div>
                    <div class="digit2"><a href="/page.do">家用电器</a></div>
                </li>
                <li>
                    <div class="digit1"><a href="#"><img src="../theme/img/pd/yue.png"></a></div>
                    <div class="digit2"><a href="#">家用电器</a></div>
                </li>

            </ul>
        </div>
    </div>
    <div>
        <div class="pc-nav-title"><h3>服装</h3></div>
        <div class="pc-nav-digit clearfix">
            <ul>
                <li>
                    <div class="digit1"><a href="#"><img src="../theme/img/pd/yue.png"></a></div>
                    <div class="digit2"><a href="#">家用电器</a></div>
                </li>
                <li>
                    <div class="digit1"><a href="#"><img src="../theme/img/pd/yue.png"></a></div>
                    <div class="digit2"><a href="#">家用电器</a></div>
                </li>
            </ul>
        </div>
    </div>
    <div style="padding-top:30px;">
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
                <a onclick="SEARCH.page(3, true)" href="javascript:;" class="pc-search-n"
                   title="使用方向键右键也可翻到下一页哦！">下一页</a>
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
<div class="pc-buying clearfix"></div>
<!--- footer begin-->
<div class="aui-footer-bot">
    <div class="time-lists aui-footer-pd clearfix">
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="../theme/icon/icon-d1.png"></span>
                <em>消费者权益</em>
            </h4>
            <ul>
                <li><a href="#">保障范围 </a></li>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">服务中心 </a></li>
                <li><a href="#">服务中心</a></li>
                <li><a href="#"> 更多特色服务 </a></li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="../theme/icon/icon-d2.png"></span>
                <em>新手上路</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">服务中心 </a></li>
                <li><a href="#">服务中心</a></li>
                <li><a href="#"> 更多特色服务 </a></li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="../theme/icon/icon-d3.png"></span>
                <em>保障正品</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">服务中心 </a></li>
                <li><a href="#">服务中心</a></li>
                <li><a href="#"> 更多特色服务 </a></li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="../theme/icon/icon-d1.png"></span>
                <em>消费者权益</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">服务中心 </a></li>
                <li><a href="#">服务中心</a></li>
                <li><a href="#"> 更多特色服务 </a></li>
            </ul>
        </div>
    </div>
    <div style="border-bottom:1px solid #dedede"></div>
    <div class="time-lists aui-footer-pd time-lists-ls clearfix">
        <div class="aui-footer-list clearfix">
            <h4>购物指南</h4>
            <ul>
                <li><a href="#">保障范围 </a></li>
                <li><a href="#">购物流程</a></li>
                <li><a href="#">会员介绍 </a></li>
                <li><a href="#">生活旅行</a></li>
                <li><a href="#"> 常见问题 </a></li>
                <li><a href="#"> 联系客服购物指南 </a></li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>特色服务</h4>
            <ul>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">服务中心 </a></li>
                <li><a href="#">服务中心</a></li>
                <li><a href="#"> 更多特色服务 </a></li>
                <li><a href="#"> 更多特色服务 </a></li>
                <li><a href="#"> 更多特色服务 </a></li>
                <li><a href="#"> 更多特色服务 </a></li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>帮助中心</h4>
            <ul>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">服务中心 </a></li>
                <li><a href="#">服务中心</a></li>
                <li><a href="#"> 更多特色服务 </a></li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>新手指导</h4>
            <ul>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">退货退款流程</a></li>
                <li><a href="#">服务中心 </a></li>
                <li><a href="#">服务中心</a></li>
                <li><a href="#">服务中心</a></li>
                <li><a href="#"> 更多特色服务 </a></li>
                <li><a href="#"> 更多特色服务 </a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
