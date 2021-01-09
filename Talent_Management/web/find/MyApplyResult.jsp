<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人事变动管理</title>
</head>
<body>
<h4>我的人事变动申请</h4>
欢迎您，${talent.name}！您目前是所在公司：${myEntName} <br>

<s:debug></s:debug>

<table border=1>
    <tr>
        <th>申请编号</th>
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
            <td>
                <s:if test="applicate.applicateType==false">离职</s:if>
                <s:elseif test="applicate.applicateType==true">入职</s:elseif>
            </td>
            <td><s:property value="applicate.enterpriseId"/></td>
            <td><s:property value="applicate.departmentId"/></td>
            <td><s:property value="applicate.applicateTime"/></td>
            <td>
                <s:if test="applicate.applicateResult==false">未通过</s:if>
                <s:elseif test="applicate.applicateResult==true">已通过</s:elseif>
                <s:elseif test="applicate.applicateResult==null">未审核</s:elseif>
            </td>
            <td><s:property value="applicate.hrReview"/></td>
            <td><s:property value="applicate.reviewTime"/></td>
        </tr>
</table>

</body>
</html>

