import org.scalatest.{FlatSpec, Matchers}

class SharedHelloWorldSpec extends FlatSpec with Matchers{
  "Hello world" must "say hello" in {


    val helloWorld = SharedHelloWorld("world")

    helloWorld.greet() shouldBe "hello world!"
  }
}
