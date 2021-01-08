<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HR登录成功</title>
</head>
<body>
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
    <a href="HRWorkExperience.action">管理员工工作信息</a><br>
<br>


<br>
<h3>人事管理</h3>
<a href="myWorkExp.action">查看个人工作经历</a><br>
<a href="applyResult.action">查看本人最新人事变动申请结果</a><br><br>

<a href="applyHRCheck.action">管理本公司未批人事变动申请</a><br>
<a href="applyEmploy.action">申请人事变动(会提示HR不能申请)</a>
</body>
</html>
