package com.example.demo_ui_exa_1

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import java.util.*


class FragmentOption7 : Fragment() {
    private lateinit var fecha: EditText
    private lateinit var imprifecha: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_option7, container, false)
        fecha = view.findViewById(R.id.etDate)
        imprifecha = view.findViewById(R.id.tvFechaGrande)

        fecha.setOnClickListener {
            mostrarDataPicker()
        }
        return view
    }

    private fun mostrarDataPicker() {
        val calendario = Calendar.getInstance()
        val año = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val dia = calendario.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            requireContext(),
            { _, selectedYear, selectedMonth, selectedDayOfMonth ->
                val dateString = "${selectedDayOfMonth}/${selectedMonth + 1}/$selectedYear"
                fecha.setText(dateString)
                imprifecha.text = "Fecha seleccionada:\n$dateString"
            },
            año, mes, dia
        )
        datePickerDialog.show()
    }
}

