package com.developer4droid.MyPieChart;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MyActivity extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Games games = new Games();
		games.setTotal(12);
		games.setWins(5);
		games.setLosses(4);
		games.setDraws(3);

		LinearLayout linearLayout = new LinearLayout(this);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
				400);

		PieView pieView = new PieView(this, games);
		ChartView chartView = new ChartView(this);

		linearLayout.addView(pieView, params);
		linearLayout.addView(chartView, params);
		setContentView(linearLayout);
	}


}
