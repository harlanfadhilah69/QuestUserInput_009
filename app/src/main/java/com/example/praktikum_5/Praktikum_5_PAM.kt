package com.example.praktikum_5

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextButton
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Praktikum5(modifier: Modifier
){

    var textNama by remember {mutableStateOf(value = "")}
    var textKota by remember {mutableStateOf(value = "")}
    var textTanggal by remember {mutableStateOf(value = "")}
    var textRT by remember {mutableStateOf(value = "")}
    var textRW by remember {mutableStateOf(value = "")}
    var textUmur by remember {mutableStateOf(value = "")}
    var textJK by remember {mutableStateOf(value = "")}
    var showDatePicker by remember { mutableStateOf(false) }
    var showAlertDialog by remember { mutableStateOf(false) }

    var nama by remember {mutableStateOf(value = "")}
    var kota by remember {mutableStateOf(value = "")}
    var tanggal by remember {mutableStateOf(value = "")}
    var rt by remember {mutableStateOf(value = "")}
    var rw by remember {mutableStateOf(value = "")}
    var umur by remember {mutableStateOf(value = "")}
    var jenis by remember {mutableStateOf(value = "")}
    var checked by remember {mutableStateOf(false)}

    val gender:List<String> = listOf("Laki-laki", "Perempuan")

    fun convertMillisToDate(millis: Long): String {
        val formatter = SimpleDateFormat("dd/MM/yyyy", Locale("in", "ID"))
        return  formatter.format(Date(millis))
    }


    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.backgroundddd),
            contentDescription = "Demo Background",
            contentScale = ContentScale.FillBounds,
            modifier = modifier.matchParentSize()
        )
        Text(
            text = "Form Registrasi",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(
                start = 88.dp,
                top = 56.dp,
            )
        )
        Column(
            modifier = Modifier.padding(top = 5.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier
                    .padding(top = 120.dp, start = 10.dp, end = 10.dp)
                    .fillMaxWidth()
                    .height(690.dp),
                shape = RoundedCornerShape(30.dp),
                colors = CardDefaults.outlinedCardColors(
                    containerColor = Color.LightGray.copy(alpha = 0.8f)
                )
            ) {

            }
        }
    }
}