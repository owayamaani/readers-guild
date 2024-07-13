package com.example.seniors.views

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.seniors.Routes
import com.example.seniors.ui.theme.SeniorsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginUI(navController:NavController){
    var username by remember{ mutableStateOf("")}
    var password by remember{mutableStateOf("")}

        Box(modifier = Modifier
            .fillMaxSize()
            .background(brush = SolidColor(Color.Blue))){
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        text = "MEDI-LINK",
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Monospace,
                        letterSpacing = 15.sp
                    )
                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    text = "LOGIN",
                    color = Color.White,
                    fontSize = 25.sp,
                    fontFamily = FontFamily.Monospace,
                    letterSpacing = 15.sp
                )
                Spacer(modifier = Modifier.padding(10.dp))
               OutlinedTextField(value = username, onValueChange = {username = it},modifier = Modifier
                   .fillMaxWidth()
                   .padding(16.dp), enabled = true, label = { Text(text = "Username")}, leadingIcon = { IconButton(
                   onClick = { /*TODO*/ }) {
                   Icon(imageVector = Icons.Filled.Person, contentDescription = "Username")
               }})
                Spacer(modifier =Modifier.padding(5.dp))
                OutlinedTextField(value = password, onValueChange ={password = it}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp), enabled = true, label = { Text(text = "Password")}, leadingIcon = { IconButton(
                    onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Lock, contentDescription = "Password")
                }},visualTransformation = PasswordVisualTransformation(), colors = outlinedTextFieldColors(
                    cursorColor = Color.White,
                    focusedBorderColor = Color.LightGray,
                    unfocusedBorderColor = Color.White,
                    disabledBorderColor = Color.DarkGray
                )
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Button(onClick = { /*TODO*/ }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .height(48.dp)) {
                    Text(text = "LOGIN", color = Color.White, fontSize = 20.sp, fontFamily = FontFamily.Monospace)
                }
                Spacer(modifier = Modifier.padding(10.dp))
                TextButton(onClick = {navController.navigate(Routes.REGISTER)}, modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),enabled = true) {
                    Text(text = "Don't Have an Account?", color = Color.White, fontSize = 15.sp, fontFamily = FontFamily.Monospace)
                }
            }
        }
}

@Composable
@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_UNDEFINED)
fun LoginUIPreview(){
    SeniorsTheme(darkTheme = false) {
        LoginUI(rememberNavController())
    }
}