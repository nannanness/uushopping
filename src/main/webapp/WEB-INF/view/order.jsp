<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tyq
  Date: 2018/8/26
  Time: 20:51
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
    <title>提交订单</title>
    <link rel="shortcut icon" type="image/x-icon" href="../theme/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="../theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="../theme/css/home.css">
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




        $(document).ready(function($){

            $(".btn1").click(function(event){
                $(".hint").css({"display":"block"});
                $(".box").css({"display":"block"});
            });

            $(".hint-in3").click(function(event) {
                $(".hint").css({"display":"none"});
                $(".box").css({"display":"none"});
            });

            $(".hint3").click(function(event) {
                $(this).parent().parent().css({"display":"none"});
                $(".box").css({"display":"none"});
            });

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
            $(".tit").mouseenter(function(){
                $(".subnav").show();
            })
            $(".subnav").mouseleave(function(){
                $(".subnav").hide();
            })

        });
    </script>


</head>
<body>

<div class="box">
    <div class="hint">
        <div class="hint-in1">
            <div class="hint2">添加收货地址</div>
            <div class="hint3"></div>
        </div>


        <div class="pc-label"><label><i class="reds ">*</i>收货人:</label><input type="text" placeholder="请您填写收货人姓名"></div>
        <div id="sjld" style="margin-top:10px; padding-left:40px; position:relative;" class="clearfix">

            <div class="clearfix" style="padding-bottom:5px;"><i class="reds fl">*</i><p class="fl">所在地区:</p></div>

            <div class="m_zlxg" id="shenfen">

                <p title="">选择省份</p>
                <div class="m_zlxg2">
                    <ul></ul>
                </div>
            </div>
            <div class="m_zlxg" id="chengshi">
                <p title="">选择城市</p>
                <div class="m_zlxg2">
                    <ul></ul>
                </div>
            </div>
            <div class="m_zlxg" id="quyu">
                <p title="">选择区域</p>
                <div class="m_zlxg2">
                    <ul></ul>
                </div>
            </div>
            <input id="sfdq_num" type="hidden" value="" />
            <input id="csdq_num" type="hidden" value="" />
            <input id="sfdq_tj" type="hidden" value="" />
            <input id="csdq_tj" type="hidden" value="" />
            <input id="qydq_tj" type="hidden" value="" />
        </div>

        <div class="pc-label"><label><i class="reds ">*</i>详细地址:</label><input type="text" style="width:400px; " placeholder="请您填写收货人详细地址"></div>
        <div class="pc-label"><label><i class="reds ">*</i>手机号码:</label><input type="text" style="width:400px;"placeholder="请您填写收货人手机号码"></div>
        <div class="pc-label"><label>邮箱:</label><input type="text" style="width:400px;" placeholder="请您填写邮箱地址"></div>
        <a href="javascript:;" class="hint-in3">保存收货地址</a>
    </div>

</div>

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
        <div class="header-logo fl" style="width:212px;"><h1><a href="/index.do"><img src="../theme/icon/logo.png"></a></h1></div>
        <div class="pc-order-titlei fl"><h2>填写订单</h2></div>
        <div class="pc-step-title fl">
            <ul>
                <%--<li class="cur2"><a href="#">1 . 我的购物车</a></li>--%>
                <li class="cur"><a href="#">1 . 填写核对订单</a></li>
                <li><a href="#">2 . 成功提交订单</a></li>
            </ul>
        </div>
    </div>

</header>
<!-- header End -->


<!-- 订单提交成功 begin-->
<section>
    <div class="containers">
        <div class="pc-space">
            <div class="pc-order-title clearfix"><h3 class="fl">收货人信息</h3> <a href="#" class="fr pc-order-add btn1">修改收货地址</a> </div>
            <div class="pc-border">
                <div class="pc-order-text clearfix">
                    <ul class=" clearfix">
                        <li class="clearfix fl">
                            <div class="fl pc-frame pc-frams"> <a href="#">默认地址</a></div>
                            <div class="fl pc-address"><span>${user.username}</span> <span>${user.userPhone} </span> <span>${user.userAddress}</span></div>
                        </li>
                        <li class="fr">
                            <div class="pc-click"><a href="#">设为默认地址</a> <a href="#">编辑</a> <a href="#">删除</a> </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- <div class="pc-space">

         </div> -->
        <div class="pc-space clearfix">
            <div class="fl ">
                <div class="pc-order-title clearfix"><h3 class="fl">非常抱歉暂时无法由用户选择快递</h3></div>
                <div class="fr pc-border">
                    <div class="pc-order-text pc-order-l clearfix">
                        <ul id="H-table" class="clearfix H-table"  >
                            <li class="cur">
                                <a href="javascript:void(0);">百事汇通</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);">顺风快递</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);">中通快递</a>
                            </li>
                        </ul>
                        <div class="" style="height:211px"></div>
                        <div class="pc-line"></div>
                        <div class="pc-freight"><p>运费：  8.00元</p></div>
                    </div>
                </div>
            </div>
            <div class="fr ">
                <div class="pc-order-title clearfix"><h3 class="fl">商品信息</h3></div>
                <div class="pc-border">
                    <div class="pc-order-text clearfix">
                        <c:forEach items="${userOrderInStores}" var="uois">
                        <div class="pc-wares-t"><h4>商家：  ${uois.storeName}</h4></div>

                        <div class="clearfix pc-wares-p">
                            <div class="fl pc-wares"><a href="#"><img src="${uois.imageAddress}"style="width: 84px;height: 84px"></a></div>
                            <div class="fl pc-wares-w"> <a href="#">${uois.commodityName}:${uois.commodityDetails}</a> <p class="clearfix"><span class="fl">尺寸：${uois.commoditySize}</span><span class="fr">版本：${uois.commodityVersion}</span></p></div>
                            <div class="fl pc-wares-s"><span class="reds">￥${uois.commodityPrice}</span><span>库存：${uois.commodityStock}</span></div>
                        </div>
                        </c:forEach>
                        <div class="pc-written"><p>订单留言</p></div>

                    </div>
                </div>
            </div>
        </div>
        <!-- <div class="pc-space">
             <div class="pc-order-title clearfix"><h3 class="fl">发票信息</h3></div>
             <div class="pc-border">
                 <div class="pc-order-text clearfix">
                     <ul class=" clearfix">
                         <li class="clearfix fl">
                             <div class="fl pc-address pc-wares-l"><span>普通发票（纸质）</span> <span> 个人</span> <span>明细</span><span><a href="#">修改</a> </span></div>
                         </li>
                     </ul>
                 </div>
             </div>
         </div> -->
        <div class="clearfix">
            <div class="fr pc-list-t">
                <ul>
                    <li><span><b>${userOrderInStores.size()}</b> 件商品，总商品金额：</span> <em>￥${AllPrice}</em></li>
                    <li><span>运费：</span> <em>￥8.00</em></li>
                    <li><span>应付总额：</span> <em>￥${allSum}</em></li>
                </ul>
            </div>
        </div>
        <div class="pc-space-n"></div>
        <div class="clearfix">
            <div class="fr pc-space-j">
                <spna>应付总额：<strong>￥${allSum}</strong></spna>
                <button class="pc-submit"><a href="d-success.do?userId=${user.userId}" style="color:#dedede">提交订单</a></button>
            </div>
        </div>
    </div>
</section>
<!-- 订单提交成功 End-->


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

<script type="text/javascript" src="../theme/js/address.js"></script>
<script type="text/javascript">
    $(function(){

        $("#sjld").sjld("#shenfen","#chengshi","#quyu");

    });
</script>
</body>
</html>
