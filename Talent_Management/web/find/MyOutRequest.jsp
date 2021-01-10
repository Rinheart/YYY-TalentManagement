<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的申请页面</title>
</head>
<body>
您好${talent.talentId}，${ap_tip}${myEntName}
<br>
${tip}<br>
<s:debug></s:debug>
<br>我在当前公司的入职信息
<table class="table">

    <tr>
        <th>用户名</th>
        <th>姓名</th>
        <th>企业ID</th>
        <th>企业名称</th>
        <th>部门</th>
        <th>入职日期</th>
    </tr>
    <tr>
        <td>${workExperience.talentId}</td>
        <td>${workExperience.name}</td>
        <td>${workExperience.enterpriseId}</td>
        <td>${workExperience.enterpriseName}</td>
        <td>${workExperience.departmentName}</td>
        <td>${workExperience.startTime}</td>
    </tr>
</table>

<%--<a href="applyOut.action?talentId=${talent.talentId}">申请离职</a>--%>
<a href="#" onclick="a('applyOut.action?talentId=${talent.talentId}');return false;">申请离职</a>
</body>
</html>
