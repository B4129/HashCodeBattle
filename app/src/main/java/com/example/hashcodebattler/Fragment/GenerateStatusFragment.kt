package com.example.hashcodebattler.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.hashcodebattler.Character.CharacterFactory
import com.example.hashcodebattler.Player.Player
import com.example.hashcodebattler.R
import com.example.hashcodebattler.Status.IParam
import com.example.hashcodebattler.Status.Status
import com.example.hashcodebattler.hashcode.HashCode
import kotlinx.android.synthetic.main.fragment_generate_status.*

class GenerateStatusFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(
            R.layout.fragment_generate_status, container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener { clickGenerateCharacterButton(it) }
        button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_generateStatusFragment_to_mainPageFragment)
        }
    }


    private fun clickGenerateCharacterButton(view: View) {
        if (button2.visibility == INVISIBLE) {
            button2.visibility = VISIBLE
        }
        val hashCodeClass = HashCode()
        val hashCode = hashCodeClass.create()
        val jobNumber = hashCodeClass.generateNumber(hashCode)
        Player.character = CharacterFactory.create(jobNumber)

        val baseStatus = Status(Player.character.baseStatus).also { it.addHashValue(hashCode) }
        changeStatusLabel(baseStatus.status)
    }

    private fun changeStatusLabel(statusList: MutableList<IParam>) {
        hpNumberLabel.text = statusList[0].value.toString()
        attackNumberLabel.text = statusList[1].value.toString()
        blockNumberLabel.text = statusList[2].value.toString()
        contackNumberLabel.text = statusList[3].value.toString()
        defenceNumberLabel.text = statusList[4].value.toString()
        speedNumberLabel.text = statusList[5].value.toString()
    }
}



