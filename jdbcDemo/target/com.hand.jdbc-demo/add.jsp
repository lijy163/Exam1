<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>添加</title>
    <link rel="stylesheet" href="css/index.css" type="text/css" />
</head>

<body>
<form action="AddServlet" method="post">
    <table border="1" class="t1">
        <tr>
            <td colspan="2"><h1>添加管理员</h1></td>
        </tr>
        <tr>
            <td>管理员帐号:</td>
            <td><input  type="text" name="username"/></td>
        </tr>
        <tr>
            <td>管理员密码:</td>
            <td><input  type="password" name="userpwd"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input  type="submit" value="提交"/>
                <input  type="reset" value="清空"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>