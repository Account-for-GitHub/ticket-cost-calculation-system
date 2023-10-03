import app.BusCostCalculation
import app.FerryCostCalculation
import app.TrainCostCalculation

fun main(){
    FerryCostCalculation().getCost()
    TrainCostCalculation().getCost()
    BusCostCalculation().getCost()
}