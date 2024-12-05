package com.example.ums.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ums.R
import com.example.ums.adapter.RvAdapter
import com.example.ums.databinding.FragmentListBinding
import com.example.ums.models.MyInfo
import com.example.ums.utils.InfoStatus
import com.example.ums.utils.MyData

class ListFragment : Fragment(), RvAdapter.RvAction {

    private val binding by lazy { FragmentListBinding.inflate(layoutInflater) }
lateinit var infoStatus: InfoStatus
lateinit var rvAdapter: RvAdapter

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       infoStatus = arguments?.getSerializable("keyInfo") as InfoStatus

       rvAdapter = when(infoStatus){
           InfoStatus.TARIFLAR-> RvAdapter(MyData.tarifList, this)
           InfoStatus.DAQIQALAR-> RvAdapter(MyData.daqiqaList, this)
           InfoStatus.INTERNET-> RvAdapter(MyData.internetList, this)
           InfoStatus.XIZMATLAR-> RvAdapter(MyData.xizmatList, this)
           InfoStatus.SMS-> RvAdapter(MyData.smsList, this)

       }


       binding.rv.adapter = rvAdapter



        return binding.root
    }

    override fun itemClick(myInfo: MyInfo, position: Int) {
        findNavController().navigate(R.id.infoFragment, bundleOf("position" to position))
        findNavController().navigate(R.id.infoFragment, bundleOf("keya" to myInfo))



    }

}