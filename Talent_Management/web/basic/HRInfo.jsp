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
    <h3>个人</h3>
    <a href="updatePage.action">修改个人信息</a>
    <br>
    <h3>员工管理</h3>
    <a href="HRWorkExperience.action">管理员工工作信息</a><br>
<br>
<a href="applyHRCheck.action">管理本公司人事变动申请</a>

<br>
<h3>新功能</h3>
<a href="myWorkExp.action">查看个人工作经历</a>

<h3>个人管理</h3>
<a href="applyResult.action">查看本人最新人事变动申请结果</a>
<a href="applyEmploy.action">申请人事变动(会提示HR不能申请)</a>
</body>
</html>
