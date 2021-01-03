<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HR登录成功</title>
</head>
<body>
登录成功,欢迎您!<br>
<br>
request tip:
<s:property value="#request.tip"/><p>
    修改个人信息

<p>
    <h3>员工管理</h3>
    <a href="updatePage.action">修改个人信息</a>
    <br>
    <h3>员工管理</h3>
    <a href="HRWorkExperience.action">查看员工工作信息</a><br>
    <a href="">查看员工评价信息</a>
</body>
</html>
