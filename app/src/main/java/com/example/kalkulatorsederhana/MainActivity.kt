package com.example.kalkulatorsederhana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KalkulatorApp()
        }
    }
}

@Composable
fun KalkulatorApp() {

    var angka1 by remember { mutableStateOf("") }
    var angka2 by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Text(
            text = "Kalkulator Sederhana : Amanda",
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = angka1,
            onValueChange = { angka1 = it },
            label = { Text("Angka Pertama") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = angka2,
            onValueChange = { angka2 = it },
            label = { Text("Angka Kedua") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                hasil = (
                        angka1.toDouble() +
                                angka2.toDouble()
                        ).toString()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Tambah")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                hasil = (
                        angka1.toDouble() *
                                angka2.toDouble()
                        ).toString()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Kali")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                hasil = (
                        angka1.toDouble() /
                                angka2.toDouble()
                        ).toString()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Bagi")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Hasil",
            fontSize = 20.sp
        )

        Text(
            text = hasil,
            fontSize = 40.sp
        )
    }
}