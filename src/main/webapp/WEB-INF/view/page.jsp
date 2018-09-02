<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell00
  Date: 2018/8/31
  Time: 19:54
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
    <title>商品详情</title>
    <link rel="shortcut icon" type="image/x-icon" href="../theme/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="../theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="../theme/css/home.css">
    <script type="text/javascript" src="../theme/js/jquery.js"></script>
    <script type="text/javascript" src="../theme/js/index.js"></script>
    <script type="text/javascript" src="../theme/js/js-tab.js"></script>
    <script>
        $(function(){
            $(".yScrollListInList1 ul").css({width:$(".yScrollListInList1 ul li").length*(160+84)+"px"});
            $(".yScrollListInList2 ul").css({width:$(".yScrollListInList2 ul li").length*(160+84)+"px"});
            var numwidth=(160+84)*4;
            $(".yScrollListInList .yScrollListbtnl").click(function(){
                var obj=$(this).parent(".yScrollListInList").find("ul");
                if (!(obj.is(":animated"))) {
                    var lefts=parseInt(obj.css("left").slice(0,-4));
                    if(lefts<60){
                        obj.animate({left:lefts+numwidth},1000);
                    }
                }
            })
            $(".yScrollListInList .yScrollListbtnr").click(function(){
                var obj=$(this).parent(".yScrollListInList").find("ul");
                var objcds=-(60+(Math.ceil(obj.find("li").length/4)-4)*numwidth);
                if (!(obj.is(":animated"))) {
                    var lefts=parseInt(obj.css("left").slice(0,-4));
                    if(lefts>objcds){
                        obj.animate({left:lefts-numwidth},1000);
                    }
                }
            })
        })
    </script>
    <script>
        $(function(){
            $("#pro_detail a").click(function(){
                $("#pro_detail a").removeClass("cur");
                $(this).addClass("cur");
                $("#big_img").attr("src",$(this).attr("simg"));
            });

            $(".attrdiv a").click(function(){
                $(".attrdiv a").removeClass("cur");
                $(this).addClass("cur");
            });

            $('.amount2').click(function(){
                var num_input = $("#subnum");
                var buy_num = (num_input.val()-1)>0?(num_input.val()-1):1;
                num_input.val(buy_num);
            });

            $('.amount1').click(function(){
                var num_input = $("#subnum");
                var buy_num = Number(num_input.val())+1;
                num_input.val(buy_num);
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
    <script type="text/javascript">
        $(document).ready(function(){

            $("#firstpane .menu_body:eq(0)").show();
            $("#firstpane h3.menu_head").click(function(){
                $(this).addClass("current").next("div.menu_body").slideToggle(300).siblings("div.menu_body").slideUp("slow");
                $(this).siblings().removeClass("current");
            });

            $("#secondpane .menu_body:eq(0)").show();
            $("#secondpane h3.menu_head").mouseover(function(){
                $(this).addClass("current").next("div.menu_body").slideDown(500).siblings("div.menu_body").slideUp("slow");
                $(this).siblings().removeClass("current");
            });
            var  getname = $("#sucesslogin").children("a").text();
            if(getname.length > 0){
                $("#sucesslogin").show()
                $("#successregister").show()
                $(".hdin").css('visibility','visible');
                $("#dologin").hide()
                $("#doregister").hide()
            }
            var joinShopCar = $("#joinShopCar");
            joinShopCar.click(function () {
                var ifLogin =$("#ifLogin").val();
                var commodityId =$("#commodityId").val();
                var storeId =$("#storeId").val();
                if(ifLogin){
                    $(this).attr("href","/pageJump/joinShopCar.do?commodityId="+commodityId+"&storeId="+storeId);
                    alert("添加成功");
                    // $.get(
                    //     "/pageJump/joinShopCar.do?commodityId="+commodityId,
                    //     function () {
                    //         alert("添加成功")
                    //     }
                    // )
                }else {
                    alert("请登陆后再操作")
                }
            })
        });
    </script>
</head>
<body>
<input type="hidden" id="ifLogin" value="${flage}">
<!--- header begin-->
<jsp:include page="index_head.jsp" flush="true"></jsp:include>
<!-- header End -->

<!-- 商品详情 begin -->
<section>
    <div class="pc-details" >
        <div class="containers">
            <div class="pc-details-l">
                <div class="pc-product clearfix">
                    <div class="pc-product-h">
                        <div class="pc-product-top"><img src="${commodity.imageAddress}" id="big_img" width="418" height="418"></div>

                    </div>
                    <div class="pc-product-t">
                        <div class="pc-name-info">
                            <h1>${commodity.commodityName}</h1>
                            <br><br>
                            <p>由<a href="javascript:void(0)" class="reds">${store.storeName}</a> 负责发货，并提供售后服务。</p>
                        </div>
                        <div class="pc-dashed clearfix">
                            <span>累计销量：<em class="reds">${commodity.salesVolume}</em> 件</span><b>|</b><span>累计评价：<em class="reds">${commodity.cumulativeComment}</em></span>
                        </div>
                        <div class="pc-size">
                            <div class="attrdiv pc-telling clearfix">
                                <div class="pc-version">版本</div>
                                <div class="pc-adults">
                                    ${commodity.commodityVersion}
                                </div>
                            </div>
                            <div class="pc-telling clearfix">
                                <div class="pc-version">数量</div>
                                <div class="pc-adults clearfix">
                                    <div class="pc-adults-p clearfix fl">
                                        <input type="" id="subnum" placeholder="1">
                                        <a href="javascript:void(0);" class="amount1"></a>
                                        <a href="javascript:void(0);" class="amount2"></a>
                                    </div>
                                    <div class="fl pc-letter ">件</div>
                                    <div class="fl pc-stock ">库存<em>${commodity.commodityStock}</em>件</div>
                                </div>
                            </div>
                            <div class="pc-number clearfix"><span class="fl">商品编号：${commodity.commodityId}</span></div>
                        </div>
                        <div class="pc-emption">
                            <a href="#">立即购买</a>
                            <input type="hidden" id="commodityId" value="${commodity.commodityId}">
                            <input type="hidden" id="storeId" value="${store.storeId}">
                            <a href="#" class="join" id="joinShopCar">加入购物车</a>
                        </div>
                    </div>
                    <div class="pc-product-s">
                        <div class="pc-shoplo"><a href="#"><img src="${store.storeLogo}" style="width:174px; height:43px; " ></a> </div>
                        <div class="pc-shopti">
                            <h2>${store.storeName}</h2>
                            <p>公司简介：${store.storeIntroduction}</p>

                        </div>
                        <div class="pc-custom"><a href="#">联系客服</a> </div>
                        <div class="pc-trigger">
                            <a href="#">进入店铺</a>
                            <a href="#" style="margin:0;">关注店铺</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="containers clearfix" style="margin-top:20px;">
        <div class="pc-info fr">
            <div class="pc-overall">
                <ul id="H-table1" class="brand-tab H-table1 H-table-shop clearfix ">
                    <li class="cur"><a href="javascript:void(0);">商品介绍</a></li>
                    <li><a href="javascript:void(0);">商品评价<em class="reds">(91)</em></a></li>
                    <li><a href="javascript:void(0);">售后保障</a></li>
                </ul>
                <div class="pc-term clearfix">
                    <div class="H-over1 pc-text-word clearfix">
                        <ul class="clearfix">
                            <li>
                                <p>商品的产地：${commodity.commondityFrom}</p>
                            </li>
                            <li>
                                <p>商品品牌：${commodity.commodityBrand}</p>
                            </li>
                            <li>
                                <p>商品详情：${commodity.commodityDetails}</p>
                            </li>
                        </ul>
                        <div class="pc-line"></div>
                        <div>
                            <div><img src="${commodity.imageAddress}" width="100%"></div>

                        </div>
                    </div>
                    <div class="H-over1" style="display:none">
                        <div class="pc-comment fl"><strong>86<span>%</span></strong><br> <span>好评度</span></div>
                        <div class="pc-percent fl">
                            <dl>
                                <dt>好评<span>(86%)</span></dt>
                                <dd><div style="width:86px"></div></dd>
                            </dl>
                            <dl>
                                <dt>中评<span>(86%)</span></dt>
                                <dd><div style="width:86px"></div></dd>
                            </dl>
                            <dl>
                                <dt>好评<span>(86%)</span></dt>
                                <dd><div style="width:86px"></div></dd>
                            </dl>
                        </div>
                    </div>
                    <div class="H-over1 pc-text-title" style="display:none">
                        <p>本产品全国联保，享受三包服务，质保期为：一年质保
                            如因质量问题或故障，凭厂商维修中心或特约维修点的质量检测证明，享受7日内退货，15日内换货，15日以上在质保期内享受免费保修等三包服务！
                            (注:如厂家在商品介绍中有售后保障的说明,则此商品按照厂家说明执行售后保障服务。) 您可以查询本品牌在各地售后服务中心的联系方式，请点击这儿查询......</p>
                        <div class="pc-line"></div>
                    </div>
                </div>
            </div>
            <div class="pc-overall">
                <ul class="brand-tab H-table H-table-shop clearfix " id="H-table" style="margin-left:0;">
                    <li class="cur"><a href="javascript:void(0);">全部评价（199）</a></li>
                    <li><a href="javascript:void(0);">好评<em class="reds">（33）</em></a></li>
                    <li><a href="javascript:void(0);">中评<em class="reds">（02）</em></a></li>
                    <li><a href="javascript:void(0);">差评<em class="reds">（01）</em></a></li>
                </ul>
                <div class="pc-term clearfix">
                    <div class="pc-column">
                        <span class="column1">评价心得</span>
                        <span class="column2">顾客满意度</span>
                        <span class="column3">购买信息</span>
                        <span class="column4">评论者</span>
                    </div>
                    <div class="H-over  pc-comments clearfix">
                        <ul class="clearfix">
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div style="display:none" class="H-over pc-comments">
                        <ul class="clearfix">
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div style="display:none" class="H-over pc-comments">
                        <ul class="clearfix">
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div style="display:none" class="H-over pc-comments">
                        <ul class="clearfix">
                            <li class="clearfix">
                                <div class="column1">
                                    <p class="clearfix"><a href="#">回复<em>（90）</em></a> <a href="#">赞<em>（90）</em></a> </p>
                                    <p>一次用三星，不是很顺手，但咨询客服后终于上手了，感觉性价比相当不错，值得购买。但最想说的是京东客服更好，产品信得过，正品行货，买的放心。</p>
                                    <p class="column5">2014-11-25 14:32</p>
                                </div>
                                <div class="column2"><img src="../theme/icon/star.png"></div>
                                <div class="column3">颜色：云石白</div>
                                <div class="column4">
                                    <p><img src="../theme/icon/user.png"></p>
                                    <p>2014-11-23 22:37 购买</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="clearfix">
                <div class="fr pc-search-g pc-search-gs">
                    <a href="#" class="fl " style="display:none">上一页</a>
                    <a class="current" href="#">1</a>
                    <a href="javascript:;">2</a>
                    <a href="javascript:;">3</a>
                    <a href="javascript:;">4</a>
                    <a href="javascript:;">5</a>
                    <a href="javascript:;">6</a>
                    <a href="javascript:;">7</a>
                    <span class="pc-search-di">…</span>
                    <a href="javascript:;">1088</a>
                    <a href="javascript:;" class="" title="使用方向键右键也可翻到下一页哦！">下一页</a>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- 商品详情 End -->

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
