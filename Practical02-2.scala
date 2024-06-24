object ExpressionEvaluation {
  def main(args: Array[String]): Unit = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f

    val a_expr = (-(-b) * a) + (c * d)
    println(s"a) ${a_expr}")


    println(s"b) ${a}")
    a += 1


    val g: Float = 5.0f 
    val c_expr = -2 * (g - k) + c
    println(s"c) ${c_expr}")


    println(s"d) ${c}")
    c += 1


    c += 1
    val e_expr = c * a
    println(s"e) ${e_expr}")
    a += 1
  }
}

