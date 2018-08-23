package mangolost.jfreechart.service;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.SeriesException;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

import java.io.File;
import java.io.IOException;

public class TimeSeriesChartService {

    /**
     *
     */
    public static void genTimeSeriesChart() {

        TimeSeries series = new TimeSeries("Random Data");
        Second current = new Second();
        double value = 100.0;
        for (int i = 0; i < 4000; i++) {
            try {
                value = value + Math.random() - 0.5;
                series.add(current, new Double(value));
                current = (Second) current.next();
            } catch (SeriesException e) {
                System.err.println("Error adding to series");
            }
        }
        XYDataset dataset = new TimeSeriesCollection(series);
        JFreeChart timechart = ChartFactory.createTimeSeriesChart(
                "Computing Test",
                "Seconds",
                "Value",
                dataset,
                false,
                false,
                false);

        int width = 560; /* Width of the image */
        int height = 370; /* Height of the image */
        File file = new File("charts/TimeSeriesChart1.png");
        try {
            ChartUtils.saveChartAsPNG(file, timechart, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
