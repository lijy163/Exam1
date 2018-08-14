<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>显示</title>
    <style type="text/css">
        table {
            border: 1px solid pink;
            margin: 0 auto;
        }

        td{
            width: 150px;
            border: 1px solid pink;
            text-align: center;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>film_id</td>
        <td>title</td>
        <td>description</td>
        <td>language</td>
    </tr>

    <%=request.getAttribute("name")%>
    <%
        String film_id = (String) request.getAttribute("film_id");
        String title = (String) request.getAttribute("title");
        String description = (String) request.getAttribute("description");
        String language = (String) request.getAttribute("language");
    %>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.film_id }</td>
            <td>${item.title }</td>
            <td>${item.description }</td>
            <td>${item.language }</td>
            <td><a href="DeleteServlet?id=${item.id }">删除</a>|<a href="UpdateServlet?id=${item.id }">修改</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="6" style="text-align: left;"><a href="add.jsp">添加管理员</a></td>
    </tr>
</table>
</body>
</html>