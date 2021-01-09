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
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
    <link rel="shortcut icon" href="assets/images/favicon.ico" />
    <link rel="stylesheet" href="assets/css/backend.min.css">
    <link rel="stylesheet" href="assets/vendor/@fortawesome/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="assets/vendor/line-awesome/dist/line-awesome/css/line-awesome.min.css">
    <link rel="stylesheet" href="assets/vendor/remixicon/fonts/remixicon.css">
</head>
<body>
<h4>添加绩效评价记录</h4><br>
<form action="AddAchievement" method="post">
    <input type="hidden" name="p_talentId" value="${p_talentId}" />
    阶段工作内容：<input type="text" name="p_content" /><br>
    阶段工作起始时间：<input type="date" name="p_startTime" /><br>
    阶段工作结束时间：<input type="date" name="p_endTime" /><br>
    绩效完成情况评分：<input type="text" name="p_achievementScore" /><br>
    绩效完成情况评语：<input type="text" name="p_achievementComment" /><br>
    <input type="submit" />
</form>
<h4>绩效评价</h4>
<table border=1>
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
<h4>添加主观评价记录</h4><br>
<form action="AddEvaluate" method="post">
    <input type="hidden" name="p_talentId" value="${p_talentId}" />
    总评分：<input type="text" name="p_totalScore" /><br>
    工作能力评分：<input type="text" name="p_abilityScore" /><br>
    工作能力评语：<input type="text" name="p_abilityComment" /><br>
    工作态度评分：<input type="text" name="p_attitudeScore" /><br>
    工作态度评语：<input type="text" name="p_attitudeComment" /><br>
    <input type="submit" />
</form>
<h4>主观评价</h4>
<table border=1>
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
