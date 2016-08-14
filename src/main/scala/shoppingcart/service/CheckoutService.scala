package shoppingcart.service

trait CheckoutService {
  def checkout
}

class CheckoutServiceImpl extends CheckoutService {
  override def checkout:Unit = Unit
}
