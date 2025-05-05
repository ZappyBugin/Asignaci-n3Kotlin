package com.example.demo_ui_exa_1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.isVisible

class DomainEx(
    private val context: Context,
    private val nombres: List<String>,
    private val imagenes: List<Int>,
    private val leyendas: List<String>
) : BaseAdapter() {

    private val expandido = BooleanArray(nombres.size) { false }

    override fun getCount(): Int = nombres.size
    override fun getItem(position: Int): Any = nombres[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_cheese, parent, false)
        val tvNombre = view.findViewById<TextView>(R.id.tvNombre)
        val imgQueso = view.findViewById<ImageView>(R.id.imgQueso)
        val tvLeyenda = view.findViewById<TextView>(R.id.tvLeyenda)

        tvNombre.text = nombres[position]
        imgQueso.setImageResource(imagenes[position])
        tvLeyenda.text = leyendas[position]

        imgQueso.isVisible = expandido[position]
        tvLeyenda.isVisible = expandido[position]

        view.setOnClickListener {
            expandido[position] = !expandido[position]
            notifyDataSetChanged()
        }

        return view
    }
}
