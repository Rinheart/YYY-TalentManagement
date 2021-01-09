<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>访问不正确</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="../assets/images/favicon.ico" />

    <link rel="stylesheet" href="../assets/css/backend.min.css">
    <link rel="stylesheet" href="../assets/vendor/@fortawesome/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="../assets/vendor/line-awesome/dist/line-awesome/css/line-awesome.min.css">
    <link rel="stylesheet" href="../assets/vendor/remixicon/fonts/remixicon.css">

    <!-- Viewer Plugin -->
    <!--PDF-->
    <link rel="stylesheet" href="../assets/vendor/doc-viewer/include/pdf/pdf.viewer.css">
    <!--Docs-->
    <!--PPTX-->
    <link rel="stylesheet" href="../assets/vendor/doc-viewer/include/PPTXjs/css/pptxjs.css">
    <link rel="stylesheet" href="../assets/vendor/doc-viewer/include/PPTXjs/css/nv.d3.min.css">
    <!--All Spreadsheet -->
    <link rel="stylesheet" href="../assets/vendor/doc-viewer/include/SheetJS/handsontable.full.min.css">
    <!--Image viewer-->
    <link rel="stylesheet" href="../assets/vendor/doc-viewer/include/verySimpleImageViewer/css/jquery.verySimpleImageViewer.css">
    <!--officeToHtml-->
    <link rel="stylesheet" href="../assets/vendor/doc-viewer/include/officeToHtml/officeToHtml.css">  </head>
<body class=" ">
<!-- loader Start -->
<div id="loading">
    <div id="loading-center">
    </div>
</div>
<!-- loader END -->

<div class="wrapper">
    <div class="container">
        <div class="row no-gutters height-self-center">
            <div class="col-sm-12 text-center align-self-center">
                <div class="iq-error position-relative">
                    <img src="../assets/images/error/500.png" class="img-fluid iq-error-img" alt="">
                    <h2 class="mb-0">页面出错</h2>
                    <p>服务器最近提示：<s:property value="#request.tip"/></p>

                </div>
            </div>
        </div>
    </div>
</div>

<!-- Backend Bundle JavaScript -->
<script src="../assets/js/backend-bundle.min.js"></script>

<!-- Chart Custom JavaScript -->
<script src="../assets/js/customizer.js"></script>

<!-- Chart Custom JavaScript -->
<script src="../assets/js/chart-custom.js"></script>

<!--PDF-->
<script src="../assets/vendor/doc-viewer/include/pdf/pdf.js"></script>
<!--Docs-->
<script src="../assets/vendor/doc-viewer/include/docx/jszip-utils.js"></script>
<script src="../assets/vendor/doc-viewer/include/docx/mammoth.browser.min.js"></script>
<!--PPTX-->
<script src="../assets/vendor/doc-viewer/include/PPTXjs/js/filereader.js"></script>
<script src="../assets/vendor/doc-viewer/include/PPTXjs/js/d3.min.js"></script>
<script src="../assets/vendor/doc-viewer/include/PPTXjs/js/nv.d3.min.js"></script>
<script src="../assets/vendor/doc-viewer/include/PPTXjs/js/pptxjs.js"></script>
<script src="../assets/vendor/doc-viewer/include/PPTXjs/js/divs2slides.js"></script>
<!--All Spreadsheet -->
<script src="../assets/vendor/doc-viewer/include/SheetJS/handsontable.full.min.js"></script>
<script src="../assets/vendor/doc-viewer/include/SheetJS/xlsx.full.min.js"></script>
<!--Image viewer-->
<script src="../assets/vendor/doc-viewer/include/verySimpleImageViewer/js/jquery.verySimpleImageViewer.js"></script>
<!--officeToHtml-->
<script src="../assets/vendor/doc-viewer/include/officeToHtml/officeToHtml.js"></script>
<script src="../assets/js/doc-viewer.js"></script>
<!-- app JavaScript -->
<script src="../assets/js/app.js"></script>
</body>
</html>