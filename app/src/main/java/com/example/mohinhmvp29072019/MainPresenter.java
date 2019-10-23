package com.example.mohinhmvp29072019;

public class MainPresenter {

    private LoginModel loginModel;

    public MainPresenter() {
        loginModel = new LoginModel();

    }

    public void login(String taikhoan, String matkhau) {
        loginModel.validdateLogin(taikhoan, matkhau);
    }
}
