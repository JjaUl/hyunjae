package jjaul.project.audioservice.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

abstract class BaseFragment<VB: ViewBinding>(private val inflate: Inflate<VB>) : Fragment() {
    private var _binding: VB? = null
    val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("hyun","Base onCreateView")
        _binding = inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        Log.d("hyun","Base onDestroyView")
        super.onDestroyView()
        _binding = null
    }
}