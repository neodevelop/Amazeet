<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : EarthlingTwo  
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20090918
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <title>. : SynergyJ - <g:layoutTitle default="Store"/> : .</title>
  <link href="${createLinkTo(dir:'earthlingtwo/',file:'style.css')}" rel="stylesheet" type="text/css" media="screen" />
  <!-- Importante el layout head -->
  <g:layoutHead/>
</head>
<body>
  <div id="wrapper">
    <div id="header">
      <div id="logo">
        <h1><a href="#">EarthlingTwo</a></h1>
        <p>by <a href="http://www.nodethirtythree.com">nodethirtythree</a> + <a href="http://www.freecsstemplates.org/">fct</a></p>
      </div>
    </div>
    <!-- end #header -->
    <div id="menu">
      <ul>
        <li class="current_page_item"><a href="#">Home</a></li>
        <li><a href="#">Services</a></li>
        <li><a href="#">Portfolio</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </div>
    <!-- end #menu -->
    <div id="page">
      <div id="content">
        <!-- Importante el layout Body -->
        <g:layoutBody/>
      </div>
      <!-- end #content -->
      <div id="sidebar">
        <ul>
          <li>
            <g:render template="/shoppingCart/myCart" />
          </li>
          <li>
            <g:render template="/category/shortList" model="[categoryList:com.synergyj.store.Category.list()]" />
          </li>
        </ul>
      </div>
      <!-- end #sidebar -->
      <div style="clear: both;">&nbsp;</div>
    </div>
    <!-- end #page -->
  </div>
  <div id="footer-content">
    <div class="column1">
      <h2>Volutpat quisque sed et aliquam</h2>
      <p><strong>Maecenas ut ante</strong> eu velit laoreet tempor accumsan vitae nibh. Aenean commodo, tortor eu porta convolutpat elementum. Proin fermentum molestie erat eget vehicula. Aenean eget tellus mi. Fusce scelerisque odio quis ante bibendum sollicitudin. Suspendisse potenti. Vivamus quam odio, facilisis at ultrices nec, sollicitudin ac risus. Donec ut odio ipsum, sed tincidunt. <a href="#">Learn more&#8230;</a></p>
    </div>
    <div class="column2">
      <ul class="list">
        <li><a href="#">Tempor accumsan vitae sed nibh dolore</a></li>
        <li><a href="#">Aenean commodo, tortor eu porta veroeros</a></li>
        <li><a href="#">Fermentum molestie erat eget consequat</a></li>
        <li><a href="#">Donec vestibulum interdum diam etiam</a></li>
        <li><a href="#">Vehicula aenean eget sed tellus blandit</a></li>
      </ul>
    </div>
  </div>
  <div id="footer">
    <p> (c) 2009 Sitename.com. Design by <a href="http://www.nodethirtythree.com">nodethirtythree</a> and <a href="http://www.freecsstemplates.org">Free CSS Templates</a>.</p>
  </div>
  <!-- end #footer -->
</body>
</html>
