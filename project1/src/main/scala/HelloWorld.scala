case class HelloWorld(subject: String) {
  val wrapped = SharedHelloWorld(subject)
  def greet(): String = wrapped.greet()
}