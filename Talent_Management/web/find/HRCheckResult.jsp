<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人事变动管理</title>
</head>
<body>
<h4>本公司人事变动列表</h4>
<s:property value="%{talent.name}" />###
<s:property value="talent.name" />###
<s:property value="#session.talent.name" />

<br>
<s:property value="#session.applicateList"/>
###
<s:property value="applicateList"/>
<table border=1>
    <tr> <th>用户名</th> <th>姓名</th> <th>企业ID</th> <th>企业名称</th> <th>部门</th> <th>入职日期</th> <th>离职日期</th><th>离职日期</th><th>离职日期</th> </tr>
    <s:iterator value="applicateList">
        <tr>
            <td><s:property value="applicationId"/></td>
            <td><s:property value="workExperienceId"/></td>
            <td><s:property value="applicateType}"/></td>
            <td><s:property value="enterpriseId"/></td>
            <td><s:property value="departmentId"/></td>
            <td><s:property value="applicateTime"/></td>
            <td><s:property value="applicateResult"/></td>
            <td><s:property value="hrReview"/></td>
            <td><s:property value="reviewTime"/></td>
        </tr>
    </s:iterator>
</table>

</body>
</html>
