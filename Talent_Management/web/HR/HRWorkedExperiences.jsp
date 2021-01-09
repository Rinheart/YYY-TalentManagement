<%--
  Created by IntelliJ IDEA.
  User: Zoe
  Date: 2021/1/4
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>过往员工过去工作经历</title>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
    <link rel="shortcut icon" href="assets/images/favicon.ico" />

    <link rel="stylesheet" href="assets/css/backend.min.css">
    <link rel="stylesheet" href="assets/vendor/@fortawesome/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="assets/vendor/line-awesome/dist/line-awesome/css/line-awesome.min.css">
    <link rel="stylesheet" href="assets/vendor/remixicon/fonts/remixicon.css">
</head>
<body>
<h4>已离职员工过去工作经历</h4>
<table border=1>
    <tr> <th>用户名</th> <th>姓名</th> <th>企业ID</th> <th>企业名称</th> <th>部门</th> <th>入职日期</th> <th>离职日期</th> </tr>
    <s:iterator value="workExperiences" id="object">
        <tr>
            <td><s:property value="#object.talentId"/></td>
            <td><s:property value="#object.name"/></td>
            <td><s:property value="#object.enterpriseId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.startTime"/></td>
            <td><s:property value="#object.endTime"/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
