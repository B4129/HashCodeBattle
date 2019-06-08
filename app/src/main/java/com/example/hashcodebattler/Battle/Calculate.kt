package com.example.hashcodebattler.Battle

import com.example.hashcodebattler.Character.ICharacter
import kotlin.math.pow

class Calculate {

    fun calculateNormalAttackDamage(dealChara: ICharacter, recieveChara: ICharacter){
        val attack = dealChara.battleStatus[1].value
        val block = recieveChara.battleStatus[2].value

        //攻撃2乗/(攻撃+防御)*補正値
        val dealDamage = pow(attack, 2) /(attack + block) * 1
        recieveChara.battleStatus[0].value -= dealDamage
    }
    //べき乗計算
    private fun pow(value:Int, n:Int) = value.toDouble().pow(n).toInt()

}