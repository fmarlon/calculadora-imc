package dev.estudos.android.calculadorimc

import java.math.BigDecimal
import java.math.RoundingMode

class CalculadoraIMC {

    fun calcular(peso: BigDecimal, altura: BigDecimal): BigDecimal {
        return peso.divide(altura.pow(2), 2, RoundingMode.HALF_EVEN)
    }

}