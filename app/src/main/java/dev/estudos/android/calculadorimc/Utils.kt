package dev.estudos.android.calculadorimc

import android.app.Activity
import android.widget.Toast

fun Activity.showShortToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

fun Activity.showLongToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}