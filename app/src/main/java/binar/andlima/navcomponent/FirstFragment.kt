package binar.andlima.navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gotodua.setOnClickListener {
//            Nav Controller : source untuk berpindah ke fragment ke dua (id yg dipanggil adalah id dari Navigation graph --> folder res> navigation >nav_component.xml
            Navigation.findNavController(view).navigate(R.id.navigasike_fragmentdua)
        }

    }

}