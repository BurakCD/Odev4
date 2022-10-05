package com.ethadien.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import com.ethadien.odev4.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.ayaGitButon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfa_a_gecis)
        }

        binding.xeGitButon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfa_x_gecis)
        }

        return binding.root
    }

}