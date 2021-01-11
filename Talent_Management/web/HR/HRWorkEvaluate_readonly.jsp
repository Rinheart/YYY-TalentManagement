<%--
  Created by IntelliJ IDEA.
  User: Zoe
  Date: 2021/1/7
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>工作评价</title>
</head>
<body>

<br>
<h4>绩效评价</h4>
<table class="table">
    <tr> <th>编号</th> <th>企业</th> <th>部门</th> <th>阶段工作内容</th> <th>阶段工作起始时间</th>
        <th>阶段工作结束时间</th> <th>评分</th> <th>评语</th> <th>评价者</th> <th>评价时间</th> </tr>
    <s:iterator value="achievement" id="object">
        <tr>
            <td><s:property value="#object.achievementId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.content"/></td>
            <td><s:property value="#object.startTime"/></td>
            <td><s:property value="#object.endTime"/></td>
            <td><s:property value="#object.achievementScore"/></td>
            <td><s:property value="#object.achievementComment"/></td>
            <td><s:property value="#object.recorderName"/></td>
            <td><s:property value="#object.recordTime"/></td>
        </tr>
    </s:iterator>
</table>
<br>
<hr>

<br>
<h4>主观评价</h4>
<table class="table">
    <tr> <th>编号</th> <th>企业</th> <th>部门</th> <th>阶段工作内容</th> <th>阶段工作起始时间</th>
        <th>阶段工作结束时间</th> <th>评分</th> <th>评语</th> <th>评价者</th> <th>评价时间</th> </tr>
    <s:iterator value="evaluate" id="object">
        <tr>
            <td><s:property value="#object.evaluateId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.valuatorName"/></td>
            <td><s:property value="#object.totalScore"/></td>
            <td><s:property value="#object.abilityScore"/></td>
            <td><s:property value="#object.abilityComment"/></td>
            <td><s:property value="#object.attitudeScore"/></td>
            <td><s:property value="#object.attitudeComment"/></td>
            <td><s:property value="#object.time"/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
