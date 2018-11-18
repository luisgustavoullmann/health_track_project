<!-- Modal Peso -->
                                   <form action="peso" method="post">
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
				                                  
				                                   
				                                   <input type="hidden" value="editar" name="acao">
				                                   <input type="hidden" value="${peso.codigo}" name="codigo" id="codigoEdit">
				                                       <div class="form-row">
				                                        <div class="form-group col-md-6">
				                                          <label for="inputData">Data</label>
				                                          <input type="date" name="datapeso" value='<fmt:formatDate value="${peso.dataexercicio.time }" pattern="dd/MM/yyyy"/>' class="form-control" id="inputData" placeholder="">
				                                        </div>
				                                        <div class="form-group col-md-6">
				                                          <label for="inputAltura">Altura</label>
				                                          <input type="text" name="altura" value="${peso.altura }" class="form-control" id="inputAltura" placeholder="">
				                                        </div>
				                                      </div>
				                                      <div class="form-row">
				                                        <div class="form-group col-md-6">
				                                          <label for="inputPeso">Peso</label>
				                                          <input type="text" name="pesagem" value="${peso.pesagem }" class="form-control" id="inputPeso">
				                                        </div>
				                                        <div class="form-group col-md-6">
				                                          <label for="inputPadraoPeso">Padrão de Peso</label>
				                                          <input type="text" name="padraopeso" value="${peso.padraopeso }" class="form-control" id="inputPadraoPeso" placeholder="">
				                                        </div>
				                                      </div>
				                                      
				                                    
				                                </div>
				                                <!-- Internal Modal Peso -->

                                                  
                                              </div>
                                              
                                              <nav>
                                               <div class="modal-footer nav-item">
                                               
                                               <input type="hidden" name="acao" value="editar">
                                               <input type="hidden" name="codigo" id="codigoEdit">
	                                             <a href="peso?acao=listar">
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