<%--
  Created by IntelliJ IDEA.
  User: Zoe
  Date: 2021/1/4
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>员工表现</title>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
</head>
<body>
<h4>添加异常出勤记录</h4><br>
<form action="AddAttend" method="post">
    <input type="hidden" name="p_talentId" value="${p_talentId}" />
    出勤异常的事件：
    <select name="newAttend.event">
        <option value="0">旷工</option>
        <option value="1">请假</option>
        <option value="2">迟到</option>
        <option value="3">早退</option>
    </select><br>
    出勤异常日期：<input type="date" name="p_date" />
    <input type="submit" />
</form>
<h4>异常出勤记录</h4>
<table border=1>
    <tr> <th>编号</th> <th>企业</th> <th>部门</th> <th>事件</th> <th>日期</th>
        <th>记录者</th> <th>记录日期</th> </tr>
    <s:iterator value="attend" id="object">
        <tr>
            <td><s:property value="#object.attendId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td>
                <s:if test="#object.event==0">
                    旷工
                </s:if>
                <s:elseif test="#object.event==1">
                    请假
                </s:elseif>
                <s:elseif test="#object.event==2">
                    早退
                </s:elseif>
                <s:elseif test="#object.event==3">
                    迟到
                </s:elseif>
            </td>
            <td><s:property value="#object.date"/></td>
            <td><s:property value="#object.recorderName"/></td>
            <td><s:property value="#object.recordTime"/></td>
        </tr>
    </s:iterator>
</table>
<br>
<h4>添加违纪事件记录</h4><br>
<form action="AddDisciplinary" method="post">
    <input type="hidden" name="p_talentId" value="${p_talentId}" />
    违纪事件描述：<input type="text" name="p_content" /><br>
    违纪发生日期：<input type="date" name="p_date" /><br>
    <input type="submit" />
</form>
<h4>违纪事件</h4>
<table border=1>
    <tr> <th>编号</th> <th>企业</th> <th>部门</th> <th>事件</th> <th>日期</th>
        <th>记录者</th> <th>记录日期</th> </tr>
    <s:iterator value="disciplinary" id="object">
        <tr>
            <td><s:property value="#object.disciplinaryId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.content"/></td>
            <td><s:property value="#object.date"/></td>
            <td><s:property value="#object.recorderName"/></td>
            <td><s:property value="#object.recordTime"/></td>
        </tr>
    </s:iterator>
</table>
<br>
<h4>添加奖励事件记录</h4><br>
<form action="AddReward" method="post">
    <input type="hidden" name="p_talentId" value="${p_talentId}" />
    奖励名称：<input type="text" name="p_rewordName" /><br>
    获奖原因：<input type="text" name="p_rewordResult" /><br>
    奖品：<input type="text" name="p_prize" /><br>
    获奖日期：<input type="date" name="p_date" /><br>
    <input type="submit" />
</form>
<h4>奖励事件</h4>
<table border=1>
    <tr> <th>编号</th> <th>企业</th> <th>部门</th> <th>奖励名称</th> <th>奖励原因</th>
        <th>奖品</th> <th>获奖日期</th> <th>记录者</th> <th>记录日期</th> </tr>
    <s:iterator value="reward" id="object">
        <tr>
            <td><s:property value="#object.rewardId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.rewardName"/></td>
            <td><s:property value="#object.rewardResult"/></td>
            <td><s:property value="#object.Prize"/></td>
            <td><s:property value="#object.date"/></td>
            <td><s:property value="#object.recorderName"/></td>
            <td><s:property value="#object.recordTime"/></td>
        </tr>
    </s:iterator>
</table>
<br>
<h4>添加重大事件记录</h4><br>
<form action="AddBigEvent" method="post">
    <input type="hidden" name="p_talentId" value="${p_talentId}" />
    事件描述：<input type="text" name="p_content" /><br>
    发生日期：<input type="date" name="p_date" /><br>
    <input type="submit" />
</form>
<h4>重大事件</h4>
<a href="../HR/bigEvent.jsp?p_talentId=${p_talentId}">添加重大事件记录</a>
<table border=1>
    <tr> <th>编号</th> <th>企业</th> <th>部门</th> <th>事件内容</th> <th>日期</th>
        <th>记录者</th> <th>记录日期</th> </tr>
    <s:iterator value="bigEvent" id="object">
        <tr>
            <td><s:property value="#object.bigEventId"/></td>
            <td><s:property value="#object.enterpriseName"/></td>
            <td><s:property value="#object.departmentName"/></td>
            <td><s:property value="#object.content"/></td>
            <td><s:property value="#object.date"/></td>
            <td><s:property value="#object.recorderName"/></td>
            <td><s:property value="#object.recordTime"/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
