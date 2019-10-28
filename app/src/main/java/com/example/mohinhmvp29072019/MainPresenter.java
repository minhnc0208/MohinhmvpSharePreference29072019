package com.example.mohinhmvp29072019;

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
public class MainPresenter implements ResponseLogin {

    private LoginModel loginModel;
    private OnListenLogin onListenLogin;

    public MainPresenter(OnListenLogin onListenLogin) {
        loginModel = new LoginModel(this);
        this.onListenLogin = onListenLogin;

    }

    public void login(String taikhoan, String matkhau) {
        loginModel.validateLogin(taikhoan, matkhau);
    }

    @Override
    public void onSuccess() {
        onListenLogin.loginSuccess();
    }

    @Override
    public void onError() {
        onListenLogin.loginFail();
    }
}
