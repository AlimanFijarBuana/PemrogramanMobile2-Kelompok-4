package id.co.kasrt.model

import com.google.gson.annotations.SerializedName

data class DataItem(
    @field: SerializedName("id")
    val id: Int? = null,

    @field: SerializedName("email")
    val email: String? = null,

    @field: SerializedName("first_name")
    val firstName: String? = null,

    @field: SerializedName("last_name")
    val lastName: String? = null,

    @field: SerializedName("avatar")
    val avatar: String? = null,

    @field: SerializedName("alamat")
    val alamat: String? = null,

    @field: SerializedName("total_iuran_bulanan")
    val totalIuranBulanan: String? = null,

    @field: SerializedName("total_iuran_individu")
    val totalIuranIndividu: String? = null,

    @field: SerializedName("total_iuran_akhir")
    val totalIuranAkhir: String? = null,

    @field: SerializedName("pengeluaran_iuran")
    val pengeluaranIuran: String? = null,

    @field: SerializedName("pemanfaatan_iuran")
    val pemanfaatanIuran: String? = null,

    )
