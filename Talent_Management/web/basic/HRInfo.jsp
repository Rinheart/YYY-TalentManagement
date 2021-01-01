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
    <s:form action="TalentUpdate" method="post">
        <s:textfield name="talent.talentId" label="用户名不能修改"
                     value="%{#request.loginUser.account}" readonly="true"/>
        <s:textfield type="password" name="talent.password"
                     label="修改密码" value="%{#request.loginUser.password}"/>
    <!-- 省略其它表单域 -->
        <s:submit value="修改"/>
    </s:form>
    <s:form action="TalentDelete" method="post">
        <s:hidden name="loginUser.customerId"
                  value="%{#request.loginUser.customerId}"/>
        <s:submit value="删除"/>
    </s:form>
    <br>
    <h3>员工管理</h3>
    <a href="HRWorkExperience.action">查看员工工作信息</a><br>
    <a href="">查看员工评价信息</a>
</body>
</html>
