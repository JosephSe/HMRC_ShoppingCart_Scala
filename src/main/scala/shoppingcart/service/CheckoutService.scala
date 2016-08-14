package shoppingcart.service

import shoppingcart.model.Product

trait CheckoutService {
  def getTotal(items: List[String]): Double
}

class CheckoutServiceImpl extends CheckoutService with OfferStrategy {
  override def getTotal(items: List[String]): Double = {
    getSumTotal {
      applyOffers {
        items.map(Product(_)).flatten
      }
    }
  }

  private def getSumTotal(items: List[Product]) = {
    items.foldLeft(0.0)(_ + _.cost)
  }
}
