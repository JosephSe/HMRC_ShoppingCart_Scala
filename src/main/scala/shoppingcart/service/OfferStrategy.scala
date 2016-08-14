package shoppingcart.service

import shoppingcart.model._

trait OfferStrategy {

  def activeOffers = List(AppleTwoForOneOffer(), OrangeThreeForTwoOffer())

  private def applyFormula(items: List[Product], offer: Offer): List[Product] = {
    val allProducts = items.partition(_ == offer.product)
    val count = allProducts._1.size
    allProducts._2 ++ (allProducts._1.drop(count - (((count / offer.formula._1) * offer.formula._2) + count % offer.formula._1)))
  }

  def applyOffers(products: List[Product]) = {
    activeOffers.foldLeft(products)((pList, offer) => applyFormula(pList, offer))
  }
}
