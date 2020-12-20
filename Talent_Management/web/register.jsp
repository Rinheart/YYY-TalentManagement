<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
    <title>用户注册</title>
</head>
<body>
<h2 align="left">
    <span style="color: #9d9d9d; ">注册系统</span>
</h2>

<s:form action="register" method="post">
    <s:textfield name="loginUser.account" label="请输入用户名"/>
    <s:password name="loginUser.password" label="请输入密码"/>
    <s:textfield name="loginUser.name" label="请输入真实姓名"/>
    <s:radio name="loginUser.sex" list="#{1 : '男', 0 : '女'}" label="请输入性别"/>

    <s:textfield type="date" name="loginUser.birthday" label="请输入生日"/>

    <s:textfield name="loginUser.address" label="请输入联系地址"/>
    <s:textfield name="loginUser.phone" label="请输入联系电话"/>
    <s:textfield name="loginUser.email" label="请输入电子邮箱"/>

    <s:submit value="注册"/> <s:reset value="重置"/>
</s:form>
</body>
</html>
