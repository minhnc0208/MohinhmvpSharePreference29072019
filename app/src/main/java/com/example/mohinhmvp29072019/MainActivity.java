package com.example.mohinhmvp29072019;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button mBtnDangNhap;
    EditText mEdtTaiKhoan, mEdtMatKhau;
    CheckBox mCbLuu;
    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor mEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        initCache();

        eventClick();

    }

    private void initCache() {
        mSharedPreferences = getSharedPreferences("CacheApp", MODE_PRIVATE);
    }

    public void init() {
        mBtnDangNhap = findViewById(R.id.buttonDangNhap);
        mEdtTaiKhoan = findViewById(R.id.edittextTaiKhoan);
        mEdtMatKhau = findViewById(R.id.edittextMatkhau);
        mCbLuu = findViewById(R.id.checkboxLuuMatKhau);
    }

    private void eventClick() {
        mBtnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String taikhoan = mEdtTaiKhoan.getText().toString();
                String matkhau = mEdtMatKhau.getText().toString();

            }
        });
    }


}
