package com.example.mohinhmvp29072019;

import android.content.Context;

//public class MainPresenter implements ResponseLogin {
//
//    private LoginModel loginModel;
//    private OnListenLogin onListenLogin;
//
//    public MainPresenter(OnListenLogin onListenLogin) {
//        loginModel = new LoginModel(this);
//        this.onListenLogin = onListenLogin;
//    }
//
//    public void login(String taikhoan, String matkhau) {
//        loginModel.validdateLogin(taikhoan, matkhau);
//    }
//
//    @Override
//    public void onSuccess() {
//       onListenLogin.loginSuccess();
//
//    }
//
//    @Override
//    public void onError() {
//        onListenLogin.loginFail();
//
//    }
//}
//public class MainPresenter implements ResponseLogin {
//
//    private LoginModel loginModel;
//    private OnListenLogin onListenLogin;
//
//    public MainPresenter(OnListenLogin onListenLogin) {
//        loginModel = new LoginModel(this);
//        this.onListenLogin = onListenLogin;
//
//    }
//
//    public void login(String taikhoan, String matkhau) {
//        loginModel.validateLogin(taikhoan, matkhau);
//    }
//
//    @Override
//    public void onSuccess() {
//        onListenLogin.loginSuccess();
//    }
//
//    @Override
//    public void onError() {
//        onListenLogin.loginFail();
//    }
//}
public class MainPresenter implements ResponseLogin, ResponseSaveCache {

    private LoginModel loginModel;
    private OnListenLogin onListenLogin;
    private OnListenSaveCache onListenSaveCache;

    public MainPresenter(OnListenLogin onListenLogin , OnListenSaveCache onListenSaveCache){
        loginModel = new LoginModel(this , this);
        this.onListenLogin = onListenLogin;
        this.onListenSaveCache = onListenSaveCache;

    }

    public void login(String taikhoan, String matkhau) {
        loginModel.validateLogin(taikhoan , matkhau);
    }

    @Override
    public void onSuccess() {
        onListenLogin.loginSuccess();
    }

    @Override
    public void onError() {
        onListenLogin.loginFail();
    }


    public void saveLogin(String user, String password, boolean status , Context context) {
        loginModel.saveData(user,password,status,context);
    }

    @Override
    public void saveSuccess() {
        onListenSaveCache.saveSuccessFull();
    }

    @Override
    public void saveFail(String error) {
        onListenSaveCache.saveFailture(error);
    }
}
