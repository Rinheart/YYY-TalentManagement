<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>注册页面</title>

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
                        <img src="../assets/images/logo.png" class="img-fluid rounded-normal light-logo logo"
                             alt="logo">
                        <img src="../assets/images/logo-white.png" class="img-fluid rounded-normal darkmode-logo logo"
                             alt="logo">
                        <h3 class="mb-3">注册账号</h3>
                        <p>请填入您的真实信息</p>
                        <form action="register.action" method="post">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="talent.talentId" id="username" type="text"
                                               placeholder=" ">
                                        <label>用户名</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="talent.password" id="password"
                                               type="password" placeholder=" ">
                                        <label>密码</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="talent.name" type="text"
                                               placeholder=" ">
                                        <label>姓名</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="floating-label form-group custom-radio text-right">
                                        　　<input type="radio" class="custom-radio floating-input" name ="talent.sex" value="true" >男
                                        　　<input type="radio" class="custom-radio floating-input" name ="talent.sex" value="false">女
                                        <label>性别</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="date" name="talent.birthday" placeholder=" ">
                                        <label>生日</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="talent.idNumber" placeholder=" ">
                                        <label>身份证</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="talent.phoneNumber" placeholder=" ">
                                        <label>联系电话</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="talent.address" placeholder=" ">
                                        <label>联系地址</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="talent.education" placeholder=" ">
                                        <label>学历</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="talent.personalProfile" placeholder=" ">
                                        <label>个人简介</label>
                                    </div>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary" onclick="return custCheck()">注册</button>
                            <p class="mt-3">
                                已经有账号 <a href="login.jsp" class="text-primary">去登陆</a>
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