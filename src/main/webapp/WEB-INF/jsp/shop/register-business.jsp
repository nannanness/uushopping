<%--
  Created by IntelliJ IDEA.
  User: tyq
  Date: 2018/8/26
  Time: 14:37
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
    <title>用户注册</title>
    <link rel="shortcut icon" type="image/x-icon" href="../../../theme/icon/favicon.ico">
    <link rel="stylesheet" type="text/css" href="../../../theme/css/base.css">
    <link rel="stylesheet" type="text/css" href="../../../theme/css/login.css">
    <script type="text/javascript" src="..\resources\js\jquery-1.7.2.min.js"></script>
    <script type="text/javascript">
        $(function () {
            var storeMan = $("#storeMan");
            var ifstoreMan = false;
            var storeManText ;
            storeMan.blur(function () {
                storeManText = storeMan.val();
                $.get(
                    "/shopController/storeMan.do?storeManText="+storeManText,
                    function (data) {
                       if(data =="可以使用" ){
                           ifstoreMan = true;
                           $("#storeManWarn").attr("style","color:green;font-size: 15px;width:70px");
                       }else {
                           ifstoreMan = false;
                           $("#storeManWarn").attr("style","color:red;font-size: 15px;width:100px");
                       }
                        $("#storeManWarn").html(data);
                    }
                );
            });
            var ifPassword = false;
            var password = $("#password");
            var password1 = $("#password1");
            var passwordText;
            password1.keyup(function () {
                if(password.val() == password1.val()){
                    $("#passwordwarn").attr("style","color:green;font-size: 15px;width:100px");
                    $("#passwordwarn").html("密码输入一致");
                    ifPassword = true;
                }else {
                    $("#passwordwarn").attr("style","color:red;font-size: 15px;width:100px");
                    $("#passwordwarn").html("密码输入不一致");
                    ifPassword = false;
                }
                passwordText = password1.val();

            });
            var iphone = $("#iphone");
            var storeSort=$("#storeSort");
            var storeName=$("#storeName");
            var storeIntroduction=$("#storeIntroduction");
            var storeEmail=$("#storeEmail");

            var ifIphone = false;
            var phoneText;
            iphone.blur(function () {
                phoneText = iphone.val();
                var isPhone = /^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\d{8}$/;//手机号码
                if (isPhone.test(phoneText)) {
                    $.get(
                        "/shopController/phoneNum.do?phoneText="+phoneText,
                        function (data) {
                            if(data){
                                $("#phonewarn").attr("style","color:green;font-size: 15px;width:120px");
                                $("#phonewarn").html("手机号可以使用!")
                                ifIphone =true;
                            }else {
                                $("#phonewarn").attr("style","color:red;font-size: 15px;width:150px");
                                $("#phonewarn").html("已经注册,请重新输入!")
                                ifIphone = false;
                            }
                        }
                    );
                }else {
                    $("#phonewarn").attr("style","color:red;font-size: 15px;width:120px");
                    $("#phonewarn").html("手机号格式不对")
                    ifIphone = false;
                }
            });
            var code = 1111111111111;
            $("#getCode").click(function () {
                if(ifIphone){
                    var countdown=60;
                    var resettim = setInterval(function() {
                        if (countdown == 0) {
                            $("#getCode").attr("disabled",false);
                            $("#getCode").text("获取短信验证码");
                            countdown = 60;
                            clearInterval(resettim) ;

                        } else {
                            $("#getCode").attr("disabled", true);
                            $("#getCode").text("重新发送验证码(" + countdown + ")");
                            countdown--;
                        }
                        if(countdown==50){
                            $.get(
                                "/check/addCheckCode.do",
                                function (data) {
                                    code =data;
                                    console.log(data)
                                }
                            )
                        }
                    },1000);
                }
            });
            var ifCcode =false;
            $("#message").blur(function () {
                var codeT = $("#message").val();
                if(code == codeT){
                    $("#codewarn").attr("style","color:green;font-size: 15px;width:80px");
                    $("#codewarn").html("验证码正确");
                    ifCcode =true;
                }else {
                    $("#codewarn").attr("style","color:red;font-size: 15px;width:80px");
                    $("#codewarn").html("验证码有误");
                    ifCcode =false;
                }
            });
            $("#register").click(function () {
                var readme = $("#readme").is(':checked');
                if(!readme){
                    alert("同意后再注册")
                }else if (ifCcode && ifstoreMan) {
                    $.get(
                        "/storeController/add_store.do?storeMan="+storeManText+"&password="+passwordText+"&storePhone="+phoneText+"&storeName="+storeName.val()+"&storeIntroduction="+storeIntroduction.val()+"&storeEmail="+storeEmail.val(),
                        function () {
                            alert("注册成功");
                            window.location.href="/shopController/login-business.do";
                        }
                    )
                }

            });





        })
    </script>
