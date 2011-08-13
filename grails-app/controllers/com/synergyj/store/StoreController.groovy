package com.synergyj.store

class StoreController {

  def index(){
    // Aquí buscaremos nuestro catalogo de productos, nuestras categorias
    // los articulos que tenemos en nuestro carrito, 
    log.debug "Controller ${controllerName}: Hola mundo en ${actionName}"
    render "Hola mundo"
  }
  
  def reviewItem = {
    // Obtener el id y buscar el articulo
    log.debug "Params ${params}"
    redirect(controller:"product",action:"show",id:params.id)
  }
  
  def addItem(){
    // Buscar el objeto y ponerlo en el carrito
    if(!session.shoppingCart)
      session.shoppingCart = new ShoppingCart(shoppingCartStatus:ShoppingCartStatus.SHOPPING)
    def product = Product.get(params.id)
    log.debug request.dump()
    log.debug response.dump()
    log.debug session.dump()
    log.debug servletContext.dump()
    log.debug flash.dump()
    render view:"added",model:[product:product]
  }

}
