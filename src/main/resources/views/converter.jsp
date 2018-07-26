<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/7/25
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"   pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta  http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>@Controller Demo</title>
</head>
<body>

    <div id="resp"> </div>
    <input type="button" onclick="req()" value="请求" />
    <script src="https://code.jquery.com/jquery-3.1.1.min.js" type="text/javascript"></script>
    <script >
        function req() {
            $.ajax({
                url:"convert",
                data:"1-wangqiang",
                type:"POST",
                contentType:"application/x-qiang",
                success:function (data) {
                    $("#resp").html(data);
                }
            });
        }
    </script>
</body>
</html>
