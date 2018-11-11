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
			      <th scope="col">Padão de Peso</th>
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
				    </tr>
			    </c:forEach>
			  </tbody>
			</table>
		</div>
	</div>
</div>