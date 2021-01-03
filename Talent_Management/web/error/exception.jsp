<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>访问不正确</title>
</head>
<body>
<h1>Exception错误提示页</h1>
<br>
最近的request tip提示：<br>
<s:property value="#request.tip"/>
</body>
</html>
