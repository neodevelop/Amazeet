package com.synergyj.store

class StoreTagLib {
  
  static namespace = 'store'
  
  static final small = [width:120,height:150]
  static final medium = [width:300,height:500]
  static final big = [width:400,height:500]
  
  def showProduct = { attrs, body ->
    def size = attrs.size
    def width = 0
    def height = 0
    switch(attrs.size){
      case 'small':
        (width,height) = [small.width,small.height]
        break
      case 'medium':
        (width,height) = [medium.width,medium.height]
        break
      case 'big':
        (width,height) = [big.width,big.height]
        break
      default:
        width = small.width
        height = small.height
    }
    out << """
      <img src='${createLink(url:[controller:"product",view:"showImage",id:attrs.id])}' width='$width' height='$height' alt='image${attrs.id}' title='image${attrs.id}' />
    """
  }
  
}
