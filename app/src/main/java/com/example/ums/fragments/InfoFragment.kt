package com.example.ums.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ums.R
import com.example.ums.adapter.RvAdapter
import com.example.ums.databinding.FragmentInfoBinding
import com.example.ums.models.MyInfo
import com.example.ums.utils.InfoStatus
import com.example.ums.utils.MeData
import com.example.ums.utils.MyData

class InfoFragment : Fragment() {
    private val binding by lazy { FragmentInfoBinding.inflate(layoutInflater) }
    lateinit var rvAdapter: RvAdapter
    lateinit var list: ArrayList<MyInfo>
 override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     var id = arguments.let { it!!.getInt("position") }
     val  myInfo = arguments.let { it!!.getSerializable("keya") as MyInfo }

     binding.tvTitle.text = myInfo.title
     binding.tvAboutShort.text = myInfo.ussdCod
     binding.tvAbout.text = myInfo.about




        return binding.root
    }

}