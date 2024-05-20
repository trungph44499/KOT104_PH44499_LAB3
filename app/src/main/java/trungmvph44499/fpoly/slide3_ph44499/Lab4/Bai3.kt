package trungmvph44499.fpoly.slide3_ph44499.Lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class Bai3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Scaffold(
                floatingActionButton = {
                    FloatingActionButton(onClick = { /* Handle
FAB click action here */ }) {
                        Icon(Icons.Filled.Add,
                            contentDescription = "Add")
                    }
                }
            ) { innerPadding ->
                NoteApp(innerPadding)

        }
    }
}
//@Preview(showBackground = true)
@Composable
fun NoteApp(paddingValues: PaddingValues) {
    val notes = listOf("Note 1", "Note 2", "Note 3", "Note 4",
        "Note 5")

    Column(modifier =
    Modifier.padding(paddingValues).padding(8.dp)) {
        notes.forEach { note ->
            NoteCard(noteText = note)
        }
    }
}
@Composable
fun NoteCard(noteText: String) {
    Box(
        modifier = Modifier.fillMaxWidth().padding(8.dp)
            .background(color = Color.Yellow, shape =
            MaterialTheme.shapes.medium)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = noteText,
                modifier = Modifier.weight(1f).padding(16.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "Expand Note",
                modifier =
                Modifier.padding(16.dp).align(Alignment.CenterVertically)
            )
        }
    }
}
}