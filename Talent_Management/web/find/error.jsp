<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>访问失败</title>
</head>
<body>
您的权限不足，或请求有误，请返回<br>
提示信息：<br>
<s:property value="#request.tip"/>
</body>
</html>
