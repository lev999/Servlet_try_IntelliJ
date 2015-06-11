<%--
  Created by IntelliJ IDEA.
  User: pc-users
  Date: 11/06/2015
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Hello world</title>
</head>
<body>
<p style="font-size: <%=request.getAttribute("font_size")%>px">
   This is dynamic text size
</p>
<%=request.getAttribute("current_date")%>
My first page2
</body>
</html>
