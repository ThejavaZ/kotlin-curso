package dev.javiersg.curso

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object{
        const val moneda = "MXN";
    }
    var saldo: Float = 300.5f;
    var sueldo: Float = 12000.00f;
    var entero: Int = 42;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Variables y tipos de datos
        val fecha = "15/07/2002"; // Constantes
        var nombre: String = "Javier"; // Variables se declara los datos como TypeScript
        var vip: Boolean = false;
        var inicial: Char = 'J'

        var saludo = "Hola " + nombre
        var mi_salario = "Saldo: " + saldo.toString();

        nombre = "Javier Sarmiento"
        // nombre = 5; // ERROR

        println(saludo);

    }
}