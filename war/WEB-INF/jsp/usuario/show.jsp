<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>

<p>
  <b>Nivel:</b>
   ${usuario.nivel}
</p>
<p>
  <b>Nome:</b>
   ${usuario.nome}
</p>
<p>
  <b>Vinhosacomprar:</b>
   ${usuario.vinhosAComprar}
</p>
<p>
  <b>Vinhosnaadega:</b>
   ${usuario.vinhosNaAdega}
</p>
<p>
  <b>Reviews:</b>
   ${usuario.reviews}
</p>
<p>
  <b>Login:</b>
   ${usuario.login}
</p>
<p>
  <b>Email:</b>
   ${usuario.email}
</p>

<a href="<c:url value="/usuarios/${usuario.id}/edit"/>">Edit</a>
<a href="<c:url value="/usuarios"/>">Back</a>

</body>
