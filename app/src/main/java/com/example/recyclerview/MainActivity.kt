package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val listaDeContatos = ArrayList<Contato>()
    var recycler : RecyclerView? = null
    var adapter : ContatoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 1..30){
            listaDeContatos.add(Contato("Mateus de Morais Tostes Cruz", "mateusmtc@gmail.com"))
        }

        recycler = findViewById(R.id.recyclerview)
        adapter = ContatoAdapter(listaDeContatos,this)
        recycler?.layoutManager = LinearLayoutManager(this)
        recycler?.adapter = adapter
    }
}