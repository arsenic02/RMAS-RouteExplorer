package elfak.mosis.routeexplorer

import RouteExplorerApp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import elfak.mosis.routeexplorer.data.repository.UserRepository
import elfak.mosis.routeexplorer.ui.theme.RouteExplorerTheme
import elfak.mosis.routeexplorer.viewModels.LoginViewModel
import elfak.mosis.routeexplorer.viewModels.LoginViewModelFactory
import elfak.mosis.routeexplorer.viewModels.UserViewModel
import elfak.mosis.routeexplorer.viewModels.UserViewModelFactory

//import viewModels.*

class MainActivity : ComponentActivity() {

    private val loginViewModel: LoginViewModel by viewModels {
        LoginViewModelFactory((application as MainApplication).container.userRepository)
    }

    private val userViewModel: UserViewModel by viewModels {
        UserViewModelFactory(
            userRepository = (application as MainApplication).container.userRepository
            //locationClient = (application as MainApplication).container.locationClient
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RouteExplorerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RouteExplorerApp(
                        loginViewModel,
                        userViewModel
                        )

                    //Greeting("Android")
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

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    RouteExplorerTheme {
//        Surface(
//            modifier =Modifier.fillMaxSize(),
//            color=MaterialTheme.colorScheme.background
//        ){
//            RouteExplorerApp(
//                loginViewModel
//                )
//        }
//        //Greeting("Android")
//    }
//}



