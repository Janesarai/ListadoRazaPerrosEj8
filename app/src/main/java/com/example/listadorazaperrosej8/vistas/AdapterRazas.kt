package com.example.listadorazaperrosej8.vistas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.listadorazaperrosej8.data.local.RazaEntity
import com.example.listadorazaperrosej8.databinding.ItemRazasBinding

class AdapterRazas: RecyclerView.Adapter <AdapterRazas.ItemRazasViewHolder>(){
    lateinit var binding: ItemRazasBinding
    private val listadiItemRazas = mutableListOf<RazaEntity>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterRazas.ItemRazasViewHolder {

        binding = ItemRazasBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemRazasViewHolder(binding)
    }


    override fun onBindViewHolder(holder: AdapterRazas.ItemRazasViewHolder, position: Int) {
        val raza = listadiItemRazas[position]
        holder.bind(raza)
    }

    override fun getItemCount(): Int {
        return listadiItemRazas.size
    }

    fun setData(razas: List<RazaEntity>){
        this.listadiItemRazas.clear()
        this.listadiItemRazas.addAll(razas)
        notifyDataSetChanged()
    }
    class ItemRazasViewHolder(val razasVista: ItemRazasBinding): RecyclerView.ViewHolder(razasVista.root) {
        fun bind(raza:RazaEntity){
            razasVista.txNombreRazas.text = raza.raza
        }

    }

}