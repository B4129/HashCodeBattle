package com.example.hashcodebattler.Battle

import com.example.hashcodebattler.Character.ICharacter
import kotlin.math.pow

class BattleSystem {
    val selectedCommand = 0
    private val calculate = Calculate()

    fun calculateAttack(selectedCommand: Int, dealChara: ICharacter, receiveChara: ICharacter) {
        when (selectedCommand) {
            1 -> calculate.calculateNormalAttackDamage(dealChara, receiveChara)
            else ->return
        }
    }
}