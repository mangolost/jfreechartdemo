package mangolost.jfreechart;

import mangolost.jfreechart.service.*;

/**
 *
 */
public class JfreechartStudyApplication {

    public static void main(String[] args) {
        System.out.println("start gen pie chart");
        PieChartService.genPieChart();
        System.out.println("finish gen pie chart");

        System.out.println("start gen bar chart");
        BarChartService.genPieChart();
        System.out.println("finish gen bar chart");

        System.out.println("start gen line chart");
        LineChartService.genLineChart();
        System.out.println("finish gen line chart");

        System.out.println("start gen xyline chart");
        XYLineChartService.genXYLineChart();
        System.out.println("finish gen xyline chart");

        System.out.println("start gen 3dpie chart");
        PieChartService.gen3DPieChart();
        System.out.println("finish gen 3dpie chart");

        System.out.println("start gen bubble chart");
        BubbleChartService.genBubbleChart();
        System.out.println("finish gen bubble chart");

        System.out.println("start gen timeseries chart");
        TimeSeriesChartService.genTimeSeriesChart();
        System.out.println("finish gen timeseries chart");
    }


}
