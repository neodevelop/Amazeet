package com.synergyj.store



import grails.test.mixin.*
import org.junit.*

/**
* See the API for {@link grails.test.mixin.domain.DomainUnitTestMixin} for usage instructions
*/
@TestFor(Product)
class ProductTests {

  void testConstraintsAllEmpty() {
    mockForConstraintsTests(Product)
    def product = new Product()
    assert !product.validate()
    assert "nullable" == product.errors.name
    assert "nullable" == product.errors["description"]
    assert "nullable" == product.errors["technicalDetails"]
    assert "nullable" == product.errors.sku
    assert "nullable" == product.errors["price"]
  }
  
  void testConstraintsEmptyValues(){
    mockForConstraintsTests(Product)
    def product = new Product(name:"",description:"",technicalDetails:"",sku:"",price:0)
    assert !product.validate()
    assert "blank" == product.errors.name
    assert "blank" == product.errors["description"]
    assert "blank" == product.errors["technicalDetails"]
    assert "blank" == product.errors.sku
    assert !("blank" == product.errors.price)
  }
  
  void testConstraintsWrongValues(){
    mockForConstraintsTests(Product)
    String invalidString = ""
    1.upto(1001){ invalidString+="x" }
    def product = new Product(
      name:invalidString,
      description:invalidString,
      technicalDetails:invalidString,
      sku:invalidString,
      price:0
    )
    assert !product.validate()
    assert "size" == product.errors.name
    assert "size" == product.errors["description"]
    assert "size" == product.errors["technicalDetails"]
    assert "size" == product.errors.sku
    assert !("blank" == product.errors.price)
  }
  
  void testConstraintsUniqueValues(){
    def existingProduct1 = new Product(
      name:"Name",
      description:"Description",
      technicalDetails:"Technical details",
      sku:"MYSKU1",
      price:0
    )
    def existingProduct2 = new Product(
      name:"Name",
      description:"Description",
      technicalDetails:"Technical details",
      sku:"MYSKU2",
      price:0
    )
    mockForConstraintsTests(Product, [existingProduct1,existingProduct2])
    def product = new Product(
      name:"Name",
      description:"Description",
      technicalDetails:"Technical details",
      sku:"MYSKU2",
      price:0
    )
    assert !product.validate()
    assert "unique" == product.errors.sku
  }
}
