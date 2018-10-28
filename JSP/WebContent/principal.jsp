<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<%@ include file="head.jsp" %>
</head>
<body>
	 <header class="container">
            <div class="row">
                <div class="col-12 mb-5">
                    <nav class="navbar navbar-expand-md navbar-light bg-light fixed-top box-shadow py-2 px-5">
                      <a class="navbar-brand font-weight-bold" href="index.html">HEALTH TRACK</a>
                      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                      </button>

                      <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto">
                          <li class="nav-item disabled">
                            <a class="nav-link menu" href="#">Dados <span class="sr-only">(current)</span></a>
                          </li>                      
                          <li class="nav-item">
                            
                          </li>
                            <li class="nav-item">
                                <form class="form-inline my-lg- my-lg-0">
                                <a href="#"><button class="btn btn-outline-primary ml-md-2" href="index.html" type="submit">Sair</button></a>         
                            </form>
                          </li>
                        </ul>
                      </div>
                    </nav>
                </div>
            </div>
        </header>
        
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
                                <div class="col-lg-5 float-md-left">
                                    <div class="bg-light rounded box-shadow form-group p-3">
                                    <h1 class="h6 text-center">Novo Exerc�cio</h1>
                                       <form>
                                           <div class="form-row">
                                            <div class="form-group col-md-6">
                                              <label for="inputExercicio">Exerc�cio</label>
                                              <select id="inputExercicio" class="form-control">
                                                <option selected>Selecione</option>
                                                <option>Caminhada</option>
                                                <option>Corrida</option>
                                                <option>Bicicleta</option>
                                                <option>Nata��o</option>
                                              </select>
                                            </div>
                                            <div class="form-group col-md-6">
                                              <label for="inputData">Data</label>
                                              <input type="date" class="form-control" id="inputData" placeholder="">
                                            </div>
                                          </div>
                                          <div class="form-row">
                                            <div class="form-group col-md-6">
                                              <label for="inputTempo">Tempo percorrido</label>
                                              <input type="time" class="form-control" id="inputTempo">
                                            </div>
                                            <div class="form-group col-md-6">
                                              <label for="inputPadraoTempo">Padr�o de Tempo</label>
                                              <input type="time" class="form-control" id="inputPadraoTempo">
                                            </div>
                                          </div>
                                          <div class="form-row">
                                            <div class="form-group col-md-6">
                                              <label for="inputKm">Quilometragem</label>
                                              <input type="text" class="form-control" id="inputKm" placeholder="">
                                            </div>
                                            <div class="form-group col-md-6">
                                              <label for="inputKmPadrao">Padr�o de Quilometragem</label>
                                              <input type="text" class="form-control" id="inputKmPadrao" placeholder="">
                                            </div>
                                          </div>
                                          <button type="submit" class="btn col-3 btn-outline-primary">Enviar</button>
                                        </form>
                                    </div>
                                </div>
                                
                                <div class="col-lg-7 float-md-right">
                                    <div class="bg-light table rounded box-shadow form-group p-lg-2">
                                    <h1 class="h6 text-center">Tabela</h1>
                                       <p>-------</p>
                                    </div>
                                </div>
                          <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                                <div class="col-12">
                                    <div class="bg-light rounded box-shadow form-group p-2">
                                        <h1 class="h6 text-center">Gr�fico</h1>
                                            <p>-------</p>
                                            <p>-------</p>
                                            <p>-------</p>
                                            <p>-------</p>
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
                            <div class="col-lg-5 float-md-left">
                                <div class="bg-light rounded box-shadow form-group p-3">
                                <h1 class="h6 text-center">Nova Dieta</h1>
                                   <form>
                                       <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputDieta">Refei��o do dia</label>
                                          <select id="inputDieta" class="form-control">
                                            <option selected>Selecione</option>
                                            <option>Caf� da Manh�</option>
                                            <option>Almo�o</option>
                                            <option>Lanche</option>
                                            <option>Jantar</option>
                                          </select>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label for=inputAlimento>Alimentos</label>
                                            <input type="text" class="form-control" id="inputAlimento" placeholder="">
                                        </div>
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputHora">Hor�rio</label>
                                          <input type="time" class="form-control" id="inputHora" placeholder="00:00:00">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputData">Data</label>
                                          <input type="date" class="form-control" id="inputData" placeholder="">
                                        </div>
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputCalorias">Calorias</label>
                                          <input type="text" class="form-control" id="inputKm" placeholder="">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputCaloriasPadrao">Padr�o de Calorias</label>
                                          <input type="text" class="form-control" id="inputCaloriasPadrao" placeholder="">
                                        </div>
                                      </div>
                                      <button type="submit" class="btn col-3 btn-outline-primary">Enviar</button>
                                    </form>
                                </div>
                            </div>

                            <div class="col-lg-7 float-md-right">
                                <div class="bg-light table rounded box-shadow form-group p-lg-2">
                                <h1 class="h6 text-center">Tabela</h1>
                                   <p>-------</p>
                                </div>
                            </div>
                            <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                            <div class="col-12">
                                <div class="bg-light rounded box-shadow form-group p-2">
                                    <h1 class="h6 text-center">Gr�fico</h1>
                                        <p>-------</p>
                                        <p>-------</p>
                                        <p>-------</p>
                                        <p>-------</p>
                                </div>
                            </div>
                            </div>
                            </div>

                            </div>
                        <!-- FIM CONTE�DO Dieta -->
                            
                        </div>
                      </div>
                        
                        
                      <div class="tab-pane fade" id="v-pills-pressao" role="tabpanel" aria-labelledby="v-pills-messages-tab">
                          
                          
                        <!-- CONTE�DO Pressao -->    
                            <div class="tab-pane fade show active" id="v-pills-pressao" role="tabpanel" aria-labelledby="v-pills-home-tab">
                            <div class="col-lg-5 float-md-left">
                                <div class="bg-light rounded box-shadow form-group p-3">
                                <h1 class="h6 text-center">Insira a Press�o Arefira</h1>
                                   <form>
                                       <div class="form-row">
                                        <div class="form-group col-md-12">
                                          <label for="inputData">Data</label>
                                          <input type="date" class="form-control" id="inputData" placeholder="">
                                        </div>
                                        
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputMax">Ponto m�ximo da press�o</label>
                                          <input type="number" class="form-control" id="inputMax">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputMin">Ponto m�nimo da press�o</label>
                                          <input type="number" class="form-control" id="inputMin">
                                        </div>
                                      </div>
                                       <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputMaxPad">Ponto m�ximo do Padr�o</label>
                                          <input type="number" class="form-control" id="inputMaxPad">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputMinPad">Ponto m�nimo do Padr�o</label>
                                          <input type="number" class="form-control" id="inputMinPad">
                                        </div>
                                      </div>
                                      
                                      <button type="submit" class="btn col-3 btn-outline-primary">Enviar</button>
                                    </form>
                                </div>
                            </div>

                            <div class="col-lg-7 float-md-right">
                                <div class="bg-light table rounded box-shadow form-group p-lg-2">
                                <h1 class="h6 text-center">Tabela</h1>
                                   <p>-------</p>
                                </div>
                            </div>
                            <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                            <div class="col-12">
                                <div class="bg-light rounded box-shadow form-group p-2">
                                    <h1 class="h6 text-center">Gr�fico</h1>
                                        <p>-------</p>
                                        <p>-------</p>
                                        <p>-------</p>
                                        <p>-------</p>
                                </div>
                            </div>
                            </div>
                            </div>

                            </div>
                        <!-- FIM CONTE�DO Pressao -->
                          
                      </div>
                        <div class="tab-pane fade" id="v-pills-peso" role="tabpanel" aria-labelledby="v-pills-settings-tab">
                            
                            <!-- CONTE�DO Peso -->    
                            <div class="tab-pane fade show active" id="v-pills-peso" role="tabpanel" aria-labelledby="v-pills-home-tab">
                            <div class="col-lg-5 float-md-left">
                                <div class="bg-light my-5 rounded box-shadow form-group p-3">
                                <h1 class="h6 text-center">Nova Medida de Peso</h1>
                                   <form>
                                       <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputData">Data</label>
                                          <input type="date" class="form-control" id="inputData" placeholder="">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputAltura">Altura</label>
                                          <input type="text" class="form-control" id="inputAltura" placeholder="">
                                        </div>
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputPeso">Peso</label>
                                          <input type="text" class="form-control" id="inputPeso">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputPadraoPeso">Padr�o de Peso</label>
                                          <input type="text" class="form-control" id="inputPadraoPeso" placeholder="">
                                        </div>
                                      </div>
                                      
                                      <button type="submit" class="btn col-3 btn-outline-primary">Enviar</button>
                                    </form>
                                </div>
                            </div>

                            <div class="col-lg-7 float-md-right">
                                <div class="bg-light table rounded box-shadow form-group p-lg-2">
                                <h1 class="h6 text-center">Tabela</h1>
                                   <p>-------</p>
                                </div>
                            </div>
                            <div class="container-fluid d-flex flex-column justify-content-end">
                            <div class="row">
                            <div class="col-12">
                                <div class="bg-light rounded box-shadow form-group p-2">
                                    <h1 class="h6 text-center">Gr�fico</h1>
                                        <p>-------</p>
                                        <p>-------</p>
                                        <p>-------</p>
                                        <p>-------</p>
                                       
                                </div>
                            </div>
                            </div>
                            </div>

                            </div>
                            <!-- FIM CONTE�DO Peso -->
                        </div>
                    </div>
                </section>
            </div>
        </section>

</body>
	<%@ include file="footerjs.jsp" %>
</html>