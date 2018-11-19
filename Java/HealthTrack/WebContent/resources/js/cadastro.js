window.onload = function(){
	var oTxtCep = document.getElementById("inputCep");
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

	
	
	//Email teste
	var oTxtEmail = document.getElementById("inputEmail");
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
	
	
	//jQuery Datepicker - não sei porque está dando erro!
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
	
	
	//Validar número de telefone
	var num = document.getElementById("inputTel");
	function vPhone (num) {
		var phoneNum = /^\(?([0-9]{2})\)?[-.]?([0-9]{5})[-.]?([0-9]{4})$/;
		if(num.value.match(phoneNum)){
			return true;
		} else {
			window.alert("Não é um número válido");
			return false;
		}
	}
	
	//Validação de campo - Tentei com class e não funcionou
	//Cadastro
	var name = document.getElementById("inputNome").required = true;
	var lastname = document.getElementById("inputLastName").required = true;
	var email = document.getElementById("inputEmail").required = true;
	var sexo = document.getElementById("sexo").required = true;
	var tel = document.getElementById("inputTel").required = true;
	var cpf = document.getElementById("inputCpf").required = true;
	var senha = document.getElementById("inputSenha").required = true;
	var data = document.getElementById("inputData").required = true;
	var endereco = document.getElementById("inputEndereco").required = true;
	var bairro = document.getElementById("inputBairro").required = true;
	var numero = document.getElementById("inputNumero").required = true;
	var cidade = document.getElementById("inputCidade").required = true;
	var estado = document.getElementById("inputEstado").required = true;
	var cep = document.getElementById("inputCep").required = true;
	var pais = document.getElementById("inputPais").required = true;
	
	//Dieta
	var dieta = document.getElementById("inputDieta").required = true;
	var alimento = document.getElementById("inputAlimento").required = true;
	var hora = document.getElementById("inputHora").required = true;
	var caloria = document.getElementById("inputCaloria").required = true;
	var padraoCaloria = document.getElementById("inputCaloriasPadrao").required = true;
	
	//Exercicio
	var ex = document.getElementById("inputExercicio").required = true;
	var tempo = document.getElementById("inputTempo").required = true;
	var padraoTempo = document.getElementById("inputPadraoTempo").required = true;
	var km = document.getElementById("inputKm").required = true;
	var padraoKm = document.getElementById("inputKmPadrao").required = true;
	
	//Peso
	var altura = document.getElementById("inputAltura").required = true;
	var peso = document.getElementById("inputPeso").required = true;
	var padraoPeso = document.getElementById("inputPadraoPeso").required = true;
	
	//Pressao
	var max = document.getElementById("inputMax").required = true;
	var min = document.getElementById("inputMin").required = true;
	var maxPadrao = document.getElementById("inputMaxPad").required = true;
	var minPadrao = document.getElementById("inputMinPad").required = true;
	
	function mandatory(){}
	
}//