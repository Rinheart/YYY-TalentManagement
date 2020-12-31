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
    <s:textfield name="talent.talentId" label="请输入用户名"/>
    <s:password name="talent.password" label="请输入密码"/>
    <s:textfield name="talent.name" label="请输入真实姓名"/>
    <s:radio name="talent.sex" list="#{true : '男', false : '女'}" label="请输入性别"/>
    <s:textfield name="talent.idNumber" label="请输入身份证"/>
    <s:textfield type="date" name="talent.birthday" label="请输入生日"/>
    <s:textfield name="talent.phoneNumber" label="请输入联系电话"/>
    <s:textfield name="talent.address" label="请输入联系地址"/>
    <s:textfield name="talent.education" label="请输入学历"/>
    <s:textfield name="talent.personalProfile" label="请输入个人简介"/>

    <s:radio name="talent.identity" list="#{1 : '在职', 0 : '待业'}" label="请输入就业状况"/>

    <s:submit value="注册"/> <s:reset value="重置"/>
</s:form>
</body>
</html>
