<!-- Modal Exerc�cio -->
<form action="exercicio" method="post">
<input type="hidden" value="cadastrar" name="acao">
	<div class="modal fade" id="exercicioModal" tabindex="-1" role="dialog" aria-labelledby="exercicioModalTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title text-center border-bottom border-primary" id="exercicioModalTitle">Exerc�cio</h5>
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
							<select id="inputExercicio" name="modalidade" class="form-control" data-toggle="tooltip" data-placement="top" title="Escolha um excerc�cio">
								<option name="Caminhada" value="Caminhada">Caminhada</option>
								<option name="Corrida" value="Corrida">Corrida</option>
								<option name="Bicicleta" value="Bicicleta">Bicicleta</option>
								<option name="Nata��o" value="Nata��o">Nata��o</option>
							</select>
						</div>
						<div class="form-group col-md-6">
							<label for="inputData">Data</label>
							<input type="date" name="dataexercicio" class="form-control" id="inputData" placeholder="">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputTempo">Tempo percorrido</label>
							<input type="time" name="tempo" class="form-control" id="inputTempo" data-toggle="tooltip" data-placement="top" title="Insira o tempo">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPadraoTempo">Padr�o de Tempo</label>
							<input type="time" name="padraotempo" class="form-control" id="inputPadraoTempo" data-toggle="tooltip" data-placement="top" title="Insira o padr�o de tempo">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputKm">Quilometragem</label>
							<input type="text" name="km" class="form-control" id="inputKm" placeholder="" data-toggle="tooltip" data-placement="top" title="Insira os km percorridos">
						</div>
						<div class="form-group col-md-6">
							<label for="inputKmPadrao">Padr�o de Quilometragem</label>
							<input type="text" name="padraokm" class="form-control" id="inputKmPadrao" placeholder="" data-toggle="tooltip" data-placement="top" title="Padr�o de km">
						</div>
					</div>
					</form>
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