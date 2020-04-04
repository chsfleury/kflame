package fr.chsfleury.kflame

import com.uchuhimo.konf.ConfigSpec

object FlameSpec: ConfigSpec("flame") {

  val functions by required<List<FunctionSettings>>()

}