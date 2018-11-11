<!-- Modal Dieta -->
                                        <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                                          <div class="modal-dialog modal-dialog-centered" role="document">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title text-center border-bottom border-primary" id="exampleModalCenterTitle">Dieta</h5>
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
                                
                                   <form action="dieta" method="post">
                                       <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputDieta">Refei��o do dia</label>
                                          <select id="inputDieta" name="tipo" class="form-control">
                                            <option name="Caf� da Manh�" value="Caf� da Manh�">Caf� da Manh�</option>
                                            <option name="Almo�o" value="Almo�o">Almo�o</option>
                                            <option name="Lanche" value="Lanche">Lanche</option>
                                            <option name="Jantar" valeu="Jantar">Jantar</option>
                                          </select>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label for=inputAlimento>Alimentos</label>
                                            <input type="text" name="alimento" class="form-control" id="inputAlimento" placeholder="">
                                        </div>
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputHora">Hor�rio</label>
                                          <input type="time" name="horario" class="form-control" id="inputHora" placeholder="00:00:00">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputData">Data</label>
                                          <input type="date" name="dataDieta" class="form-control" id="inputData" placeholder="">
                                        </div>
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputCalorias">Calorias</label>
                                          <input type="text" name="caloria" class="form-control" id="inputKm" placeholder="">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputCaloriasPadrao">Padr�o de Calorias</label>
                                          <input type="text" name="padraocaloria" class="form-control" id="inputCaloriasPadrao" placeholder="">
                                        </div>
                                      </div>
                                    </form>
                                </div>
                                <!-- Interno Modal Dieta -->

                                                  
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
                                        <!-- END Modal Dieta -->