<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改个人信息</title>
</head>
<body>
<h2>修改个人信息</h2>
    <s:form action="TalentUpdate" method="post">
        <s:textfield name="talent.talentId" label="用户名" value="%{talent.talentId}" readonly="true"/>
        <%--为防止恶意改前端readonly，action中重新赋值--%>
        <%--<s:textfield name="talent.name" label="姓名" value="%{talent.name}" readonly="true"/>
        <s:textfield name="talent.sex" value="%{talent.sex}" label="性别" readonly="true"/>
        <s:textfield name="talent.birthday" value="%{talent.birthday}" label="生日" readonly="true"/>
        <s:textfield name="talent.idNumber" value="%{talent.idNumber}" label="身份证号" readonly="true"/>--%>

        <s:textfield type="password" name="talent.password" label="修改密码" value="%{talent.password}"/>
        <s:textfield name="talent.phoneNumber" label="修改联系电话" value="%{talent.phoneNumber}"/>
        <s:textfield name="talent.address" label="修改联系地址" value="%{talent.address}"/>
        <s:textfield name="talent.education" label="修改学历" value="%{talent.education}"/>
        <s:textfield name="talent.personalProfile" label="修改个人简介" value="%{talent.personalProfile}"/>

        <%--<s:hidden name="talent.informationReview" value="%{talent.informationReview}"/>
        <s:hidden name="talent.identity" value="%{talent.identity}"/>--%>
        <s:submit value="修改"/>
    </s:form>

    <%--已移除删除操作--%>
</body>
</html>
