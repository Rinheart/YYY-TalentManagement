<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门主管登录成功</title>
</head>
<body>
登录成功,欢迎您!
<br>
<a href="./allItems">查看所有商品详情信息</a>
<br>
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


</body>
</html>
