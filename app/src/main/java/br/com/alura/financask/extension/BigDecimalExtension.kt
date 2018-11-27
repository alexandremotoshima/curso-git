package br.com.alura.financask.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

fun BigDecimal.formataParaBrasileiro(): String{
    return DecimalFormat
        .getCurrencyInstance(Locale("pt", "br"))
        .format(this)
}