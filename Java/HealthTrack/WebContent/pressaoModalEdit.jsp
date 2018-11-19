<!-- Modal Pressão -->
<form action="pressao" method="post">
<input type="hidden" value="editar" name="acao">
<input type="hidden" value="${pressao.codigo}" name="codigo" id="codigoEdit">
	<div class="modal fade" id="pressaoModalEdit" tabindex="-1" role="dialog" aria-labelledby="pressaoModalEditTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title text-center border-bottom border-primary" id="pressaoModalEditTitle">Pressão Arterial</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
				
					<!-- INSERIR CONTEUDO -->
					<!-- Internal Modal Pressão -->
					<div class="bg-light rounded box-shadow form-group p-3">
					
						<c:if test="${not empty msg}">
							<div class="alert alert-sucess">${msg}</div>
						</c:if>
						<c:if test="${not empty erro}">
							<div class="alert alert-danger">${erro}</div>
						</c:if>
						
						<div class="form-row">
							<div class="form-group col-md-12">
								<label for="inputData">Data</label>
								<input type="date" name="datapressao" value='<fmt:formatDate value="${pressao.datapressao.time }" pattern="dd/MM/yyyy"/>' class="form-control" id="inputData" placeholder="">
							</div>						
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputMax">Ponto máximo da pressão</label>
								<input type="number" name="max" value="${pressao.max }" class="form-control" id="inputMax" data-toggle="tooltip" data-placement="top" title="Ponto máximo da pressão">
							</div>
							<div class="form-group col-md-6">
								<label for="inputMin">Ponto mínimo da pressão</label>
								<input type="number" name="min" value="${pressao.min }" class="form-control" id="inputMin" data-toggle="tooltip" data-placement="top" title="Ponto mínimo da pressão">
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputMaxPad">Ponto máximo do Padrão</label>
								<input type="number" name="padraomax" value="${pressao.padraomax }" class="form-control" id="inputMaxPad" data-toggle="tooltip" data-placement="top" title="Padrão máximo">
							</div>
							<div class="form-group col-md-6">
								<label for="inputMinPad">Ponto mínimo do Padrão</label>
								<input type="number" name="padraomin" value="${pressao.padraomin }" class="form-control" id="inputMinPad" data-toggle="tooltip" data-placement="top" title="Padrão mínimo">
							</div>
						</div>
					
					</div>
					<!-- Internal Modal Pressão -->
				</div>
				
				<nav>
					<div class="modal-footer nav-item">
						<a href="pressao?acao=listar">
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
<!-- END Modal Pressão -->