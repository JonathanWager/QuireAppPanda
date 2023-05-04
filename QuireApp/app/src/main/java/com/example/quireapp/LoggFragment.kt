package com.example.quireapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quireapp.databinding.FragmentLoggBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class LoggFragment : Fragment() {
    private var _binding:FragmentLoggBinding?=null
    private val binding get() = _binding!!
    private lateinit var db : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoggBinding.inflate(layoutInflater,container,false)
        val view = binding.root

        db = FirebaseDatabase.getInstance("https://quire-9ac5c-default-rtdb.europe-west1.firebasedatabase.app")
            .getReference("User")
        return view
    }


}