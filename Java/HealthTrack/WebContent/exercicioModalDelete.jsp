<!-- Modal Exerc�cio -->
                                        <div class="modal fade" id="exercicioModalDelete" tabindex="-1" role="dialog" aria-labelledby="exercicioModalDeleteTitle" aria-hidden="true">
                                          <div class="modal-dialog modal-dialog-centered" role="document">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title text-center border-bottom border-primary" id="exercicioModalDeleteTitle">Exerc�cio</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                  <span aria-hidden="true">&times;</span>
                                                </button>
                                              </div>
                                              <div class="modal-body">        
                                                  
                                                  <p>Deseja realmente excluir/</p>
                                                  
                                              </div>
                                              <nav>
                                               <div class="modal-footer nav-item">
                                               <form action="exercicio" method="post">
                                               	<input type="hidden" name="acao" value="excluir">
                                               	<input type="hidden" name="codigo" id="codigoDelete">
	                                             <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
	                                                <a class="" href="principal.jsp">
	                                                	<button type="submit" class="btn btn-outline-primary">Enviar</button>
	                                                </a>
	                                               </form>
	                                              </div>
                                              </nav>
                                              
                                            </div>
                                          </div>
                                        </div>
                                        <!-- END Modal Exerc�cio -->