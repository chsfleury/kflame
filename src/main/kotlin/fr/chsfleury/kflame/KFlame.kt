package fr.chsfleury.kflame

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.source.yaml
import java.nio.file.Paths

object KFlame {

  @JvmStatic
  fun main(args: Array<String>) {
    val workingDir = System.getProperty("user.dir")
    val file = Paths.get(workingDir)
        .resolve("flame.yml")
        .toFile()

    if (!file.exists()) {
      throw IllegalArgumentException("flame.yml not found")
    }

    val conf = Config { addSpec(FlameSpec) }
        .from.yaml.file(file)
        .from.env()
        .from.systemProperties()

    val flameFunctions = conf[FlameSpec.functions]
  }

}