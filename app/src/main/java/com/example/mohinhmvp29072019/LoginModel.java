package com.example.mohinhmvp29072019;

//public class LoginModel {
//    private ResponseLogin responseLogin;
//
//    public LoginModel(ResponseLogin responseLogin) {
//        this.responseLogin = responseLogin;
//    }
//
//    public void validdateLogin(String taikhoan, String matkhau) {
//        if (taikhoan.equals("admin") && matkhau.equals("matkhau")) {
//            responseLogin.onSuccess();
//        } else {
//            responseLogin.onError();
//        }
//    }
//}
public class LoginModel {

    private ResponseLogin responseLogin;

    public LoginModel(ResponseLogin responseLogin){
        this.responseLogin = responseLogin;
    }
    public void validateLogin(String taikhoan, String matkhau) {

        if (taikhoan.equals("phat123") && matkhau.equals("123456")) {
            responseLogin.onSuccess();
        } else {
            responseLogin.onError();
        }
    }
}