HMRC Shopping Cart
=========


Compile
----
  - sbt clean
  - sbt test


Expected output
--------------

```sh
[info] CheckoutServiceTest:
[info] Call to getTotal
[info] - should give correct total for single item
[info] - should give correct total for multiple items
[info] - should give correct total for name with different case
[info] - should give correct total for multiple same items
[info] - should give total 0 for unknown item
[info] - should give correct total for multiple items with unknown item
[info] - should apply offers and give correct total
[info] - should apply offers for 3 apples and 4 oranges
[info] Run completed in 825 milliseconds.
[info] Total number of tests run: 8
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 8, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 2 s, completed 15-Aug-2016 09:57:02
