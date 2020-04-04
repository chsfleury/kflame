package fr.chsfleury.kflame

enum class Function(
    private val exprX: (x: Double, y: Double) -> Double,
    private val exprY: (x: Double, y: Double) -> Double
) {
  LINEAR(
      { x, _ -> x },
      { _, y -> y }
  );

  operator fun invoke(x: Double, y: Double): Pair<Double, Double> = Pair(exprX(x, y), exprY(x, y))
}