<h2><g:message code="shoppingCart.yours"/></h2>
<g:if test="${session.shoppingCart}">
  <p>Ya estás comprando en la tienda</p>
</g:if>
<g:else>
  <p>Aún no has agregado ningún producto al carrito</p>
</g:else>