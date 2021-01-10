<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>小微企业跨组织人才管理系统</title>
    <!-- Favicon -->
    <link rel="shortcut icon" href="../assets/images/favicon.ico" />
    <link rel="stylesheet" href="../assets/css/backend.min.css">
    <link rel="stylesheet" href="../assets/vendor/@fortawesome/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="../assets/vendor/line-awesome/dist/line-awesome/css/line-awesome.min.css">
    <link rel="stylesheet" href="../assets/vendor/remixicon/fonts/remixicon.css">
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
                        <img src="../assets/images/logo1.png" class="img-fluid rounded-normal light-logo logo" alt="logo">
                        <img src="../assets/images/logo-white.png" class="img-fluid rounded-normal darkmode-logo logo" alt="logo">
                        <h3 class="mb-3">企业登录</h3>
                        <p><s:property value="#request.tip"/></p>
                        <form action="enterpriseLogin.action" method="post">
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="enterprise.enterpriseId" id="username" type="text" placeholder=" ">
                                        <label>用户名</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="enterprise.password" id="password" type="password" placeholder=" ">
                                        <label>密码</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="custom-control custom-checkbox mb-3 text-left">
                                        <input type="checkbox" class="custom-control-input" id="customCheck1">
                                        <label class="custom-control-label" for="customCheck1">记住我</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <a href="" class="text-primary float-right">忘记密码?</a>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary" onclick="return custCheck()">登录</button>
                            <p class="mt-3">
                                没有账号？ <a href="/enterprise/enterpriseRegister.jsp" class="text-primary">注册</a> <br>
                                <br>
                                <a href="../index.jsp">返回首页</a>
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