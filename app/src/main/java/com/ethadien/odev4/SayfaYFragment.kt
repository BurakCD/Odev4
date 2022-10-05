package com.ethadien.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SayfaYFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sayfa_y, container, false)
    }

    // Navigation graphte geri dönülecek sayfayı seçmek için sayfa değiştirme
    // aksiyonunun popUpTo özelliği ayarlanır ve altındaki tik işaretlenmez.
    // Altındaki tik seçilen sayfanın finish edilmesini sağlar
}