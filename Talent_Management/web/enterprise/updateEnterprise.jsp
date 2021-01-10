<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>企业信息更新</title>
</head>
<body>
<h6 align="left" >
    <span style="color: #9f94d9; ">企业信息更新</span>
</h6>
<div style="height:25px;"></div>
<form class="col-12" action="enterpriseUpdate.action" method="post">用户名（不可修改）
    <input class="form-control col-6" type="text" readonly name="enterprise.enterpriseId" value="${enterprise.enterpriseId}"> 修改密码
    <input class="form-control col-6" type="password" name="enterprise.password" value="${enterprise.password}">请输入企业名称
    <input class="form-control col-6" type="text"   name="enterprise.enterpriseName" value="${enterprise.enterpriseName}"> 请输入企业地址
<%--    <input class="form-control col-6" type="text" name="enterprise.address" value="${enterprise.address}">请输入企业经营范围--%>
<%--    <input class="form-control col-6" type="text" name="enterprise.businessScope" value="${enterprise.businessScope}">请输入企业类型--%>
<%--    <input class="form-control col-6" type="text" name="enterprise.enterpriseType" value="${enterprise.enterpriseType}">请输入企业年营业额--%>
<%--    <input class="form-control col-6" type="text" name="enterprise.annualTurnover" value="${enterprise.annualTurnover}">请输入企业CEO姓名--%>
<%--    <input class="form-control col-6" type="text" name="enterprise.ceo" value="${enterprise.ceo}">请输入公司主页--%>
<%--    <input class="form-control col-6" type="text" name="enterprise.websiteAddress" value="${enterprise.websiteAddress}">--%>
<%--    <div style="height: 15px;"></div> --%>
    <br>
    <input class="col-6 btn btn-outline-primary" type="submit" value="确认修改">
</form>
</body>
</html>