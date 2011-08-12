package com.synergyj.store

class Product {
  
  String name
  String description
  String technicalDetails
  String sku
  BigDecimal price
  byte[] photo
  
  Date dateCreated
  Date lastUpdated

  static constraints = {
  }
}
