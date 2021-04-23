package com.sitare.fragmentlifecycle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.sitare.fragmentlifecycle.databinding.SecondFragmentBinding

class SecondFragment : Fragment() {
    private var _secondFragmentBinding : SecondFragmentBinding? = null
    private val secondFragmentBinding get() = _secondFragmentBinding!!
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.second_fragment, container, false)
        _secondFragmentBinding = SecondFragmentBinding.inflate(inflater, container, false)
        secondFragmentBinding.clickTwoButton.setOnClickListener {
            Toast.makeText(requireContext(), "Click Here Button", Toast.LENGTH_SHORT).show()
            counter++
            secondFragmentBinding.detailTextView.text = counter.toString()
        }
        return secondFragmentBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _secondFragmentBinding = null
    }
}