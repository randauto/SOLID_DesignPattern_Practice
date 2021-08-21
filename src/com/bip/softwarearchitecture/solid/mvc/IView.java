package com.bip.softwarearchitecture.solid.mvc;

import java.util.List;

public interface IView {
    void refreshScreen(List<String> listData);
    void showLoading();
    void hideLoading();
}
