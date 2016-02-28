// ignore this first line (its fidle mock) and it will return what ever you pass as json:... parameter... consider to change it to your ajax call
$(document).ready(function(){
    $("#report tr:odd").addClass("odd");
    $("#report tr:not(.odd)").hide();
    $("#report tr:first-child").show();

    $("#report tr.odd").click(function(){
        $(this).next("tr").toggle();
        $(this).find(".arrow").toggleClass("up");
    });
    //$("#report").jExpand();
});

$.ajax({
    url: 'http://localhost:8080/words-server/api/statistic/getAllFileStatistic',
    type: "get",
    dataType: "json",
    success: function(data, textStatus, jqXHR) {
        // since we are using jQuery, you don't need to parse response
        drawTable(data);
    },
    //success: function (data) {
    //    showFileSummary(JSON.parse(data), $field);
    //    //printFileList(data)
    //},
    error: function () {
        errorMessage = $('#errorMessage');
        $(errorMessage).html('Ошибка получения данных');
        $(errorMessage).show();
    }
});

function drawTable(data) {
    for (var i = 0; i < data.length; i++) {
        drawRow(data[i]);
    }
}

function drawRow(rowData) {
    var row = $("<tr class='odd' />")
    $("#report").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it
    row.append($("<td>" + rowData.id + "</td>"));
    row.append($("<td>" + rowData.fileName + "</td>"));
    row.append($("<td>" + rowData.longWord + "</td>"));
    row.append($("<td>" + rowData.shortWord + "</td>"));
    row.append($("<td>" + rowData.longWordLenght + "</td>"));
    row.append($("<td>" + rowData.shortWordLenght + "</td>"));
    row.append($("<td>" + rowData.rowLenght + "</td>"));
    row.append($("<td>" + rowData.averageWordLenght + "</td>"));
    row.append($("<td>" + rowData.countWords + "</td>"));
    row.append($("<td><div class='arrow'></div></td>"));
}

