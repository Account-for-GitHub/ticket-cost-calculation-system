package app

class BusCostCalculation : CostCalculation() {
    init {
        setCalculationMethod(BusCost())
    }
}