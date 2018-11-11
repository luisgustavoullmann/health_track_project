<div class="container rounded">
	<div class="row">
		<div class="col-12 my-1">
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">Data</th>
			      <th scope="col">Alimento</th>
			      <th scope="col">Refeição</th>
			      <th scope="col">Caloria</th>
			      <th scope="col">Horario</th>
			    </tr>
			  </thead>
			  <tbody>
			    <c:forEach items="${dieta}" var="x">
				    <tr>
				      <th scope="row"><fmt:formatDate value="${x.dataDieta.time}" pattern="dd/MM/yyyy"/></th>
				      <td>${x.nome}</td>
				      <td>${x.tipo}</td>
				      <td>${x.caloria}</td>
				      <td>${x.horario}</td>
				      <td>
				      	<c:url value="dieta" var="link">
				      	<c:param name="acao" value="abrir-form-edicao"/>
				      	<c:param name="codigo" value="${x.codigo}"/>
				      	</c:url>
				      	<a href="${link}">Editar</a>
				      </td>
				    </tr>
			    </c:forEach>
			  </tbody>
			</table>
		</div>
	</div>
</div>