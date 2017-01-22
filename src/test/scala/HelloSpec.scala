import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {

  "Scala" should "be able to sum" in {
    (3+2) should be(5)
  }

}
