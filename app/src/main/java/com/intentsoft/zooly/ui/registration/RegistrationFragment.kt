package com.intentsoft.zooly.ui.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.intentsoft.zooly.R
import kotlinx.android.synthetic.main.fragment_registration.*


class RegistrationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_registration, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnSigin.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_registrationFragment_to_signFragment)
        }
        btnSigup.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_registrationFragment_to_sigupFragment)
        }

    }
}