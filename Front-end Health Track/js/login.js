window.onload = function () {
     
    var oTxtEmail = document.getElementById("exempleInputEmail1");
    var oMsgEmail = document.getElementById("msgEmail");
    
    oTxtCep.onblur = function () {
        var oRegExp = new RegExp (/^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/);
        if(oRegExp.test(oTxtEmail.value) == true) {
            oMsgEmail.style.color = "green";
            oMsgEmail.innerHTML = "Email válido.";
        } else {
            oMsgEmail.style.color = "red";
            oMsgEmail.innerHTML = "Email inválido."
        }
    };
    
    oTxtCep.onfocus = function () {
        oMsgCep.style.color = "";
        oMsgCep.innerHTML = "";
    };
    
    var nEmail = document.getElementById("exampleInputEmail1").required = true;
    var nPassword = document.getElementById("exampleInputPassword1").required = true;
    
    function cObg (){
    }
    
};