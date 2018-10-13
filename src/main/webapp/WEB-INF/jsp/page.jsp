<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:out value="Page Jsp"/>
<ul>
<c:forEach var="aParam" items="${paramlist}">
    <c:out value="${aParam.key}"/> = <c:out value="${aParam.value}"/></br>
</c:forEach>
</ul>

<c:choose>
  <c:when test="${paramlist['oui'] == 'oui'}">
     <p>OUI</p>
  </c:when>
  <c:otherwise>
     <p>NON</p>
  </c:otherwise>
</c:choose>

</body>
</html>