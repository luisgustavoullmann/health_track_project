<!-- Modal Press�o -->
                                        <div class="modal fade" id="pressaoModalEdit" tabindex="-1" role="dialog" aria-labelledby="pressaoModalEditTitle" aria-hidden="true">
                                          <div class="modal-dialog modal-dialog-centered" role="document">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title text-center border-bottom border-primary" id="pressaoModalEditTitle">Press�o Arterial</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                  <span aria-hidden="true">&times;</span>
                                                </button>
                                              </div>
                                              <div class="modal-body">
                                                
                                            <!-- INSERIR CONTEUDO -->
                                            <!-- Internal Modal Press�o -->
                                <div class="bg-light rounded box-shadow form-group p-3">
                                    
                                    <c:if test="${not empty msg}">
		                        		<div class="alert alert-sucess">${msg}</div>
		                        	</c:if>
		                        	<c:if test="${not empty erro}">
		                        		<div class="alert alert-danger">${erro}</div>
		                        	</c:if>
                                    
                                   <form action="pressao" method="post">
                                   <input type="hidden" value="editar" name="acao">
                                   <input type="hidden" value="${pressao.codigo}" name="codigo" id="codigoEdit">
                                       <div class="form-row">
                                        <div class="form-group col-md-12">
                                          <label for="inputData">Data</label>
                                          <input type="date" name="datapressao" value="${pressao.datapressao.time }" pattern="dd/MM/yyyy"/>' class="form-control" id="inputData" placeholder="">
                                        </div>
                                        
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputMax">Ponto m�ximo da press�o</label>
                                          <input type="number" name="max" value="${pressao.max }" class="form-control" id="inputMax">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputMin">Ponto m�nimo da press�o</label>
                                          <input type="number" name="min" value="${pressao.min }" class="form-control" id="inputMin">
                                        </div>
                                      </div>
                                       <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputMaxPad">Ponto m�ximo do Padr�o</label>
                                          <input type="number" name="padraomax" value="${pressao.padraomax }" class="form-control" id="inputMaxPad">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputMinPad">Ponto m�nimo do Padr�o</label>
                                          <input type="number" name="padraomin" value="${pressao.padraomin }" class="form-control" id="inputMinPad">
                                        </div>
                                      </div>
                                    </form>
                                </div>
                                <!-- Internal Modal Press�o -->

                                                  
                                                  
                                              </div>
                                              
                                              <nav>
                                               <div class="modal-footer nav-item">
	                                             <a href="pressao?acao=listar">
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
                                        <!-- END Modal Press�o -->