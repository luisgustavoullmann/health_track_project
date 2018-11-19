<!-- Modal Edição Exercício -->
<form action="exercicio" method="post">
<input type="hidden" value="editar" name="acao">
<input type="hidden" value="${exercicio.codigo}" name="codigo" id="codigoEdit">
	<div class="modal fade" id="exercicioEditModal" tabindex="-1" role="dialog" aria-labelledby="exercicioModalEditTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title text-center border-bottom border-primary" id="exercicioModalEditTitle">Exercício</h5>
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
								<select id="inputExercicio" name="modalidade" value="${exercicio.modalidade}" class="form-control" data-toggle="tooltip" data-placement="top" title="Escolha o tipo de exercício">
									<option name="Caminhada" value="Caminhada">Caminhada</option>
									<option name="Corrida" value="Corrida">Corrida</option>
									<option name="Bicicleta" value="Bicicleta">Bicicleta</option>
									<option name="Natação" value="Natação">Natação</option>
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
								<input type="time" name="tempo" value="${exericio.tempo}" class="form-control" id="inputTempo" data-toggle="tooltip" data-placement="top" title="Tempo do exercício realizado">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPadraoTempo">Padrão de Tempo</label>
								<input type="time" name="padraotempo" value="${exercicio.padraotempo}" class="form-control" id="inputPadraoTempo" data-toggle="tooltip" data-placement="top" title="Padrão de tempo dos seus exercícios">
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputKm">Quilometragem</label>
								<input type="text" name="km" value="${exercicio.km}" class="form-control" id="inputKm" placeholder="" data-toggle="tooltip" data-placement="top" title="Km percorridos">
							</div>
							<div class="form-group col-md-6">
								<label for="inputKmPadrao">Padrão de Quilometragem</label>
								<input type="text" name="padraokm" value="${exercicio.padraokm }" class="form-control" id="inputKmPadrao" placeholder="" data-toggle="tooltip" data-placement="top" title="Padrão de Km do usuário">
							</div>
						</div>
					
					</div>
				</div>
			</div>
			
			<nav>
				<div class="modal-footer nav-item">
					<a href="exercicio?acao=listar">
						<button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
					</a>
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