package com.example.hashcodebattler.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hashcodebattler.Battle.Action
import com.example.hashcodebattler.Battle.Calculate
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
            startBattle()

    }

    private fun startBattle() {
        //TODO　: キャラの戦闘時ステータスの初期化が必要
        val player = Player.character
        val enemy = Enemy.character
        //~~が現れた！
        //どうする？
        //ボタン表示
        fragment2.onStart()
        //ボタンセレクト
        fragment2.onDestroy()

        sleep(1000)
        val actionOrderPair = calculate.actionOrder(player,enemy)
        action.attack("normal",actionOrderPair)
        //入れ替え処理
        val swapPair = Pair(actionOrderPair.second,actionOrderPair.first)
        action.attack("normal",swapPair)
    }
}
