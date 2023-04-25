package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class MainFragment : Fragment(),View.OnClickListener {
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.profile).setOnClickListener(this)
        view.findViewById<Button>(R.id.projects).setOnClickListener(this)
    }
    override fun onClick(view: View?) {
        when(view?.id){
            R.id.profile -> navController.navigate(R.id.action_mainFragment_to_profileFragment)
            R.id.projects -> navController.navigate(R.id.action_mainFragment_to_projectsFragment)
        }
    }

}