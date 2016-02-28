$(document).ready(function () {
    PopUpHide();
    $("#report tr:odd").addClass("odd");
    $("#report tr:not(.odd)").hide();
    $("#report tr:first-child").show();

});

$.ajax({
    url: 'http://localhost:8080/words-server/api/statistic/getAllFileStatistic',
    type: "get",
    dataType: "json",
    success: function (data) {
        drawTable(data, "#report");
    },
    error: function () {
        errorMessage = $('#errorMessage');
        $(errorMessage).html('Ошибка получения данных');
        $(errorMessage).show();
    }
});

function PopUpShow(id, fileName) {
    $.ajax({
        url: 'http://localhost:8080/words-server/api/statistic/getRowsStatistic',
        type: "get",
        dataType: "json",
        data: 'id=' + id,
        success: function (data) {
            drawDetailTable(data, "#reportDetail", fileName);
        },
        error: function () {
            errorMessage = $('#errorMessage');
            $(errorMessage).html('Ошибка получения данных');
            $(errorMessage).show();
        }
    });
    $("#popup1").show();
}

function PopUpHide() {
    $("#popup1").hide();
}
function drawDetailTable(data, id, fileName) {
    for (var i = 0; i < data.length; i++) {
        drawDetailRow(data[i], id);
    }
}

function drawDetailRow(rowData, id) {
    var row = $("<tr class='odd' />")
    $(id).append(row);
    row.append($("<td>" + rowData.longWord + "</td>"));
    row.append($("<td>" + rowData.shortWord + "</td>"));
    row.append($("<td>" + rowData.longWordLenght + "</td>"));
    row.append($("<td>" + rowData.shortWordLenght + "</td>"));
    row.append($("<td>" + rowData.rowLenght + "</td>"));
    row.append($("<td>" + rowData.averageWordLenght + "</td>"));
    row.append($("<td>" + rowData.countWords + "</td>"));
}
function drawTable(data, id) {
    for (var i = 0; i < data.length; i++) {
        drawRow(data[i], id);
    }
}

function drawRow(rowData, id) {
    var row = $("<tr class='odd' id='" + rowData.id + "' onclick='PopUpShow(" + rowData.id + ", \"" + rowData.fileName + "\")'/>")
    $(id).append(row);
    row.append($("<td>" + rowData.fileName + "</td>"));
    row.append($("<td>" + rowData.longWord + "</td>"));
    row.append($("<td>" + rowData.shortWord + "</td>"));
    row.append($("<td>" + rowData.longWordLenght + "</td>"));
    row.append($("<td>" + rowData.shortWordLenght + "</td>"));
    row.append($("<td>" + rowData.averageWordLenght + "</td>"));
    row.append($("<td>" + rowData.rowLenght + "</td>"));
    row.append($("<td>" + rowData.countWords + "</td>"));
    //row.onclick = function(){PopUpShow(rowData.id, rowData.fileName);};
}

//window.onload = addRowHandlers();

