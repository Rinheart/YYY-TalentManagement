<%--
  Created by IntelliJ IDEA.
  User: 小坏坏
  Date: 2021/1/6
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加部门信息</title>
</head>
<body>
<form action="addDepartment.action" method="post">
    请输入部门ID:<input type="text" name="department.departmentId">  <br>
    请输入企业ID:<input type="text" name="department.enterpriseId" value="${enterprise.enterpriseId}">  <br>
    请输入部门名称<input type="text" name="department.departmentName">  <br>
    请输入部门主管<input type="text" name="department.departmentHead">  <br>
    请输入员工数<input type="text" name="department.staffNumber">  <br>
    请输入工作描述<input type="text" name="department.jobDescription">  <br>
    <button type="submit">添加信息</button>
</form>
</body>
</html>
