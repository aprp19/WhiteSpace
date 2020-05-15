package com.aprp.whitespace.ui.profile

/*
NAMA    : ANGGA PUJA RESTU PRAKASA
NIM     : 10117130
KELAS   : IF4
TANGGAL PENGERJAAN : 14 - MEI - 2020
*/

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import android.content.ActivityNotFoundException
import com.aprp.whitespace.R
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * A simple [Fragment] subclass.
 */
class Profile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnInstagram.setOnClickListener{
            val uri = Uri.parse("https://www.instagram.com/aprp_19/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            try {
                Toast.makeText(activity, "Open Instagram", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/aprp_19")))
            }

        }
        btnFacebook.setOnClickListener{
            val uri = Uri.parse("fb://profile/Kier.Skies")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            try {
                Toast.makeText(activity, "Open Facebook", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Kier.Skies")))
            }

        }
        btnWhasapp.setOnClickListener{
            val uri = Uri.parse("https://wa.me/6281214290571/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            try {
                Toast.makeText(activity, "Open WhatsApp", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6281214290571/")))
            }

        }
        findMe.setOnClickListener{
            val uri = Uri.parse("geo:-6.936867, 107.646631?q=6°56'12.7\"S+107°38'47.9\"E")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            try {
                Toast.makeText(activity, "Open Maps", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:-6.936867, 107.646631?q=6°56'12.7\"S+107°38'47.9\"E")))
            }

        }

        about.setOnClickListener {
            val alertDialog =
                AlertDialog.Builder(activity).create()
            alertDialog.setTitle("App Version History")
            alertDialog.setMessage("Version 0.1.0 :\n" +
                    "- App Built\n" +
                    "Version 0.2.0 :\n" +
                    "- Adding Splashscreen and walktrough\n" +
                    "Version 0.3.0 :\n" +
                    "- Adding project structures\n" +
                    "Version 0.6.0 :\n" +
                    "- Completing Home, Daily Activity\n" +
                    "Version 0.8.0 :\n" +
                    "- Completing Gallery, Music Video\n" +
                    "Version 1.0.0 :\n" +
                    "- Completing Profile\n" +
                    "- Finishing Touch")
            alertDialog.setButton(
                AlertDialog.BUTTON_NEUTRAL, "OK"
            ) { dialog, _ -> dialog.dismiss() }
            alertDialog.show()
        }
    }
}