<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>

<p>
  <b>Data:</b>
   ${review.data}
</p>
<p>
  <b>Nota:</b>
   ${review.nota}
</p>
<p>
  <b>Vinho:</b>
   ${review.vinho}
</p>
<p>
  <b>Usuario:</b>
   ${review.usuario}
</p>
<p>
  <b>Impressoes:</b>
   ${review.impressoes}
</p>

<a href="<c:url value="/reviews/${review.id}/edit"/>">Edit</a>
<a href="<c:url value="/reviews"/>">Back</a>

</body>
