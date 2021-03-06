package shoppingcart.service

import org.scalatest.{BeforeAndAfter, FlatSpec, Matchers}

class CheckoutServiceTest extends FlatSpec with Matchers with BeforeAndAfter {

  var underTest: CheckoutService = _

  before {
    underTest = new CheckoutServiceImpl
  }

  "Call to getTotal" should "give correct total for single item" in {
    val sum = underTest.getTotal(List("apple"))
    sum should be(.6)
  }
  it should "give correct total for multiple items" in {
    val sum = underTest.getTotal(List("apple", "orange", "apple", "apple"))
    sum should be(1.45)
  }
  it should "give correct total for name with different case" in {
    val sum = underTest.getTotal(List("Apple", "ORANGE"))
    sum should be(.85)
  }
  it should "give correct total for multiple same items" in {
    val sum = underTest.getTotal(List("apple", "apple"))
    sum should be(.6)
  }
  it should "give total 0 for unknown item" in {
    val sum = underTest.getTotal(List("banana"))
    sum should be(0)
  }
  it should "give correct total for multiple items with unknown item" in {
    val sum = underTest.getTotal(List("apple", "orange", "banana"))
    sum should be(.85)
  }
  it should "apply offers and give correct total " in {
    val sum = underTest.getTotal(List("apple", "apple"))
    sum should be(.6)
  }
  it should "apply offers for 3 apples and 4 oranges" in {
    val sum = underTest.getTotal(List("apple", "apple", "apple", "orange", "orange", "orange", "orange"))
    sum should be(1.95)
  }
}
