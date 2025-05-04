package com.example.demo_ui_exa_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isGone

class FragmentOption6 : Fragment(),RadioGroup.OnCheckedChangeListener {
    private lateinit var botton1:RadioButton
    private lateinit var botton2:RadioButton
    private lateinit var  botton3:RadioButton
    private lateinit var botton4 : RadioButton
    private lateinit var  radioButton : RadioGroup
    private lateinit var  img : ImageView
    private lateinit var text : TextView

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_option6, container, false)
              botton1=view.findViewById(R.id.radioButton1)
              botton2=view.findViewById(R.id.radioButton2)
              botton3=view.findViewById(R.id.radioButton3)
              botton4=view.findViewById(R.id.radioButton4)
              radioButton = view.findViewById(R.id.radioGroup)
              radioButton.setOnCheckedChangeListener(this)
              img=view.findViewById(R.id.imageView)
              text=view.findViewById(R.id.textView1)
            return view
        }

    override fun onCheckedChanged(p0: RadioGroup?, opcion: Int) {
        text.visibility= View.VISIBLE
        when(opcion){
            botton1?.id ->{
                Toast.makeText( activity,"se selecciono la opcion 1", Toast.LENGTH_LONG).show()

                img?.setImageResource(R.drawable.uno)
            }
            botton2?.id ->{
                Toast.makeText( activity,"se selecciono la opcion 2", Toast.LENGTH_LONG).show()
                img?.setImageResource(R.drawable.dos)
            }
            botton3?.id -> {
                Toast.makeText( activity,"se selecciono la opcion 3", Toast.LENGTH_LONG).show()
                img?.setImageResource(R.drawable.tres)
            }
            botton4?.id->{
                Toast.makeText(activity,"se selecciono la opcion 4", Toast.LENGTH_LONG).show()
                img?.setImageResource(R.drawable.cuatro)
            }
        }
    }

}

