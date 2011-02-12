<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		 ${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="<c:url value="/vinhos"/>" method="post">
  
  <c:if test="${not empty vinho.id}">
    <input type="hidden" name="vinho.id" value="${vinho.id}"/>
    <input type="hidden" name="_method" value="put"/>
  </c:if>

  <div class="field">
    Codigodebarras:<br />
    <input type="text" name="vinho.codigoDeBarras" value="${vinho.codigoDeBarras}"/>
  </div>
  <div class="field">
    Nome:<br />
    <input type="text" name="vinho.nome" value="${vinho.nome}"/>
  </div>
  <div class="field">
    Notamedia:<br />
    <input type="text" name="vinho.notaMedia" value="${vinho.notaMedia}"/>
  </div>
  <div class="field">
    Teoralcoolico:<br />
    <input type="text" name="vinho.teorAlcoolico" value="${vinho.teorAlcoolico}"/>
  </div>
  <div class="field">
    Precomedio:<br />
    <input type="text" name="vinho.precoMedio" value="${vinho.precoMedio}"/>
  </div>
  <div class="field">
    Produtor:<br />
    <input type="text" name="vinho.produtor" value="${vinho.produtor}"/>
  </div>
  <div class="field">
    Reviews:<br />
    <input type="text" name="vinho.reviews" value="${vinho.reviews}"/>
  </div>
  <div class="field">
    Castas:<br />
    <input type="text" name="vinho.castas" value="${vinho.castas}"/>
  </div>
  <div class="field">
    Safra:<br />
    <input type="text" name="vinho.safra" value="${vinho.safra}"/>
  </div>
  <div class="actions">
    <button type="submit">send</button>
  </div>
</form>

<a href="<c:url value="/vinhos"/>">Back</a>