<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>라켓</h1>
<form action="/choice" method="post">
    <select name="menuRacket" id="menu">
        <option value="나노플레어555">나노플레어555</option>
        <option value="넥스테이지">넥스테이지</option>
        <option value="아크세이버11">아크세이버11</option>
        <option value="아스트록스88">아스트록스88</option>
    </select>
    <input type="number" min="0" max="10" step="1" name="amount">
    <button type="submit">선택 완료</button>
</form>
</body>
</html>
