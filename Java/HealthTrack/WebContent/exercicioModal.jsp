<!-- Modal Exercício -->
                                        <div class="modal fade" id="exercicioModal" tabindex="-1" role="dialog" aria-labelledby="exercicioModalTitle" aria-hidden="true">
                                          <div class="modal-dialog modal-dialog-centered" role="document">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title text-center border-bottom border-primary" id="exercicioModalTitle">Exercício</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                  <span aria-hidden="true">&times;</span>
                                                </button>
                                              </div>
                                              <div class="modal-body">        
                                                
                                                  
                                    <div class="col-lg-12 float-md-left">
                                    <div class="bg-light rounded box-shadow form-group p-3">
                                    <div class="d-flex justify-content-center">
                                    
                                    </div>
                                       <form action="exercicio" method="post">
                                           <div class="form-row">
                                            <div class="form-group col-md-6">
                                              <label for="inputExercicio">Exercício</label>
                                              <select id="inputExercicio" name="exercicio" class="form-control">
                                                <option name="Caminhada" value="Caminhada">Caminhada</option>
                                                <option name="Corrida" value="Corrida">Corrida</option>
                                                <option name="Bicicleta" value="Bicicleta">Bicicleta</option>
                                                <option name="Natação" value="Natação">Natação</option>
                                              </select>
                                            </div>
                                            <div class="form-group col-md-6">
                                              <label for="inputData">Data</label>
                                              <input type="date" name="dataexercicio" class="form-control" id="inputData" placeholder="">
                                            </div>
                                          </div>
                                          <div class="form-row">
                                            <div class="form-group col-md-6">
                                              <label for="inputTempo">Tempo percorrido</label>
                                              <input type="time" name="tempo" class="form-control" id="inputTempo">
                                            </div>
                                            <div class="form-group col-md-6">
                                              <label for="inputPadraoTempo">Padrão de Tempo</label>
                                              <input type="time" name="padraotempo" class="form-control" id="inputPadraoTempo">
                                            </div>
                                          </div>
                                          <div class="form-row">
                                            <div class="form-group col-md-6">
                                              <label for="inputKm">Quilometragem</label>
                                              <input type="text" name="km" class="form-control" id="inputKm" placeholder="">
                                            </div>
                                            <div class="form-group col-md-6">
                                              <label for="inputKmPadrao">Padrão de Quilometragem</label>
                                              <input type="text" name="padraokm" class="form-control" id="inputKmPadrao" placeholder="">
                                            </div>
                                          </div>
                                        </form>
                                    </div>
                                </div>
                                                  
                                                  
                                                  
                                              </div>
                                              <div class="modal-footer">
                                                <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
                                                <button type="submit" class="btn col-3 btn-outline-primary">Enviar</button>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                        <!-- END Modal Exercício -->