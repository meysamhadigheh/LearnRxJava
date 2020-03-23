package info.meysam.learnrxjava.ui.main

import info.meysam.learnrxjava.GitResponse

interface MainContract {


    interface View {

        fun updateUi(gitResponse: GitResponse) {}


    }

    interface Presenter {


        fun getGitData()
        fun onDestroy()
    }
}