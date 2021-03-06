<!-- Modal Edi��o Exerc�cio -->
<form action="exercicio" method="post">
<input type="hidden" value="editar" name="acao">
<input type="hidden" value="${exercicio.codigo}" name="codigo" id="codigoEdit">
	<div class="modal fade" id="exercicioEditModal" tabindex="-1" role="dialog" aria-labelledby="exercicioModalEditTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title text-center border-bottom border-primary" id="exercicioModalEditTitle">Exerc�cio</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
			</div>
			<div class="modal-body">        
				
				<div class="col-lg-12 float-md-left">
					<div class="bg-light rounded box-shadow form-group p-3">
						<div class="d-flex justify-content-center">
						
							<c:if test="${not empty msg}">
								<div class="alert alert-sucess">${msg}</div>
							</c:if>
							<c:if test="${not empty erro}">
								<div class="alert alert-danger">${erro}</div>
							</c:if>
						
						</div>
						
						
						
						
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputExercicio">Exerc�cio</label>
								<select id="inputExercicio" name="modalidade" value="${exercicio.modalidade}" class="form-control" data-toggle="tooltip" data-placement="top" title="Escolha o tipo de exerc�cio">
									<option name="Caminhada" value="Caminhada">Caminhada</option>
									<option name="Corrida" value="Corrida">Corrida</option>
									<option name="Bicicleta" value="Bicicleta">Bicicleta</option>
									<option name="Nata��o" value="Nata��o">Nata��o</option>
								</select>
							</div>
							<div class="form-group col-md-6">
								<label for="inputData">Data</label>
								<input type="date" name="dataexercicio" value='<fmt:formatDate value="${exercicio.dataexercicio.time }" pattern="dd/MM/yyyy"/>' class="form-control" id="inputData" placeholder="">
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputTempo">Tempo percorrido</label>
								<input type="time" name="tempo" value="${exericio.tempo}" class="form-control" id="inputTempo" data-toggle="tooltip" data-placement="top" title="Tempo do exerc�cio realizado">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPadraoTempo">Padr�o de Tempo</label>
								<input type="time" name="padraotempo" value="${exercicio.padraotempo}" class="form-control" id="inputPadraoTempo" data-toggle="tooltip" data-placement="top" title="Padr�o de tempo dos seus exerc�cios">
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputKm">Quilometragem</label>
								<input type="text" name="km" value="${exercicio.km}" class="form-control" id="inputKm" placeholder="" data-toggle="tooltip" data-placement="top" title="Km percorridos">
							</div>
							<div class="form-group col-md-6">
								<label for="inputKmPadrao">Padr�o de Quilometragem</label>
								<input type="text" name="padraokm" value="${exercicio.padraokm }" class="form-control" id="inputKmPadrao" placeholder="" data-toggle="tooltip" data-placement="top" title="Padr�o de Km do usu�rio">
							</div>
						</div>
					
					</div>
				</div>
			</div>
			
			<nav>
				<div class="modal-footer nav-item">
					<button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
					<button type="submit" class="btn btn-outline-primary" onclick="mandatory">Enviar</button>
				</div>
			</nav>
			</div>
		</div>
	</div>
</form>
<!-- END Modal Exerc�cio -->