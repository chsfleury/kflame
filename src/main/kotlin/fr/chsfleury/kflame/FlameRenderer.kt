package fr.chsfleury.kflame

import kotlin.random.Random

class FlameRenderer(private val random: Random) {

  private fun randomPoint() = Pair(
      random.nextDouble(-1.0, 1.0),
      random.nextDouble(-1.0, 1.0)
  )

  fun render(functions: List<FunctionSettings>, renderingOptions: RenderingOptions) {
    val functionChooser = FunctionChooser(functions, random)
    for (s in 1..renderingOptions.sampling) {
      var (x, y) = randomPoint()
      for (i in 1..renderingOptions.iterations) {
        val f =
      }
    }
  }

}