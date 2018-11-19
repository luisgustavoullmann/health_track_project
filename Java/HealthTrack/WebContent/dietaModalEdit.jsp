<!-- Modal Dieta -->
<form action="dieta" method="post">
<input type="hidden" value="editar" name="acao">
<input type="hidden" value="${dieta.codigo}" name="codigo" id="codigoEdit">
	<div class="modal fade" id="dietaModalEdit" tabindex="-1" role="dialog" aria-labelledby="exampleModalEditTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title text-center border-bottom border-primary" id="exampleModalEditTitle">Dieta</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
				
					<!-- INSERIR CONTEUDO -->
					<!-- Interno Modal Dieta -->
					<div class="bg-light rounded box-shadow form-group p-3">
					
						<c:if test="${not empty msg}">
							<div class="alert alert-sucess">${msg}</div>
						</c:if>
						<c:if test="${not empty erro}">
							<div class="alert alert-danger">${erro}</div>
						</c:if>
						
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputDieta">Refei��o do dia</label>
								<select id="inputDieta" name="tipo" value="${dieta.tipo }" class="form-control" data-toggle="tooltip" data-placement="top" title="Escolha uma refei��o">
									<option name="Caf� da Manh�" value="Caf� da Manh�">Caf� da Manh�</option>
									<option name="Almo�o" value="Almo�o">Almo�o</option>
									<option name="Lanche" value="Lanche">Lanche</option>
									<option name="Jantar" valeu="Jantar">Jantar</option>
								</select>
							</div>
							<div class="form-group col-md-6">
								<label for=inputAlimento>Alimentos</label>
								<input type="text" name="alimento" value="${dieta.alimento }" class="form-control" id="inputAlimento" placeholder="" data-toggle="tooltip" data-placement="top" title="Insira qual alimento consumido">
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputHora">Hor�rio</label>
								<input type="time" name="horario" value="${dieta.horario } class="form-control" id="inputHora" placeholder="00:00:00" data-toggle="tooltip" data-placement="top" title="Hor�rio da refei��o">
							</div>
							<div class="form-group col-md-6">
								<label for="inputData">Data</label>
								<input type="date" name="dataDieta" value='<fmt:formatDate value="${dieta.dataDieta.time }" pattern="dd/MM/yyyy"/>' class="form-control" id="inputData" placeholder=""> 
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputCalorias">Calorias</label>
								<input type="text" name="caloria" value="${dieta.caloria }" class="form-control" id="inputCaloria" placeholder="" data-toggle="tooltip" data-placement="top" title="Calorias consumidas">
							</div>
							<div class="form-group col-md-6">
								<label for="inputCaloriasPadrao">Padr�o de Calorias</label>
								<input type="text" name="padraocaloria" value="${dieta.padraocaloria }" class="form-control" id="inputCaloriasPadrao" placeholder="" data-toggle="tooltip" data-placement="top" title="Padr�o de Calorias">
							</div>
						</div>
					</div>
					<!-- Interno Modal Dieta -->
	
				</div>
				<nav>
					<div class="modal-footer nav-item">
						<a href="dieta?acao=listar">
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
<!-- END Modal Dieta -->