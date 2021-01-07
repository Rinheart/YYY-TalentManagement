<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的申请页面</title>
</head>
<body>
您好${talent.talentId}，${ap_tip}
<br>
${tip}<br>


现在要申请就职
<s:form action="applyIn" method="post">
    <s:textfield label="用户名" value="%{talent.talentId}" readonly="true"/>
    <s:textfield name="applicate.enterpriseId" label="入职的目标企业ID"/>
    <s:textfield name="applicate.departmentId" label="入职的目标部门ID"/>

    <%--<s:hidden name="talent.informationReview" value="%{talent.informationReview}"/>
    <s:hidden name="talent.identity" value="%{talent.identity}"/>--%>
    <s:submit value="提交申请"/>
</s:form>



</body>
</html>
