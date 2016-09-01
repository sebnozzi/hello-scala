import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "Scala" should "be able to sum" in {
    1+1 should be(2)
  }
}
