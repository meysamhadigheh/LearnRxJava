package info.meysam.learnrxjava.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hivatec.ir.hivatectools.adapters.HivaRecyclerAdapter
import info.meysam.learnrxjava.GitResponse
import info.meysam.learnrxjava.R
import kotlinx.android.synthetic.main.activity_main.*


/**
 *
 */
class MainActivity : AppCompatActivity(), MainContract.View {

    var presenterImp: MainPresenterImp? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterImp = MainPresenterImp()
        presenterImp?.mView = this
        presenterImp?.getGitData()

    }


    override fun onDestroy() {

        presenterImp?.onDestroy()
        super.onDestroy()
    }

    override fun updateUi(gitResponse: GitResponse) {
        super.updateUi(gitResponse)

        url.text = gitResponse.url
        forksUrl.text = gitResponse.forksUrl
        htmlUrl.text = gitResponse.htmlUrl

        val adapter = HivaRecyclerAdapter(gitResponse.forks)
        container.layoutManager =
            LinearLayoutManager(baseContext, RecyclerView.VERTICAL, false)
        container.adapter = adapter


    }
}
