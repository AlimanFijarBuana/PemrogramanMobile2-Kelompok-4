package id.co.kasrt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import id.co.kasrt.model.DataItem


class UserAdapter(private val users: MutableList<DataItem>) :
    RecyclerView.Adapter<UserAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_user, parent, false)
        return ListViewHolder(view)
    }

    fun addUser(newUsers: DataItem) {
        users.add(newUsers)
        notifyItemInserted(users.lastIndex)
    }

    fun clear() {
        users.clear()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = users[position]
        Glide.with(holder.itemView.context)
            .load(user.avatar)
            .apply(RequestOptions().override(80, 80).placeholder(R.drawable.icon_avatar))
            .transform(CircleCrop())
            .into(holder.ivAvatar)
        holder.tvUserName.text = "${user.firstName} ${user.lastName}"
        holder.tvEmail.text = user.email
        holder.tvAlamat.text = user.alamat.toString()
        holder.tvTotalIuranBulanan.text = user.totalIuranBulanan
        holder.tvTotalIuranIndividu.text = user.totalIuranIndividu
        holder.tvTotalIuranAkhir.text = user.totalIuranAkhir
        holder.tvPengeluaranIuran.text = user.pengeluaranIuran
        holder.tvPemanfaatanIuran.text = user.pemanfaatanIuran
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvUserName: TextView = itemView.findViewById(R.id.ItemName)
        var tvEmail: TextView = itemView.findViewById(R.id.ItemEmail)
        var ivAvatar: ImageView = itemView.findViewById(R.id.item_avatar)
        var tvAlamat: TextView = itemView.findViewById(R.id.ItemAlamat)
        var tvTotalIuranBulanan: TextView = itemView.findViewById(R.id.itemTotalIuranBulanan)
        var tvTotalIuranIndividu: TextView = itemView.findViewById(R.id.itemTotalIuranIndividu)
        var tvTotalIuranAkhir: TextView = itemView.findViewById(R.id.itemTotalIuranAkhir)
        var tvPengeluaranIuran: TextView = itemView.findViewById(R.id.itemPengeluaranIuran)
        var tvPemanfaatanIuran: TextView = itemView.findViewById(R.id.itemPemanfaatanIuran)
    }
}