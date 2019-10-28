package com.example.mohinhmvp29072019;

import android.content.Context;

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
//public class LoginModel {
//
//    private ResponseLogin responseLogin;
//
//    public LoginModel(ResponseLogin responseLogin){
//        this.responseLogin = responseLogin;
//    }
//    public void validateLogin(String taikhoan, String matkhau) {
//
//        if (taikhoan.equals("phat123") && matkhau.equals("123456")) {
//            responseLogin.onSuccess();
//        } else {
//            responseLogin.onError();
//        }
//    }
//}
public class LoginModel {

    private ResponseLogin responseLogin;
    private ResponseSaveCache responseSaveCache;
    public LoginModel(ResponseLogin responseLogin , ResponseSaveCache responseSaveCache) {
        this.responseLogin = responseLogin;
        this.responseSaveCache = responseSaveCache;
    }

    public void validateLogin(String taikhoan, String matkhau) {
        if (taikhoan.equals("phat123") && matkhau.equals("123456")) {
            responseLogin.onSuccess();
        } else {
            responseLogin.onError();
        }
    }

    public void saveData(String user, String password, boolean status , Context context) {
        try {
            Mycache.getInstanceCache(context).saveValue("Taikhoan",user);
            Mycache.getInstanceCache(context).saveValue("Matkhau",password);
            Mycache.getInstanceCache(context).saveValue("Status",status);
            responseSaveCache.saveSuccess();
        }catch (Exception e){
            responseSaveCache.saveFail(e.getMessage());
        }


    }
}