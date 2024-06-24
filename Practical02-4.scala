object MovieTheaterProfitOptimizer {
  def main(args: Array[String]): Unit = {
    val basePrice = 15.0
    val baseAttendance = 120
    val priceChange = 5.0
    val attendanceChange = 20
    val fixedCost = 500.0
    val variableCostPerAttendee = 3.0

    def calculateAttendance(ticketPrice: Double): Int = {
      baseAttendance + ((basePrice - ticketPrice) / priceChange * attendanceChange).toInt
    }

    def calculateRevenue(ticketPrice: Double, attendance: Int): Double = {
      ticketPrice * attendance
    }

    def calculateTotalCost(attendance: Int): Double = {
      fixedCost + (variableCostPerAttendee * attendance)
    }

    def calculateProfit(ticketPrice: Double): Double = {
      val attendance = calculateAttendance(ticketPrice)
      val revenue = calculateRevenue(ticketPrice, attendance)
      val totalCost = calculateTotalCost(attendance)
      revenue - totalCost
    }

    def findBestTicketPrice(): (Double, Double) = {
      val ticketPrices = (5 to 50 by 5).map(_.toDouble)
      val profits = ticketPrices.map(price => (price, calculateProfit(price)))
      profits.maxBy(_._2)
    }

    val (bestPrice, maxProfit) = findBestTicketPrice()
    println(f"The best ticket price is Rs. $bestPrice%.2f with a maximum profit of Rs. $maxProfit%.2f")
  }
}
