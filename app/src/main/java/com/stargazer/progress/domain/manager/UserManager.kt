package com.stargazer.progress.domain.manager

class UserManager {

    companion object{
        const val defaultUsername = "test"
        const val defaultPassword = "0000"

        var isLoggendIn = false

        fun login(usuername: String, password: String): Boolean{

            return if (usuername == defaultUsername && password == defaultPassword){

                isLoggendIn = true
                true
            }else{
                isLoggendIn = false
                false
            }
        }
        fun logout(){
            isLoggendIn = false
        }
    }
}