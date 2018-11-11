<div class="container rounded">
	<div class="row">
		<div class="col-12 my-1">
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">Data</th>
			      <th scope="col">Pressão</th>
			      <th scope="col">Padrão da Pressão</th>
			    </tr>
			  </thead>
			  <tbody>
			    <c:forEach items="${pressao}" var="x">
				    <tr>
				      <th scope="row"><fmt:formatDate value="${x.data.time}" pattern="dd/MM/yyyy"/></th>
				      <td>${x.dadoMax} / ${x.dadoMin}</td>
				      <td>${x.padraoMax} / ${x.padraoMin}</td>
				      <td>
				      	<c:url value="pressao" var="link">
				      	<c:param name="acao" value="abrir-form-edicao"/>
				      	<c:param name="codigo" value="${x.codigo}"/>
				      	</c:url>
				      	<a href="${link}">
				      		<div class="col-4">
                             <div class="d-flex justify-content-right float-right">
                             <!-- Button trigger modal -->
                              <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#pressaoModalEdit">
                               Editar
                              </button>
                             </div>
                         </div>
                        </a>
				      </td>
				    </tr>
			    </c:forEach>
			  </tbody>
			</table>
		</div>
	</div>
</div>