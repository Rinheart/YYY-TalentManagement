<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人事变动管理</title>
</head>
<body>
<h4>本公司人事变动历史</h4>
欢迎您，${talent.name}！您是${myEntName}公司的HR<br>


<s:debug></s:debug>

<table class="table">
    <tr>
        <th>申请编号</th>
        <th>申请人ID</th>
        <th>申请类型</th>
        <th>企业名称</th>
        <th>部门</th>
        <th>申请时间</th>
        <th>申请结果</th>
    </tr>
    <s:iterator value="applicateList">
        <tr>
            <td><s:property value="applicateId"/></td>
            <td><s:property value="talentId"/></td>
            <td>
                <s:if test="applicateType==false">离职</s:if>
                <s:elseif test="applicateType==true">入职</s:elseif>
            </td>
            <td><s:property value="enterpriseId"/></td>
            <td><s:property value="departmentId"/></td>
            <td><s:property value="applicateTime"/></td>
            <td>
                <s:if test="applicateResult==false">未通过</s:if>
                <s:elseif test="applicateResult==true">已通过</s:elseif>
                <s:elseif test="applicateResult==null">未审核</s:elseif>
            </td>

        </tr>
    </s:iterator>
</table>

</body>
</html>

