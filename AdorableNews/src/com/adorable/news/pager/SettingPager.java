package com.adorable.news.pager;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class SettingPager extends BasePager {

	public SettingPager(Context context) {
		super(context);
	}

	@Override
	public View initView() {

		TextView tv = new TextView(context);
		tv.setText("SettingPager");
		return tv;
	}

	@Override
	public void initData() {

	}

}
