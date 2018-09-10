window.onload = function () {
    var cButton = document.getElementById("button");
    cButton.onclick = function (){
        do {
        cButton = prompt("Insira as inofrmações: ");
        } while (cButton == null || cButton == "");
    };
};

/* jqueryui.com/dialog/#modal-form */

