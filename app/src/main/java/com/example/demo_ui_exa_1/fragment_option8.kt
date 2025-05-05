package com.example.demo_ui_exa_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView


class FragmentOption8 : Fragment() {
    private lateinit var listView: ListView

    private val nombres = listOf("Cheddar", "Mozzarella", "Blue Cheese", "Casu Marzu", "Yak", "Pule", "Stinking Bishop")
    private val imagenes = listOf(
        R.drawable.cheddar, R.drawable.mozzarella, R.drawable.bluecheese,
        R.drawable.casu_marzu, R.drawable.yak, R.drawable.pule, R.drawable.stinking_bishop
    )
    private val leyendas = listOf(
        "Queso duro originario de Inglaterra, muy popular y versátil.\n" +
                "Va de suave a muy fuerte según su maduración.\n" +
                "Puede envejecer más de 10 años, intensificando su sabor.",
        "Queso fresco italiano, originalmente de leche de búfala.\n" +
                "Muy usado en pizzas por su textura y derretido.\n" +
                "El di bufala está protegido por denominación de origen.",
        "Queso con moho azul como Roquefort o Gorgonzola.\n" +
                "El moho Penicillium roqueforti le da su sabor y vetas.\n" +
                "Tiene un aroma fuerte y un gusto salado y punzante.",
        "Queso sardo con larvas vivas de mosca en su interior.\n" +
                "Fermenta hasta volverse casi líquido con las larvas.\n" +
                "Está prohibido en muchos países, pero es una delicia local.\n" +
                "\n",
        "Queso del Himalaya hecho con leche de yak.\n" +
                "Muy seco y duro, se mastica como un caramelo.\n" +
                "Puede conservarse durante años sin refrigeración.",
        "Queso serbio rarísimo hecho con leche de burra.\n" +
                "Es uno de los quesos más caros del mundo.\n" +
                "Requiere leche de muchas burras para producir 1 kilo.",
        "Queso blando inglés con olor extremadamente fuerte.\n" +
                "Lavado con sidra de pera durante su maduración.\n" +
                "Famoso por aparecer en Wallace & Gromit."
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_option8, container, false)
        listView = view.findViewById(R.id.listaQ)
        val adapter = DomainEx(requireContext(), nombres, imagenes, leyendas)
        listView.adapter = adapter
        return view
    }
}
