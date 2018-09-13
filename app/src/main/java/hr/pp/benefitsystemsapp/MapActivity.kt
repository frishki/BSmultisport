package hr.pp.benefitsystemsapp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity() {

    lateinit var mapFragment : SupportMapFragment
    lateinit var googleMap : GoogleMap

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        mapFragment=supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            googleMap= it

            val center=LatLng(45.793460,15.919430)
            val location1=LatLng(45.7,15.9)
            //lalalalalal

            googleMap.isMyLocationEnabled = true

            googleMap.addMarker(MarkerOptions().position(center).title("ured"))
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(center, 9.7F))

            googleMap.addMarker(MarkerOptions()
                    .position(location1)
                    .title("location unknown")
                    .snippet("random lokacija ..."))

        })
    }
}
