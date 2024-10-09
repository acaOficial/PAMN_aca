package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PresentationCardTheme {
                // Pantalla con Scaffold y tarjeta de presentación
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PresentationCard(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PresentationCard(modifier: Modifier = Modifier) {
    // Tarjeta de presentación con columnas y una imagen
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp), // Agregar padding para darle espacio
        horizontalAlignment = Alignment.CenterHorizontally, // Centrar horizontalmente los elementos
        verticalArrangement = Arrangement.Center // Centrar verticalmente
    ) {
        // Agregar imagen del logo de Android
        Image(
            painter = painterResource(id = R.drawable.androidlogo),
            contentDescription = "Android Logo",
            modifier = Modifier
                .size(100.dp)
                .padding(bottom = 16.dp),
            contentScale = ContentScale.Crop
        )

        // Nombre de la persona
        Text(
            text = "John Doe", // Nombre
            style = MaterialTheme.typography.headlineMedium, // Estilo del texto
            color = Color.Black
        )

        // Cargo o puesto
        Text(
            text = "Android Developer", // Cargo
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )

        // Información de contacto
        Text(
            text = "john.doe@example.com", // Email
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray
        )

        Text(
            text = "+1 (555) 123-4567", // Número de teléfono
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PresentationCardPreview() {
    PresentationCardTheme {
        PresentationCard() // Previsualización del componente
    }
}
