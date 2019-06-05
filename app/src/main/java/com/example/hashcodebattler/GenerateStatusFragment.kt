package com.example.hashcodebattler

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hashcodebattler.Character.CharacterFactory
import com.example.hashcodebattler.Status.IParam
import com.example.hashcodebattler.Status.Status
import com.example.hashcodebattler.hashcode.HashCode
import kotlinx.android.synthetic.main.fragment_generate_status.*

class GenerateStatusFragment : Fragment() {
    // TODO: Rename and change types of parameters

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
    }

    private fun clickGenerateCharacterButton(view: View) {
        val hashCodeClass = HashCode()
        val hashCode = hashCodeClass.create()
        val jobNumber = hashCodeClass.generateNumber(hashCode)
        val character = CharacterFactory.create(jobNumber)
        val baseStatus = Status(character.baseStatus).also { it.addHashValue(hashCode) }
        changeStatusLabel(baseStatus.status)
    }

    private fun changeStatusLabel(statusList: MutableList< IParam>) {
        hpNumberLabel.text = statusList[0].value.toString()
        attackNumberLabel.text = statusList[1].value.toString()
        blockNumberLabel.text = statusList[2].value.toString()
        contackNumberLabel.text = statusList[3].value.toString()
        defenceNumberLabel.text = statusList[4].value.toString()
        speedNumberLabel.text = statusList[5].value.toString()
    }
}



