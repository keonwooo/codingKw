

function callAjax(data) {
    $.ajax({
        type: data.type,
        url: data.url,
        dataType: "json",
        data: data.data
    }).done((abc) => {
        console.log(abc);
    }).fail((err) => {
        console.log(err);
    });
}