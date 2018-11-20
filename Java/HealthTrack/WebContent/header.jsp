		<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top box-shadow py-auto px-5">
              <a class="navbar-brand pr-5 font-weight-bold" href="index.jsp">HEALTH TRACK</a>
              <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>

              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto my-auto pt-1 pt-sm-auto">
                  <li class="nav-item menu">
                    <a class="nav-link" href="index.jsp">Home</a>
                  </li>
                  <li class="nav-item menu">
                    <a class="nav-link" href="sobre.jsp">Sobre</a>
                  </li>
                    <li class="nav-item menu">
                    <a class="nav-link" href="contato.jsp">Contato</a>
                  </li>
                </ul>
                  <li class="form-inline my-2 my-lg-0">
	              	<button type="button" class="btn btn-outline-primary ml-md-2" data-toggle="modal" data-target="#cadastroModal">Inscreva-se</button>         
                  </li>
              </div>
            </nav>
            
            <!-- Modal -->
				
				<div class="modal fade" id="cadastroModal" tabindex="-1" role="dialog" aria-labelledby="cadastroModalTitle" aria-hidden="true">
					<div class="modal-dialog modal-dialog-centered" role="document">
						<div class="modal-content">
						<form class="mt-3" action="cadastro" method="post">
						<input type="hidden" name="acao" value="cadastrar">
							<div class="modal-header">
								<h5 class="modal-title text-center border-bottom border-primary" id="cadastroModalTitle">Cadastro</h5>
								<button type="button" class="close" data-dismiss="modal" aria-label="Close">
								<span aria-hidden="true">&times;</span>
								</button>
							</div>
						<div class="modal-body">
						
							<div class="col-12 d-flex justify-content-center">
								<div class="bg-light rounded box-shadow p-3">
									<div class="form-row">
										<div class="form-group col-md-6 m-auto">
											<label for="inputNome"></label>
											<input type="text" name="name" class="form-control" id="inputNome" placeholder="Nome" data-toggle="tooltip" data-placement="top" title="Insira seu nome">
										</div>
										<div class="form-group col-md-6 m-auto">
											<label for="inputLastName"></label>
											<input type="text" name="lastname" class="form-control" id="inputLastName" placeholder="Sobrenome" data-toggle="tooltip" data-placement="top" title="Insira seu sobrenome">
										</div>
									</div>
									<div class="form-row">
										<div class="form-group col-md-6 m-auto">
											<label for="inputEmail"></label>
											<input type="email" name="email" class="form-control" id="inputEmail" placeholder="Email" data-toggle="tooltip" data-placement="top" title="Insira o seu email">
										</div>
										<div class="form-group col-md-6 m-auto pt-2 pl-2" name="sexo" id="sexo">
											<div class="form-check">
												<input class="form-check-input" type="radio" name="masculino" id="inputMasculino" value="option1">
												<label class="form-check-label" for="inputMasculino">Masculino</label>
											</div>
											<div class="form-check">
												<input class="form-check-input" type="radio" name="feminino" id="inputFeminino" value="option2">
												<label class="form-check-label" for="inputFeminino">Feminino</label>
											</div>
										</div>
									</div>
									
									<div class="form-row">
										<div class="form-group col-md-6 m-auto">
											<label for="inputTel"></label>
											<input type="text" name="telefone" class="form-control" id="inputTel" placeholder="Telefone" data-toggle="tooltip" data-placement="top" title="Insira o seu telefone">
										</div>
										<div class="form-group col-md-6 m-auto">
											<label for="inputCpf"></label>
											<input type="text" name="cpf" class="form-control" id="inputCpf" placeholder="CPF" data-toggle="tooltip" data-placement="top" title="Insira o seu cpf">
										</div>
									</div>                      
									
									<div class="form-row">
										<div class="form-group col-md-6 m-auto">
											<label for="inputSenha"></label>
											<input type="password" name="password" class="form-control" id="inputSenha" placeholder="Senha" data-toggle="tooltip" data-placement="top" title="Insira a sua senha">
										</div>
										<div class="form-group col-md-6 m-auto">
											<label for="inputNascimento"></label>
											<!-- incluir tooltip para informar que � um campo para data de nascimento -->
											<input type="date" name="nascimento" class="form-control" id="inputData" placeholder="Data de Nascimento" data-toggle="tooltip" data-placement="top" title="Insira a data do seu nascimento">
										</div>
									</div>
									
									<div class="form-row mb-auto">
										<div class="form-group col-md-6 mb-auto">
											<label for="inputEndereco"></label>
											<input type="text" name="endereco" class="form-control" id="inputEndereco" placeholder="Endereco" data-toggle="tooltip" data-placement="top" title="Insira o seu endere�o">
										</div>
										<div class="form-group col-md-4 mb-auto">
											<label for="inputBairro"></label>
											<input type="text" name="bairro" class="form-control" id="inputBairro" placeholder="Bairro" data-toggle="tooltip" data-placement="top" title="Insira o bairro aonde mora">
										</div>
										<div class="form-group col-md-2">
											<label for="inputNumero"></label>
											<input type="text" name="numero" class="form-control" id="inputNumero" placeholder="n�" data-toggle="tooltip" data-placement="top" title="N�mero da sua resid�ncia">
										</div>
										
										<div class="form-group col-md-6 mb-auto">
											<label for="inputCidade"></label>
											<input type="text" name="city" class="form-control" id="inputCidade" placeholder="Cidade" data-toggle="tooltip" data-placement="top" title="Insira a cidade aonde vive">
										</div>
										<div class="form-group col-md-4 mb-auto">
											<label for="inputEstado"></label>
											<select id="inputEstado" name="estado" class="form-control" data-toggle="tooltip" data-placement="top" title="Insira o estado aonde vive">
												<option>Rio de Janeiro</option>
												<option selected>S�o Paulo</option>
												<option>Minas Gerais</option>
												<option>Espir�to Santo</option>
											</select>
										</div>
										<div class="form-group col-md-2">
											<label for="inputCep"></label>
											<input type="text" name="cep" class="form-control" id="inputCep" placeholder="CEP" data-toggle="tooltip" data-placement="top" title="Insira o CEP do seu endere�o">
										</div>
										<div class="form-group col-md-12 m-auto">
											<label for="inputPais"></label>
											<input type="text" name="pais" class="form-control" id="inputPais" placeholder="Pa�s" data-toggle="tooltip" data-placement="top" title="Insira o pa�s aonde vive">
										</div>
									</div>
								</div>
							</div>
						</div>
						<nav>
							<div class="modal-footer nav-item">
								<button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
								<button type="submit" class="btn btn-outline-primary" onclick="mandatory">Enviar</button>
							</div>
						</nav>
						</form>
						</div>
					</div>
				</div>
			