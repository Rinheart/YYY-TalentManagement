<%--
  Created by IntelliJ IDEA.
  User: 小坏坏
  Date: 2021/1/9
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改部门信息</title>
</head>
<body>
<script language="javascript">
    function alterConfirm() {
        if (!confirm("确认修改部门信息吗？")) {
            window.returnValue = false;
        }
    }
</script>
<form action="departmentUpdate.action" method="post">
    请输入部门ID:<input type="text" name="department.departmentId" value="${department.departmentId}">  <br>
    请输入企业ID:<input type="text" name="department.enterpriseId" value="${enterprise.enterpriseId}">  <br>
    请输入部门名称<input type="text" name="department.departmentName" value="${department.departmentName}">  <br>
    请输入部门主管<input type="text" name="department.departmentHead" value="${department.departmentHead}">  <br>
    请输入员工数<input type="text" name="department.staffNumber" value="${department.staffNumber}"> <br>
    请输入工作描述<input type="text" name="department.jobDescription" value="${department.jobDescription}">  <br>
    <button type="submit" onclick="alterConfirm()">修改信息</button>
</form>
</body>
</html>
