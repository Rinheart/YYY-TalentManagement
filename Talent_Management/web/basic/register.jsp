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
                                        <input class="floating-input form-control" name="talent.talentId" id="username"
                                               type="text"
                                               placeholder="">
                                        <label>用户名</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="talent.password" id="password"
                                               type="password" placeholder="">
                                        <label>密码</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" name="talent.name" type="text"
                                               id="myname"
                                               placeholder="">
                                        <label>姓名</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="floating-label form-group custom-radio text-right">
                                        　　<input type="radio" class="custom-radio floating-input" name="talent.sex"
                                                 value="true">男
                                        　　<input type="radio" class="custom-radio floating-input" name="talent.sex"
                                                 value="false">女
                                        <label>性别</label>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="date" name="talent.birthday"
                                               id="birthday" placeholder="">
                                        <label>生日</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="talent.idNumber"
                                               id="idnumber" placeholder="">
                                        <label>身份证</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="talent.phoneNumber"
                                               id="phonenumber" placeholder="">
                                        <label>联系电话</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="talent.address"
                                               id="address" placeholder="">
                                        <label>联系地址</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text" name="talent.education"
                                               id="education" placeholder="">
                                        <label>学历</label>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="floating-label form-group">
                                        <input class="floating-input form-control" type="text"
                                               name="talent.personalProfile" id="personalprofile" placeholder="">
                                        <label>个人简介</label>
                                    </div>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary" onclick="return custCheck()">注册</button>
                            <p class="mt-3">
                                已经有账号 <a href="login.html" class="text-primary">去登陆</a>
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
        var n1 = document.getElementById("username");//获取用户名
        var n2 = document.getElementById("password");//获取密码
        var n3 = document.getElementById("myname");//获取姓名
        var n4 = document.getElementsByName("talent.sex");//性别
        var n5 = document.getElementById("birthday");//生日
        var n6 = document.getElementById("idnumber");//获取身份证
        var n7 = document.getElementById("phonenumber");//获取联系电话
        var n8 = document.getElementById("address");//获取联系地址
        var n9 = document.getElementById("education");//获取学历
        var n10 = document.getElementById("personalprofile");//获取个人简介
        var reg = /^[0-9]*$/;
        if (n1.value == "") {
            alert("用户名不能为空！");
            return false;
        } else if (n2.value == "") {
            alert("密码不能为空！");
            return false;
        } else if (n3.value == "") {
            alert("姓名不能为空！");
            return false;
        } else if (n4.value == "") {
            alert("性别不能为空！");
            return false;
        } else if (n5.value == "") {
            alert("生日不能为空！");
            return false;
        } else if (n6.value == "") {
            alert("身份证不能为空！");
            return false;
        } else if (n7.value == "") {
            alert("联系电话不能为空！");
            return false;
        } else if (n8.value == "") {
            alert("联系地址不能为空！");
            return false;
        } else if (n9.value == "") {
            alert("学历不能为空！");
            return false;
        } else if (n10.value == "") {
            alert("个人简介不能为空！");
            return false;
        } else if (n1.value.length > 8) {
            alert("用户名长度不能超过8位！");
            return false;
        } else if (n2.value.length > 20) {
            alert("密码长度不能超过20位！");
            return false;
        } else if (n3.value.length > 10) {
            alert("姓名长度不能超过10位！");
            return false;
        } else if (n6.value.length != 18 || !reg.test(n6.value)) {
            alert("身份证输入格式错误！");
            return false;
        } else if (!reg.test(n7.value) || n7.value.length != 11) {
            alert("联系电话输入格式错误！");
            return false;
        } else if (n8.value.length > 100) {
            alert("联系地址长度不能超过100位！");
            return false;
        } else if (n9.value.length > 10) {
            alert("学历长度不能超过10位！");
            return false;
        } else if (n10.value.length > 200) {
            alert("个人简介长度不能超过200位！");
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