package com.example.forcapratica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.forcapratica3.jogo.Banco
import com.example.forcapratica3.jogo.Desafio

class MainActivity : AppCompatActivity() {

    private lateinit var tvPalavra: TextView
    private lateinit var tvDica: TextView
    private lateinit var banco: Banco
    private lateinit var desafio: Desafio

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.banco = Banco()
        this.desafio = Desafio(this.banco.palavra(),this.banco.dica())

        this.tvPalavra = findViewById(R.id.tvPalavra)
        this.tvDica = findViewById(R.id.tvDica)

        this.tvPalavra.text = this.desafio.palavra
        this.tvDica.text = this.desafio.dica
    }
}