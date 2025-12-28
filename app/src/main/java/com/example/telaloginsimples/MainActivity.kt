package com.example.telaloginsimples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telaloginsimples.extencions.getTextString
import com.example.telaloginsimples.extencions.onClick
import com.example.telaloginsimples.extencions.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // View
        setContentView(R.layout.activity_main)

        // Adiciona o evento no botao de login
        onClick(R.id.btLogin) { onClickLogin() }

    }
    // Logica da senha
    fun onClickLogin() {
        val login = getTextString(R.id.editTextText)
        val senha = getTextString(R.id.editTextText2)

        if (login == "Odair" && senha == "123") {
            toast("Bem-vindo, Login realizado com sucesso!")
        } else{
            toast("Login ou senha incorretos")
        }
    }
}