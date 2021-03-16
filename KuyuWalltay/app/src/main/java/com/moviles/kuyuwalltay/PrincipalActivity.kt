package com.moviles.kuyuwalltay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore

class PrincipalActivity : AppCompatActivity() {
    var peliculas = arrayListOf<PeliculasModelClass>()
    var selectedContactPosition = 0
    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        db = FirebaseFirestore.getInstance()
    }
}