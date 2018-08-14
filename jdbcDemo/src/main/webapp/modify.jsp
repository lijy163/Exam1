<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>修改</title>
    <link rel="stylesheet" href="css/index.css" type="text/css" />
</head>

<body>
<form action="UpdateServlet" method="post">
    <table border="1" class="t1">
        <tr>
            <td colspan="2"><h1>修改管理员信息</h1></td>
        </tr>
        <tr>
            <td>编号:</td>
            <td><input  type="text" name="id" value="${admin.id}" readonly="readonly"/></td>
        </tr>

        <tr>
            <td>管理员帐号:</td>
            <td><input  type="text" name="username" value="${admin.username}"/></td>
        </tr>
        <tr>
            <td>管理员密码:</td>
            <td><input  type="text" name="userpwd" value="${admin.userpwd}"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input  type="submit" value="提交"/>
                <input  type="button" value="返回" onclick="history.go(-1)"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>