package com.bip.softwarearchitecture.solid.mvc;

import java.util.List;

public class MainPresenter implements IPresenter {
    private IView view;

    private Model model;

    public MainPresenter() {
        model = new Model();
    }

    public void attachView(IView view) {
        this.view = view;
    }

    @Override
    public void queryData() {
        view.showLoading();
        List<String> listString = model.getListString();
        view.refreshScreen(listString);
        view.hideLoading();
    }
}
