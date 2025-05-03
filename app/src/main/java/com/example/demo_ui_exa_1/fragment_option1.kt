package com.example.demo_ui_exa_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast


class FragmentOption1 : Fragment() {
    private lateinit var textViewSeekBarValue: TextView
    private lateinit var seekBar: SeekBar
    private lateinit var buttonShowValue: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_option1, container, false)

        textViewSeekBarValue = view.findViewById(R.id.textViewSeekBarValue)
        seekBar = view.findViewById(R.id.seekBar)
        buttonShowValue = view.findViewById(R.id.buttonShowValue)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                textViewSeekBarValue.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        buttonShowValue.setOnClickListener {
            val value = seekBar.progress
            val message = "El valor seleccionado es: $value"
            Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
        }

        return view
    }


}