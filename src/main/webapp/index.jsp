<%--
  Created by IntelliJ IDEA.
  User: Sergey_PC
  Date: 25.02.2016
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Статистика по файлам</title>
    <link rel="stylesheet" href="resources/css/style.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js" type="text/javascript"></script>
</head>
<script src="resources/js/jsWords.js"></script>
<body>
<h1>Статистика по файлам</h1>
<table id="report">
    <tr>
        <th>Id</th>
        <th>Имя файла</th>
        <th>Самое длинное слово</th>
        <th>Самое короткое слово</th>
        <th>Длина самого длинного слова</th>
        <th>Длина самого корткого слова</th>
        <th>Средняя длина строк</th>
        <th>Количество строк</th>
        <th>Количество слов</th>
        <th></th>
    </tr>

</table>
</body>
</html>