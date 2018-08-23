package mangolost.jfreechart.service;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.IOException;

public class LineChartService {

    /**
     *
     */
    public static void genLineChart() {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        line_chart_dataset.addValue(15, "schools", "1970");
        line_chart_dataset.addValue(30, "schools", "1980");
        line_chart_dataset.addValue(60, "schools", "1990");
        line_chart_dataset.addValue(120, "schools", "2000");
        line_chart_dataset.addValue(240, "schools", "2010");
        line_chart_dataset.addValue(300, "schools", "2014");

        String title = "Schools Vs Years";
        String categoryAxisLabel = "Year";
        String valueAxisLabel = "Schools Count";
        PlotOrientation orientation = PlotOrientation.VERTICAL;
        JFreeChart lineChartObject = ChartFactory.createLineChart(title, categoryAxisLabel, valueAxisLabel,
                line_chart_dataset, orientation, true, true, false);

        int width = 640; /* Width of the image */
        int height = 480; /* Height of the image */
        File file = new File("charts/LineChart1.png");
        try {
            ChartUtils.saveChartAsPNG(file, lineChartObject, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
