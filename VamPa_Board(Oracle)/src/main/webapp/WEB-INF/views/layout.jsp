<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>layout</title>
</head>
<body>
    
    <table width="400" border="1" cellpadding="0" cellspacing="0">
        <tr>
            <td>
                <jsp:include page="top.jsp" flush="false"/>
            </td>
        </tr>
        <tr>
            <td>
                <jsp:include page="content.jsp" flush="false"/>
            </td>
        </tr>
        <tr>
            <td>
                <jsp:include page="bottom.jsp" flush="false"/>
            </td>
        </tr>
    </table>
    
</body>
</html>
