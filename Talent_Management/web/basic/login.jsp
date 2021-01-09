<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <title>用户登录页面</title></head>
<link rel="shortcut icon" href="../assets/images/favicon.ico" />
<link rel="stylesheet" href="../assets/css/backend.min.css">
<link rel="stylesheet" href="../assets/vendor/@fortawesome/fontawesome-free/css/all.min.css">
<link rel="stylesheet" href="../assets/vendor/line-awesome/dist/line-awesome/css/line-awesome.min.css">
<link rel="stylesheet" href="../assets/vendor/remixicon/fonts/remixicon.css">
<body>

<s:property value="#request.tip"/>
<br>

<form action="login" method="post">
    <table style="border: 1px solid #222222;" rules="none" cellspacing="0" width="320">

        <tr height="40">
            <td colspan=2>
                <h2 align="center">
                    <span style="color: #9d9d9d; ">登录系统</span>
                </h2>
            </td>
        </tr>

        <tr height=40>
            <td width=100 height=40 align="center">用&nbsp;&nbsp;&nbsp;户&nbsp;&nbsp;&nbsp;名</td>
            <td width=220><input style="width: 95%;height: 25px;" required="required"
                                 type="text" placeholder="请输入用户名"
                                 onfocus="if(value==defaultValue){value='';this.style.color='#000'}"
                                 onblur="if(!value){value='';this.style.color='#999'}"
                                 name="talent.talentId" id="username"></td>
        </tr>


        <tr height=40>
            <td width=100 height=40 align="center">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码</td>
            <td width=220><input style="width: 95%;height: 25px;" required="required"
                                 type="password" placeholder="请输入密码"
                                 onfocus="if(value==defaultValue){value='';this.style.color='#000'}"
                                 onblur="if(!value){value='';this.style.color='#999'}"
                                 name="talent.password" id="password"></td>
        </tr>



        <tr height=40>
            <td colspan=2 align="center">
                <input type="submit" value="登录" onclick="return custCheck()">
                <%--onclick被return false后，提交表单会被阻止，写custCheck的js函数判断并阻止提交--%>
        </tr>

        <tr>
            <td align="right" colspan="2">
                没有账户?<a href="register.jsp">请注册</a>
            </td>
        </tr>


    </table>
</form>


</body>
<script language="JavaScript">
    function custCheck() {
        var n2 = document.getElementById("username");
        var n3 = document.getElementById("password");
        if(n2.value==""||n2.value=="请输入用户名"){
            alert("用户名不能为空！");
            return false;
        }
        else if(n3.value==""||n3.value=="请输入密码"){
            alert("密码不能为空！");
            return false;
        }

        if(n2.value.length>8||n3.value().length>8){
            alert("用户名/密码不能超过8位");
            return false;
        }
    }
</script>
</html>
