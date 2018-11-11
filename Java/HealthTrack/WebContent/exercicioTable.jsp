<div class="container rounded">
	<div class="row">
		<div class="col-12 my-1">
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">Data</th>
			      <th scope="col">Exercício</th>
			      <th scope="col">Tempo</th>
			      <th scope="col">Quilometragem</th>
			    </tr>
			  </thead>
			  <tbody>
			    <c:forEach items="${exercicio}" var="x">
				    <tr>
				      <th scope="row"><fmt:formatDate value="${x.data.time}" pattern="dd/MM/yyyy"/></th>
				      <td>${x.modalidade}</td>
				      <td>${x.tempo}</td>
				      <td>${x.km}</td>
				    </tr>
			    </c:forEach>
			  </tbody>
			</table>
		</div>
	</div>
</div>