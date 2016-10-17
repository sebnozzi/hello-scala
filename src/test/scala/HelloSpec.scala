import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "be able to sum" in {
    Hello.sum(3, 2) should be(5)
  }
}
