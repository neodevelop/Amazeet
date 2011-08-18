<h2>${message(code:'category.name',default:'Category')}</h2>
<ul>
  <g:each in="${categoryList}" var="category">
    <li><span>New!</span><a href="#">${category.name}</a></li>
  </g:each>
</ul>