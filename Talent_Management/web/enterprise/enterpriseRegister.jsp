<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
    <title>企业用户注册</title>
</head>
<body>
<h2 align="left">
    <span style="color: #9d9d9d; ">企业用户注册系统</span>
</h2>
<s:form action="enterpriseRegister" method="post">
    <s:textfield name="enterprise.enterpriseId" label="请输入企业账号"/>
    <s:password name="enterprise.password" label="请输入密码"/>
    <s:textfield name="enterprise.enterpriseName" label="请输入企业姓名"/>
    <s:textfield type="date" name="enterprise.establishTime"  label="请输入企业成立时间"/>
    <s:textfield name="enterprise.address" label="请输入企业地址"/>
    <s:textfield name="enterprise.businessScope" label="请输入企业经营范围"/>
    <s:textfield name="enterprise.enterpriseType" label="请输入企业类型"/>
    <s:textfield name="enterprise.annualTurnover" label="请输入企业年营业额"/>
    <s:textfield name="enterprise.staffNumber" label="请输入职工编号"/>
    <s:textfield name="enterprise.founder" label="请输入企业创建人姓名"/>
    <s:textfield name="enterprise.ceo" label="请输入企业CEO姓名"/>
    <s:textfield name="enterprise.resignNumber" label="请输入企业注册号"/>
    <s:textfield name="enterprise.registrar" label="请输入企业注册地"/>
    <s:textfield name="enterprise.registeredCapital" label="请输入企业注册资本"/>
    <s:textfield name="enterprise.websiteAddress" label="请输入公司主页"/>
    <s:submit value="注册"/> <s:reset value="重置"/>
</s:form>
</body>
</html>
