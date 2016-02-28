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
        <div class="b-container">
            <table id="report">
                <tr>
                    <th>Имя файла</th>
                    <th>Самое длинное слово</th>
                    <th>Самое короткое слово</th>
                    <th>Длина самого длинного слова</th>
                    <th>Длина самого короткого слова</th>
                    <th>Средняя количество слов в строке</th>
                    <th>Количество строк</th>
                    <th>Количество слов</th>
                </tr>
            </table>
        </div>
        <div class="b-popup" id="popup1">
            <div class="b-popup-content" id="popup-content">
                <p style="width: 850px; text-align: right; height: 12px;">
                    <a href="javascript:PopUpHide()">
                        <img src="resources/img/close.png" style="height: 40px;"/>
                    </a>
                </p>
                <table id="reportDetail">
                    <tr>
                        <th>Самое длинное слово</th>
                        <th>Самое короткое слово</th>
                        <th>Длина самого длинного слова</th>
                        <th>Длина самого короткого слова</th>
                        <th>Длина строки(символов)</th>
                        <th>Средняя длина слов</th>
                        <th>Количество слов</th>
                    </tr>
                 </table>
            </div>
        </div>
    </body>
</html>