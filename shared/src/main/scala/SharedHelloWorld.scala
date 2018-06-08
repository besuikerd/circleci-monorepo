case class SharedHelloWorld(subject: String) {
  def greet(): String = s"hello $subject!"
}
