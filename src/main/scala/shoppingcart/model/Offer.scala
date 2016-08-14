package shoppingcart.model

sealed trait Offer {
  type Formula = (Int, Int)

  def formula: Formula

  def product: Product
}

case class AppleTwoForOneOffer() extends Offer {
  override def formula: (Int, Int) = (2, 1)

  override def product: Apple = Apple()
}

case class OrangeThreeForTwoOffer() extends Offer {
  override def formula: (Int, Int) = (3, 2)

  override def product: Orange = Orange()
}