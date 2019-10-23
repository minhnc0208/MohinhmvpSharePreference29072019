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
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initCache();
        mapview();
        eventClick();
    }

    private void init() {
        mBtnDangNhap = findViewById(R.id.buttonDangNhap);
        mEdtTaiKhoan = findViewById(R.id.edittextTaiKhoan);
        mEdtMatKhau = findViewById(R.id.edittextMatkhau);
        mCbLuu = findViewById(R.id.checkboxLuuMatKhau);
        mainPresenter = new MainPresenter();
    }

    private void mapview() {
        mEdtTaiKhoan.setText(mSharedPreferences.getString("taikhoan", ""));
        mEdtMatKhau.setText(mSharedPreferences.getString("matkhau", ""));
        mCbLuu.setChecked(mSharedPreferences.getBoolean("trangthai", false));
    }

    private void initCache() {
        mSharedPreferences = getSharedPreferences("CacheApp", MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
    }

    private void eventClick() {
        //        mBtnDangNhap.setOnClickListener(new View.OnClickListener() {
        ////            @Override
        ////            public void onClick(View v) {
        ////                String taikhoan = mEdtTaiKhoan.getText().toString().trim();
        ////                String matkhau = mEdtMatKhau.getText().toString().trim();
        ////
        ////                if (taikhoan.equals("admin") && matkhau.equals("admin")) {
        ////                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
        ////                    if (mCbLuu.isChecked()) {
        ////                        mEditor.putString("taikhoan", taikhoan);
        ////                        mEditor.putString("matkhau", matkhau);
        ////                        mEditor.putBoolean("trangthai", true);
        ////                        mEditor.commit();
        ////                    } else {
        ////                        mEditor.remove("taikhoan");
        ////                        mEditor.remove("matkhau");
        ////                        mEditor.remove("trangthai");
        ////                        mEditor.commit();
        ////                    }
        ////                } else {
        ////                    Toast.makeText(MainActivity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
        ////                }
        ////
        ////            }
        ////        });
        mBtnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String taikhoan = mEdtTaiKhoan.getText().toString().trim();
                String matkhau = mEdtMatKhau.getText().toString().trim();
                mainPresenter.login(taikhoan, matkhau);
            }
        });
    }

}