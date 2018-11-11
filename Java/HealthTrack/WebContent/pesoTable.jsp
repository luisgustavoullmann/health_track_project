<div class="container rounded">
	<div class="row">
		<div class="col-12 my-1">
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">Data</th>
			      <!-- <th scope="col">IMC</th> -->
			      <th scope="col">Peso</th>
			      <th scope="col">Altura</th>
			      <th scope="col">Padrão de Peso</th>
			    </tr>
			  </thead>
			  <tbody>
			    <c:forEach items="${exercicio}" var="x">
				    <tr>
				      <th scope="row"><fmt:formatDate value="${x.dataPeso.time}" pattern="dd/MM/yyyy"/></th>
				      <!-- <td>${x.imc}</td> -->
				      <td>${x.peso}</td>
				      <td>${x.altura}</td>
				      <td>${x.padraoPeso}</td>
				      <td>
				      	<c:url value="peso" var="link">
				      	<c:param name="acao" value="abrir-form-edicao"/>
				      	<c:param name="codigo" value="${x.codigo}"/>
				      	</c:url>
				      	<a href="${link}">
				      		<div class="col-4">
                             <div class="d-flex justify-content-right float-right">
                              <!-- Button trigger modal -->
                              <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#pesoModalEdit">
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