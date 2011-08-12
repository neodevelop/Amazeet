package com.synergyj.store

class Order {
  
  OrderStatus orderStatus
  ShoppingCart shoppingCart
  Date dateCreated
  Date lastUpdated
  
  static hasOne = [payment:Payment]

  static constraints = {
  }
}
