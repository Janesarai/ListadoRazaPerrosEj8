package com.example.listadorazaperrosej8.vistas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.listadorazaperrosej8.R
import com.example.listadorazaperrosej8.databinding.FragmentListadoRazasBinding


// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "id"


class FragmentDetalle : Fragment() {

    lateinit var binding: FragmentListadoRazasBinding
    private val razasVM: RazaVM by activityViewModels()

    private var param1: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListadoRazasBinding.inflate(layoutInflater,container,false)
        //initAdapter()

        razasVM.getDetallePerroVM(param1.toString())
        return binding.root
    }


    private fun initAdapter() {

    }


}
