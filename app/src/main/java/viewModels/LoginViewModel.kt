package viewModels


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel(): ViewModel(){

    var email by mutableStateOf("")
    var password by mutableStateOf("")

    var passwordVisible by mutableStateOf(false)

    fun resetState() {
        email = ""
        password = ""
        passwordVisible = false
    }

    fun loginUserWithEmailAndPassword(
        email: String, password: String, callback: (Boolean) -> Unit
    ) {
//        viewModelScope.launch {
//            userRepository.loginWithEmailAndPassword(email, password) { success ->
//                if (success) {
//                    callback(true)
//                } else {
//                    callback(false)
//                }
//
//            }
//        }

    }

//    fun signOut(callback: (Boolean) -> Unit) {
//        viewModelScope.launch {
//            userRepository.signOut { success ->
//                if (success) {
//                    callback(true)
//                } else {
//                    callback(false)
//                }
//
//            }
//        }
//    }
}

//class LoginViewModelFactory(private val userRepository: UserRepository) :
//    ViewModelProvider.Factory {
//    @Suppress("UNCHECKED_CAST")
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
//            return LoginViewModel(userRepository) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}
