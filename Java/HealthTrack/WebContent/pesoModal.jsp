 <!-- Modal Peso -->
                                        <div class="modal fade" id="pesoModal" tabindex="-1" role="dialog" aria-labelledby="pesoModalTitle" aria-hidden="true">
                                          <div class="modal-dialog modal-dialog-centered" role="document">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title text-center border-bottom border-primary" id="pesoModalTitle">Peso</h5>
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
                                  
                                   <form action="peso" method="post">
                                   <input type="hidden" value="peso" name="acao">
                                       <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputData">Data</label>
                                          <input type="date" name="datapeso" class="form-control" id="inputData" placeholder="">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputAltura">Altura</label>
                                          <input type="text" name="altura" class="form-control" id="inputAltura" placeholder="">
                                        </div>
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputPeso">Peso</label>
                                          <input type="text" name="pesagem" class="form-control" id="inputPeso">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputPadraoPeso">Padrão de Peso</label>
                                          <input type="text" name="padraopeso" class="form-control" id="inputPadraoPeso" placeholder="">
                                        </div>
                                      </div>
                                      
                                    </form>
                                </div>
                                <!-- Internal Modal Peso -->

                                                  
                                              </div>
                                              
                                              <nav>
                                               <div class="modal-footer nav-item">
	                                             <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
	                                                <a class="" href="principal.jsp">
	                                                	<button type="submit" class="btn btn-outline-primary">Enviar</button>
	                                                </a>
	                                              </div>
                                              </nav>
                                              
                                              
                                            </div>
                                          </div>
                                        </div>
                                        <!-- END Modal Peso -->