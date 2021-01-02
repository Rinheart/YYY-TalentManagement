<%--
  Created by IntelliJ IDEA.
  User: Zoe
  Date: 2021/1/2
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>员工工作信息</title>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
</head>
<body>
<h4>员工工作信息</h4>
<table border=1>
    <tr> <th>用户名</th> <th>姓名</th> <th>企业ID</th> <th>企业名称</th> <th>部门</th> <th>入职日期</th> <th>既往评价</th> </tr>
    <s:iterator value="HRworkExperiences" id="object">
        <tr>
            <td><s:property value="#object.talentId"/></td>
            <td><s:property value="#object.name"/></td>
            <td><s:property value="#object.enterpriseId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.startTime"/></td>
            <td><a href="">查看</a></td>
        </tr>
    </s:iterator>
</table>
<br>
<h4>过往员工工作信息</h4>
<table border=1>
    <tr> <th>用户名</th> <th>姓名</th> <th>企业ID</th> <th>企业名称</th> <th>部门</th> <th>入职日期</th> <th>既往评价</th> </tr>
    <s:iterator value="HRworkedExperiences" id="object">
        <tr>
            <td><s:property value="#object.talentId"/></td>
            <td><s:property value="#object.name"/></td>
            <td><s:property value="#object.enterpriseId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.startTime"/></td>
            <td><a href="">查看</a></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>