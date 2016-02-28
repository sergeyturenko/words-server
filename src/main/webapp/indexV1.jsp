<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
</head>
<script src="resources/js/jquery-2.2.0.min.js"></script>
<script src="resources/js/tttt.js"></script>
<link href="resources/css/style.css"/>
<body>
<a style="display: none;text-align: center;color: red" id="errorMessage"/>
<div style="width: 40%;margin-left: 30%" id="statistics">
    <h2>Статистика по файлам</h2>
</div>

<div class="file-summary" style="display: none">

    <label for="longWord">Самое длинное слово:</label>

    <p id="longWord"></p>

    <label for="shortWord">Самое короткое слово:</label>

    <p id="shortWord"></p>

    <label for="longWordLenght">Длина самого длинного слова:</label>

    <p id="longWordLenght"></p>

    <label for="shortWordLenght">Длина самого корткого слова:</label>

    <p id="shortWordLenght"></p>

    <label for="rowLenght">Количество строк</label>

    <p id="rowLenght"></p>

    <label for="averageWordLenght"></label>

    <p id="averageWordLenght"></p>

    <label for="countWords">Количество слов:</label>

    <p id="countWords"></p>
</div>
</body>
</html>