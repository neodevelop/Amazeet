<!doctype html>
<html>
<head>
  <meta name="layout" content="main">
  <title>. : Welcome to the SynergyJ - Store : .</title>
</head>
<body>
  <h1>Nuestras categorías</h1>
  <g:each in="${categories}" var="category">
  ${category.name}<br/>
</g:each>
<h2>Nuestros productos</h2>

<table>
  <thead>
    <tr>
      <td>
        <b>${message(code: 'product.label', default: 'Product')}</b>
      </td>
      <td>
        <b>${message(code: 'product.name.label', default: 'Name')}</b>
      </td>
      <td>
        <b>${message(code: 'product.price.label', default: 'Price')}</b>
      </td>
    </tr>
  </thead>
  <tbody>
    <g:each in="${products}" var="product">  
    <tr>
      <td>
        <store:showProduct id="${product.id}" size="small"/>
      </td>
      <td>${product.name}</td>
      <td>$ ${product.price}</td>
    </tr>
  </g:each>
  </tbody>  
</table>

<g:if test="${session.shoppingCart}">
  <h3>Ya estás comprando en la tienda</h3>
</g:if>
<g:else>
  <h3>Aún no has agregado ningún producto al carrito</h3>
</g:else>
</body>
</html>