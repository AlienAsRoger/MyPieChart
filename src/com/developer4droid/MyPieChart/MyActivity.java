package com.developer4droid.MyPieChart;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MyActivity extends Activity {
	private PieView pieView;
	private ChartView chartView;
	private GamesInfoByResult games;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		games = new GamesInfoByResult();
		games.setTotal(2147);
		games.setWins(1183);
		games.setLosses(833);
		games.setDraws(131);

		LinearLayout linearLayout = new LinearLayout(this);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
				420);

		pieView = new PieView(this);
		chartView = new ChartView(this);

		linearLayout.addView(pieView, params);
		linearLayout.addView(chartView, params);
		setContentView(linearLayout);
	}

	@Override
	protected void onResume() {
		super.onResume();
		pieView.setGames(games);
	}
}
