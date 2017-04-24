package com.example.administrator.editknee.HistoryPhase;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.administrator.editknee.AdapterPhase.Phase4Adapter;
import com.example.administrator.editknee.AdapterPhase.Phase5Adapter;
import com.example.administrator.editknee.DatabaseManager;
import com.example.administrator.editknee.ModelPhase.DBPhase4;
import com.example.administrator.editknee.ModelPhase.DBPhase5;
import com.example.administrator.editknee.R;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.chart.BarChart;
import org.achartengine.chart.PointStyle;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

import java.util.List;

public class HistoryFirstPhase5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_first_phase5);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.9),(int)(height*.7));


        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("กราฟระยะที่ 5");

        DatabaseManager databaseManager = DatabaseManager.getInstance(this);
        List<DBPhase5> dbPhase5s = databaseManager.getPhase5();

        XYSeries series = new XYSeries("หงาย-ชิด-ก้น");
        XYSeries series2 = new XYSeries("คว่ำ-ชิด-ก้น");
        XYSeries series3 = new XYSeries("ก้ม-แตะ-เท้า");
        XYSeries series4 = new XYSeries("นั่ง-เหยียด-ค้าง");
        XYSeries series5 = new XYSeries("เกาะ-ย่อ-ลง");
        XYSeries series6 = new XYSeries("เดิน-สอง-ขา");

        int length = dbPhase5s.size();
        for (int i = 0; i < length; i++) {
            series.add(i + 1, dbPhase5s.get(i).getNumber5_1());
            series2.add(i + 1,dbPhase5s.get(i).getNumber5_2());
            series3.add(i + 1, dbPhase5s.get(i).getNumber5_3());
            series4.add(i + 1, dbPhase5s.get(i).getNumber5_4());
            series5.add(i + 1, dbPhase5s.get(i).getNumber5_5());
            series6.add(i + 1, dbPhase5s.get(i).getNumber5_6());
        }

        XYSeriesRenderer renderer = new XYSeriesRenderer();
        renderer.setPointStyle(PointStyle.CIRCLE);
        renderer.setLineWidth(8);
        renderer.setColor(Color.BLUE);
        renderer.setPointStrokeWidth(15);
        renderer.setFillPoints(true);
        renderer.setDisplayChartValues(false);

        XYSeriesRenderer renderer2 = new XYSeriesRenderer();
        renderer2.setPointStyle(PointStyle.CIRCLE);
        renderer2.setLineWidth(8);
        renderer2.setColor(Color.RED);
        renderer2.setPointStrokeWidth(15);
        renderer2.setFillPoints(true);
        renderer2.setDisplayChartValues(false);

        XYSeriesRenderer renderer3 = new XYSeriesRenderer();
        renderer3.setPointStyle(PointStyle.CIRCLE);
        renderer3.setLineWidth(8);
        renderer3.setColor(Color.GREEN);
        renderer3.setPointStrokeWidth(5);
        renderer3.setFillPoints(true);
        renderer3.setDisplayChartValues(false);

        XYSeriesRenderer renderer4 = new XYSeriesRenderer();
        renderer4.setPointStyle(PointStyle.CIRCLE);
        renderer4.setLineWidth(8);
        renderer4.setColor(Color.GRAY);
        renderer4.setPointStrokeWidth(5);
        renderer4.setFillPoints(true);
        renderer4.setDisplayChartValues(false);

        XYSeriesRenderer renderer5 = new XYSeriesRenderer();
        renderer5.setPointStyle(PointStyle.CIRCLE);
        renderer5.setLineWidth(8);
        renderer5.setColor(Color.MAGENTA);
        renderer5.setPointStrokeWidth(5);
        renderer5.setFillPoints(true);
        renderer5.setDisplayChartValues(false);

        XYSeriesRenderer renderer6 = new XYSeriesRenderer();
        renderer6.setPointStyle(PointStyle.CIRCLE);
        renderer6.setLineWidth(8);
        renderer6.setColor(Color.CYAN);
        renderer6.setPointStrokeWidth(5);
        renderer6.setFillPoints(true);
        renderer6.setDisplayChartValues(false);

        XYMultipleSeriesRenderer mrenderer = new XYMultipleSeriesRenderer();
        for (int i = 0; i < length; i++) {
            mrenderer.addXTextLabel(i, String.valueOf(i));
        }
        mrenderer.addSeriesRenderer(renderer);
        mrenderer.addSeriesRenderer(renderer2);
        mrenderer.addSeriesRenderer(renderer3);
        mrenderer.addSeriesRenderer(renderer4);
        mrenderer.addSeriesRenderer(renderer5);
        mrenderer.addSeriesRenderer(renderer6);
        mrenderer.setYTitle("จำนวน (ครั้ง)");
        mrenderer.setXTitle("ครั้งที่");
        mrenderer.setZoomButtonsVisible(true);
        mrenderer.setChartTitleTextSize(50);
        mrenderer.setLabelsTextSize(30);
        mrenderer.setAxisTitleTextSize(35);
        mrenderer.setLabelsColor(Color.BLACK);
        mrenderer.setApplyBackgroundColor(true);
        mrenderer.setBackgroundColor(Color.WHITE);
        mrenderer.setMarginsColor(Color.WHITE);
        mrenderer.setLabelsColor(Color.BLACK);
        mrenderer.setYLabelsColor(0, Color.BLACK);
        mrenderer.setXLabelsColor(Color.BLACK);
        mrenderer.setXLabels(1);
        mrenderer.setLegendTextSize(30);
        mrenderer.setMargins(new int[] { 70, 90, 70, 90 });
        mrenderer.setBarSpacing(1);

        XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
        dataset.addSeries(series);
        dataset.addSeries(series2);
        dataset.addSeries(series3);
        dataset.addSeries(series4);
        dataset.addSeries(series5);
        dataset.addSeries(series6);

        LinearLayout chartLayout2 = (LinearLayout) findViewById(R.id.ViewGraph5);

        GraphicalView barView = ChartFactory.getBarChartView(this,dataset,mrenderer, BarChart.Type.DEFAULT);
        chartLayout2.addView(barView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_phase1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.close:
                startActivity();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void startActivity() {
        finish();
    }
}





