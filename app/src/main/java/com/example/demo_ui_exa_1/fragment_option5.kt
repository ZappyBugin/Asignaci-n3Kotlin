package com.example.demo_ui_exa_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class FragmentOption5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_option5, container, false)
        val spinner: Spinner = view.findViewById(R.id.fidgetspinner)

        val adapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.colores_array,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>, viewItem: View?, position: Int, id: Long
            ) {
                val colorSeleccionado = parent.getItemAtPosition(position).toString()
                Toast.makeText(
                    requireContext(),
                    "Color seleccionado: $colorSeleccionado",
                    Toast.LENGTH_SHORT
                ).show()

                val colorResId = when (colorSeleccionado.lowercase()) {
                    "blanco" -> R.color.white
                    "rojo" -> R.color.rojo
                    "verde" -> R.color.verde
                    "azul" -> R.color.azul
                    "amarillo" -> R.color.amarillo
                    "naranja" -> R.color.naranja
                    "morado" -> R.color.morado
                    else -> R.color.white
                }

                val color = ContextCompat.getColor(requireContext(), colorResId)
                view.setBackgroundColor(color)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // No hacer nada
            }
        }

        return view
    }
}
