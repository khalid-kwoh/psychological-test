package com.example.psychometricsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.psychometricsapp.R
import com.example.psychometricsapp.databinding.FragmentSelectionBinding

class SelectionFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController
    private var _binding: FragmentSelectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSelectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.btnBack.setOnClickListener(this)
        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SelectionFragment.
         */
        // TODO: Rename and change types and number of parameters
    }

    override fun onClick(view: View?) {
        when(view?.id) {

            R.id.btn_back -> {
                navController.popBackStack()
            }
            R.id.option_1 -> {
                navgateWithIndex(1)
            }
            R.id.option_2 -> {
                navgateWithIndex(2)
            }
            R.id.option_3 -> {
                navgateWithIndex(3)
            }
            R.id.option_4 -> {
                navgateWithIndex(4)
            }
        }
    }

    fun navgateWithIndex(index: Int) {
        val bundle = bundleOf("index" to index)
        navController.navigate(R.id.action_selectionFragment_to_resultFragment, bundle)
    }
}