package com.example.hashcodebattler.Character

import com.example.hashcodebattler.Status.*
import com.example.hashcodebattler.VO.Name

class Rogue() : ICharacter {

    override val name = Name("ローグ")
    override val baseStatus = mutableListOf(
        //合計100(HPは1/2コスト)で振り分ける
        HP(50),
        Attack(30),
        Block(10),
        Contact(10),
        Defence(10),
        Speed(25)
    )


    override fun attack() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun block() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}