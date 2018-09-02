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
                        <a href="/my-d.do">我的订单</a>
                        <a href="/my-s.do">我的收藏</a>
                        <a href="/my-user.do">账户安全</a>
                        <a href="/my-add.do">地址管理</a>
                        <a href="/my-p.do">我要评价</a>
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
        <div class="header-logo fl"><h1><a href="${pageContext.request.contextPath}/index.jsp"><img src="../theme/icon/logo.png"></a> </h1></div>
        <div class="head-form fl">
            <form class="clearfix">
                <input type="text" class="search-text" accesskey="" id="key" autocomplete="off"  placeholder="洗衣机">
                <button class="button" onclick="search('key');return false;">搜索</button>
            </form>
        </div>
        <div class="header-cart fr hdin" style="visibility: hidden"><a href="/shopcart.do?getshopcarnum=${sessionScope.ShopCarNum}"><img src="../theme/icon/car.png"></a> <i class="head-amount">${sessionScope.CurrUserShopCarCommdiNun}</i></div>
        <div class="head-mountain"></div>
    </div>
    <div class="yHeader">
        <div class="yNavIndex">
            <%--<div class="pullDown">--%>
                <%--<h2 class="pullDownTitle">--%>
                    <%--全部商品分类--%>
                <%--</h2>--%>
                <%--<ul class="pullDownList">--%>
                    <%--<c:forEach items="${commodityType}" var="type">--%>
                        <%--<li>--%>
                            <%--<i class="listi2"></i>--%>
                            <%--<a href="/ClassCommodityController/all-class.do?commodityType=${type}" target="_blank">${type}</a>--%>
                            <%--<span></span>--%>
                        <%--</li>--%>
                    <%--</c:forEach>--%>
                <%--</ul>--%>

            <%--</div>--%>
            <ul class="yMenuIndex">
                <li><a href="/ClassCommodityController/all-class.do?commodityType=手机" target="_blank">手机城</a></li>
                <li><a href="/ClassCommodityController/all-class.do?commodityType=衣服" target="_blank">服装城</a></li>
                <li><a href="/ClassCommodityController/all-class.do?commodityType=香水" target="_blank">香水有毒</a></li>
                <li><a href="/ClassCommodityController/all-class.do?commodityType=护肤品" target="_blank">护肤城</a></li>
                <li><a href="/ClassCommodityController/all-class.do?commodityType=鞋" target="_blank">潮鞋城</a></li>
                <li><a href="/ClassCommodityController/all-class.do?commodityType=all" target="_blank">全部商品</a></li>
            </ul>

        </div>
    </div>
</header>
<!-- header End -->
