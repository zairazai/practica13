
package com.example.practica13

import android.content.Context
import android.hardware.SensorManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // Obtener el servicio de sensores de Android
        val sensorManager =
            getSystemService(Context.SENSOR_SERVICE) as SensorManager

        enableEdgeToEdge()

        setContent {

            BurbujaScreen(sensorManager = sensorManager)

        }
    }
}
