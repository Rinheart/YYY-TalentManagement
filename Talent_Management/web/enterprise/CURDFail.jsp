<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 小坏坏
  Date: 2020/12/31
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新或删除失败</title>
</head>
<body>
<s:property value="#request.tip"/>

<a href="#" onClick="javascript :history.back(-1);return false;">返回</a>
</body>
</html>
