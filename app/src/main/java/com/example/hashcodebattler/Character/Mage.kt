package com.example.hashcodebattler.Character

import com.example.hashcodebattler.Status.*
import com.example.hashcodebattler.VO.Name

class Mage() : ICharacter {
    override val name = Name("メイジ")
    override val baseStatus = mutableListOf(
        //合計100(HPは1/2コスト)で振り分ける
        HP(50),
        Attack(5),
        Block(10),
        Contact(40),
        Defence(10),
        Speed(10)
    )
    override val battleStatus = baseStatus.map{ it }.toMutableList()

    override fun attack(target: ICharacter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun block() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}