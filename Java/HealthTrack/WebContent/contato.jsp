<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<%@ include file="../head.jsp" %>
</head>
<body>
		<%@ include file="../header.jsp" %>
       
       <!-- Modal Cadastro -->
        <%@ include file="../cadastroModal.jsp" %>
       
        <div class="container mt-5">
            <div class="row">
                <section class="col-12 mt-3 pt-5">
                    <div class="d-flex justify-content-center mb-5">
                        <h1 class="h2 border-bottom border-primary">Contato</h1>
                    </div>
                    
                    <!-- Conteúdo Contato -->
                    <div class="col-12">
                        <div class="mx-lg-3">
                          <div class="col-12 col-lg-6 float-left">
                            <div class="bg-light rounded box-shadow form-group p-3">
                                    <h1 class="h5 text-center">Envie sua mensagem!</h1>
                                       <form action="">
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
                                              <textarea id="inputKm" class="form-group col-12 rounded" rows="3"></textarea>
                                            </div>
                                            
                                          </div>
                                          <button type="submit" class="btn btn-outline-primary col-3">Enviar</button>
                                        </form>
                                    </div>      
                          </div>
                          <div class="col-12 col-lg-6 float-right">
                            <div>
                                <a href="https://goo.gl/qb91rr">
                                    <img class="mt-1 img-fluid box-shadow rounded" src="resources/img/mapa.png" href="https://goo.gl/3FZwXS" alt="Mapa">
                                </a>
                            </div>
                              
                           <div class="col-12">
                            
                            <div class="col-6 float-left">
                                <div class="d-flex justify-content-center mt-3">
                                <h5 class="border-bottom">Endereço</h5>
                            </div>
                                <p class="h6 endereco">Condomínio do Edifício Casa Alta, 528<br> Botafogo, Rio de Janeiro - RJ, 22250-040<br>
                                Tel: (21) 22271-030 <br>
                                </p>
                            </div>  
                            
                            <div class="col-6 float-right">
                                <div class="col-12 d-flex justify-content-center mt-3">
                                <h5 class="border-bottom">Redes Sociais</h5>
                            </div>
                            <div class="col-12 d-flex justify-content-center">
                                <ul class="row navbar-nav">
                                  <li class="nav-item">
                                    <a class="nav-link menu px-3 disabled" href="https://dribbble.com/">Dribbble</a>
                                  </li>
                                  <li class="nav-item">
                                    <a class="nav-link menu px-3 disabled" href="https://unsplash.com/">Unsplash</a>
                                  </li>
                                    <li class="nav-item">
                                    <a class="nav-link menu px-3 disabled" href="https://www.behance.net/">Behance</a>
                                  </li>
                                </ul>
                            </div>  
                            </div>
                                
                            </div>
                                
                            </div> 
                            
                          </div>
                        </div>
                    </div>
                    <!-- FIM Conteúdo Contato -->
                </section>
            </div>
        </div>
	
</body>
	<%@ include file="../footerjs.jsp" %>
</html>