package com.lvtanxi.adapter.listener;

import android.view.View;

/**
 * Date: 2017-11-08
 * Time: 13:34
 * Description: ItemView的点击事件
 */
public interface OnItemChildClickListener {
  /* 回调
     * @param view 点击View
     * @param position 点击下标
     */
    void onItemChildClick(View view, int position);
}
