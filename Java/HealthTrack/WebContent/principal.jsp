<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
									
									<!-- Modal Exericio -->
									<%@ include file="exercicioModal.jsp" %>
									
									<!-- Tabela Exercicio -->
									<%@include file="exercicioTable.jsp" %>
									
									
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
												<%@ include file="dietaModal.jsp" %>
												
												<!-- Dieta Table -->
												<%@ include file="dietaTable.jsp" %>
											
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
									
									
									<!-- Modal Pressao -->
									<%@ include file="pressaoModal.jsp" %>
									
									<!-- Pressao Table -->
									<%@ include file="pressaoTable.jsp" %>
									
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
									<%@ include file="pesoModal.jsp" %>
									
									<!-- Peso Table -->
									<%@ include file="pesoTable.jsp" %>
									
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
	<footer>
		<%@ include file="../footerjs.jsp" %>
	</footer>
</html>