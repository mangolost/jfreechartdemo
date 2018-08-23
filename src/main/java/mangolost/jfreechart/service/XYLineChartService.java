package mangolost.jfreechart.service;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.io.File;
import java.io.IOException;

public class XYLineChartService {

    /**
     *
     */
    public static void genXYLineChart() {

        XYSeries firefox = new XYSeries("Firefox");
        firefox.add(1.0, 1.0);
        firefox.add(2.0, 4.0);
        firefox.add(3.0, 3.0);

        XYSeries chrome = new XYSeries("Chrome");
        chrome.add(1.0, 4.0);
        chrome.add(2.0, 5.0);
        chrome.add(3.0, 6.0);

        XYSeries iexplorer = new XYSeries("InternetExplorer");
        iexplorer.add(3.0, 4.0);
        iexplorer.add(4.0, 5.0);
        iexplorer.add(5.0, 4.0);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(firefox);
        dataset.addSeries(chrome);
        dataset.addSeries(iexplorer);

        String title = "Browser usage statastics";
        String categoryAxisLabel = "Category";
        String valueAxisLabel = "Score";
        PlotOrientation orientation = PlotOrientation.VERTICAL;
        JFreeChart xylineChart = ChartFactory.createXYLineChart(title, categoryAxisLabel, valueAxisLabel, dataset,
                orientation, true, true, false);

        int width = 640; /* Width of the image */
        int height = 480; /* Height of the image */
        File file = new File("charts/XYLineChart1.png");
        try {
            ChartUtils.saveChartAsPNG(file, xylineChart, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
