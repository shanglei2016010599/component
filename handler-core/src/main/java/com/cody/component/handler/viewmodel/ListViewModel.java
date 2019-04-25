/*
 * ************************************************************
 * 文件：ListViewModel.java  模块：handler-core  项目：component
 * 当前修改时间：2019年04月24日 13:39:51
 * 上次修改时间：2019年04月24日 13:37:30
 * 作者：Cody.yi   https://github.com/codyer
 *
 * 描述：handler-core
 * Copyright (c) 2019
 * ************************************************************
 */

package com.cody.component.handler.viewmodel;

import com.cody.component.handler.data.ItemViewDataHolder;
import com.cody.component.handler.data.MaskViewData;
import com.cody.component.handler.interfaces.OnRequestListener;
import com.cody.component.handler.livedata.SafeMutableLiveData;
import com.cody.component.handler.mapper.IDataMapper;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;

/**
 * Created by xu.yi. on 2019/4/8.
 * 获取列表数据
 */
public abstract class ListViewModel<VD extends MaskViewData, ItemBean> extends SingleViewModel<VD>
        implements OnRequestListener, IDataMapper {

    private LiveData<List<ItemViewDataHolder<?>>> mItems;

    public ListViewModel(final VD friendlyViewData) {
        super(friendlyViewData);
    }

    @Override
    public void initFriendly() {
        super.initFriendly();
        mItems = new SafeMutableLiveData<>(new ArrayList<>());
    }

    public LiveData<List<ItemViewDataHolder<?>>> getItems() {
        return mItems;
    }
}