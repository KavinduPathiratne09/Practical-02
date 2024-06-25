object ScalaExpressions {

  var a = 2
  var b = 3
  var c = 4
  var d = 5
  var k = 4.3f
  var g = 0

  def evaluateExpressionA(): Unit = {
    b -= 1
    val resultA = b * a + c * d
    d -= 1
    println(resultA)
  }

  def evaluateExpressionB(): Unit = {
    println(a)
    a += 1
  }

  def evaluateExpressionC(): Unit = {
    println(-2 * (g - k) + c)
  }

  def evaluateExpressionD(): Unit = {
    val tempC = c
    c += 1
    println(tempC)
  }

  def evaluateExpressionE(): Unit = {
    c += 1
    val resultE = c * a
    a += 1
    println(resultE)
  }

  def main(args: Array[String]): Unit = {
    evaluateExpressionA()
    evaluateExpressionB()
    evaluateExpressionC()
    evaluateExpressionD()
    evaluateExpressionE()
  }
}
