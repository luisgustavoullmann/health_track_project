			<!-- Modal -->
			<form class="mt-3" action="cadastro" method="post">
			<div class="modal fade" id="cadastroModal" tabindex="-1" role="dialog" aria-labelledby="cadastroModalTitle" aria-hidden="true">
			  <div class="modal-dialog modal-dialog-centered" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h5 class="modal-title text-center border-bottom border-primary" id="cadastroModalTitle">Cadastro</h5>
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
			          <span aria-hidden="true">&times;</span>
			        </button>
			      </div>
			      <div class="modal-body">
			      			
				        <div class="col-12 d-flex justify-content-center">
	                    <div class="bg-light rounded box-shadow p-3">
	                    	
	                    	<c:if test="${not empty msg}">
			            	    <div class="alert alert-sucess">${msg}</div>
			                </c:if>
			                <c:if test="${not empty erro}">
			                	<div class="alert alert-danger">${erro}</div>
			                </c:if>
	                    		
	                    
	                    	<input type="hidden" value="cadastrar" name="acao">
	                        <div class="form-row">
	                        <div class="form-group col-md-6 m-auto">
	                          <label for="inputNome"></label>
	                          <input type="text" name="name" class="form-control" id="inputNome" placeholder="Nome">
	                        </div>
	                        <div class="form-group col-md-6 m-auto">
	                          <label for="inputLastName"></label>
	                          <input type="text" name="lastname" class="form-control" id="inputLastName" placeholder="Sobrenome">
	                        </div>
	                      </div>   
	                     
	                      <div class="form-row">
	                        <div class="form-group col-md-6 m-auto">
	                          <label for="inputEmail"></label>
	                          <input type="email" name="email" class="form-control" id="inputEmail" placeholder="Email">
	                        </div>
	                        <div class="form-group col-md-6 m-auto pt-2 pl-2" name="sexo">
	                          <div class="form-check">
								  <input class="form-check-input" type="radio" name="masculino" id="inputMasculino" value="masculino">
								  <label class="form-check-label" for="inputMasculino">
								    Masculino
								  </label>
								</div>
								<div class="form-check">
								  <input class="form-check-input" type="radio" name="feminino" id="inputFeminino" value="feminino">
								  <label class="form-check-label" for="inputFeminino">
								    Feminino
								  </label>
								</div>
	                        </div>
	                      </div>
	                                            
	                      <div class="form-row">
	                        <div class="form-group col-md-6 m-auto">
	                          <label for="inputTel"></label>
	                          <input type="text" name="telefone" class="form-control" id="inputTel" placeholder="Telefone">
	                        </div>
	                        <div class="form-group col-md-6 m-auto">
	                         	 <label for="inputCpf"></label>
	                          <input type="text" name="cpf" class="form-control" id="inputCpf" placeholder="CPF">
	                        </div>
	                      </div>                      
	                        
	                        <div class="form-row">
	                        <div class="form-group col-md-6 m-auto">
	                          <label for="inputSenha"></label>
	                          <input type="password" name="password" class="form-control" id="inputSenha" placeholder="Senha">
	                        </div>
	                        <div class="form-group col-md-6 m-auto">
	                          <label for="inputNascimento"></label>
	                          <!-- incluir tooltip para informar que � um campo para data de nascimento -->
	                          <input type="date" name="nascimento" class="form-control" id="inputNascimento" placeholder="Data de Nascimento">
	                        </div>
	                      </div>
	                      
	                      <div class="form-row mb-auto">
	                        <div class="form-group col-md-6 mb-auto">
	                          <label for="inputEndereco"></label>
	                          <input type="text" name="endereco" class="form-control" id="inputEndereco" placeholder="Endereco">
	                        </div>
	                        <div class="form-group col-md-4 mb-auto">
	                          <label for="inputBairro"></label>
	                          <input type="text" name="bairro" class="form-control" id="inputBairro" placeholder="Bairro">
	                        </div>
	                        <div class="form-group col-md-2">
	                          <label for="inputNumero"></label>
	                          <input type="text" name="numero" class="form-control" id="inputNumero" placeholder="n�">
	                        </div>
	                        
	                        <div class="form-group col-md-6 mb-auto">
	                          <label for="inputCidade"></label>
	                          <input type="text" name="city" class="form-control" id="inputCidade" placeholder="Cidade">
	                        </div>
	                        <div class="form-group col-md-4 mb-auto">
	                          <label for="inputEstado"></label>
	                          <select id="inputEstado" name="estado" class="form-control">
	                            <option>Rio de Janeiro</option>
	                            <option selected>S�o Paulo</option>
	                            <option>Minas Gerais</option>
	                            <option>Espir�to Santo</option>
	                          </select>
	                        </div>
	                        <div class="form-group col-md-2">
	                          <label for="inputCep"></label>
	                          <input type="text" name="cep" class="form-control" id="inputCep" placeholder="CEP">
	                        </div>
	                        <div class="form-group col-md-12 m-auto">
	                        	<label for="inputPais"></label>
	                        	<input type="text" name="pais" class="form-control" id="inputPais" placeholder="Pa�s">
	                     	 </div>
	                      </div>
	                      
                      
                    
                </div>
               </div>
			        
			      </div>
			     <nav>
					<div class="modal-footer nav-item">
                     <input type="hidden" name="acao" value="cadastrar">
	                  <button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Sair</button>
	                    <a class="" href="index.jsp">
	                      <button type="submit" class="btn btn-outline-primary">Enviar</button>
	                    </a>
	                </div>
                 </nav>
			    </div>
			  </div>
			</div>
		</form>