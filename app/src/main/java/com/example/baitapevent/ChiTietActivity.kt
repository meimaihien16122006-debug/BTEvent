
package com.example.baitapevent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChiTietActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chi_tiet)

        val tvHoTen = findViewById<TextView>(R.id.tvHoTen)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvSDT = findViewById<TextView>(R.id.tvSDT)
        val tvGioiTinh = findViewById<TextView>(R.id.tvGioiTinh)
        val tvMangXaHoi = findViewById<TextView>(R.id.tvMangXaHoi)
        val tvMSSV = findViewById<TextView>(R.id.tvMSSV)
        val tvLop = findViewById<TextView>(R.id.tvLop)
        val tvNganh = findViewById<TextView>(R.id.tvNganh)

        tvHoTen.text = "Họ tên: ${intent.getStringExtra("hoTen") ?: ""}"
        tvEmail.text = "Email: ${intent.getStringExtra("email") ?: ""}"
        tvSDT.text = "Số điện thoại: ${intent.getStringExtra("sdt") ?: ""}"
        tvGioiTinh.text = "Giới tính: ${intent.getStringExtra("gioiTinh") ?: ""}"
        tvMangXaHoi.text = "Mạng xã hội: ${intent.getStringExtra("mangXaHoi") ?: "Không chọn"}"
        tvMSSV.text = "MSSV: ${intent.getStringExtra("mssv") ?: ""}"
        tvLop.text = "Lớp: ${intent.getStringExtra("lop") ?: ""}"
        tvNganh.text = "Ngành: ${intent.getStringExtra("nganh") ?: ""}"
    }
}
