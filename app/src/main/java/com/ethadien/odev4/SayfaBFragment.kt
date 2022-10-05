package com.ethadien.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ethadien.odev4.databinding.FragmentSayfaABinding
import com.ethadien.odev4.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {
    private lateinit var binding : FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.bdenYyeGitButon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfa_bden_yye_gecis)
        }
        return binding.root
    }

}