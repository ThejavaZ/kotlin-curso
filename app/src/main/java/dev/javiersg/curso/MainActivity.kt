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


        // Operadores

        var a:Int = 5 + 5 // suma
        var b:Int = 5 - 5 // resta
        var c:Int = 5 * 5 // multiplicacion
        var d:Int = 5 / 5 // division
        var e:Int = 5 % 5 // modulo
        var f:Int = 10 / 6 // division infinita

        var aProIncremento:Int = 5
        var bProDecremento:Int = 5
        var cProIncremento:Int = 5
        var dProDecremento:Int = 5

        println(aProIncremento)
        println(++aProIncremento) // Primero incrementa, luego regresa. Salida: 6
        println(aProIncremento)

        println(bProDecremento)
        println(--bProDecremento) // Primero decrementa, luego regresa. Salida: 6
        println(bProDecremento)

        println(cProIncremento)
        println(cProIncremento++) // Primero regresa, luego increemta. Salida: 6
        println(cProIncremento)

        println(dProDecremento)
        println(dProDecremento--) // Primero regresa, luego decrementa. Salida: 5
        println(dProDecremento)


        // Comentario

        /*
        * Comentario de varias lineas
        * */

        // Operadores de comparacion
        var r = true

        println(a == b); // igual igual
        println(a != b) // diferente de
        println(a > b) // mayor que
        println(a < b) // menor que
        println(a >= b) // mayor igual que
        println(a <= b) // menor igual que
    }
}