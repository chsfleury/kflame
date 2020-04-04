package fr.chsfleury.kflame

data class RenderingOptions(
    val width: Int,
    val height: Int,
    val sampling: Long = (width.toLong() * height.toLong()),
    val iterations: Int = 100,
    val writer: PixelWriter
)