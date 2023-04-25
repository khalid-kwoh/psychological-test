package com.example.psychometricsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.psychometricsapp.R
import com.example.psychometricsapp.databinding.FragmentMainBinding
import com.example.psychometricsapp.databinding.FragmentQuestionBinding


class QuestionFragment : Fragment(), View.OnClickListener {
    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.btn_next -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }
}