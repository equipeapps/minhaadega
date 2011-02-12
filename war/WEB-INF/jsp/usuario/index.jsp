<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
<h1>Listing Usuarios</h1>

<table>
  <tr>
   <th>nivel</th>
   <th>nome</th>
   <th>vinhosAComprar</th>
   <th>vinhosNaAdega</th>
   <th>reviews</th>
   <th>login</th>
   <th>email</th>
   <th></th>
   <th></th>
   <th></th>
  </tr>

<c:forEach items="${usuarioList}" var="usuario">
  <tr>
      <td>
      ${usuario.nivel}
    </td>
      <td>
      ${usuario.nome}
    </td>
      <td>
      ${usuario.vinhosAComprar}
    </td>
      <td>
      ${usuario.vinhosNaAdega}
    </td>
      <td>
      ${usuario.reviews}
    </td>
      <td>
      ${usuario.login}
    </td>
      <td>
      ${usuario.email}
    </td>
      <td><a href="<c:url value="/usuarios/${usuario.id}"/>">show</a></td>
    <td><a href="<c:url value="/usuarios/${usuario.id}/edit"/>">edit</a></td>
    <td>
      <form action="<c:url value="/usuarios/${usuario.id}"/>" method="post">
    	  <input type="hidden" name="_method" value="delete"/>
    	  <button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
	    </form>
	  </td>
    </tr>
</c:forEach>
</table>

<br />
<a href="<c:url value="/usuarios/new"/>">New Usuario</a> 
</body>
