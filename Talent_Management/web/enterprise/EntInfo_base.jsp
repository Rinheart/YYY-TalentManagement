<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>小微企业跨组织人才管理系统</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="../assets/images/favicon.ico"/>

    <link rel="stylesheet" href="../assets/css/backend.min.css">
    <link rel="stylesheet" href="../assets/vendor/@fortawesome/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="../assets/vendor/line-awesome/dist/line-awesome/css/line-awesome.min.css">
    <link rel="stylesheet" href="../assets/vendor/remixicon/fonts/remixicon.css">

    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>

</head>
<body class="  ">
<!-- loader Start -->
<div id="loading">
    <div id="loading-center">
    </div>
</div>
<!-- loader END -->
<!-- Wrapper Start -->
<div class="wrapper">
    <div class="iq-sidebar  sidebar-default ">
        <div class="iq-sidebar-logo d-flex align-items-center justify-content-between">
            <a href="index.html" class="header-logo">
                <img src="../assets/images/logo.png" class="img-fluid rounded-normal light-logo" alt="logo">
                <img src="../assets/images/logo-white.png" class="img-fluid rounded-normal darkmode-logo" alt="logo">
            </a>
            <div class="iq-menu-bt-sidebar">
                <i class="las la-bars wrapper-menu"></i>
            </div>
        </div>
        <div class="data-scrollbar" data-scroll="1">
            <nav class="iq-sidebar-menu">
                <ul id="iq-sidebar-toggle" class="iq-menu">
                    <!--此处是导航  定位-->
                    <li class="active">
                        <a href="getEntPage.action" class="">
                            <i class="las la-home iq-arrow-left"></i><span>企业主页</span>
                        </a>
                        <ul id="dashboard" class="iq-submenu collapse" data-parent="#iq-sidebar-toggle">
                        </ul>
                    </li>
                    <li class=" ">
                        <a href="#" onclick="a('enterpriseUpdatePage.action');return false;" class="">
                            <i class="lar la-file-alt iq-arrow-left"></i><span>企业信息管理</span>
                        </a>
                        <ul id="page-files" class="iq-submenu collapse" data-parent="#iq-sidebar-toggle">
                        </ul>
                    </li>
                    <li class=" ">
                        <a href="#" onclick="a('departmentPage.action');return false;" class="">
                            <i class="lar la-hdd iq-arrow-left"></i><span>部门信息管理</span>
                        </a>
                        <ul class="iq-submenu collapse" data-parent="#iq-sidebar-toggle">
                        </ul>
                    </li>
                    <li class=" ">
                        <a href="#" onclick="a('manageHRPage.action');return false;" class="">
                            <i class="lar la-share-square iq-arrow-left"></i><span>HR信息管理</span>
                        </a>
                        <ul class="iq-submenu collapse" data-parent="#iq-sidebar-toggle">
                        </ul>
                    </li>


                </ul>
            </nav>
            <div class="p-3"></div>
        </div>
    </div>
    <div class="iq-top-navbar">
        <div class="iq-navbar-custom">
            <nav class="navbar navbar-expand-lg navbar-light p-0">
                <div class="iq-navbar-logo d-flex align-items-center justify-content-between">
                    <i class="ri-menu-line wrapper-menu"></i>
                    <a href="index.html" class="header-logo">
                        <img src="../assets/images/logo.png" class="img-fluid rounded-normal light-logo" alt="logo">
                        <img src="../assets/images/logo-white.png" class="img-fluid rounded-normal darkmode-logo"
                             alt="logo">
                    </a>
                </div>

            </nav>
        </div>
    </div>
    <div class="content-page">
        <div class="container-fluid" id="mainpage">

            <!--此处是内容，具体页面  定位-->
            <script language="javascript">
                function logoutConfirm() {
                    if (!confirm("确定要退出账号吗？")) {
                        window.returnValue = false;
                    }
                }
            </script>
            <s:property value="#request.tip"/>
            欢迎您登陆系统，${enterprise.enterpriseId}登陆系统! <br>
            <a href="enterpriseUpdatePage.action">修改、发布企业信息</a> <br>
            <%--待修改--%>
            <a href="departmentPage.action">管理部门信息</a> <br>
            <a href="manageHRPage.action">管理HR信息</a> <br>
            <a href="deleteSession.action" onclick="logoutConfirm()" style="left:200px">退出登录</a>

        </div>
    </div>
</div>
<!-- Wrapper End-->
<footer class="iq-footer">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-6">
                <ul class="list-inline mb-0">
                    <li class="list-inline-item"><a href="privacy-policy.html">Privacy Policy</a></li>
                    <li class="list-inline-item"><a href="terms-of-service.html">Terms of Use</a></li>
                </ul>
            </div>
            <div class="col-lg-6 text-right">
                Copyright 2020 <a href="http://www.bootstrapmb.com/">CloudBOX</a> All Rights Reserved.
            </div>
        </div>
    </div>
</footer>
<!-- Backend Bundle JavaScript -->
<script src="../assets/js/backend-bundle.min.js"></script>

<!-- Chart Custom JavaScript -->
<script src="../assets/js/customizer.js"></script>

<!-- Chart Custom JavaScript -->
<script src="../assets/js/chart-custom.js"></script>


<script src="../assets/js/doc-viewer.js"></script>
<!-- app JavaScript -->
<script src="../assets/js/app.js"></script>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered modal-xl" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Title</h4>
                <div>
                    <a class="btn" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </a>
                </div>
            </div>
            <div class="modal-body">
                <div id="resolte-contaniner" style="height: 500px;" class="overflow-auto">
                    File not found
                </div>
            </div>
        </div>
    </div>
</div>


</body>

<script type="text/javascript">
    function a(url){
        $.get(url,function(data){
            $("#mainpage").html(data)
        });
    }
</script>
</html>