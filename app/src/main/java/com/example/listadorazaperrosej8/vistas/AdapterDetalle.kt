package com.example.listadorazaperrosej8.vistas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.listadorazaperrosej8.data.local.RazaDetalle
import com.example.listadorazaperrosej8.databinding.FragmentDetalleBinding
import com.example.listadorazaperrosej8.databinding.ItemDetalleBinding

class AdapterDetalle: RecyclerView.Adapter<AdapterDetalle.ItemDetalleViewHolder>() {

    lateinit var binding: ItemDetalleBinding
    private val listaDetalle = mutableListOf<RazaDetalle>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterDetalle.ItemDetalleViewHolder{

        binding = ItemDetalleBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemDetalleViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return listaDetalle.size
    }

    override fun onBindViewHolder(holder: ItemDetalleViewHolder, position: Int) {
        val perro = listaDetalle[position]
        holder.bind(perro)
    }

    fun setDataDetalle(detalle: List<RazaDetalle>){
        this.listaDetalle.clear()
        this.listaDetalle.addAll(detalle)
        notifyDataSetChanged()
    }
    class ItemDetalleViewHolder(val perritoVista: ItemDetalleBinding): RecyclerView.ViewHolder(perritoVista.root) {
        fun bind(detalle: RazaDetalle){
            perritoVista.imgDetalle.load(detalle.url)
        }
    }
}