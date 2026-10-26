
package com.example.baitapevent

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtHoTen: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtSDT: EditText
    private lateinit var edtMSSV: EditText
    private lateinit var edtLop: EditText
    private lateinit var edtNganh: EditText
    private lateinit var rgGioiTinh: RadioGroup
    private lateinit var cbFacebook: CheckBox
    private lateinit var cbTikTok: CheckBox
    private lateinit var cbInstagram: CheckBox
    private lateinit var btnDangKy: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtHoTen = findViewById(R.id.edtHoTen)
        edtEmail = findViewById(R.id.edtEmail)
        edtSDT = findViewById(R.id.edtSDT)
        edtMSSV = findViewById(R.id.edtMSSV)
        edtLop = findViewById(R.id.edtLop)
        edtNganh = findViewById(R.id.edtNganh)

        rgGioiTinh = findViewById(R.id.rgGioiTinh)
        cbFacebook = findViewById(R.id.cbFacebook)
        cbTikTok = findViewById(R.id.cbTikTok)
        cbInstagram = findViewById(R.id.cbInstagram)
        btnDangKy = findViewById(R.id.btnDangKy)

        // Event cho EditText
        val danhSachEditText = listOf(
            edtHoTen, edtEmail, edtSDT,
            edtMSSV, edtLop, edtNganh
        )

        for (editText in danhSachEditText) {
            editText.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?, start: Int, count: Int, after: Int
                ) {}

                override fun onTextChanged(
                    s: CharSequence?, start: Int, before: Int, count: Int
                ) {
                    if (!s.isNullOrEmpty()) {
                        Toast.makeText(
                            this@MainActivity,
                            "Đang nhập: ${editText.hint}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                override fun afterTextChanged(s: Editable?) {}
            })
        }

        // Event cho RadioButton giới tính
        rgGioiTinh.setOnCheckedChangeListener { _, checkedId ->
            val gioiTinh = when (checkedId) {
                R.id.rbNam -> "Nam"
                R.id.rbNu -> "Nữ"
                else -> ""
            }

            if (gioiTinh.isNotEmpty()) {
                Toast.makeText(
                    this,
                    "Bạn đã chọn giới tính: $gioiTinh",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        // Event cho CheckBox mạng xã hội
        val danhSachCheckBox = listOf(
            cbFacebook, cbTikTok, cbInstagram
        )

        for (checkBox in danhSachCheckBox) {
            checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
                val trangThai = if (isChecked) "Đã chọn" else "Đã bỏ chọn"

                Toast.makeText(
                    this,
                    "$trangThai ${buttonView.text}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        // Event cho nút Đăng ký
        btnDangKy.setOnClickListener {
            Toast.makeText(
                this,
                "Bạn đã bấm Đăng ký!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
