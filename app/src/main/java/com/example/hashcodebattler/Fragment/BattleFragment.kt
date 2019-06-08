package com.example.hashcodebattler.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hashcodebattler.Battle.Action
import com.example.hashcodebattler.Battle.Calculate
import com.example.hashcodebattler.Character.ICharacter
import com.example.hashcodebattler.Player.Enemy
import com.example.hashcodebattler.Player.Player
import com.example.hashcodebattler.R
import kotlinx.android.synthetic.main.fragment_battle.*
import java.lang.Thread.sleep

class BattleFragment : Fragment() {
    private val calculate = Calculate()
    private val action = Action()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_battle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //ループ
        initLabel()
        startBattle()

    }

    private fun startBattle() {
        val fragmentManager= fragmentManager!!
        val fragmentTransaction = fragmentManager.beginTransaction()
        //TODO　: キャラの戦闘時ステータスの初期化が必要
        val player = Player.character
        val enemy = Enemy.character
        initLabel()

        //~~が現れた！
        sleep(1000)
        //どうする？
        sleep(1000)
        //ボタン表示
        sleep(1000)
        fragmentTransaction.show(fragment2)


        //ボタンセレクト
        sleep(1000)
        fragmentTransaction.hide(fragment2)

        sleep(1000)
        val actionOrderPair = calculate.actionOrder(player,enemy)
        action.attack("normal",actionOrderPair)
        //入れ替え処理
        val swapPair = Pair(actionOrderPair.second,actionOrderPair.first)
        action.attack("normal",swapPair)
    }

    private fun initLabel() {
        val playerStatus = Player.character.baseStatus
        val enemyStatus = Enemy.character.baseStatus

        //プレイヤー側
        player2.text = Player.character.name.string
        hpnumlabel.text = playerStatus[0].value.toString()
        attacknumlabel.text = playerStatus[1].value.toString()
        blocknumlabel.text = playerStatus[2].value.toString()
        contactnumlabel.text = playerStatus[3].value.toString()
        defencenumlabel.text = playerStatus[4].value.toString()
        speednumlabel.text = playerStatus[5].value.toString()

        //敵側
        enemy.text = Enemy.character.name.string
        hpnumlabel2.text = enemyStatus[0].value.toString()
        attacknumlabel2.text = enemyStatus[1].value.toString()
        blocknumlabel2.text = enemyStatus[2].value.toString()
        contactnumlabel2.text = enemyStatus[3].value.toString()
        defencenumlabel2.text = enemyStatus[4].value.toString()
        speednumlabel2.text = enemyStatus[5].value.toString()

    }
}
