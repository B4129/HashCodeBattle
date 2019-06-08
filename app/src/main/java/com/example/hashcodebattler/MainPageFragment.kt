package com.example.hashcodebattler

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.hashcodebattler.Player.Player
import kotlinx.android.synthetic.main.fragment_main_page.*


class MainPageFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hpValueLabel.text = Player.character.baseStatus[0].value.toString()
        attackValueLabel.text = Player.character.baseStatus[1].value.toString()
        blockValueLabel.text = Player.character.baseStatus[2].value.toString()
        contactValueLabel.text = Player.character.baseStatus[3].value.toString()
        defenceValueLabel.text = Player.character.baseStatus[4].value.toString()
        speedValueLabel.text = Player.character.baseStatus[5].value.toString()

        battleButton.setOnClickListener { Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_generateStatusFragment) }


    }

}
