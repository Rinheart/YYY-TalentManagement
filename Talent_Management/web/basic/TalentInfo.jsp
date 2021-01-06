<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人才登录成功</title>
</head>
<body>
登录成功,欢迎您！
<s:property value="%{talent.name}" />
<br>
您的身份为：
<s:property value="%{talent.identity}" />
<br>
request tip:
<s:property value="#request.tip"/>

<br>

<h3>员工管理</h3>
<a href="updatePage.action">修改个人信息</a>
<a href="myWorkExp.action">查看个人工作经历(申请变动)</a>


</body>
</html>
