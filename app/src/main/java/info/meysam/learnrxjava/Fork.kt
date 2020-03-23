package info.meysam.learnrxjava

import hivatec.ir.hivatectools.adapters.ItemBinder
import hivatec.ir.hivatectools.adapters.ItemHolder
import kotlinx.android.synthetic.main.item_fork.view.*


class Fork : ItemBinder {

    var url: String? = null
    var id: String? = null
    var created_at: String? = null
    var updated_at: String? = null
    override fun bindToHolder(binder: ItemHolder?, listener: Any?) {

        binder?.itemView?.createdAt?.text = created_at
        binder?.itemView?.updatedAt?.text = updated_at

    }

    override fun getResourceId(): Int {

        return R.layout.item_fork
    }

}



