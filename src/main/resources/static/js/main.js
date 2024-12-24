$(document).ready(function () {
    $("#test_1").on("click", function() {
        let data = {
            "x1" : $("#x1").val(),
            "x2" : $("#x2").val(),
            "x3" : $("#x3").val(),
            "x4" : $("#x4").val(),
        }
        
        let ajaxData = {
            "type" : "post",
            "url" : "restApi/test_1",
            "dataType" : "application/json",
            "params" : data
        }
        kwfw.ajax(ajaxData);
    });
    
    $("#test_2").on("click", function() {
        let data = {
            "a" : $("#a").val(),
            "b" : $("#b").val(),
            "c" : $("#c").val(),
            "d" : $("#d").val(),
        }
        
        let ajaxData = {
            "type" : "post",
            "url" : "restApi/test_2",
            "dataType" : "application/json",
            "params" : data
        }
        kwfw.ajax(ajaxData);
    });
    
    $("#test_3").on("click", function() {
        let data = {
            "str" : $("#my_string").val(),
            "index" : $("#index").val()
        }
        
        let ajaxData = {
            "type" : "post",
            "url" : "restApi/test_3",
            "dataType" : "application/json",
            "params" : data
        }
        kwfw.ajax(ajaxData);
    });
    
    $("#test_4").on("click", function() {
        
        let ajaxData = {
            "type" : "post",
            "url" : "restApi/test_4",
            "dataType" : "application/json",
        }
        kwfw.ajax(ajaxData);
    });
    
    $("#test_5").on("click", function() {
        
        let ajaxData = {
            "type" : "post",
            "url" : "restApi/test_5",
            "dataType" : "application/json",
        }
        kwfw.ajax(ajaxData);
    });
});