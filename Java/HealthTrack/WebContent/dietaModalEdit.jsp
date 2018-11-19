<!-- Modal Dieta -->
									<form action="dieta" method="post">
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
				                                
				                                   
				                                   <input type="hidden" value="editar" name="acao">
				                                   <input type="hidden" value="${dieta.codigo}" name="codigo" id="codigoEdit">
				                                       <div class="form-row">
				                                        <div class="form-group col-md-6">
				                                          <label for="inputDieta">Refeição do dia</label>
				                                          <select id="inputDieta" name="tipo" value="${dieta.tipo }" class="form-control">
				                                            <option name="Café da Manhã" value="Café da Manhã">Café da Manhã</option>
				                                            <option name="Almoço" value="Almoço">Almoço</option>
				                                            <option name="Lanche" value="Lanche">Lanche</option>
				                                            <option name="Jantar" valeu="Jantar">Jantar</option>
				                                          </select>
				                                        </div>
				                                        <div class="form-group col-md-6">
				                                            <label for=inputAlimento>Alimentos</label>
				                                            <input type="text" name="alimento" value="${dieta.alimento }" class="form-control" id="inputAlimento" placeholder="">
				                                        </div>
				                                      </div>
				                                      <div class="form-row">
				                                        <div class="form-group col-md-6">
				                                          <label for="inputHora">Horário</label>
				                                          <input type="time" name="horario" value="${dieta.horario } class="form-control" id="inputHora" placeholder="00:00:00">
				                                        </div>
				                                        <div class="form-group col-md-6">
				                                          <label for="inputData">Data</label>
				                                          <input type="date" name="dataDieta" value='<fmt:formatDate value="${dieta.dataexercicio.time }" pattern="dd/MM/yyyy"/>' class="form-control" id="inputData" placeholder=""> 
				                                        </div>
				                                      </div>
				                                      <div class="form-row">
				                                        <div class="form-group col-md-6">
				                                          <label for="inputCalorias">Calorias</label>
				                                          <input type="text" name="caloria" value="${dieta.caloria }" class="form-control" id="inputCaloria" placeholder="">
				                                        </div>
				                                        <div class="form-group col-md-6">
				                                          <label for="inputCaloriasPadrao">Padrão de Calorias</label>
				                                          <input type="text" name="padraocaloria" value="${dieta.padraocaloria }" class="form-control" id="inputCaloriasPadrao" placeholder="">
				                                        </div>
				                                      </div>
				                                    
				                                </div>
				                                <!-- Interno Modal Dieta -->

                                              
                                              </div>
                                              
                                              
                                              <nav>
                                               <div class="modal-footer nav-item">
                                               
                                               <input type="hidden" name="acao" value="editar">
                                               <input type="hidden" name="codigo" id="codigoEdit">
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