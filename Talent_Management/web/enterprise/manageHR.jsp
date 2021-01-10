<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 小坏坏
  Date: 2021/1/5
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HR信息管理页面</title>
</head>
<body>
<h1></h1>
<h6 align="left" >
    <span style=" color:#9f94d9;text-align: center;">注意：身份标识位中"2"代表HR，"4"代表既是HR又是部门主管</span>
</h6>
<div style="height: 25px;"></div>
<%--通过改变人才标识来实现HR管理的功能--%>
<table class="table">
    <tr>
        <th>用户名</th>  <th>姓名</th> <th>企业</th>
        <th>身份</th><th>操作</th>
    </tr>
    <s:iterator value="HRList" id="HR">
        <tr>
            <td><s:property value="#HR.talentId"/></td>
            <td><s:property value="#HR.name"/></td>
            <td><s:property value="#HR.enterpriseId"/></td>
            <td><s:property value="#HR.identity"/> </td>
            <td>
                <a href="#" onclick="a('alterHRPage.action?tid=${HR.talentId}');return false;" class="">修改</a>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
