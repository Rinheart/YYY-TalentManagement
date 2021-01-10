<%--
  Created by IntelliJ IDEA.
  User: 小坏坏
  Date: 2021/1/7
  Time: 2:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改人事信息</title>
</head>
<body>
<script language="javascript">
    function alterConfirm() {
        if (!confirm("确认修改HR信息吗？")) {
            window.returnValue = false;
        }
    }
</script>
<h6 align="left" >
    <span style="color:#9f94d9">注意:身份标识位中"1"代表普通员工，"2"代表HR，"4"代表既是HR又是部门主管</span>
</h6>
<div style="height: 25px;"></div>

<form class="col-12" action="alterHR.action" method="post">
    用户名:<input class="form-control col-6" type="text" name="talent.talentId" value="${talent.talentId}" readonly>  <br>
    姓名:<input class="form-control col-6" type="text" name="talent.name" value="${talent.name}" readonly>  <br>
<%--    请输入所在企业:<input type="text" name="talent.enterpriseId" value="${talent.enterpriseId}">  <br>--%>
    请选择身份:<br>
    <input  type="radio" name="talent.identity" value="1">普通员工
    <input  type="radio" name="talent.identity" value="2">HR
    <input  type="radio" name="talent.identity" value="3">主管
    <input  type="radio" name="talent.identity" value="4">HR兼主管 <br>
    <input class="col-6 btn btn-outline-primary" type="submit" onclick="alterConfirm()" value="修改信息">
</form>
</body>
</html>
