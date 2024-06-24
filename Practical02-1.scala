object ExpressionEvaluation {
  def main(args: Array[String]): Unit = {
    var i, j, k: Int = 3
    var m, n: Int = 5
    var f: Float = 12.0f
    var g: Float = 4.0f
    var c: Char = 'X'

    val a = k + 12 * m
    val b = m / j
    val c_expr = n % j
    val d = m / j * j
    val e = f + 10 * 5 + g
    val f_expr = { i += 1; i * n }

    println(s"a) k + 12 * m = $a")
    println(s"b) m / j = $b")
    println(s"c) n % j = $c_expr")
    println(s"d) m / j * j = $d")
    println(s"e) f + 10*5 + g = $e")
    println(s"f) ++i * n = $f_expr")
  }
}

