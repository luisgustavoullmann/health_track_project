		<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top box-shadow py-auto px-5">
              <a class="navbar-brand pr-5 font-weight-bold" href="index.jsp">HEALTH TRACK</a>
              <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>

              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto my-auto">
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
                <c:if test="${empty user }">
                    <div class="alert alert-danger">${erro}</div>
                  <form class="form-inline my-2 my-lg-0">
                    <button type="button" class="btn btn-outline-primary ml-md-2" data-toggle="modal" data-target="#cadastroModal">Inscreva-se</button>         
                  </form>
                </c:if>
                <c:if test="${not empty user }">
			    	<button type="submit" class="btn btn-outline-primary col-3">Sair</button>
			    </c:if>
              </div>
            </nav>