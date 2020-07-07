package com.resocentro.sam.chartdemo;

import android.app.Activity;
import android.os.Bundle;

import com.anychart.APIlib;
import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CHART 1
        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("John", 200));
        data.add(new ValueDataEntry("Jake", 300));
        data.add(new ValueDataEntry("Peter", 500));

        AnyChartView anyChartView1 = (AnyChartView) findViewById(R.id.any_chart_view1);
        APIlib.getInstance().setActiveAnyChartView(anyChartView1);
        Pie pie = AnyChart.pie();
        pie.data(data);
        pie.title("Primer Gráfico");
                pie.labels().position("outside");
        pie.legend().title().enabled(true);
        pie.legend().title().text("subtitulo").padding(0d,0d,5d,0d);


        anyChartView1.setChart(pie);

        //CHART 2
        List<DataEntry> data2 = new ArrayList<>();
        data2.add(new ValueDataEntry("John", 1));
        data2.add(new ValueDataEntry("Jake", 1));
        data2.add(new ValueDataEntry("Peter", 1));

        AnyChartView anyChartView2 = (AnyChartView) findViewById(R.id.any_chart_view2);
        APIlib.getInstance().setActiveAnyChartView(anyChartView2);
        Pie pie2 = AnyChart.pie();
        pie2.data(data2);

        anyChartView2.setChart(pie2);
    }
}
