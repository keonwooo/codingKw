$(document).ready(function () {
    $("#test_1").on("click", function() {
        let data = {
            "x1" : $("#x1").val(),
            "x2" : $("#x2").val(),
            "x3" : $("#x3").val(),
            "x4" : $("#x4").val(),
        }
        
        let ajaxData = {
            "type" : "get",
            "url" : "restApi/test_1",
            "dataType" : "json",
            "data" : data
        }
        callAjax(ajaxData);
    });
});