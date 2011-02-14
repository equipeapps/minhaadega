<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
<h1>Listing Reviews</h1>

<table>
  <tr>
   <th>data</th>
   <th>nota</th>
   <th>vinho</th>
   <th>usuario</th>
   <th>impressoes</th>
   <th></th>
   <th></th>
   <th></th>
  </tr>

<c:forEach items="${reviewList}" var="review">
  <tr>
      <td>
      ${review.data}
    </td>
      <td>
      ${review.nota}
    </td>
      <td>
      ${review.vinho}
    </td>
      <td>
      ${review.usuario}
    </td>
      <td>
      ${review.impressoes}
    </td>
      <td><a href="<c:url value="/reviews/${review.id}"/>">show</a></td>
    <td><a href="<c:url value="/reviews/${review.id}/edit"/>">edit</a></td>
    <td>
      <form action="<c:url value="/reviews/${review.id}"/>" method="post">
    	  <input type="hidden" name="_method" value="delete"/>
    	  <button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
	    </form>
	  </td>
    </tr>
</c:forEach>
</table>

<br />
<a href="<c:url value="/reviews/new"/>">New Review</a> 
</body>
