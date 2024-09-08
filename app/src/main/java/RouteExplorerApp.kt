import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import elfak.mosis.routeexplorer.viewModels.LoginViewModel

enum class Screens{
    Login,
    Register,
    GoogleMap
}

//@RequiresApi(Build.VERSION_CODES.0)
@Composable
fun RouteExplorerApp(
    loginViewModel: LoginViewModel,
   // registerViewModel:RegisterViewModel,
) {
    var isLoading by remember { mutableStateOf(true) }

//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Column(horizontalAlignment = Alignment.CenterHorizontally) {
//            CircularProgressIndicator()
//            Spacer(Modifier.height(4.dp))
//            Text("Loading...")
//        }
//    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Welcome to Route Explorer!")
    }
}

