<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		 ${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="<c:url value="/reviews"/>" method="post">
  
  <c:if test="${not empty review.id}">
    <input type="hidden" name="review.id" value="${review.id}"/>
    <input type="hidden" name="_method" value="put"/>
  </c:if>

  <div class="field">
    Data:<br />
    <input type="text" name="review.data" value="${review.data}"/>
  </div>
  <div class="field">
    Nota:<br />
    <input type="text" name="review.nota" value="${review.nota}"/>
  </div>
  <div class="field">
    Vinho:<br />
    <input type="text" name="review.vinho" value="${review.vinho}"/>
  </div>
  <div class="field">
    Usuario:<br />
    <input type="text" name="review.usuario" value="${review.usuario}"/>
  </div>
  <div class="field">
    Impressoes:<br />
    <input type="text" name="review.impressoes" value="${review.impressoes}"/>
  </div>
  <div class="actions">
    <button type="submit">send</button>
  </div>
</form>

<a href="<c:url value="/reviews"/>">Back</a>

