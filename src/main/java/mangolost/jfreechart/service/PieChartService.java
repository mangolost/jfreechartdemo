package mangolost.jfreechart.service;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;

public class PieChartService {

    /**
     *
     */
    public static void genPieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("IPhone 5s", 20);
        dataset.setValue("SamSung Grand", 25.5);
        dataset.setValue("MotoG", 40.77);
        dataset.setValue("Nokia Lumia", 10);

        String title = "Mobile Sales";
        JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);

        int width = 640; /* Width of the image */
        int height = 480; /* Height of the image */
        File file = new File("charts/PieChart1.png");
        try {
            ChartUtils.saveChartAsPNG(file, chart, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    public static void gen3DPieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("IPhone 5s", 20);
        dataset.setValue("SamSung Grand", 25.5);
        dataset.setValue("MotoG", 40.77);
        dataset.setValue("Nokia Lumia", 10);

        String title = "Mobile Sales";
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, true, true, false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(270);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.02);

        int width = 640; /* Width of the image */
        int height = 480; /* Height of the image */
        File file = new File("charts/3DPieChart1.png");
        try {
            ChartUtils.saveChartAsPNG(file, chart, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
