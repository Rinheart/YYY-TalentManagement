<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>企业信息更新</title>
</head>
<body>
<h2 align="left">
    <span style="color: #9d9d9d; ">企业信息更新</span>
</h2>
<form action="enterpriseUpdate.action" method="post">
    <input type="text"   name="enterprise.enterpriseId" value="${enterprise.enterpriseId}">用户名不能修改  <br>
    <input type="password" name="enterprise.password" value="${enterprise.password}">修改密码  <br>
    <input type="text"   name="enterprise.enterpriseName" value="${enterprise.enterpriseName}">请输入企业名称  <br>
<%--    <input type="date" name="enterprise.establishTime" value="${enterprise.establishTime}">请输入企业成立时间  <br>--%>
    <input type="text" name="enterprise.address" value="${enterprise.address}">请输入企业地址  <br>
<%--    <s:textfield name="enterprise.businessScope" label="请输入企业经营范围"/>--%>
<%--    <s:textfield name="enterprise.enterpriseType" label="请输入企业类型"/>--%>
<%--    <s:textfield name="enterprise.annualTurnover" label="请输入企业年营业额"/>--%>
<%--    <s:textfield name="enterprise.staffNumber" label="请输入职工编号"/>--%>
<%--    <s:textfield name="enterprise.founder" label="请输入企业创建人姓名"/>--%>
<%--    <s:textfield name="enterprise.ceo" label="请输入企业CEO姓名"/>--%>
<%--    <s:textfield name="enterprise.resignNumber" label="请输入企业注册号"/>--%>
<%--    <s:textfield name="enterprise.registrar" label="请输入企业注册地"/>--%>
<%--    <s:textfield name="enterprise.registeredCapital" label="请输入企业注册资本"/>--%>
<%--    <s:textfield name="enterprise.websiteAddress" label="请输入公司主页"/>--%>
<%--    <s:submit value="注册"/> <s:reset value="重置"/>--%>
    <input type="submit">提交修改</input>
</form>
</body>
</html>