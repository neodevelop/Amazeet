package com.synergyj.store

import grails.test.mixin.*
import org.junit.*

@TestFor(StoreController)
@Mock(Product) // Importante para hacer el mock de Product en los métodos del controller
class StoreControllerTests {

  void testIndex() {
    // Aquñi podemos simular el envio de parametros
    controller.index()
    // Aqui quedan objetos mock que podemos usar
    assert response.text == "Hola mundo"
    assert model == [:]
    log.debug params.dump()
  }
  
  void testReviewItem(){
    params.id = 1
    controller.reviewItem()
    assert response.redirectedUrl == '/product/show/1'
  }
  
  void testAddItem(){
    mockDomain(Product,[
      [
        id:1,
        name:"T-shirt GrailsMX 2011",
        description:"Playera edición 2011 de la comunidad de grails.org.mx",
        technicalDetails:"Disponible en tallas CH, M, X y XL. Impresión impregnado en tela.",
        sku:"GRAILSMX2011",
        price:220.00
      ]
    ])
    params.id = 1
    controller.addItem()
    assert session.shoppingCart
    assert model.product
    println model.product
    assert view == "/store/added"
    println session.shoppingCart
  }
}
