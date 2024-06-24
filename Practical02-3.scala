object EmployeeSalaryCalculator {
  def main(args: Array[String]): Unit = {
    val normalHourlyRate = 250
    val otHourlyRate = 85
    val taxRate = 0.12

    def calculateGrossSalary(normalHours: Int, otHours: Int): Double = {
      (normalHours * normalHourlyRate) + (otHours * otHourlyRate)
    }

    def calculateTax(grossSalary: Double): Double = {
      grossSalary * taxRate
    }

    def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
      val grossSalary = calculateGrossSalary(normalHours, otHours)
      val tax = calculateTax(grossSalary)
      grossSalary - tax
    }

    val normalHoursWorked = 40
    val otHoursWorked = 30

    val takeHomeSalary = calculateTakeHomeSalary(normalHoursWorked, otHoursWorked)

    println(f"Take-home salary is: Rs. $takeHomeSalary%.2f")
  }
}
