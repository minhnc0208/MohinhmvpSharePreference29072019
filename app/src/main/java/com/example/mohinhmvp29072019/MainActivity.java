package com.example.mohinhmvp29072019;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

    //public class MainActivity extends AppCompatActivity implements OnListenLogin {
//
//    Button mBtnDangNhap;
//    EditText mEdtTaiKhoan, mEdtMatKhau;
//    CheckBox mCbLuu;
//    SharedPreferences mSharedPreferences;
//    SharedPreferences.Editor mEditor;
//    MainPresenter mainPresenter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        init();
//        initCache();
//        mapview();
//        eventClick();
//    }
//
//    private void init() {
//        mBtnDangNhap = findViewById(R.id.buttonDangNhap);
//        mEdtTaiKhoan = findViewById(R.id.edittextTaiKhoan);
//        mEdtMatKhau = findViewById(R.id.edittextMatkhau);
//        mCbLuu = findViewById(R.id.checkboxLuuMatKhau);
//        mainPresenter = new MainPresenter(this);
//    }
//
//    private void mapview() {
//        mEdtTaiKhoan.setText(mSharedPreferences.getString("taikhoan", ""));
//        mEdtMatKhau.setText(mSharedPreferences.getString("matkhau", ""));
//        mCbLuu.setChecked(mSharedPreferences.getBoolean("trangthai", false));
//    }
//
//    private void initCache() {
//        mSharedPreferences = getSharedPreferences("CacheApp", MODE_PRIVATE);
//        mEditor = mSharedPreferences.edit();
//    }
//
//    private void eventClick() {
//        //        mBtnDangNhap.setOnClickListener(new View.OnClickListener() {
//        ////            @Override
//        ////            public void onClick(View v) {
//        ////                String taikhoan = mEdtTaiKhoan.getText().toString().trim();
//        ////                String matkhau = mEdtMatKhau.getText().toString().trim();
//        ////
//        ////                if (taikhoan.equals("admin") && matkhau.equals("admin")) {
//        ////                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
//        ////                    if (mCbLuu.isChecked()) {
//        ////                        mEditor.putString("taikhoan", taikhoan);
//        ////                        mEditor.putString("matkhau", matkhau);
//        ////                        mEditor.putBoolean("trangthai", true);
//        ////                        mEditor.commit();
//        ////                    } else {
//        ////                        mEditor.remove("taikhoan");
//        ////                        mEditor.remove("matkhau");
//        ////                        mEditor.remove("trangthai");
//        ////                        mEditor.commit();
//        ////                    }
//        ////                } else {
//        ////                    Toast.makeText(MainActivity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
//        ////                }
//        ////
//        ////            }
//        ////        });
//        mBtnDangNhap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String taikhoan = mEdtTaiKhoan.getText().toString().trim();
//                String matkhau = mEdtMatKhau.getText().toString().trim();
//                mainPresenter.login(taikhoan, matkhau);
//            }
//        });
//    }
//
//    @Override
//    public void loginSuccess() {
//        Toast.makeText(this, "Thanh cong", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void loginFail() {
//        Toast.makeText(this, "That bai", Toast.LENGTH_SHORT).show();
//    }
//}
public class MainActivity extends AppCompatActivity implements OnListenLogin{

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
//        initCache();
//        mapview();
        eventClick();
    }

    private void init() {
        mBtnDangNhap = findViewById(R.id.buttonDangNhap);
        mEdtTaiKhoan = findViewById(R.id.edittextTaiKhoan);
        mEdtMatKhau = findViewById(R.id.edittextMatkhau);
        mCbLuu = findViewById(R.id.checkboxLuuMatKhau);
        mainPresenter = new MainPresenter(this);
    }

//    private void mapview() {
//        mEdtTaiKhoan.setText(mSharedPreferences.getString("taikhoan", ""));
//        mEdtMatKhau.setText(mSharedPreferences.getString("matkhau", ""));
//        mCbLuu.setChecked(mSharedPreferences.getBoolean("trangthai", false));
//    }
//
//    private void initCache() {
//        mSharedPreferences = getSharedPreferences("CacheApp", MODE_PRIVATE);
//        mEditor = mSharedPreferences.edit();
//    }

    private void eventClick() {
        mBtnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taikhoan = mEdtTaiKhoan.getText().toString().trim();
                String matkhau = mEdtMatKhau.getText().toString().trim();
                mainPresenter.login(taikhoan, matkhau);

//                if (taikhoan.equals("phat123") && matkhau.equals("123456")) {
//                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
//                    if (mCbLuu.isChecked()) {
//                        mEditor.putString("taikhoan", taikhoan);
//                        mEditor.putString("matkhau", matkhau);
//                        mEditor.putBoolean("trangthai", true);
//                        mEditor.commit();
//                    } else {
//                        mEditor.remove("taikhoan");
//                        mEditor.remove("matkhau");
//                        mEditor.remove("trangthai");
//                        mEditor.commit();
//                    }
//                } else {
//                    Toast.makeText(MainActivity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
//                }

            }
        });
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "Thanh cong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFail() {
        Toast.makeText(this, "That bai", Toast.LENGTH_SHORT).show();
    }
}