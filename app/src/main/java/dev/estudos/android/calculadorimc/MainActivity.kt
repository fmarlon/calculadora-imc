package dev.estudos.android.calculadorimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    val calculadoraIMC = CalculadoraIMC()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.title = "CALCULADORA IMC"

        btnCalcularImc.setOnClickListener { btnCalcularOnClick(it) }
        btnLimpar.setOnClickListener { btnLimparOnClick(it) }
    }

    fun btnCalcularOnClick(view: View) {
        try {
            if (txtPeso.text.isBlank()) {
                showShortToast("Informe o campo peso")
                txtPeso.requestFocus()
                return
            }
            if (txtAltura.text.isBlank()) {
                showShortToast("Informe o campo altura")
                txtPeso.requestFocus()
                return
            }

            val peso = txtPeso.text.toString().toBigDecimal()
            val altura = txtAltura.text.toString().toBigDecimal()

            val imc = calculadoraIMC.calcular(peso, altura)

            showLongToast("IMC Calculado: $imc")
        } catch (e: Exception) {
            showLongToast("Erro Inesperado: $e")
        }
    }

    fun btnLimparOnClick(view: View) {
        txtPeso.text.clear()
        txtAltura.text.clear()
        txtPeso.requestFocus()
    }

}