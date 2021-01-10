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
                                        <input class="floating-input form-control" name="enterprise.enterpriseName" type="text"
                                               placeholder=" ">
                                        <label>企业名称</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="date" name="enterprise.establishTime" placeholder=" ">
                                        <label>企业成立时间</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="enterprise." type="text" placeholder=" ">
                                        <label>企业地址</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.businessScope" placeholder=" ">
                                        <label>企业经营范围</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.enterpriseType" placeholder=" ">
                                        <label>企业类型</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.annualTurnover" placeholder=" ">
                                        <label>年营业额</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.staffNumber" placeholder=" ">
                                        <label>企业职工编号</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.ceo" placeholder=" ">
                                        <label>企业CEO姓名</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.resignNumber" placeholder=" ">
                                        <label>企业注册号</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.registrar" placeholder=" ">
                                        <label>企业注册地</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.registeredCapital" placeholder=" ">
                                        <label>企业注册资本</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="enterprise.websiteAddress" placeholder=" ">
                                        <label>企业主页</label>
                                    </div>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary" onclick="return custCheck()">注册</button>
                            <p class="mt-3">
                                已经有账号?<a href="enterpriseLogin.jsp" class="text-primary">去登陆</a>
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
        var n2 = document.getElementById("username");
        var n3 = document.getElementById("password");
        if(n2.value==""||n2.value=="请输入用户名"){
            alert("用户名不能为空！");
            return false;
        }
        else if(n3.value==""||n3.value=="请输入密码"){
            alert("密码不能为空！");
            return false;
        }
        if(n2.value.length>8||n3.value().length>8){
            alert("用户名/密码不能超过8位");
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
