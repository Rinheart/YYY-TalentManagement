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
    <s:textfield class="form-control col-12" name="talent.talentId" label="用户名" id="username" value="%{talent.talentId}" readonly="true"/>
    <s:textfield type="password" class="form-control col-12" name="talent.password" id="password" label="修改密码" value="%{talent.password}"/>
    <s:textfield name="talent.phoneNumber" class="form-control col-12" label="修改联系电话" id="phonenumber" value="%{talent.phoneNumber}"/>
    <s:textfield name="talent.address" class="form-control col-12" label="修改联系地址" id="address" value="%{talent.address}"/>
    <s:textfield name="talent.education" class="form-control col-12" label="修改学历" id="education" value="%{talent.education}"/>
    <s:textfield name="talent.personalProfile" class="form-control col-12" label="修改个人简介" id="personalprofile" value="%{talent.personalProfile}"/>
    <s:submit value="修改" class="col-4 btn btn-primary" onclick="return custCheck()"/>
</s:form>

<script language="JavaScript">
    function custCheck() {
        var n1 = document.getElementById("username");//获取用户名
        var n2 = document.getElementById("password");//获取密码
        var n8 = document.getElementById("address");//获取联系地址
        var n9 = document.getElementById("education");//获取学历
        var n10 = document.getElementById("personalprofile");//获取个人简介
        var n7 = document.getElementById("phonenumber");//获取联系电话
        var reg = /^[0-9]*$/;
        if(n1.value==""){
            alert("用户名不能为空！");
            return false;
        }else if (n7.value == "") {
            alert("联系电话不能为空！");
            return false;
        } else if(n2.value==""){
            alert("密码不能为空！");
            return false;
        }else if(n8.value==""){
            alert("联系地址不能为空！");
            return false;
        }else if(n9.value==""){
            alert("学历不能为空！");
            return false;
        }
        else if(n10.value==""){
            alert("个人简介不能为空！");
            return false;
        }

        else if(n1.value.length>8){
            alert("用户名长度不能超过8位！");
            return false;
        }
        else if(n2.value.length>20){
            alert("密码长度不能超过20位！");
            return false;
        }
        else if(n8.value.length>100){
            alert("联系地址长度不能超过100位！");
            return false;
        }
        else if(n9.value.length>10){
            alert("学历长度不能超过10位！");
            return false;
        }
        else if(n10.value.length>200){
            alert("个人简介长度不能超过200位！");
            return false;
        } else if (!reg.test(n7.value) || n7.value.length != 11) {
            alert("联系电话输入格式错误！");
            return false;
        }
    }
</script>
</body>
</html>
