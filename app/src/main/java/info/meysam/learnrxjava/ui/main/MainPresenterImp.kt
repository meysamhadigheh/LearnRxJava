package info.meysam.learnrxjava.ui.main

import info.meysam.learnrxjava.GitResponse
import info.meysam.learnrxjava.url.ApiHelper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class MainPresenterImp : MainContract.Presenter {

    var compositeDisposable: CompositeDisposable? = CompositeDisposable()
    var mView: MainContract.View? = null


    open override fun getGitData() {


        compositeDisposable!!.add(
            ApiHelper.myApiInterface.getGitData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableObserver<GitResponse>() {
                    override fun onComplete() {

                    }

                    override fun onNext(gitResponse: GitResponse) {


                        mView?.updateUi(gitResponse)


                    }

                    override fun onError(e: Throwable) {
                    }

                })
        )


    }

    override fun onDestroy() {
        compositeDisposable?.clear()
    }

}