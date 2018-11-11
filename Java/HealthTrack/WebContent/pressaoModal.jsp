 <!-- Modal Pressão -->
                                        <div class="modal fade" id="pressaoModal" tabindex="-1" role="dialog" aria-labelledby="pressaoModalTitle" aria-hidden="true">
                                          <div class="modal-dialog modal-dialog-centered" role="document">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title text-center border-bottom border-primary" id="pressaoModalTitle">Pressão Arterial</h5>
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
                                    
                                   <form action="pressao" method="post">
                                   <input type="hidden" value="pressao" name="acao">
                                       <div class="form-row">
                                        <div class="form-group col-md-12">
                                          <label for="inputData">Data</label>
                                          <input type="date" name="datapressao" class="form-control" id="inputData" placeholder="">
                                        </div>
                                        
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputMax">Ponto máximo da pressão</label>
                                          <input type="number" name="max" class="form-control" id="inputMax">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputMin">Ponto mínimo da pressão</label>
                                          <input type="number" name="min" class="form-control" id="inputMin">
                                        </div>
                                      </div>
                                       <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputMaxPad">Ponto máximo do Padrão</label>
                                          <input type="number" name="padraomax" class="form-control" id="inputMaxPad">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputMinPad">Ponto mínimo do Padrão</label>
                                          <input type="number" name="padraomin" class="form-control" id="inputMinPad">
                                        </div>
                                      </div>
                                    </form>
                                </div>
                                <!-- Internal Modal Pressão -->

                                                  
                                                  
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
                                        <!-- END Modal Pressão -->