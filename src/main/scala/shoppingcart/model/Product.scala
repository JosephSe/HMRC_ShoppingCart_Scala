package shoppingcart.model

trait Product {
  def cost:Double
  def typ:String
}

case class Apple(val cost:Double = .6, val typ:String = "Apple") extends Product
case class Orange(val cost:Double = .25, val typ:String = "Orange") extends Product

object Product {
  def apply(typ:String): Option[Product] = typ.toLowerCase match  {
    case "apple" => Some(new Apple)
    case "orange" => Some(new Orange)
    case _ => None
  }
}