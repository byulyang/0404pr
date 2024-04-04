<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String menuRacket = (String) request.getAttribute("menuRacket");
    Integer amount = (Integer) request.getAttribute("amount");
    Integer orderPrice = (Integer) request.getAttribute("orderprice");
%>

<h3>주문하신 라켓 : <%= menuRacket%></h3>
<h3>주문하신 수량 : <%= amount%>자루</h3>
<h3>결제하실 최종 금액 : <%= orderPrice %>원 입니다.</h3>
</body>
</html>
