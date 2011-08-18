<!doctype html>
<html>
<head>
  <meta name="layout" content="earthlingtwo">
  <title>Store</title>
</head>
<body>
  <h1>Nuestras categorías</h1>
  <g:each in="${categories}" var="category">
  ${category.name}<br/>
  </g:each>
  <h2>Nuestros productos</h2>

  <g:each in="${products}" var="product">  
  <div class="post">
    <h2 class="title"><a href="#">${product.name}</a></h2>
    <p class="meta">$ ${product.price}</p>
    <div class="entry">
      <p>
        <store:showProduct id="${product.id}" size="small"/>
        ${product.description}<br/>
        <i>${product.technicalDetails}</i>
      </p>
      <p class="links"><a href="#" class="more">Read More</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="comments">Comments (33)</a></p>
    </div>
  </div>
  <div style="clear: both;">&nbsp;</div>
  </g:each>

<g:if test="${session.shoppingCart}">
<h3>Ya estás comprando en la tienda</h3>
</g:if>
<g:else>
<h3>Aún no has agregado ningún producto al carrito</h3>
</g:else>
</body>
</html>