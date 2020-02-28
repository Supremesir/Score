package com.supremesir.score

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author HaoFan Fang
 * @date 2020/2/28 19:35
 */

class ScoreViewModel : ViewModel() {
    private var aTeamScore : MutableLiveData<Int> = MutableLiveData()
    private var bTeamScore : MutableLiveData<Int> = MutableLiveData()

    private var aBack = 0
    private var bBack = 0

    fun getaTeamScore(): MutableLiveData<Int> {
        if (aTeamScore == null) {
            aTeamScore = MutableLiveData<Int>()
            aTeamScore.setValue(0)
        }
        return aTeamScore
    }

    fun getbTeamScore(): MutableLiveData<Int> {
        if (bTeamScore == null) {
            bTeamScore = MutableLiveData<Int>()
            bTeamScore.setValue(0)
        }
        return bTeamScore
    }

    fun addaTeamScore(num: Int) {
        aBack = aTeamScore.getValue()!!
        bBack = bTeamScore.getValue()!!
        aTeamScore.setValue(aTeamScore.getValue()!! + num)
    }

    fun addbTeamScore(num: Int) {
        aBack = aTeamScore.getValue()!!
        bBack = bTeamScore.getValue()!!
        bTeamScore.setValue(bTeamScore.getValue()!! + num)
    }

    fun reset() {
        aBack = aTeamScore.getValue()!!
        bBack = bTeamScore.getValue()!!
        aTeamScore.setValue(0)
        bTeamScore.setValue(0)
    }

    fun undo() {
        aTeamScore.setValue(aBack)
        bTeamScore.setValue(bBack)
    }

}



