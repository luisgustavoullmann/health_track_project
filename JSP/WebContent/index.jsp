<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">
        <%@ include file="head.jsp" %>
</head>
	<body>
		 <header>
			<%@ include file="header.jsp" %>
        </header>
        
		<!--Carousel com imgs-->
        <section class="container-fluid mt-5 bg-color">
            <div class="row">
                <div class="col-lg-6 px-0">
                    <div id="carouselHT" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#carouselHT" data-slide-to="0" class="active"></li>
                            <li data-target="#carouselHT" data-slide-to="1"></li>
                            <li data-target="#carouselHT" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                              <img class="d-block w-100" src="/img/foto-1.jpg" alt="Foto um">
                            </div>
                            <div class="carousel-item">
                              <img class="d-block w-100" src="/img/foto-2.jpg" alt="Foto dois">
                            </div>
                            <div class="carousel-item">
                              <img class="d-block w-100" src="/img/foto-3.jpg" alt="Foto 3">
                            </div>
                        </div>
                        <a class="carousel-control-prev" href="#carouselHT" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Anterior</span>
                        </a>
                        <a class="carousel-control-next" href="#carouselHT" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Pr�ximo</span>
                        </a>
                    </div>
                </div>
                
                <!-- login -->
                <div class="col-lg-6 p-5 mb-auto bg-color">
                    <form class="mt-5">
                      <div class="form-group">
                        <label for="exampleInputEmail1"></label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Email">
                      </div>
                      <div class="form-group">
                        <label for="exampleInputPassword1"></label>
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Senha">
                      </div>
                      <div class="form-group form-check">
                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Manter conectado</label>
                      </div>
                      <button type="submit" class="btn btn-outline-primary col-3" href="principal.html">Entrar</button>
                    </form>
                </div>
            </div>
        </section>
        
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 mt-5 pt-2">
                    <blockquote class="blockquote text-center text-info font-weight-bold mt-3">Inserir a tecnologia na �rea de sa�de, aliado � conveni�ncia, rapidez e qualidade</blockquote>
                </div>
            </div>
        </div>
        
    </body>
        
        
    <footer>
        
    </footer>
	<!-- USAR APENAS O QUE INCLUIR NO PROJETO -->
	<%@ include file="footerjs.jsp" %>
</html>