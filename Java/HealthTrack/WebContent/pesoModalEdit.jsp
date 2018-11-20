<!-- Modal Peso -->
<form action="peso" method="post">
<input type="hidden" value="editar" name="acao">
<input type="hidden" value="${peso.codigo}" name="codigo" id="codigoEdit">
<div class="modal fade" id="pesoModalEdit" tabindex="-1" role="dialog" aria-labelledby="pesoModalEditTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title text-center border-bottom border-primary" id="pesoModalEditTitle">Peso</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">

      <!-- INSERIR CONTEUDO -->
      <!-- Internal Modal Peso -->
        <div class="bg-light rounded box-shadow form-group p-3">

           <c:if test="${not empty msg}">
                <div class="alert alert-sucess">${msg}</div>
            </c:if>
            <c:if test="${not empty erro}">
                <div class="alert alert-danger">${erro}</div>
            </c:if>
               <div class="form-row">
                <div class="form-group col-md-6">
                  <label for="inputData">Data</label>
                  <input type="date" name="datapeso" value='<fmt:formatDate value="${peso.datapeso.time }" pattern="dd/MM/yyyy"/>' class="form-control" id="inputData" placeholder="" data-toggle="tooltip" data-placement="top" title="Data da pesagem">
                </div>
                <div class="form-group col-md-6">
                  <label for="inputAltura">Altura</label>
                  <input type="text" name="altura" value="${peso.altura }" class="form-control" id="inputAltura" placeholder="" data-toggle="tooltip" data-placement="top" title="Insira a sua altura">
                </div>
              </div>
              <div class="form-row">
                <div class="form-group col-md-6">
                  <label for="inputPeso">Peso</label>
                  <input type="text" name="pesagem" value="${peso.pesagem }" class="form-control" id="inputPeso" data-toggle="tooltip" data-placement="top" title="Insira seu peso">
                </div>
                <div class="form-group col-md-6">
                  <label for="inputPadraoPeso">Padrão de Peso</label>
                  <input type="text" name="padraopeso" value="${peso.padraopeso }" class="form-control" id="inputPadraoPeso" placeholder="" data-toggle="tooltip" data-placement="top" title="Insira o padrão de peso">
                </div>
              </div>
        </div>
        <!-- Internal Modal Peso -->

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
<!-- END Modal Peso -->