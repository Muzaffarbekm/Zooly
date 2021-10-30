package com.intentsoft.zooly.ui.registration

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import com.intentsoft.zooly.R
import com.intentsoft.zooly.ui.MainActivity
import kotlinx.android.synthetic.main.fragment_sigup.*


class SigupFragment : Fragment() {

    lateinit var firbaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sigup, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_back.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_sigupFragment_to_signFragment)
        }
        btnGoUp.setOnClickListener {
            btnGoUp.setOnClickListener {
                requireActivity().run {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
            }

        }
    }

}