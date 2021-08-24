<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/7/14
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>

<form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="aa">
    <input type="submit" value="上传">
</form>