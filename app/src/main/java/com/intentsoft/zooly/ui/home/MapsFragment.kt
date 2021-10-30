package com.intentsoft.zooly.ui.home


import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.intentsoft.zooly.R

class MapsFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->

        val Abay = LatLng(49.38, 72.52)
        googleMap.addMarker(MarkerOptions().title("Abay").position(Abay).snippet("Population: 4,137,400").icon(
            BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Abay))

        val Astana = LatLng(51.10, 71.30)
        googleMap.addMarker(MarkerOptions().title("Astana").position(Astana).snippet("Astana").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Astana))

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }


}