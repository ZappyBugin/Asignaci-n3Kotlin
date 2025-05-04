package com.example.demo_ui_exa_1

import android.icu.text.Transliterator.Position
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class FragmentOption8 : Fragment() {
    private lateinit var listView: ListView
    private val quesos = listOf("Cheedar", "Mozzarela", "Bluecheese", "Casu Marzu", "Yak", "Pule", "Stinking Bishop")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_option8, container, false)
        listView = view.findViewById(R.id.listaQ)
        val adapter= ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,quesos)
        listView.adapter = adapter
        listView.setOnItemClickListener{_,_,Position,_->
            val quesoselc = quesos[Position]
            Toast.makeText(requireContext(),"Parece que te gusto el: $quesoselc es un gran queso",Toast.LENGTH_SHORT).show()
        }
    return view
    }
}