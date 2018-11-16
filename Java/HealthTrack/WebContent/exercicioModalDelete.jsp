<!-- Modal Exercício -->
									<form action="exercicio" method="post">	
                                        <div class="modal fade" id="exercicioModalDelete" tabindex="-1" role="dialog" aria-labelledby="exercicioModalDeleteTitle" aria-hidden="true">
                                          <div class="modal-dialog modal-dialog-centered" role="document">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title text-center border-bottom border-primary" id="exercicioModalDeleteTitle">Exercício</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                  <span aria-hidden="true">&times;</span>
                                                </button>
                                              </div>
                                              <div class="modal-body">        
                                                  
                                                  <p>Deseja realmente excluir/</p>
                                                  
                                              </div>
                                              <nav>
                                               <div class="modal-footer nav-item">
                                               	<input type="hidden" name="acao" value="excluir">
                                               	<input type="hidden" name="codigo" id="codigoDelete">
	                                             <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
	                                                <a class="" href="principal.jsp">
	                                                	<button type="submit" class="btn btn-outline-primary">Enviar</button>
	                                                </a>
	                                              </div>
                                              </nav>
                                              
                                            </div>
                                          </div>
                                        </div>
                                        </form>
                                        <!-- END Modal Exercício -->