package com.example.ums.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ums.R
import com.example.ums.databinding.FragmentHomeBinding
import com.example.ums.utils.InfoStatus

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.apply {
            cardTariflar.setOnClickListener { nextfragment(InfoStatus.TARIFLAR) }
            cardDaqiqalar.setOnClickListener { nextfragment(InfoStatus.DAQIQALAR) }
            cardInternet.setOnClickListener { nextfragment(InfoStatus.INTERNET) }
            cardXizmatlar.setOnClickListener { nextfragment(InfoStatus.XIZMATLAR) }
            cardSms.setOnClickListener { nextfragment(InfoStatus.SMS) }
            cardNews.setOnClickListener {
                val url = "https://mobi.uz/uz/news/"

                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }

        }


        return binding.root
    }

    fun nextfragment(status: InfoStatus){
        findNavController().navigate(R.id.listFragment, bundleOf("keyInfo" to status))
    }

}