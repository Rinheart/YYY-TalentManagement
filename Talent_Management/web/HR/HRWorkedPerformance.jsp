<%--
  Created by IntelliJ IDEA.
  User: Zoe
  Date: 2021/1/4
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>已离职员工的异常出勤</title>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
</head>
<body>
<h4>任职期间异常出勤</h4>
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
<h4>任职期间违纪事件</h4>
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
<h4>任职期间奖励事件</h4>
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
<h4>任职期间重大事件</h4>
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
