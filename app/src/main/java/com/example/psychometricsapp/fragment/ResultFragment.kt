package com.example.psychometricsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.psychometricsapp.R
import com.example.psychometricsapp.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    lateinit var navController: NavController
    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!

    var option = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        option = arguments?.getInt("index")?: -1
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setResult(option)
        binding.btnHome.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
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
         * @return A new instance of fragment ResultFragment.
         */
        // TODO: Rename and change types and number of parameter
    }

    fun setResult(option: Int) {
        when(option) {
            1 -> {
                binding.MainTextView.text = "You are a QUITTER!"
                binding.SubTextView.text = "You can let the person easily!"
            }

            2 -> {
                binding.MainTextView.text = "You should focus on yourself!"
                binding.SubTextView.text = "You become really clingy to your EX!"
            }

            3 -> {
                binding.MainTextView.text = "You should take it easy!"
                binding.SubTextView.text = "You can do crazy things no matter what it takes!"
            }

            4 -> {
                binding.MainTextView.text = "You are pretty mature!"
                binding.SubTextView.text = "You can easily accept the break-up!"
            }
        }
    }
}