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
				    </tr>
			    </c:forEach>
			  </tbody>
			</table>
		</div>
	</div>
</div>