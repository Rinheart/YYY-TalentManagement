<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>小微企业跨组织人才管理系统</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="assets/images/favicon.ico"/>

    <link rel="stylesheet" href="assets/css/backend.min.css">
    <link rel="stylesheet" href="assets/vendor/@fortawesome/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="assets/vendor/line-awesome/dist/line-awesome/css/line-awesome.min.css">
    <link rel="stylesheet" href="assets/vendor/remixicon/fonts/remixicon.css">

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
                <img src="assets/images/logo.png" class="img-fluid rounded-normal light-logo" alt="logo">
                <img src="assets/images/logo-white.png" class="img-fluid rounded-normal darkmode-logo" alt="logo">
            </a>
            <div class="iq-menu-bt-sidebar">
                <i class="las la-bars wrapper-menu"></i>
            </div>
        </div>
        <div class="data-scrollbar" data-scroll="1">
            <nav class="iq-sidebar-menu">
                <ul id="iq-sidebar-toggle" class="iq-menu">
                    <!--此处是导航  定位-->
                    <li class="active" >
                        <a href="loginPage.action" class="">
                            <i class="las la-home iq-arrow-left"></i><span>HR主页</span>
                        </a>
                        <ul id="dashboard" class="iq-submenu collapse" data-parent="#iq-sidebar-toggle">
                        </ul>
                    </li>
                    <li class=" ">
                        <a href="#" onclick="a('updatePage.action')" class="">
                            <i class="lar la-file-alt iq-arrow-left"></i><span>个人信息管理</span>
                        </a>
                        <ul id="page-files" class="iq-submenu collapse" data-parent="#iq-sidebar-toggle">
                        </ul>
                    </li>

                    <li class=" ">
                        <a href="#mydrive" class="collapsed" data-toggle="collapse" aria-expanded="false">
                            <i class="las la-hdd"></i><span>人事管理</span>
                            <i class="las la-angle-right iq-arrow-right arrow-active"></i>
                            <i class="las la-angle-down iq-arrow-right arrow-hover"></i>
                        </a>
                        <ul id="mydrive" class="iq-submenu collapse" data-parent="#iq-sidebar-toggle">
                            <!--定位 此处是小下拉框-->
                            <li class=" ">
                                <a href="#" onclick="a('myWorkExp.action')">
                                    <i class="lab la-blogger-b"></i><span>个人工作经历</span>
                                </a>
                            </li>
                            <li class=" ">
                                <a href="#" onclick="a('applyResult.action')">
                                    <i class="las la-share-alt"></i><span>人事申请结果</span>
                                </a>
                            </li>
                            <li class=" ">
                                <a href="#" onclick="a('applyEmploy.action')">
                                    <i class="las la-icons"></i><span>申请人事变动</span>
                                </a>
                            </li>
                            <li class=" ">
                                <a href="#" onclick="a('applyEmploy.action')">
                                    <i class="las la-bomb"></i><span>管理公司人事变动</span>
                                </a>
                            </li>
                        </ul>
                    </li>

                    <li class=" ">
                        <a href="#otherpage" class="collapsed" data-toggle="collapse" aria-expanded="false">
                            <i class="lab la-wpforms iq-arrow-left"></i><span>员工管理</span>
                            <i class="las la-angle-right iq-arrow-right arrow-active"></i>
                            <i class="las la-angle-down iq-arrow-right arrow-hover"></i>
                        </a>
                        <ul id="otherpage" class="iq-submenu collapse" data-parent="#iq-sidebar-toggle">
                            <li class=" ">
                                <a href="#" onclick="a('HRWorkExperience.action')">
                                    <i class="las la-id-card"></i><span>管理人才档案</span>
                                </a>
                            </li>
                            <li class=" ">
                                <a href="#" onclick="a('HRWorkedExperiences.action')">
                                    <i class="las la-pager"></i><span>已离职员工既往工作经历</span>
                                </a>
                            </li>
                            <li class=" ">
                                <a href="#" onclick="a('HRWorkedExperience.action')">
                                    <i class="las la-cubes"></i><span>某员工既往工作经历</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class=" ">
                        <a href="basic/login.jsp" class="">
                            <i class="lar la-file-alt iq-arrow-left"></i><span>退出</span>
                        </a>
                        <ul id="" class="iq-submenu collapse" data-parent="#iq-sidebar-toggle">
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
                        <img src="assets/images/logo.png" class="img-fluid rounded-normal light-logo" alt="logo">
                        <img src="assets/images/logo-white.png" class="img-fluid rounded-normal darkmode-logo"
                             alt="logo">
                    </a>
                </div>

            </nav>
        </div>
    </div>
    <div class="content-page" id="mainpage">
        <!--此处是内容，具体页面  定位-->
        <!--<a href="#" onclick="a('HRInfo.jsp')">北京</a><br/>-->
        <%--<dev id="mainpage"></dev>--%>
        登录成功,欢迎您!
        <s:property value="%{talent.name}" />
        <br>
        您的身份为：
        <%--<s:property value="%{talent.identity}" />--%>
        <s:if test="talent.identity == 0">待业</s:if>
        <s:if test="talent.identity == 1">在职</s:if>
        <s:if test="talent.identity == 2">HR</s:if>
        <br>
        提示信息:
        <s:property value="#request.tip"/>


        <h3>信息管理</h3>
        <a href="updatePage.action">修改个人信息</a>
        <br>
        <h3>员工管理</h3>
        <a href="HRWorkExperience.action">员工工作信息管理</a><br>
        <a href="HRWorkExperience1.action">已离职员工工作信息</a><br>
        <br>


        <br>
        <h3>人事管理</h3>
        <a href="myWorkExp.action">查看个人工作经历</a><br>
        <a href="applyResult.action">查看本人最新人事变动申请结果</a><br><br>

        <a href="applyHRCheck.action">管理本公司未批人事变动申请</a><br>
        <a href="applyEmploy.action">申请人事变动(会提示HR不能申请)</a>


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
<script src="assets/js/backend-bundle.min.js"></script>

<!-- Chart Custom JavaScript -->
<script src="assets/js/customizer.js"></script>

<!-- Chart Custom JavaScript -->
<script src="assets/js/chart-custom.js"></script>


<script src="assets/js/doc-viewer.js"></script>
<!-- app JavaScript -->
<script src="assets/js/app.js"></script>
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

