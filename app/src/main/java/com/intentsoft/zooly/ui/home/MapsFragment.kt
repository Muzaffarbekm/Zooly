package com.intentsoft.zooly.ui.home


import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.intentsoft.zooly.R

class MapsFragment : Fragment(), OnMapReadyCallback, GoogleMap.OnPolylineClickListener {

    val TamWorth: LatLng = LatLng(-31.083332, 150.916672)
    val NewCastle: LatLng = LatLng(-31.083332, 150.916672)
    val Brisbane: LatLng = LatLng(-31.083332, 150.916672)

    private val callback = OnMapReadyCallback { googleMap ->

        val Abay = LatLng(49.38, 72.52)
        googleMap.addMarker(MarkerOptions().title("Abay").position(Abay).snippet("Population: 4,137,400").icon(
            BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Abay))

        googleMap.addPolyline((PolylineOptions()).add(Brisbane, NewCastle, TamWorth, Brisbane)
            .width(10F)
            .color(Color.RED)
            .geodesic(true))

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

    override fun onMapReady(googleMap: GoogleMap) {

        // Add polylines to the map.
        // Polylines are useful to show a route or some other connection between points.
        val polyline1 = googleMap.addPolyline(PolylineOptions()
            .clickable(true)
            .add(
                LatLng(-35.016, 143.321),
                LatLng(-34.747, 145.592),
                LatLng(-34.364, 147.891),
                LatLng(-33.501, 150.217),
                LatLng(-32.306, 149.248),
                LatLng(-32.491, 147.309)))

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(-23.684, 133.903), 4f))

    }

    override fun onPolylineClick(p0: Polyline) {

    }
}