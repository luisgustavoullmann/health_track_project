<!-- Modal Peso -->
<form action="peso" method="post">
<input type="hidden" name="acao" value="excluir">
<input type="hidden" name="codigo" id="codigoDelete">
<div class="modal fade" id="pesoModalDelete" tabindex="-1" role="dialog" aria-labelledby="pesoModalDeleteTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title text-center border-bottom border-primary" id="pesoModalDeleteTitle">Dieta</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">


      	<p>Deseja realmente excluir?</p>

      </div>

      <nav>
       <div class="modal-footer nav-item">

            <a href="dieta?acao=listar">
                <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
            </a>
            <a class="" href="principal.jsp">
                <button type="submit" class="btn btn-outline-primary">Enviar</button>
            </a>

          </div>
      </nav>

    </div>
  </div>
</div>
</form>
<!-- END Modal Peso -->