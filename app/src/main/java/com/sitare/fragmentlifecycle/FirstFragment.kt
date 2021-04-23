package com.sitare.fragmentlifecycle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.sitare.fragmentlifecycle.databinding.FirstFragmentBinding

class FirstFragment : Fragment() {
    private var _firstFragmentBinding: FirstFragmentBinding? = null
    private val firstFragmentBinding get() = _firstFragmentBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.first_fragment, container, false)
        _firstFragmentBinding = FirstFragmentBinding.inflate(inflater, container, false)
        firstFragmentBinding.clickMeButton.setOnClickListener {
            Toast.makeText(requireContext(), "Click Me Button Clicked", Toast.LENGTH_SHORT).show()
        }
        return firstFragmentBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _firstFragmentBinding = null
    }

}