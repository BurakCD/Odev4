package com.ethadien.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ethadien.odev4.databinding.FragmentSayfaABinding
import com.ethadien.odev4.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {
    private lateinit var binding : FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.xtenYyeGitButon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfa_xten_yye_gecis)
        }
        return binding.root
    }

}