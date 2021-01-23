<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>已离职员工工作信息</title>
</head>
<body>
<h4>已离职员工工作信息</h4>
<table class="table">
    <tr> <th>用户名</th> <th>姓名</th> <th>企业ID</th> <th>企业名称</th> <th>部门</th> <th>入职日期</th>
        <th>离职日期</th> <th>过去工作经历</th> <th>过去工作表现</th> <th>过去工作评价</th> </tr>
    <s:iterator value="HRworkedExperiences" id="object">
        <tr>
            <td><s:property value="#object.talentId"/></td>
            <td><s:property value="#object.name"/></td>
            <td><s:property value="#object.enterpriseId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.startTime"/></td>
            <td><s:property value="#object.endTime"/></td>
            <td><%--<a href="HRWorkedExperiences.action?p_talentId=${object.talentId}&p_enterpriseId=${object.enterpriseId}">查看</a>--%>
                <a href="#" onclick="a('HRWorkedExperiences.action?p_talentId=${object.talentId}&p_enterpriseId=${object.enterpriseId}');
                return false;">查看</a>
            </td>
            <td><%--<a href="HRWorkedPerformance.action?p_talentId=${object.talentId}&p_enterpriseId=${object.enterpriseId}">查看</a>--%>
                <a href="#" onclick="a('HRWorkedPerformance.action?p_talentId=${object.talentId}&p_enterpriseId=${object.enterpriseId}');
                        return false;">查看</a>
            </td>
            <td><%--<a href="HRWorkedEvaluate.action?p_talentId=${object.talentId}&p_enterpriseId=${object.enterpriseId}">查看</a>--%>
                <a href="#" onclick="a('HRWorkedEvaluate.action?p_talentId=${object.talentId}&p_enterpriseId=${object.enterpriseId}');
                        return false;">查看</a>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
