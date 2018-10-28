<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<%@ include file="head.jsp" %>
</head>
<body>
	<header>
			<%@ include file="header.jsp" %>
    </header>
       
        <div class="container mt-5">
            <div class="row">
                <section class="col-12 mt-5 pt-5">
                    <div class="d-flex justify-content-center mb-5">
                        <h1 class="h2 border-bottom border-primary">Contato</h1>
                    </div>
                    
                    <!-- Conte�do Contato -->
                    <div class="col-12">
                        <div class="mx-lg-3">
                          <div class="col-12 col-lg-6 float-left">
                            <div class="bg-light rounded box-shadow form-group p-3">
                                    <h1 class="h5 text-center">Envie sua mensagem!</h1>
                                       <form>
                                          <div class="form-row">
                                            <div class="form-group col-12">
                                              <label for="inputNome">Nome</label>
                                              <input type="text" class="form-control" id="inputNome">
                                            </div>
                                            <div class="form-group col-12">
                                              <label for="inputEmail">Email</label>
                                              <input type="email" class="form-control" id="inputEmail">
                                              </div>
                                            <div class="form-group col-12">
                                              <label for="inputTextArea">Mensagem</label>
                                              <textarea id="inputKm" class="form-group area col-12 rounded"></textarea>
                                            </div>
                                            
                                          </div>
                                          <button type="submit" class="btn btn-outline-primary col-3">Enviar</button>
                                        </form>
                                    </div>      
                          </div>
                          <div class="col-12 col-lg-6 float-right">
                            <div>
                                <img class="col-12 mt-3" src="img/mapa.png" href="https://goo.gl/3FZwXS" alt="Mapa">
                            </div>
                            <div class="col-4 d-flex justify-content-left mt-5">
                                <h5 class="border-bottom">Redes Sociais</h5>
                            </div>
                            <div class="col-3 d-flex justify-content-center mt-2">
                                <ul class="row navbar-nav">
                                  <li class="nav-item">
                                    <a class="nav-link menu px-3 disabled" href="index.html">Dribbble</a>
                                  </li>
                                  <li class="nav-item">
                                    <a class="nav-link menu px-3 disabled" href="sobre.html">Unplash</a>
                                  </li>
                                    <li class="nav-item">
                                    <a class="nav-link menu px-3 disabled" href="#">Behance</a>
                                  </li>
                                </ul>
                            </div>
                          </div>
                        </div>
                    </div>
                    <!-- FIM Conte�do Contato -->
                </section>
            </div>
        </div>
	
</body>
	<%@ include file="footerjs.jsp" %>
</html>