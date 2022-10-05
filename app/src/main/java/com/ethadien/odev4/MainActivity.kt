package com.ethadien.odev4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         // Navigation graphte geri dönülecek sayfayı seçmek için sayfa değiştirme
         // aksiyonunun popUpTo özelliği ayarlanır ve altındaki tik işaretlenmez.
         // Altındaki tik seçilen sayfanın finish edilmesini sağlar
    }
}