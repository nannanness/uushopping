<%--
  Created by IntelliJ IDEA.
  User: dell00
  Date: 2018/8/31
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                <li><a href="/pageJump/login-business.do">商家登陆</a></li>
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
                <div class="yMenuListCon">
                    <div class="yMenuListConin">
                        <div class="yMenuLCinList fl">
                            &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;<a href="/erji-class.do?oneClass=数码&erJiClass=手机">手机</a>
                            &nbsp; &nbsp; &nbsp;<a href="/erji-class.do?oneClass=数码&erJiClass=电脑">电脑</a>

                        </div>
                    </div>

                    <div class="yMenuListConin">
                        <div class="yMenuLCinList fl">
                            &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;<a href="/erji-class.do?oneClass=数码&erJiClass=男鞋">男鞋</a>
                            &nbsp; &nbsp; &nbsp;<a href="/erji-class.do?oneClass=数码&erJiClass=女鞋">女鞋</a>

                        </div>
                    </div>
                </div>
            </div>
            <ul class="yMenuIndex">
                <li><a href="all-class.do?oneClass=服装" target="_blank">服装城</a></li>
                <li><a href="all-class.do?oneClass=数码" target="_blank">数码城</a></li>
                <li><a href="/all-cl.do" target="_blank">全部商品</a></li>

            </ul>

        </div>
    </div>
</header>
<!-- header End -->
