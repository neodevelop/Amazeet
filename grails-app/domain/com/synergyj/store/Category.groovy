package com.synergyj.store

class Category {
  
  String name
  String description
  
  static hasMany = [products:Product]
  
  Date dateCreated
  Date lastUpdated

  static constraints = {
    name nullable:false,blank:false,size:3..50
    description nullable:false,blank:false,size:1..1000,validator:{ val,obj -> 
      if(val.tokenize(" ").size() <= 5)
        false
        //"className.property.customError"
        //['custom.error', arg1, arg2]
    }
  }
}
