$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/user/1"
    }).then(function(data, status, jqxhr) {
       $('.firstname').append(data.firstname);
       $('.lastname').append(data.lastname);
       console.log(jqxhr);
    });
});