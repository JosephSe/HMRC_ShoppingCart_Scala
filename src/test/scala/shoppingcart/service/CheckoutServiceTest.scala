package shoppingcart.service

import org.scalatest.{BeforeAndAfter, FlatSpec, Matchers}

class CheckoutServiceTest extends FlatSpec with Matchers with BeforeAndAfter {

  var underTest: CheckoutService = _

  before {
    underTest = new CheckoutServiceImpl
  }

  "Call to checkout" should "execute method" in {
    underTest.checkout
  }
}
