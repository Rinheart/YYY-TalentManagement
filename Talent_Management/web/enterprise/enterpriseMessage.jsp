<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 小坏坏
  Date: 2020/12/31
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${enterprise.enterpriseId}企业，欢迎您！</title>
</head>
<body>
<script language="javascript">
    function logoutConfirm() {
        if (!confirm("确定要退出账号吗？")) {
            window.returnValue = false;
        }
    }
</script>
<s:property value="#request.tip"/>
欢迎您${enterprise.enterpriseId}，登陆系统! <br>
<a href="enterpriseUpdatePage.action">修改、发布企业信息</a> <br>
<%--待修改--%>
<a href="departmentPage.action">管理部门信息</a> <br>
<a href="manageHRPage.action">管理HR信息</a> <br>
<a href="deleteSession.action" onclick="logoutConfirm()" style="left:200px">退出登录</a>
</body>
</html>
