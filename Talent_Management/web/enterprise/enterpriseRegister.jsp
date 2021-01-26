<%--<%@ taglib prefix="s" uri="/struts-tags" %>--%>
<%--<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>企业用户注册</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h2 align="left">--%>
<%--    <span style="color:#9f94d9; ">企业用户注册系统</span>--%>
<%--</h2>--%>
<%--<table class="table">--%>
<%--<s:form action="enterpriseRegister" method="post">--%>
<%--    <s:textfield name="enterprise.enterpriseId" label="请输入企业账号"/>--%>
<%--    <s:password name="enterprise.password" label="请输入密码"/>--%>
<%--    <s:textfield name="enterprise.enterpriseName" label="请输入企业姓名"/>--%>
<%--    <s:textfield type="date" name="enterprise.establishTime"  label="请输入企业成立时间"/>--%>
<%--    <s:textfield name="enterprise.address" label="请输入企业地址"/>--%>
<%--    <s:textfield name="enterprise.businessScope" label="请输入企业经营范围"/>--%>
<%--    <s:textfield name="enterprise.enterpriseType" label="请输入企业类型"/>--%>
<%--    <s:textfield name="enterprise.annualTurnover" label="请输入企业年营业额"/>--%>
<%--    <s:textfield name="enterprise.staffNumber" label="请输入职工编号"/>--%>
<%--    <s:textfield name="enterprise.founder" label="请输入企业创建人姓名"/>--%>
<%--    <s:textfield name="enterprise.ceo" label="请输入企业CEO姓名"/>--%>
<%--    <s:textfield name="enterprise.resignNumber" label="请输入企业注册号"/>--%>
<%--    <s:textfield name="enterprise.registrar" label="请输入企业注册地"/>--%>
<%--    <s:textfield name="enterprise.registeredCapital" label="请输入企业注册资本"/>--%>
<%--    <s:textfield name="enterprise.websiteAddress" label="请输入公司主页"/>--%>
<%--    <s:submit class="table" value="注册"/> <s:reset class="table" value="重置"/>--%>
<%--</s:form>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>企业账号注册页面</title>
    <!-- Favicon -->
    <link rel="shortcut icon" href="../assets/images/favicon.ico"/>
    <link rel="stylesheet" href="../assets/css/backend.min.css">
    <link rel="stylesheet" href="../assets/vendor/@fortawesome/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="../assets/vendor/line-awesome/dist/line-awesome/css/line-awesome.min.css">
    <link rel="stylesheet" href="../assets/vendor/remixicon/fonts/remixicon.css">
</head>
<body class=" ">
<!-- loader Start -->
<div id="loading">
    <div id="loading-center">
    </div>
</div>
<!-- loader END -->

<div class="wrapper">
    <section class="login-content">
        <div class="container h-100">
            <div class="row justify-content-center align-items-center height-self-center">
                <div class="col-md-5 col-sm-12 col-12 align-self-center">
                    <div class="sign-user_card">
                        <img src="../assets/images/logo1.png" class="img-fluid rounded-normal light-logo logo"
                             alt="logo">
                        <img src="../assets/images/logo-white.png" class="img-fluid rounded-normal darkmode-logo logo"
                             alt="logo">
                        <h3 class="mb-3">企业账号注册</h3>
                        <p>请填入企业的真实信息</p>
                        <form action="enterpriseRegister" method="post">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="enterprise.enterpriseId" id="username" type="text"
                                               placeholder=" ">
                                        <label>企业账号</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="enterprise.password" id="password"
                                               type="password" placeholder=" ">
                                        <label>密码</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="enterprise.enterpriseName" id="enterprisename" type="text"
                                               placeholder=" ">
                                        <label>企业名称</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="date" name="enterprise.establishTime" id="establishtime" placeholder=" ">
                                        <label>企业成立时间</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="enterprise." type="text" id="enteraddress" placeholder=" ">
                                        <label>企业地址</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.businessScope" id="businessscope" placeholder=" ">
                                        <label>企业经营范围</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.enterpriseType" id="enterprisetype" placeholder=" ">
                                        <label>企业类型</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.annualTurnover" id="annualturnover" placeholder=" ">
                                        <label>年营业额</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.staffNumber" id="staffnumber" placeholder=" ">
                                        <label>企业职工编号</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.ceo" id="ceoname" placeholder=" ">
                                        <label>企业CEO姓名</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.resignNumber" id="resignnumber" placeholder=" ">
                                        <label>企业注册号</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.registrar" id="registrar" placeholder=" ">
                                        <label>企业注册地</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.registeredCapital" id="registeredcapital" placeholder=" ">
                                        <label>企业注册资本</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.websiteAddress" id="websiteaddress" placeholder=" ">
                                        <label>企业主页</label>
                                    </div>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary" onclick="return custCheck()">注册</button>
                            <p class="mt-3">
                                已经有账号?<a href="enterpriseLogin.html" class="text-primary">去登陆</a>
                            </p>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
