package info.meysam.learnrxjava.url


import info.meysam.learnrxjava.GitResponse
import io.reactivex.Observable
import retrofit2.http.*


interface ApiEndpointInterface {
    // Request method and URL specified in the annotation


    @GET("db72a05cc03ef523ee74")
    fun getGitData(): Observable<GitResponse>


}