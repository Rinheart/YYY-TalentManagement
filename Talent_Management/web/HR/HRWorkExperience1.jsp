<%--
  Created by IntelliJ IDEA.
  User: Zoe
  Date: 2021/1/9
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>已离职员工工作信息</title>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
</head>
<body>
<h4>已离职员工工作信息</h4>
<table border=1>
    <tr> <th>用户名</th> <th>姓名</th> <th>企业ID</th> <th>企业名称</th> <th>部门</th> <th>入职日期</th>
        <th>过去工作经历</th> <th>过去工作表现</th> <th>过去工作评价</th> </tr>
    <s:iterator value="HRworkedExperiences" id="object">
        <tr>
            <td><s:property value="#object.talentId"/></td>
            <td><s:property value="#object.name"/></td>
            <td><s:property value="#object.enterpriseId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.startTime"/></td>
            <td><a href="HRWorkedExperiences.action?p_talentId=${object.talentId}&p_enterpriseId=${object.enterpriseId}">查看</a></td>
            <td><a href="HRWorkedPerformance.action?p_talentId=${object.talentId}&p_enterpriseId=${object.enterpriseId}">查看</a></td>
            <td><a href="HRWorkedEvaluate.action?p_talentId=${object.talentId}&p_enterpriseId=${object.enterpriseId}">查看</a></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
