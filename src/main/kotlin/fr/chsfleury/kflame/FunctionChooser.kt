package fr.chsfleury.kflame

import fr.chsfleury.kflame.FunctionSettings
import java.util.*
import kotlin.random.Random

class FunctionChooser(functions: List<FunctionSettings>, private val random: Random) {

  private val functionMap: TreeMap<Double, FunctionSettings> = TreeMap()
  private val total: Double

  init {
    var sum = 0.0
    for (f in functions) {
      functionMap[sum + f.weight] = f
      sum += f.weight
    }
    total = sum
  }

  fun pick(): FunctionSettings = functionMap[functionMap.ceilingKey(random.nextDouble(total))] ?: throw IllegalStateException("invalid weight")

}