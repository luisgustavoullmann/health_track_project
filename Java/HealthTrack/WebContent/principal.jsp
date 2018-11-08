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
                      <a class="nav-link active menu mx-md-0 my-1 mx-sm-2 px-2" id="v-pills-exercicio-tab" data-toggle="pill" href="#v-pills-exercio" role="tab" aria-controls="v-pills-exercio" aria-selected="true">Exerc�cios</a>
                      <a class="nav-link menu mx-md-0 mx-sm-4 my-1 px-2" id="v-pills-dieta-tab" data-toggle="pill" href="#v-pills-dieta" role="tab" aria-controls="v-pills-dieta" aria-selected="false">Dieta</a>
                      <a class="nav-link menu mx-md-0 mx-sm-2 my-1 px-2" id="v-pills-pressao-tab" data-toggle="pill" href="#v-pills-pressao" role="tab" aria-controls="v-pills-pressao" aria-selected="false">Press�o Arterial</a>
                      <a class="nav-link menu mx-md-0 mx-sm-2 my-1 px-2" id="v-pills-peso-tab" data-toggle="pill" href="#v-pills-peso" role="tab" aria-controls="v-pills-peso" aria-selected="false">Peso</a>
                    </div>
                </sidenav>
                <!-- FIM NAVEGACAO INTERNA -->
                
                <section class="col py-3 bg-color">
                    <div class="justify-content-lg-center tab-content" id="v-pills-tabContent">
                        
                    <!-- CONTE�DO Exercicio -->    
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
                                                  Novo Exerc�cio
                                                </button>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        
                            <!-- Modal Exerc�cio -->
                                        <div class="modal fade" id="exercicioModal" tabindex="-1" role="dialog" aria-labelledby="exercicioModalTitle" aria-hidden="true">
                                          <div class="modal-dialog modal-dialog-centered" role="document">
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <h5 class="modal-title text-center border-bottom border-primary" id="exercicioModalTitle">Exerc�cio</h5>
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
                                              <label for="inputExercicio">Exerc�cio</label>
                                              <select id="inputExercicio" name="exercicio" class="form-control">
                                                <option selected>Selecione</option>
                                                <option>Caminhada</option>
                                                <option>Corrida</option>
                                                <option>Bicicleta</option>
                                                <option>Nata��o</option>
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
                                              <label for="inputPadraoTempo">Padr�o de Tempo</label>
                                              <input type="time" name="padraotempo" class="form-control" id="inputPadraoTempo">
                                            </div>
                                          </div>
                                          <div class="form-row">
                                            <div class="form-group col-md-6">
                                              <label for="inputKm">Quilometragem</label>
                                              <input type="text" name="km" class="form-control" id="inputKm" placeholder="">
                                            </div>
                                            <div class="form-group col-md-6">
                                              <label for="inputKmPadrao">Padr�o de Quilometragem</label>
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
                                        <!-- END Modal Exerc�cio -->
                                        
                                       
                                    </div>
                                </div>
                          <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                                <div class="col-12">
                                    <div class="bg-light rounded box-shadow form-group p-2 table">
                                        <div class="d-flex justify-content-left pt-1 mx-3">
                                            <h1 class="h5 text-center border-bottom border-primary">Gr�fico</h1>
                                        </div>
                                            
                                    </div>
                                </div>
                            </div>
                          </div>
                            
                        </div>  
                    </div>
                    <!-- FIM CONTE�DO Exercicio -->
                        
                    
                        
                      <div class="tab-pane fade" id="v-pills-dieta" role="tabpanel" aria-labelledby="v-pills-profile-tab">
                        <div class="bg-color">
                    
                        <!-- CONTE�DO Dieta -->    
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
                                          <label for="inputDieta">Refei��o do dia</label>
                                          <select id="inputDieta" name="refeicao" class="form-control">
                                            <option selected>Selecione</option>
                                            <option>Caf� da Manh�</option>
                                            <option>Almo�o</option>
                                            <option>Lanche</option>
                                            <option>Jantar</option>
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
                                          <input type="date" name="datacaloria" class="form-control" id="inputData" placeholder="">
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
                                            <h1 class="h5 text-center border-bottom border-primary">Gr�fico</h1>
                                        </div>
                                            
                                    </div>
                                </div>
                            </div>
                          </div>
                                
                        <!-- Insert -->
                                </div>
                            </div>
                        <!-- FIM CONTE�DO Dieta -->
                            
                        </div>
                      </div>
                        
                        
                      <div class="tab-pane fade" id="v-pills-pressao" role="tabpanel" aria-labelledby="v-pills-messages-tab">
                          
                          
                        <!-- CONTE�DO Pressao -->    
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
                                                  Nova Press�o
                                                </button>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        
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
                                        
                                       
                                    </div>
                                </div>
                          <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                                <div class="col-12">
                                    <div class="bg-light rounded box-shadow form-group p-2 table">
                                        <div class="d-flex justify-content-left pt-1 mx-3">
                                            <h1 class="h5 text-center border-bottom border-primary">Gr�fico</h1>
                                        </div>
                                            
                                    </div>
                                </div>
                            </div>
                          </div>
                                
                        <!-- Insert -->
                            
                                
                                
                            </div>

                            
                            

                        </div>
                        <!-- FIM CONTE�DO Pressao -->
                          
                          
                          
                      </div>
                        <div class="tab-pane fade" id="v-pills-peso" role="tabpanel" aria-labelledby="v-pills-settings-tab">
                            
                            <!-- CONTE�DO Peso -->    
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
                                          <label for="inputPadraoPeso">Padr�o de Peso</label>
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
                                            <h1 class="h5 text-center border-bottom border-primary">Gr�fico</h1>
                                        </div>
                                            
                                    </div>
                                </div>
                            </div>
                          </div>
                                
                        <!-- Insert -->
                            </div>
                            <!-- FIM CONTE�DO Peso -->
                        </div>
                    </div>
                </section>
            </div>
        </section>

</body>
	<%@ include file="../footerjs.jsp" %>
</html>