package com.example.hashcodebattler.Battle

import com.example.hashcodebattler.Character.ICharacter

class Attack {
    private val calculate = Calculate()
    fun normalAttack(orderPair: Pair<ICharacter, ICharacter>) {
        calculateNormalAttackDamage(orderPair)
    }

    private fun calculateNormalAttackDamage(orderPair: Pair<ICharacter,ICharacter>) {
        val dealChara = orderPair.first
        val receiveChara = orderPair.second
        val attack = dealChara.battleStatus[1].value
        val block = receiveChara.battleStatus[2].value

        //攻撃2乗/(攻撃+防御)*補正値
        val dealDamage = calculate.pow(attack, 2) / (attack + block) * 1
        receiveChara.battleStatus[0].value -= dealDamage
    }
}
