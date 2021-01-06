<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 小坏坏
  Date: 2021/1/5
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门管理页面</title>
</head>
<body>
<h1>${enterprise.enterpriseId}部门管理系统</h1>
<%--显示各部门信息--%>
<table border=1>
    <s:iterator value="departmentList" id="department">
        <tr>
            <td><s:property value="#department.departmentId"/></td>
            <td><s:property value="#department.enterpriseID"/></td>
            <td><s:property value="#department.departmentName"/></td>
            <td><s:property value="#department.departmentHead"/></td>
            <td><s:property value="#department.staffNumber"/></td>
            <td><s:property value="#department.jobDescription"/></td>
        </tr>
    </s:iterator>
</table>
<%--点击添加部门信息--%>
<a href="addDepartmentPage.action">添加部门信息</a>
</body>
</html>
