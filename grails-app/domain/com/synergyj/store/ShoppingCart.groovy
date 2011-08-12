package com.synergyj.store

class ShoppingCart {
  
  //User user
  ShoppingCartStatus shoppingCartStatus
  Date dateCreated
  Date lastUpdated
  
  static hasMany = [items:ItemToPurchase]

  static constraints = {
  }
}
