<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>企业信息更新</title>
</head>
<body>
<h6 align="left" >
    <span style="color: #9f94d9; ">企业信息更新</span>
</h6>
<div style="height:25px;"></div>

<form class="col-12" action="enterpriseUpdate.action" method="post">
    用户名（不可修改）<input class="form-control col-6" type="text" readonly name="enterprise.enterpriseId" value="${enterprise.enterpriseId}">
    修改密码<input class="form-control col-6" type="password" name="enterprise.password" id="password" value="${enterprise.password}">
    请输入企业名称<input class="form-control col-6" type="text"   name="enterprise.enterpriseName" id="enterprisename" value="${enterprise.enterpriseName}">
    请输入企业地址<input class="form-control col-6" type="text" name="enterprise.address" id="enteraddress" value="${enterprise.address}">
    请输入企业经营范围<input class="form-control col-6" type="text" name="enterprise.businessScope" id="businessscope" value="${enterprise.businessScope}">
    请输入企业类型<input class="form-control col-6" type="text" name="enterprise.enterpriseType" id="enterprisetype" value="${enterprise.enterpriseType}">
    请输入企业年营业额<input class="form-control col-6" type="text" name="enterprise.annualTurnover" id="annualturnover" value="${enterprise.annualTurnover}">
    请输入企业CEO姓名<input class="form-control col-6" type="text" name="enterprise.ceo" id="ceoname" value="${enterprise.ceo}">
    请输入公司主页<input class="form-control col-6" type="text" name="enterprise.websiteAddress" id="websiteaddress" value="${enterprise.websiteAddress}">
    <div style="height: 15px;"></div>
    <br>
    <input class="col-6 btn btn-outline-primary" type="submit" value="确认修改">
</form>

<script language="JavaScript">
    function custCheck() {
        var n2 = document.getElementById("password");//获取密码
        var n3 = document.getElementById("enterprisename");//获取企业名称
        var n5 = document.getElementById("enteraddress");//获取企业地址
        var n6 = document.getElementById("businessscope");//获取企业经营范围
        var n7 = document.getElementById("enterprisetype");//获取企业类型
        var n8 = document.getElementById("annualturnover");//获取年营业额
        var n10 = document.getElementById("ceoname");//获取企业CEO姓名
        var n14 = document.getElementById("websiteaddress");//获取企业主页
        var reg = /^[0-9]*$/;
        if(n2.value==""){
            alert("密码不能为空！");
            return false;
        }
        else if(n3.value==""){
            alert("企业名称不能为空！");
            return false;
        }
        else if(n5.value==""){
            alert("企业地址不能为空！");
            return false;
        }
        else if(n6.value==""){
            alert("企业经营范围不能为空！");
            return false;
        }
        else if(n7.value==""){
            alert("企业类型不能为空！");
            return false;
        }
        else if(n8.value==""){
            alert("年营业额不能为空！");
            return false;
        }
        else if(n10.value==""){
            alert("CEO姓名不能为空！");
            return false;
        }
        else if(n14.value==""){
            alert("企业主页不能为空！");
            return false;
        }

        else if(n2.value.length>20){
            alert("密码长度不能超过20位！");
            return false;
        }
        else if(n3.value.length>20){
            alert("企业名称长度不能超过20位！");
            return false;
        }
        else if(n5.value.length>100){
            alert("企业地址长度不能超过100位！");
            return false;
        }
        else if(n6.value.length>45){
            alert("企业经验范围长度不能超过45位！");
            return false;
        }
        else if(n7.value.length>45){
            alert("企业类型长度不能超过45位！");
            return false;
        }
        else if(n8.value.length>200){
            alert("年营业额长度不能超过200位！");
            return false;
        }
        else if(n10.value.length>10){
            alert("CEO姓名长度不能超过10位！");
            return false;
        }
        else if(n14.value.length>50){
            alert("企业官网网址长度不能超过50位！");
            return false;
        }
    }
</script>
</body>
</html>