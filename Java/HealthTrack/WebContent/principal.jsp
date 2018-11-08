<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<%@ include file="../head.jsp" %>
</head>
<body>
	<%@ include file="../header-principal.jsp" %>
	        
                <section class="container-fluid pt-4">
            <div class="row">
                
                <!-- NAVEGACAO INTERNA -->
                <sidenav class="col-md-3 col-lg-2 m-1 px-sm-0">
                    <div class="nav flex-md-column justify-content-sm-center justify-content-center nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                      <a class="nav-link active menu mx-md-0 my-1 mx-sm-2 px-2" id="v-pills-exercicio-tab" data-toggle="pill" href="#v-pills-exercio" role="tab" aria-controls="v-pills-exercio" aria-selected="true">Exercícios</a>
                      <a class="nav-link menu mx-md-0 mx-sm-4 my-1 px-2" id="v-pills-dieta-tab" data-toggle="pill" href="#v-pills-dieta" role="tab" aria-controls="v-pills-dieta" aria-selected="false">Dieta</a>
                      <a class="nav-link menu mx-md-0 mx-sm-2 my-1 px-2" id="v-pills-pressao-tab" data-toggle="pill" href="#v-pills-pressao" role="tab" aria-controls="v-pills-pressao" aria-selected="false">Pressão Arterial</a>
                      <a class="nav-link menu mx-md-0 mx-sm-2 my-1 px-2" id="v-pills-peso-tab" data-toggle="pill" href="#v-pills-peso" role="tab" aria-controls="v-pills-peso" aria-selected="false">Peso</a>
                    </div>
                </sidenav>
                <!-- FIM NAVEGACAO INTERNA -->
                
                <section class="col py-3 bg-color">
                    <div class="justify-content-lg-center tab-content" id="v-pills-tabContent">
                        
                    <!-- CONTEÚDO Exercicio -->    
                      <div class="tab-pane fade show active" id="v-pills-exercio" role="tabpanel" aria-labelledby="v-pills-home-tab">
                        <div class="row">
                          
                            <div class="col-lg-12 float-md-right">
                                    <div class="bg-light table align-items-stretch rounded box-shadow form-group p-lg-2">
                                        <div class="row pt-1 mx-1">
                                            <div class="col-8 d-flex justify-content-left">
                                                <h1 class="h5 text-center border-bottom border-primary">Tabela</h1>
                                            </div>
                                            <div class="col-4">
                                                <div class="d-flex justify-content-right float-right">
                                                    <!-- Button trigger modal -->
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exercicioModal">
                                                  Novo Exercício
                                                </button>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        
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
                                        
                                       
                                    </div>
                                </div>
                          <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                                <div class="col-12">
                                    <div class="bg-light rounded box-shadow form-group p-2 table">
                                        <div class="d-flex justify-content-left pt-1 mx-3">
                                            <h1 class="h5 text-center border-bottom border-primary">Gráfico</h1>
                                        </div>
                                            
                                    </div>
                                </div>
                            </div>
                          </div>
                            
                        </div>  
                    </div>
                    <!-- FIM CONTEÚDO Exercicio -->
                        
                    
                        
                      <div class="tab-pane fade" id="v-pills-dieta" role="tabpanel" aria-labelledby="v-pills-profile-tab">
                        <div class="bg-color">
                    
                        <!-- CONTEÚDO Dieta -->    
                            <div class="tab-pane fade show active" id="v-pills-dieta" role="tabpanel" aria-labelledby="v-pills-home-tab">
                                <div class="row">
                                    <!-- Insert -->
                            <div class="col-lg-12 float-md-right">
                                    <div class="bg-light table align-items-stretch rounded box-shadow form-group p-lg-2">
                                        <div class="row pt-1 mx-1">
                                            <div class="col-8 d-flex justify-content-left">
                                                <h1 class="h5 text-center border-bottom border-primary">Tabela</h1>
                                            </div>
                                            <div class="col-4">
                                                <div class="d-flex justify-content-right float-right">
                                                <!-- Button trigger modal -->
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
                                                  Novo Dieta
                                                </button>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        
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
                                
                                   <form action="dieta" method="post">
                                       <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputDieta">Refeição do dia</label>
                                          <select id="inputDieta" name="tipo" class="form-control">
                                            <option name="Café da Manhã" value="Café da Manhã">Café da Manhã</option>
                                            <option name="Almoço" value="Almoço">Almoço</option>
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
                                          <label for="inputHora">Horário</label>
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
                                          <label for="inputCaloriasPadrao">Padrão de Calorias</label>
                                          <input type="text" name="padraocaloria" class="form-control" id="inputCaloriasPadrao" placeholder="">
                                        </div>
                                      </div>
                                    </form>
                                </div>
                                <!-- Interno Modal Dieta -->

                                                  
                                              </div>
                                              <div class="modal-footer">
                                                <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
                                                <button type="submit" class="btn col-3 btn-outline-primary">Enviar</button>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                        <!-- END Modal Dieta -->
                                        
                                       
                                    </div>
                                </div>
                          <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                                <div class="col-12">
                                    <div class="bg-light rounded box-shadow form-group p-2 table">
                                        <div class="d-flex justify-content-left pt-1 mx-3">
                                            <h1 class="h5 text-center border-bottom border-primary">Gráfico</h1>
                                        </div>
                                            
                                    </div>
                                </div>
                            </div>
                          </div>
                                
                        <!-- Insert -->
                                </div>
                            </div>
                        <!-- FIM CONTEÚDO Dieta -->
                            
                        </div>
                      </div>
                        
                        
                      <div class="tab-pane fade" id="v-pills-pressao" role="tabpanel" aria-labelledby="v-pills-messages-tab">
                          
                          
                        <!-- CONTEÚDO Pressao -->    
                            <div class="tab-pane fade show active" id="v-pills-pressao" role="tabpanel" aria-labelledby="v-pills-home-tab">
                            <div class="row">
                                <!-- Insert -->
                            <div class="col-lg-12 float-md-right">
                                    <div class="bg-light table align-items-stretch rounded box-shadow form-group p-lg-2">
                                        <div class="row pt-1 mx-1">
                                            <div class="col-8 d-flex justify-content-left">
                                                <h1 class="h5 text-center border-bottom border-primary">Tabela</h1>
                                            </div>
                                            <div class="col-4">
                                                <div class="d-flex justify-content-right float-right">
                                                <!-- Button trigger modal -->
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#pressaoModal">
                                                  Nova Pressão
                                                </button>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        
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
                                    
                                   <form action="pressao" method="post">
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
                                              <div class="modal-footer">
                                                <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
                                                <button type="submit" class="btn col-3 btn-outline-primary">Enviar</button>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                        <!-- END Modal Pressão -->
                                        
                                       
                                    </div>
                                </div>
                          <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                                <div class="col-12">
                                    <div class="bg-light rounded box-shadow form-group p-2 table">
                                        <div class="d-flex justify-content-left pt-1 mx-3">
                                            <h1 class="h5 text-center border-bottom border-primary">Gráfico</h1>
                                        </div>
                                            
                                    </div>
                                </div>
                            </div>
                          </div>
                                
                        <!-- Insert -->
                            
                                
                                
                            </div>

                            
                            

                        </div>
                        <!-- FIM CONTEÚDO Pressao -->
                          
                          
                          
                      </div>
                        <div class="tab-pane fade" id="v-pills-peso" role="tabpanel" aria-labelledby="v-pills-settings-tab">
                            
                            <!-- CONTEÚDO Peso -->    
                            <div class="row">
                                <!-- Insert -->
                            <div class="col-lg-12 float-md-right">
                                    <div class="bg-light table align-items-stretch rounded box-shadow form-group p-lg-2">
                                        <div class="row pt-1 mx-1">
                                            <div class="col-8 d-flex justify-content-left">
                                                <h1 class="h5 text-center border-bottom border-primary">Tabela</h1>
                                            </div>
                                            <div class="col-4">
                                                <div class="d-flex justify-content-right float-right">
                                                <!-- Button trigger modal -->
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#pesoModal">
                                                  Novo Peso
                                                </button>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        
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
                                  
                                   <form action="peso" method="post">
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
                                          <input type="text" name="peso" class="form-control" id="inputPeso">
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
                                              <div class="modal-footer">
                                                <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
                                                <button type="submit" class="btn col-3 btn-outline-primary">Enviar</button>
                                              </div>
                                            </div>
                                          </div>
                                        </div>
                                        <!-- END Modal Peso -->
                                        
                                       
                                    </div>
                                </div>
                          <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                                <div class="col-12">
                                    <div class="bg-light rounded box-shadow form-group p-2 table">
                                        <div class="d-flex justify-content-left pt-1 mx-3">
                                            <h1 class="h5 text-center border-bottom border-primary">Gráfico</h1>
                                        </div>
                                            
                                    </div>
                                </div>
                            </div>
                          </div>
                                
                        <!-- Insert -->
                            </div>
                            <!-- FIM CONTEÚDO Peso -->
                        </div>
                    </div>
                </section>
            </div>
        </section>

</body>
	<%@ include file="../footerjs.jsp" %>
</html>