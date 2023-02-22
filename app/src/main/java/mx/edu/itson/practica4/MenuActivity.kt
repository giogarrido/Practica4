package mx.edu.itson.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        var btnAntojitos: Button = findViewById(R.id.button_antojitos) as Button
        btnAntojitos.setOnClickListener{
            var intent: Intent = Intent(this,ActivityProductos::class.java).apply {
                putExtra("botonSeleccionado",1)
            }
            startActivity(intent)
        }
        var btnEspecialidades: Button = findViewById(R.id.button_especialidades) as Button
        btnEspecialidades.setOnClickListener{
            var intent: Intent = Intent(this,ActivityProductos::class.java).apply {
                putExtra("botonSeleccionado",2)
            }
            startActivity(intent)
        }
        var btnCombinaciones: Button =findViewById(R.id.button_conbinations) as Button
        btnCombinaciones.setOnClickListener{
            var intent: Intent = Intent(this,ActivityProductos::class.java).apply {
                putExtra("botonSeleccionado",3)
            }
            startActivity(intent)
        }
        var btnSopas: Button =findViewById(R.id.button_sopas) as Button
        btnSopas.setOnClickListener{
            var intent: Intent = Intent(this,ActivityProductos::class.java).apply {
                putExtra("botonSeleccionado",4)
            }
            startActivity(intent)
        }
        var btnTortas: Button =findViewById(R.id.button_tortas) as Button
        btnTortas.setOnClickListener{
            var intent: Intent = Intent(this,ActivityProductos::class.java).apply {
                putExtra("botonSeleccionado",5)
            }
            startActivity(intent)
        }
        var btnBebidas: Button =findViewById(R.id.button_drinks) as Button
        btnBebidas.setOnClickListener{
            var intent: Intent = Intent(this,ActivityProductos::class.java).apply {
                putExtra("botonSeleccionado",6)
            }
            startActivity(intent)
        }
    }
}