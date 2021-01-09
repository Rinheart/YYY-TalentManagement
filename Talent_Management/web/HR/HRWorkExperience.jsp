<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>员工工作信息</title>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
    <link rel="shortcut icon" href="assets/images/favicon.ico" />
    <link rel="stylesheet" href="assets/css/backend.min.css">
    <link rel="stylesheet" href="assets/vendor/@fortawesome/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="assets/vendor/line-awesome/dist/line-awesome/css/line-awesome.min.css">
    <link rel="stylesheet" href="assets/vendor/remixicon/fonts/remixicon.css">
</head>
<body>
<h4>员工工作信息</h4>
<table border=1>
    <tr> <th>用户名</th> <th>姓名</th> <th>企业ID</th> <th>企业名称</th> <th>部门</th> <th>入职日期</th>
        <th>既往工作经历</th> <th>工作表现</th> <th>工作评价</th> </tr>
    <s:iterator value="HRworkExperiences" id="object">
        <tr>
            <td><s:property value="#object.talentId"/></td>
            <td><s:property value="#object.name"/></td>
            <td><s:property value="#object.enterpriseId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.startTime"/></td>
            <td><a href="HRWorkedExperience.action?p_talentId=${object.talentId}">查看</a></td>
            <td><a href="HRWorkPerformance.action?p_talentId=${object.talentId}">管理</a></td>
            <td><a href="HRWorkEvaluate.action?p_talentId=${object.talentId}">管理</a></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
