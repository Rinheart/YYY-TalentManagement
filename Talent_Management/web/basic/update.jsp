<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改个人信息</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="https://cdn.staticfile.org/echarts/4.3.0/echarts.min.js"></script>
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

<form role="form" action="TalentUpdate.action" method="post">
    <div class="form-group">
        <label for="talentId">用户名</label>
        <s:textfield id="talentId" name="talent.talentId" value="%{talent.talentId}" readonly="true" class="form-control"/>
        <label for="password">修改密码</label>
        <s:textfield id="password" type="password" name="talent.password" value="%{talent.password}" class="form-control"/>
        <label for="phoneNumber">修改联系电话</label>
        <s:textfield id="phoneNumber" name="talent.phoneNumber" value="%{talent.phoneNumber}" class="form-control"/>
        <label for="address">修改联系地址</label>
        <s:textfield id="address" name="talent.address" value="%{talent.address}" class="form-control"/>
        <label for="education">修改学历</label>
        <s:textfield id="education" name="talent.education" value="%{talent.education}" class="form-control"/>
        <label for="personalProfile">修改个人简介</label>
        <s:textfield id="personalProfile" name="talent.personalProfile" value="%{talent.personalProfile}" class="form-control"/>
    </div>

    <button type="submit" class="btn btn-default">提交所有修改</button>
</form>

    <%--已移除删除操作--%>
</body>
</html>
