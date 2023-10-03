package app

class TrainCostCalculation : CostCalculation() {
    init {
        setCalculationMethod(TrainCost())
    }
}