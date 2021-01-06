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
<%--通过改变人才标识来实现HR管理的功能--%>
<table border=1>
    <tr>
        <th>用户名</th> <th>密码</th> <th>姓名</th> <th>性别（0女，1男）</th>
        <th>身份证号</th> <th>出生日期</th> <th>联系电话</th> <th>家庭住址</th>
        <th>学历</th> <th>个人简介</th> <th>信息审核情况（0尚未通过，1已通过）</th>
        <th>身份（2HR，4既是HR又是部门主管）</th>
    </tr>
    <s:iterator value="HRList" id="talent">
        <tr>
            <td><s:property value="#talent.talentId"/></td>
<%--            以下存疑--%>
<%--            <td><s:hidden value="#talent.password" /></td>--%>
<%--            <td><s:hidden name="#talent.password" /></td>--%>
            <td><s:property value="#talent.name"/></td>
            <td><s:property value="#talent.sex"/></td>
            <td><s:property value="#talent.idNumber"/></td>
<%--            日期类型？--%>
            <td><s:property value="#talent.birthday"/></td>
            <td><s:property value="#talent.phoneNumber"/></td>
            <td><s:property value="#talent.address"/></td>
            <td><s:property value="#talent.education"/></td>
            <td><s:property value="#talent.personalProfile"/></td>
            <td><s:property value="#talent.informationReview"/></td>
            <td><s:property value="#talent.identity"/></td>
        </tr>
    </s:iterator>
<%--待补充修改信息--%>
</table>
</body>
</html>
