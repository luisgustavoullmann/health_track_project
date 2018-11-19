<!-- Modal Exercício -->
<form action="exercicio" method="post">
<input type="hidden" value="cadastrar" name="acao">
	<div class="modal fade" id="exercicioModal" tabindex="-1" role="dialog" aria-labelledby="exercicioModalTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title text-center border-bottom border-primary" id="exercicioModalTitle">Exercício</h5>
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
							<label for="inputExercicio">Exercício</label>
							<select id="inputExercicio" name="modalidade" class="form-control" data-toggle="tooltip" data-placement="top" title="Escolha um excercício">
								<option name="Caminhada" value="Caminhada">Caminhada</option>
								<option name="Corrida" value="Corrida">Corrida</option>
								<option name="Bicicleta" value="Bicicleta">Bicicleta</option>
								<option name="Natação" value="Natação">Natação</option>
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
							<label for="inputPadraoTempo">Padrão de Tempo</label>
							<input type="time" name="padraotempo" class="form-control" id="inputPadraoTempo" data-toggle="tooltip" data-placement="top" title="Insira o padrão de tempo">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputKm">Quilometragem</label>
							<input type="text" name="km" class="form-control" id="inputKm" placeholder="" data-toggle="tooltip" data-placement="top" title="Insira os km percorridos">
						</div>
						<div class="form-group col-md-6">
							<label for="inputKmPadrao">Padrão de Quilometragem</label>
							<input type="text" name="padraokm" class="form-control" id="inputKmPadrao" placeholder="" data-toggle="tooltip" data-placement="top" title="Padrão de km">
						</div>
					</div>
					</form>
					</div>
					</div>

				</div>
				
				<nav>
					<div class="modal-footer nav-item">
						<button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
						<a class="" href="principal.jsp">
							<button type="submit" class="btn btn-outline-primary" onclick="mandatory">Enviar</button>
						</a>
					</div>
				</nav>
			
			</div>
		</div>
	</div>
</form>
<!-- END Modal Exercício -->