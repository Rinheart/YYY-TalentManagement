<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人事变动管理</title>
</head>
<body>
<h4>本公司人事变动列表</h4>
欢迎您，${talent.name}！您是${myEntName}公司的HR<br>


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
        <%--<th>审核人</th>
        <th>审核时间</th>--%>
        <th>审核操作</th>
    </tr>
    <s:iterator value="applicateList">
        <tr>
            <td><s:property value="applicateId"/></td>
            <td><s:property value="talentId"/></td>
            <td><s:property value="applicateType"/></td>
            <td><s:property value="enterpriseId"/></td>
            <td><s:property value="departmentId"/></td>
            <td><s:property value="applicateTime"/></td>
            <td><s:property value="applicateResult"/></td>
            <%--<td><s:property value="hrReview"/></td>
            <td><s:property value="reviewTime"/></td>--%>
            <td><a href="applyHRReview.action?Id=${applicateId}&Result=true">通过</a>
            <a href="applyHRReview.action?Id=${applicateId}&Result=false">拒绝</a></td>
        </tr>
    </s:iterator>
</table>

</body>
</html>

