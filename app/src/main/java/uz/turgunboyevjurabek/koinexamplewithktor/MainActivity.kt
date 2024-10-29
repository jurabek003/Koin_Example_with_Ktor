package uz.turgunboyevjurabek.koinexamplewithktor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.koin.androidx.viewmodel.ext.android.viewModel
import uz.turgunboyevjurabek.koinexamplewithktor.feature.presentation.vm.MyViewModel
import uz.turgunboyevjurabek.koinexamplewithktor.ui.theme.KoinExampleWithKtorTheme

class MainActivity : ComponentActivity() {
    private val myViewModel: MyViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KoinExampleWithKtorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val todayTime by myViewModel.todayTime.collectAsState()
                    Text(text = todayTime?.date.toString(), modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KoinExampleWithKtorTheme {
        Greeting("Android")
    }
}