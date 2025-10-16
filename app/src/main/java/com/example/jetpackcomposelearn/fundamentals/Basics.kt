package com.example.jetpackcomposelearn.fundamentals

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun greeting(){
    Text(text = "sandeep")
}

@Preview(showBackground = true)
@Composable
fun greetingPreview(){
    greeting()
}