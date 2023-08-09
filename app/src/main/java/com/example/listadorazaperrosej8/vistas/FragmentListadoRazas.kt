package com.example.listadorazaperrosej8.vistas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.listadorazaperrosej8.databinding.FragmentListadoRazasBinding

class FragmentListadoRazas : Fragment() {
    lateinit var binding: FragmentListadoRazasBinding
    private val razasVM: RazaVM by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListadoRazasBinding.inflate(layoutInflater,container,false)
        initAdapter()
        razasVM.getTodasRazas()
        return binding.root
    }

    private fun initAdapter() {
        val adapter = AdapterRazas()
        binding.RVrazas.adapter = adapter
        razasVM
    }


}