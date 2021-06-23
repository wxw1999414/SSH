<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>exception</title>
</head>
<body>
private Integer studetnId;
private String name;
private String sex;
private String age;
<div >
    <tr>
        <td>学号</td>
    </tr>
    <tr>
        <td>姓名</td>
    </tr>
    <tr>
        <td>性别</td>
    </tr>
    <tr>
        <td>年龄</td>
    </tr>
    <c:forEach items="${pm.list}" var="ite">
        <tr>
            <td>ite.studetnId</td>
        </tr>
        <tr>
            <td>ite.name</td>
        </tr>
        <tr>
            <td>ite.sex</td>
        </tr>
        <tr>
            <td>ite.age</td>
        </tr>
    </c:forEach>
    <div>
        <tr>
            <td colspan="2">
                当前页：${pm.nowPage}/总页数：${pm.sumPage}&nbsp;&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/student_queryPage.action&nowPage=1&size=5&queryWord=${sessionScope.queryWord}">首页</a>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/student_queryPage.action&nowPage=${pm.nowPage==1?1:(pm.nowPage-1)}&size=5">上一页</a>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/student_queryPage.action&nowPage=${pm.nowPage==pm.sumPage?pm.sumPage:(pm.nowPage+1)}&size=5">下一页</a>
            </td>
            <td colspan="2">
                <a href="${pageContext.request.contextPath}/student_queryPage.action&nowPage=${pm.sumPage}&size=5">尾页</a>
            </td>
        </tr>
    </div>
</div>

</body>
</html>
