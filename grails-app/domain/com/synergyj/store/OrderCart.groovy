package com.synergyj.store

class OrderCart {
  
  OrderStatus orderStatus
  ShoppingCart shoppingCart
  Date dateCreated
  Date lastUpdated
  
  static hasOne = [payment:Payment]

  static constraints = {
  }
}
