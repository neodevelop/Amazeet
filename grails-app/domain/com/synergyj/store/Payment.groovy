package com.synergyj.store

class Payment {
  
  BigDecimal amount
  BigDecimal commission
  String transactionId = UUID.randomUUID().toString().replaceAll('-', '').substring(0,20)
  String description
  PaymentStatus paymentStatus
  Date dateCreated
  Date lastUpdated
  
  static belongsTo = [order:Order]

  static constraints = {
    amount nullable:false, blank:false
    commission nullable:false, blank:false
    description blank:true, size:1..1000
    transactionId blank:false, size:1..20
  }
}
