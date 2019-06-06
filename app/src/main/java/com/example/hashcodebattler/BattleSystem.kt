package com.example.hashcodebattler

import android.icu.util.IslamicCalendar
import com.example.hashcodebattler.Character.ICharacter
import com.example.hashcodebattler.Status.Attack
import com.example.hashcodebattler.Status.IParam
import kotlin.math.pow

object BattleSystem {
    fun calculateDamage(dealChara:ICharacter,recieveChara:ICharacter){
        val attack = dealChara.baseStatus[1].value
        val block = recieveChara.baseStatus[2].value



        //攻撃2乗/(攻撃+防御)*補正値
        val dealDamage = pow(attack,2) /(attack + block) * 1
        recieveChara.baseStatus[0].value -= dealDamage

    }
    private fun pow(value:Int, n:Int):Int{
        return value.toDouble().pow(n).toInt()
    }
}