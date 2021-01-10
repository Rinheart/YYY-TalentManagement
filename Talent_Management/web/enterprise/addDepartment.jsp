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
<form class="col-12" action="addDepartment.action" method="post">
    请输入部门ID:<input class="form-control col-6" type="text" name="department.departmentId">  <br>
    请输入企业ID:<input class="form-control col-6" type="text" name="department.enterpriseId" value="${enterprise.enterpriseId}" readonly>  <br>
    请输入部门名称:<input class="form-control col-6" type="text" name="department.departmentName" >  <br>
    请输入部门主管:<input class="form-control col-6" type="text" name="department.departmentHead" >  <br>
    请输入员工数:<input class="form-control col-6" type="text" name="department.staffNumber" >  <br>
    请输入工作描述:<input class="form-control col-6" type="text" name="department.jobDescription" >  <br>
    <button type="submit" class="col-6 btn btn-outline-primary">添加信息</button>
</form>
</body>
</html>
