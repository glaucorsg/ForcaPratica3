package com.example.forcapratica3.jogo

class Banco {

    val map: LinkedHashMap<String, String>
    lateinit var palavraSorteada: String

    init {
        this.map = linkedMapOf<String, String>()
        this.gerarSorteio()
        this.sorteio()
    }

    private fun gerarSorteio(){

        this.map.put("CASA", "Habitação")
        this.map.put("MARGARIDA", "Um tipo de flor")
        this.map.put("XICARA", "Café")
        this.map.put("TESOURA", "Pedra, papel, ...")
        this.map.put("VENTILADOR", "Acaba com o calor")
    }

    fun sorteio() {
        this.palavraSorteada = this.map.keys.random()
    }

    fun palavra(): String{
        return this.palavraSorteada
    }

    fun dica(): String {
        return this.map[palavraSorteada].toString()
    }

}


