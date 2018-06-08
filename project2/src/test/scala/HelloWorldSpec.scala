import org.scalatest.{FlatSpec, Matchers}

class HelloWorldSpec extends FlatSpec with Matchers{
  "Hello world" must "say hello" in {


    val helloWorld = HelloWorld("world")

    helloWorld.greet() shouldBe "hello world!"
  }
}
