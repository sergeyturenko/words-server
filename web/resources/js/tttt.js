$(document).ready(function () {
    getFiles();
});

function printFileList(fileArray) {
    for (var file in fileArray) {
        var row = document.createElement('div');
        $(row).addClass('unpressed');
        $(row).addClass('fileRow');
        $(row).attr('id', file['id']);
        fileName = document.createElement('a');
        $(row).css('display', 'block');
        $(fileName).html(file['name']);

        $(fileName).on('click', function () {
            if ($(this).parent('div').hasClass('unpressed')) {
                getFileSummary(file['id'], $(this));
                $(this).parent('div').removeClass('unpressed');
                $(this).parent('div').addClass('pressed');

            } else {
                $(this).parent('div').addClass('unpressed');
                $(this).parent('div').removeClass('pressed');
                $(this).parent('div').find('.file-summary').remove();
            }
        });
        $(row).append($(fileName));
        $("#statistics").append(row);
    }
}


function showFileSummary(summaryList, $field) {
    var emptySummaryRow = document.getElementsByClassName('file-summary')[0];
    for (var sum in summaryList) {
        summary = $(emptySummaryRow).clone();
        $($field.parent('div')).find('p').each(function () {
            $(this).val(sum[$(this).attr('id')]);
        });
        $field.parent('div').append($(summary));
    }
}

function getFileSummary(fileID, $field) {
    $.ajax({
        url: 'http',
        type: 'POST',
        data: fileID,
        success: function (data) {
            showFileSummary(data, $field);
        }
    });
}

function getFiles() {
    $.ajax({
        url: 'http://127.0.0.1:8080/api/statistic/getAllFileStatistic',
        type: 'GET',
        success: function (data) {
            showFileSummary(JSON.parse(data), $field);
            //printFileList(data)
        },
        //error: function () {
        //    errorMessage = $('#errorMessage');
        //    $(errorMessage).html('Ошибка получения данных');
        //    $(errorMessage).show();
        //}
        error: function (xhr, exception) {
            console.log(exception);
        }
    });
}