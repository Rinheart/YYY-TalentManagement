<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改个人信息</title>
    <link rel="shortcut icon" href="../assets/images/favicon.ico"/>

</head>
<body>
<h2>修改个人信息</h2>
    <s:form class="col-12" action="TalentUpdate" method="post">
        <s:textfield class="form-control col-12" name="talent.talentId" label="用户名" value="%{talent.talentId}" readonly="true"/>

        <s:textfield type="password" class="form-control col-12" name="talent.password" label="修改密码" value="%{talent.password}"/>
        <s:textfield name="talent.phoneNumber" class="form-control col-12" label="修改联系电话" value="%{talent.phoneNumber}"/>
        <s:textfield name="talent.address" class="form-control col-12" label="修改联系地址" value="%{talent.address}"/>
        <s:textfield name="talent.education" class="form-control col-12" label="修改学历" value="%{talent.education}"/>
        <s:textfield name="talent.personalProfile" class="form-control col-12" label="修改个人简介" value="%{talent.personalProfile}"/>
        <s:submit value="修改" class="col-4 btn btn-primary"/>

    </s:form>


</body>
</html>
