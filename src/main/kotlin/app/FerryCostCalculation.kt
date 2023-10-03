package app

class FerryCostCalculation : CostCalculation() {
    init {
        setCalculationMethod(FerryCost())
    }
}