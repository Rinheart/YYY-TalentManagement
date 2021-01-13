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
<script language="javascript">
    function deleteConfirm() {
        if (!confirm("确认删除部门信息吗？")) {
            window.returnValue = false;
        }
    }
</script>

<h6 align="left" >
    <span style="color:#9f94d9; ">${enterprise.enterpriseId}部门管理系统</span>
</h6>
<div style="height: 25px;"></div>
<%--显示各部门信息--%>
<table class="table">
    <tr>
        <th>部门ID</th><th>企业ID</th><th>部门名称</th>
        <th>部门主管</th><th>员工数</th><th>工作描述</th><th>操作</th>
        <%--<th>操作</th>--%>
    </tr>
    <s:iterator value="departmentList" id="department">
        <tr>
            <td><s:property value="#department.departmentId"/></td>
            <td><s:property value="#department.enterpriseId"/></td>
            <td><s:property value="#department.departmentName"/></td>
            <td><s:property value="#department.departmentHead"/></td>
            <td><s:property value="#department.staffNumber"/></td>
            <td><s:property value="#department.jobDescription"/></td>
            <td><a href="#" onclick="a('departmentUpdatePage.action?did=${department.departmentId}');return false;" class="">修改</a></td>
            <%--<td><a href="#" onclick="a('departmentDelete.action?did=${department.departmentId}');return false;" class="">删除</a></td>--%>
        </tr>
    </s:iterator>
</table>
<br>
<a href="#" onclick="a('addDepartmentPage.action');return false;" class="col-3 btn btn-outline-primary">添加部门信息</a>
</body>
</html>
