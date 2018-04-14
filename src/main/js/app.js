var xmlhttp = new XMLHttpRequest();
xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        var myObj = JSON.parse(this.responseText);
        document.getElementById("demo").innerHTML = myObj.name;
    }
};
var response = xmlhttp.open("GET", "http://localhost:8080/api/highscores/", true);
console.log(response);
xmlhttp.send();