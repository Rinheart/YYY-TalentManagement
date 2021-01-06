<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人事变动管理</title>
</head>
<body>
<h4>我的人事变动申请</h4>
欢迎您，${talent.name}！您目前是${myEntName}公司的员工<br>

<s:debug></s:debug>

<table border=1>
    <tr>
        <th>申请号</th>
        <th>申请人ID</th>
        <th>申请类型</th>
        <th>企业名称</th>
        <th>部门</th>
        <th>申请时间</th>
        <th>申请结果</th>
        <th>审核人</th>
        <th>审核时间</th>
    </tr>
        <tr>
            <td><s:property value="applicate.applicateId"/></td>
            <td><s:property value="applicate.talentId"/></td>
            <td><s:property value="applicate.applicateType"/></td>
            <td><s:property value="applicate.enterpriseId"/></td>
            <td><s:property value="applicate.departmentId"/></td>
            <td><s:property value="applicate.applicateTime"/></td>
            <td><s:property value="applicate.applicateResult"/></td>
            <td><s:property value="applicate.hrReview"/></td>
            <td><s:property value="applicate.reviewTime"/></td>
        </tr>
</table>

</body>
</html>