</head>
<body>

<!--- header begin-->
<header id="pc-header">
    <div class="login-header" style="padding-bottom:0">
        <div><h1><a href="/index.do"><img src="../theme/icon/logo.png"></a></h1></div>
    </div>
</header>
<!-- header End -->



<section id="login-content">
    <div class="login-centre">
        <div class="login-switch clearfix">
            <p class="fr">我已经注册，现在就 <a href="/shopController/login-business.do">登录</a></p>
        </div>
        <div class="login-back" style="height: auto;padding-top: 20px">
            <div class="H-over">
                <form>
                    <div class="login-input">
                        <label><i class="heart" >*</i>用户名：</label>
                        <input type="text" class="list-input1" id="storeMan" name="store[storeMan]" placeholder="" style="width: 200px">
                        &nbsp;&nbsp;<label id="storeManWarn" ></label>
                    </div>
                    <div class="login-input">
                        <label><i class="heart">*</i>请设置密码：</label>
                        <input type="password" class="list-input" id="password" name="store[password]" placeholder="">
                    </div>
                    <div class="login-input">
                        <label><i class="heart">*</i>请确认密码：</label>
                        <input type="password" class="list-input" id="password1" name="store[password]" placeholder="">
                        &nbsp;&nbsp;<label id="passwordwarn"></label>
                    </div>
                    <div class="login-input">
                        <label><i class="heart">*</i>手机号：</label>
                        <input type="text" class="list-iphone" id="iphone" name="store[password]" placeholder="">
                        <a href="javascript:void(0)" class="obtain" id="getCode">获取短信验证码</a>
                        &nbsp;&nbsp;<label id="phonewarn"></label>
                    </div>
                    <div class="login-input">
                        <label><i class="heart">*</i>短信验证码：</label>
                        <input type="text" class="list-notes" id="message" name="store[password]" placeholder="">
                        &nbsp;&nbsp;<label id="codewarn"></label>
                    </div>
                    <%--<div class="login-input">--%>
                        <%--<label><i class="heart">*</i>商铺分类：</label>--%>
                        <%--<input type="text" class="list-notes"  name="storeSort" placeholder="">--%>
                        <%--&nbsp;&nbsp;<label id="storeSort"></label>--%>
                    <%--</div>--%>
                    <div class="login-input">
                        <label><i class="heart">*</i>商铺名字：</label>
                        <input type="text" class="list-notes"  name="storeName" placeholder="">
                        &nbsp;&nbsp;<label id="storeName"></label>
                    </div>
                    <div class="login-input">
                        <label><i class="heart">*</i>商铺介绍：</label>
                        <textarea type="text" class="list-input"  name="storeIntroduction" placeholder=""style="width: 400px;height: 200px"></textarea>
                        &nbsp;&nbsp;
                    </div>
                    <div class="login-input">
                        <label><i class="heart">*</i>商铺邮箱：</label>
                        <input type="text" class="list-input"  name="storeEmail" placeholder="">
                        &nbsp;&nbsp;<label id="storeEmail"></label>
                    </div>
                    <div class="item-ifo">
                        <input type="checkbox" onclick="agreeonProtocol();" id="readme" checked="checked" class="checkbox">
                        <label for="protocol">我已阅读并同意<a id="protocol" class="blue" href="#">《悦商城用户协议》</a></label>
                        <span class="clr"></span>
                    </div>
                    <div class="login-button" style="padding-bottom: 20px">
                        <button id="register" ><a href="javascript:void(0)" onclick="vali()">立即注册</a></button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<!--- footer begin-->
<footer id="footer">
    <div class="containers">
        <div class="w" style="padding-top:30px">
            <div id="footer-2013">
                <div class="links">
                    <a href="">关于我们</a>
                    |
                    <a href="">联系我们</a>
                    |
                    <a href="">人才招聘</a>
                    |
                    <a href="">商家入驻</a>
                    |
                    <a href="">广告服务</a>
                    |
                    <a href="">手机京东</a>
                    |
                    <a href="">友情链接</a>
                    |
                    <a href="">销售联盟</a>
                    |
                    <a href="">English site</a>
                </div>
                <div style="padding-left:10px">
                    <p style="padding-top:10px; padding-bottom:10px; color:#999">网络文化经营许可证：浙网文[2013]0268-027号| 增值电信业务经营许可证：浙B2-20080224-1</p>
                    <p style="padding-bottom:10px; color:#999">信息网络传播视听节目许可证：1109364号 | 互联网违法和不良信息举报电话:0571-81683755</p>
                </div>
            </div>
        </div>

    </div>
</footer>
<!-- footer End -->
</body>
</html>