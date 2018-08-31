
<%--
  Created by IntelliJ IDEA.
  User: tyq
  Date: 2018/8/30
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>购物车页面</title>
    <link rel="shortcut icon" type="image/x-icon" href="theme/icon/favicon.ico">
    <link href="theme/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="theme/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="theme/css/cartstyle.css" rel="stylesheet" type="text/css" />
    <link href="theme/css/optstyle.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="theme/css/home.css">

    <script type="text/javascript" src="theme/js/index.js"></script>
    <script type="text/javascript" src="theme/js/js-tab.js"></script>
    <script type="text/javascript" src="theme/js/MSClass.js"></script>
    <script type="text/javascript" src="theme/js/jcarousellite.js"></script>

    <script type="text/javascript" src="/theme/js/jquery.js"></script>
    <script type="text/javascript">
        $(function () {
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

<!--顶部导航条 -->
<header id="pc-header">
    <div class="BHeader">
        <div class="yNavIndex">
            <ul class="BHeaderl">
                <li style="display:none;"><a href="#" style="float:left;">嘻哈杂货铺</a> <a href="#" style="float:left;">退出</a> </li>
                <li id="pc-nav" class="menu"><a href="#" class="tit" style="hover:'color: #666;'"}>我的商城</a>
                    <div class="subnav">
                        <a href="my-d.do">我的订单</a>
                        <a href="my-s.do">我的收藏</a>
                        <a href="my-user.do">账户安全</a>
                        <a href="my-add.do">地址管理</a>
                        <a href="my-p.do">我要评价</a>
                    </div>
                </li>
                <li class="headerul">|</li>
                <li><a href="#" style="color:#ea4949;">${sessionScope.username}</a> </li>
                <li class="headerul">|</li>
                <li ><a href="/logout.do">退出登录</a> </li>
                <li class="headerul">|</li>
                <li><a href="/pageJump/login-business.do">商家登陆</a></li>
            </ul>
        </div>
    </div>
</header>

<!--悬浮搜索框-->

    <div class="nav white">

        <div class="logoBig">
            <li><a href="index.do"><img src="theme/icon/logo.png"></a></li>
        </div>
        <div class="search-bar pr">
            <a name="index_none_header_sysc" href="#"></a>
            <form>
                <input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
                <input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
            </form>
        </div>
    </div>

    <div class="clear"></div>

    <!--购物车 -->
    <div class="concent">
        <div id="cartTable">
            <div class="cart-table-th">
                <div class="wp">
                    <div class="th th-chk">
                        <div id="J_SelectAll1" class="select-all J_SelectAll">

                        </div>
                    </div>
                    <div class="th th-item">
                        <div class="td-inner">商品信息</div>
                    </div>
                    <div class="th th-price">
                        <div class="td-inner">单价</div>
                    </div>
                    <div class="th th-amount">
                        <div class="td-inner">数量</div>
                    </div>
                    <div class="th th-sum">
                        <div class="td-inner">金额</div>
                    </div>
                    <div class="th th-op">
                        <div class="td-inner">操作</div>
                    </div>
                </div>
            </div>
            <div class="clear"></div>

            <tr class="item-list">
                <%--购物车的展示--%>
                <c:forEach items="${sessionScope.commodity}" var="commodity">
                <div class="bundle  bundle-last ">
                    <div class="bundle-hd">
                        <div class="bd-promos">
                            <div class="bd-has-promo">商品库存:<span class="bd-has-promo-content">${commodity.commodityStock}</span>&nbsp;&nbsp;</div>
                            <div class="act-promo">
                                <a href="#" target="_blank">商品状态:${commodity.commodityFlag}<span class="gt">&gt;&gt;</span></a>
                            </div>
                        </div>
                    </div>
                    <div class="clear"></div>
                    <div class="bundle-main">
                        <ul class="item-content clearfix">
                            <li class="td td-chk">
                                <div class="cart-checkbox ">
                                    <%--@declare id="j_checkbox_170037950254"--%>
                                    <input class="check" id="J_CheckBox" name="items[]" value="170037950254" type="checkbox">
                                    <label for="J_CheckBox_170037950254"></label>
                                </div>
                            </li>
                            <li class="td td-item">
                                <div class="item-pic">
                                    <a href="#" target="_blank" data-title="${commodity.commodityName}" class="J_MakePoint" data-point="tbcart.8.12">
                                        <img src="resources/products/${commodity.commodityImageId}.png" class="itempic J_ItemImg" style="width: 80px"></a>
                                </div>
                                <div class="item-info">
                                    <div class="item-basic-info">
                                        <a href="#" target="_blank" title="" class="item-title J_MakePoint" data-point="tbcart.8.11">${commodity.commodityDetails}</a>
                                    </div>
                                </div>
                            </li>
                            <li class="td td-info">
                                <div class="item-props item-props-can">
                                    <span class="sku-line">尺寸：${commodity.commoditySize}</span>
                                    <span class="sku-line">款式：${commodity.commodityStyle}</span>
                                    <i class="theme-login am-icon-sort-desc"></i>
                                </div>
                            </li>
                            <li class="td td-price">
                                <div class="item-price price-promo-promo">
                                    <div class="price-content">
                                        <div class="price-line">
                                            <em class="price-original">699.00</em>
                                        </div>
                                        <div class="price-line">
                                            <em class="J_Price price-now" tabindex="0">${commodity.commodityPrice}</em>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="td td-amount">
                                <div class="amount-wrapper ">
                                    <div class="item-amount ">
                                        <div class="sl">
                                            <input class="min am-btn" name="" type="button" value="-" />
                                            <input class="text_box" name="" type="text" value="3" style="width:30px;" />
                                            <input class="add am-btn" name="" type="button" value="+" />
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="td td-sum">
                                <div class="td-inner">
                                    <em tabindex="0" class="J_ItemSum number">${commodity.commodityPrice}</em>
                                </div>
                            </li>
                            <li class="td td-op">
                                <div class="td-inner">
                                    <a title="移入收藏夹" class="btn-fav" href="#">
                                        移入收藏夹</a>
                                    <a href="javascript:;" data-point-url="#" class="delete">
                                        删除</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                </c:forEach>
            </tr>
            <div class="clear"></div>
    <div class="clear"></div>

    <div class="float-bar-wrapper">
        <div id="J_SelectAll2" class="select-all J_SelectAll">
            <div class="cart-checkbox">
                <input class="check-all check" id="J_SelectAllCbx2" name="select-all" value="true" type="checkbox">
                <label for="J_SelectAllCbx2"></label>
            </div>
            <span>全选</span>
        </div>
        <div class="operations">
            <a href="#" hidefocus="true" class="deleteAll">删除</a>
            <a href="#" hidefocus="true" class="J_BatchFav">移入收藏夹</a>
        </div>
        <div class="float-bar-right">
            <div class="amount-sum">
                <span class="txt">已选商品</span>
                <em id="J_SelectedItemsCount">0</em><span class="txt">件</span>
                <div class="arrow-box">
                    <span class="selected-items-arrow"></span>
                    <span class="arrow"></span>
                </div>
            </div>
            <div class="price-sum">
                <span class="txt">合计:</span>
                <strong class="price">¥<em id="J_Total">0.00</em></strong>
            </div>
            <div class="btn-area">
                <a href="pay.do" id="J_Go" class="submit-btn submit-btn-disabled" aria-label="请注意如果没有选择宝贝，将无法结算">
                    <span>结&nbsp;算</span></a>
            </div>
        </div>

    </div>

    <div class="footer">
        <div class="footer-hd">
            <p>
                <a href="#">恒望科技</a>
                <b>|</b>
                <a href="#">商城首页</a>
                <b>|</b>
                <a href="#">支付宝</a>
                <b>|</b>
                <a href="#">物流</a>
            </p>
        </div>
        <div class="footer-bd">
            <p>
                <a href="#">关于恒望</a>
                <a href="#">合作伙伴</a>
                <a href="#">联系我们</a>
                <a href="#">网站地图</a>
                <em>© 2015-2025 Hengwang.com 版权所有</em>
            </p>
        </div>
    </div>

  </div>
    </div>
</body>


</html>