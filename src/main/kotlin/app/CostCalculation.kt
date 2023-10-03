package app

abstract class CostCalculation {
    private var calculationMethod: CalculationMethod = NoCalculationMethod()

    protected fun setCalculationMethod(method: CalculationMethod){
        calculationMethod = method
    }

    fun getCost() {
        return calculationMethod.calculate()
    }
}