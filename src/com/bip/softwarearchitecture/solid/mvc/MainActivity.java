package com.bip.softwarearchitecture.solid.mvc;

import com.bip.softwarearchitecture.Main;

import java.util.List;

/*

View
 */
public class MainActivity implements IView {

    private MainPresenter mainPresenter;

    public static void main(String[] args) {
        MainActivity mainActivity = new MainActivity();
        mainActivity.onCreate();
    }

    public MainActivity() {

    }

    public void onCreate() {
        mainPresenter = new MainPresenter();
        mainPresenter.attachView(this);

        mainPresenter.queryData();
    }

    @Override
    public void refreshScreen(List<String> listData) {
        if (!listData.isEmpty()) {
            for (String item : listData) {
                System.out.println("" + item);

            }
        }
    }

    @Override
    public void showLoading() {
        System.out.println("Getting data...");
    }

    @Override
    public void hideLoading() {
        System.out.println("Done!");
    }
}
