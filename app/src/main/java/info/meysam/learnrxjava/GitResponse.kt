package info.meysam.learnrxjava

import com.google.gson.annotations.SerializedName

open class GitResponse {
    @SerializedName("url")
    var url: String? = null

    @SerializedName("forks_url")
    var forksUrl: String? = null

    @SerializedName("html_url")
    var htmlUrl: String? = null

    @SerializedName("forks")
    var forks: ArrayList<Fork>? = null

}
