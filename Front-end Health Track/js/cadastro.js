window.onload = function () {
    
    /*Validação CEP*/
    var oTxtCep = document.getElementById("inputZip");
    var oMsgCep = document.getElementById("msgCep");
    
    oTxtCep.onblur = function () {
        var oRegExp = new RegExp ("^[0-9]{5}\-[0-9]{3}$");
        if(oRegExp.test(oTxtCep.value) == true) {
            oMsgCep.style.color = "green";
            oMsgCep.innerHTML = "CEP válido, campo preenchido com sucesso";
        } else {
            oMsgCep.style.color = "red";
            oMsgCep.innerHTML = "CEP inválido! Tente novamente!"
        };
    };
    
    oTxtCep.onfocus = function () {
        oMsgCep.style.color = "";
        oMsgCep.innerHTML = "";
    };
    
    
    /* VALIDAR NUMERO - FINALIZAR - https://stackoverflow.com/questions/18375929/validate-phone-number-using-javascript*/
    var inputtxt = document.getElementById("inputContact");
    function vPhone (inputtxt) {
        var phoneno = /^\(?([0-9]{2})\)?[-.]?([0-9]{5})[-.]?([0-9]{4})$/;
        if(inputtxt.value.match(phoneno)){
            return true;
        } else {
           window.alert("Não é um número válido");
            return false;
        }
    }
    

    /*Calendário Data de Nascimento*/
    $(document).ready(function() {
                      $("#inputBirthday").datepicker({
        dateFormat: 'dd/mm/yyyy', 
        daynames:['Domingo','Segunda','Terça','Quarta','Quinta','Setxa','Sábado'],
        dayNamesMin:['D','S','T','Q','Q','S','S','D'],
        dayNamesShort:['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
        monthNames:['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
        monthNamesShort:['Jan','Fev','Mar','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'],
        nextText: 'Próximo',
        prevText: 'Anterior'
    });
                      });
    
    
    
    
    
    /*Obrigatórios - tentei fazer com Classname, mas não funcionou. Por isso fiz um para cada.*/
    var nName = document.getElementById("nome").required = true;
    var sName = document.getElementById("sobrenome").required = true;
    var nZip = document.getElementById("inputZip").required = true;
    var nState = document.getElementById("inputState").required = true;
    var nCity = document.getElementById("inputCity").required = true;
    var nBirth = document.getElementById("inputBirthday").required = true;
    var nAddress = document.getElementById("inputAddress").required = true;
    var nSexo = document.getElementById("inputSexo").required = true;
    var nContact = document.getElementById("inputContact").required = true;
    var nPwd = document.getElementById("inputPassword4").required = true;
    var nEmail = document.getElementById("inputEmail4").required = true;
    
    function cObg (){
    }
    
}


