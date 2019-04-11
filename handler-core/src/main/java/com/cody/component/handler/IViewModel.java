/*
 * ************************************************************
 * 文件：IViewModel.java  模块：bind-base  项目：component
 * 当前修改时间：2019年04月05日 17:42:54
 * 上次修改时间：2019年03月29日 16:29:01
 * 作者：Cody.yi   https://github.com/codyer
 *
 * Copyright (c) 2019
 * ************************************************************
 */

package com.cody.component.handler;

import com.cody.component.handler.action.ViewAction;
import com.cody.component.lib.safe.SafeMutableLiveData;
import com.cody.component.lib.view.IView;

/**
 * Created by xu.yi. on 2019/3/25.
 * p-gbb-android
 */
public interface IViewModel extends IView {
    SafeMutableLiveData<ViewAction> getActionLiveData();

    /**
     * 处理其他action，扩展用
     */
    void executeAction(ViewAction action);
}