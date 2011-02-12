<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		 ${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="<c:url value="/usuarios"/>" method="post">
  
  <c:if test="${not empty usuario.id}">
    <input type="hidden" name="usuario.id" value="${usuario.id}"/>
    <input type="hidden" name="_method" value="put"/>
  </c:if>

  <div class="field">
    Nivel:<br />
    <input type="text" name="usuario.nivel" value="${usuario.nivel}"/>
  </div>
  <div class="field">
    Nome:<br />
    <input type="text" name="usuario.nome" value="${usuario.nome}"/>
  </div>
  <div class="field">
    Vinhosacomprar:<br />
    <input type="text" name="usuario.vinhosAComprar" value="${usuario.vinhosAComprar}"/>
  </div>
  <div class="field">
    Vinhosnaadega:<br />
    <input type="text" name="usuario.vinhosNaAdega" value="${usuario.vinhosNaAdega}"/>
  </div>
  <div class="field">
    Reviews:<br />
    <input type="text" name="usuario.reviews" value="${usuario.reviews}"/>
  </div>
  <div class="field">
    Login:<br />
    <input type="text" name="usuario.login" value="${usuario.login}"/>
  </div>
  <div class="field">
    Email:<br />
    <input type="text" name="usuario.email" value="${usuario.email}"/>
  </div>
  <div class="actions">
    <button type="submit">send</button>
  </div>
</form>

<a href="<c:url value="/usuarios"/>">Back</a>

