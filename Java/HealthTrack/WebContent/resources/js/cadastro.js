window.onload = function(){
	var oTxtCep = document.getElementById("cep");
	var oDivMsgCep = document.getElementById("msgCep");
	
	//Dispara quando o campo de CEP perder o foco
	oTxtCep.onblur = function(){
		var oRegExp = new RegExp("^[0-9]{5}\-[0-9]{3}$");
			if (oRegExp.test(oTxtCep.value) == true){
				oTxtCep.style.borderColor = "#008000";
				oDivMsgCep.style.color = "#008000";
				oDivMsgCep.innerHTML = "Campo preenchido com sucesso!";
			} else {
				oTxtCep.style.borderColor = "#FF0000";
				oDivMsgCep.style.color = "#FF0000";
				oDivMsgCep.innerHTML = "CEP inválido!";
			}
	}
	
	//Limpar
	oTxtCep.onfocus = function(){
		oTxtCep.style.color.borderColor = "";
		oDivMsgCep.style.color = "";
		oDivMsgCep.innerHTML = "";
	}
}



//jQuery Datepicker
$(document).ready(function() {
	$("#inputData").datepicker({
		dateFormat: 'dd/mm/yy',
		['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],
		dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
		dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
		monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho' ,'Agosto','Setembro','Outubro','Novembro','Dezembro'],
		monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out', 'Nov','Dez'],
		nextText: 'Próximo',
		prevText: 'Anterior'
	});
});