</div>


<script language="JavaScript">
    function custCheck() {
        var n1 = document.getElementById("username");//获取企业账号
        var n2 = document.getElementById("password");//获取密码
        var n3 = document.getElementById("enterprisename");//获取企业名称
        var n4 = document.getElementById("establishtime");//获取企业成立时间
        var n5 = document.getElementById("enteraddress");//获取企业地址
        var n6 = document.getElementById("businessscope");//获取企业经营范围
        var n7 = document.getElementById("enterprisetype");//获取企业类型
        var n8 = document.getElementById("annualturnover");//获取年营业额
        var n9 = document.getElementById("staffnumber");//获取企业职工编号
        var n10 = document.getElementById("ceoname");//获取企业CEO姓名
        var n11 = document.getElementById("resignnumber");//获取企业注册号
        var n12 = document.getElementById("registrar");//获取企业注册地
        var n13 = document.getElementById("registeredcapital");//获取企业注册资本
        var n14 = document.getElementById("websiteaddress");//获取企业主页
        var reg = /^[0-9]*$/;
        if(n1.value==""){
            alert("账号不能为空！");
            return false;
        }
        else if(n2.value==""){
            alert("密码不能为空！");
            return false;
        }
        else if(n3.value==""){
            alert("企业名称不能为空！");
            return false;
        }
        else if(n4.value==""){
            alert("企业成立时间不能为空！");
            return false;
        }
        else if(n5.value==""){
            alert("企业地址不能为空！");
            return false;
        }
        else if(n6.value==""){
            alert("企业经营范围不能为空！");
            return false;
        }
        else if(n7.value==""){
            alert("企业类型不能为空！");
            return false;
        }
        else if(n8.value==""){
            alert("年营业额不能为空！");
            return false;
        }
        else if(n9.value==""){
            alert("企业职工编号不能为空！");
            return false;
        }
        else if(n10.value==""){
            alert("CEO姓名不能为空！");
            return false;
        }
        else if(n11.value==""||!reg.test(n11.value)){
            alert("企业注册号不能为空！");
            return false;
        }
        else if(n12.value==""){
            alert("企业注册地不能为空！");
            return false;
        }
        else if(n13.value==""){
            alert("企业注册资本不能为空！");
            return false;
        }
        else if(n14.value==""){
            alert("企业主页不能为空！");
            return false;
        }

        else if(n1.value.length>8){
            alert("用户名长度不能超过8位！");
            return false;
        }
        else if(n2.value.length>20){
            alert("密码长度不能超过20位！");
            return false;
        }
        else if(n3.value.length>20){
            alert("企业名称长度不能超过20位！");
            return false;
        }
        else if(n5.value.length>100){
            alert("企业地址长度不能超过100位！");
            return false;
        }
        else if(n6.value.length>45){
            alert("企业经验范围长度不能超过45位！");
            return false;
        }
        else if(n7.value.length>45){
            alert("企业类型长度不能超过45位！");
            return false;
        }
        else if(n8.value.length>200){
            alert("年营业额长度不能超过200位！");
            return false;
        }
        else if(n10.value.length>10){
            alert("CEO姓名长度不能超过10位！");
            return false;
        }
        else if(n11.value.length!=18){
            alert("企业注册号输入格式错误！");
            return false;
        }
        else if(n12.value.length>20){
            alert("企业登记机关地长度不能超过20位！");
            return false;
        }
        else if(n13.value.length>200){
            alert("企业注册资本长度不能超过200位！");
            return false;
        }
        else if(n14.value.length>50){
            alert("企业官网网址长度不能超过50位！");
            return false;
        }
    }
</script>
<!-- Backend Bundle JavaScript -->
<script src="../assets/js/backend-bundle.min.js"></script>
<!-- Chart Custom JavaScript -->
<script src="../assets/js/customizer.js"></script>
<!-- Chart Custom JavaScript -->
<script src="../assets/js/chart-custom.js"></script>
<script src="../assets/js/doc-viewer.js"></script>
<!-- app JavaScript -->
<script src="../assets/js/app.js"></script>
</body>
</html>
