 <!-- Modal Press�o -->
                                        <div class="modal fade" id="pressaoModal" tabindex="-1" role="dialog" aria-labelledby="pressaoModalTitle" aria-hidden="true">
                                          <div class="modal-dialog modal-dialog-centered" role="document">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title text-center border-bottom border-primary" id="pressaoModalTitle">Press�o Arterial</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                  <span aria-hidden="true">&times;</span>
                                                </button>
                                              </div>
                                              <div class="modal-body">
                                                
                                            <!-- INSERIR CONTEUDO -->
                                            <!-- Internal Modal Press�o -->
                                <div class="bg-light rounded box-shadow form-group p-3">
                                    
                                   <form action="pressao" method="post">
                                       <div class="form-row">
                                        <div class="form-group col-md-12">
                                          <label for="inputData">Data</label>
                                          <input type="date" name="datapressao" class="form-control" id="inputData" placeholder="">
                                        </div>
                                        
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputMax">Ponto m�ximo da press�o</label>
                                          <input type="number" name="max" class="form-control" id="inputMax">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputMin">Ponto m�nimo da press�o</label>
                                          <input type="number" name="min" class="form-control" id="inputMin">
                                        </div>
                                      </div>
                                       <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputMaxPad">Ponto m�ximo do Padr�o</label>
                                          <input type="number" name="padraomax" class="form-control" id="inputMaxPad">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputMinPad">Ponto m�nimo do Padr�o</label>
                                          <input type="number" name="padraomin" class="form-control" id="inputMinPad">
                                        </div>
                                      </div>
                                    </form>
                                </div>
                                <!-- Internal Modal Press�o -->

                                                  
                                                  
                                              </div>
                                              <div class="modal-footer">
                                                <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
                                                <button type="submit" class="btn col-3 btn-outline-primary">Enviar</button>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                        <!-- END Modal Press�o -->