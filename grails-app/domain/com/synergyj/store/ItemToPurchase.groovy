package com.synergyj.store

class ItemToPurchase {
  
  Product product
  Integer quantity
  Date dateCreated
  Date lastUpdated
  
  static belongsTo = [shoppingCart:ShoppingCart]

  static constraints = {
    quantity range:1..99
  }
}
