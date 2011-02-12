<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>

<p>
  <b>Codigodebarras:</b>
   ${vinho.codigoDeBarras}
</p>
<p>
  <b>Nome:</b>
   ${vinho.nome}
</p>
<p>
  <b>Notamedia:</b>
   ${vinho.notaMedia}
</p>
<p>
  <b>Teoralcoolico:</b>
   ${vinho.teorAlcoolico}
</p>
<p>
  <b>Precomedio:</b>
   ${vinho.precoMedio}
</p>
<p>
  <b>Produtor:</b>
   ${vinho.produtor}
</p>
<p>
  <b>Reviews:</b>
   ${vinho.reviews}
</p>
<p>
  <b>Castas:</b>
   ${vinho.castas}
</p>
<p>
  <b>Safra:</b>
   ${vinho.safra}
</p>

<a href="<c:url value="/vinhos/${vinho.id}/edit"/>">Edit</a>
<a href="<c:url value="/vinhos"/>">Back</a>

</body>
