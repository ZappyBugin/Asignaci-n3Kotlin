package com.example.demo_ui_exa_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class FragmentOption6 : Fragment(),RadioGroup.OnCheckedChangeListener {
    private lateinit var botton1:RadioButton;
    private lateinit var botton2:RadioButton;
    private lateinit var  botton3:RadioButton;
    private lateinit var  radioButton : RadioGroup ;

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_option6, container, false)
              botton1=view.findViewById(R.id.radioButton1)
              botton2=view.findViewById(R.id.radioButton2)
              botton3=view.findViewById(R.id.radioButton3)
              radioButton = view.findViewById(R.id.radioGroup)
              radioButton.setOnCheckedChangeListener(this)
            return view
        }

    override fun onCheckedChanged(p0: RadioGroup?, opcion: Int) {
        when(opcion){
            botton1?.id ->Toast.makeText( activity,"se selecciono la opcion 1", Toast.LENGTH_LONG).show()
            botton2?.id -> Toast.makeText( activity,"se selecciono la opcion 2", Toast.LENGTH_LONG).show()
            botton3?.id -> Toast.makeText( activity,"se selecciono la opcion 3", Toast.LENGTH_LONG).show()
        }
    }

}

