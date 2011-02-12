<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
<h1>Listing Vinhos</h1>

<table>
  <tr>
   <th>codigoDeBarras</th>
   <th>nome</th>
   <th>notaMedia</th>
   <th>teorAlcoolico</th>
   <th>precoMedio</th>
   <th>produtor</th>
   <th>reviews</th>
   <th>castas</th>
   <th>safra</th>
   <th></th>
   <th></th>
   <th></th>
  </tr>

<c:forEach items="${vinhoList}" var="vinho">
  <tr>
      <td>
      ${vinho.codigoDeBarras}
    </td>
      <td>
      ${vinho.nome}
    </td>
      <td>
      ${vinho.notaMedia}
    </td>
      <td>
      ${vinho.teorAlcoolico}
    </td>
      <td>
      ${vinho.precoMedio}
    </td>
      <td>
      ${vinho.produtor}
    </td>
      <td>
      ${vinho.reviews}
    </td>
      <td>
      ${vinho.castas}
    </td>
      <td>
      ${vinho.safra}
    </td>
      <td><a href="<c:url value="/vinhos/${vinho.id}"/>">show</a></td>
    <td><a href="<c:url value="/vinhos/${vinho.id}/edit"/>">edit</a></td>
    <td>
      <form action="<c:url value="/vinhos/${vinho.id}"/>" method="post">
    	  <input type="hidden" name="_method" value="delete"/>
    	  <button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
	    </form>
	  </td>
    </tr>
</c:forEach>
</table>

<br />
<a href="<c:url value="/vinhos/new"/>">New Vinho</a> 
</body>
