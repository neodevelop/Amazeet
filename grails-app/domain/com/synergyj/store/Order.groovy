package com.synergyj.store

class Order {
  
  OrderStatus orderStatus
  Date dateCreated
  Date lastUpdated
  
  static hasOne = [shoppingCart:ShoppingCart,payment:Payment]

  static constraints = {
  }
}
