package mangolost.jfreechart.service;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.IOException;

public class BarChartService {

    /**
     *
     */
    public static void genPieChart() {

        String fiat = "FIAT";
        String audi = "AUDI";
        String ford = "FORD";

        String speed = "Speed";
        String millage = "Millage";
        String userrating = "User Rating";
        String safety = "safety";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(1.0, fiat, speed);
        dataset.addValue(3.0, fiat, userrating);
        dataset.addValue(5.0, fiat, millage);
        dataset.addValue(5.0, fiat, safety);

        dataset.addValue(5.0, audi, speed);
        dataset.addValue(6.0, audi, userrating);
        dataset.addValue(10.0, audi, millage);
        dataset.addValue(4.0, audi, safety);

        dataset.addValue(4.0, ford, speed);
        dataset.addValue(2.0, ford, userrating);
        dataset.addValue(3.0, ford, millage);
        dataset.addValue(6.0, ford, safety);

        String title = "CAR USAGE STATISTICS";
        String categoryAxisLabel = "Category";
        String valueAxisLabel = "Score";
        PlotOrientation orientation = PlotOrientation.VERTICAL;
        JFreeChart barChart = ChartFactory.createBarChart(title, categoryAxisLabel, valueAxisLabel, dataset, orientation,
                true, true, false);

        int width = 640; /* Width of the image */
        int height = 480; /* Height of the image */
        File file = new File("charts/BarChart1.png");
        try {
            ChartUtils.saveChartAsPNG(file, barChart, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


