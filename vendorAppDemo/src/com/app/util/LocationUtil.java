package com.app.util;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.dom4j.tree.DefaultCDATA;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class LocationUtil {
	// method for generate piechart by 2parameter path and Object[] data
	public void generatePieChart(String path, List<Object[]> data) {
		// 1.DataSet
		DefaultPieDataset dataset = new DefaultPieDataset();
		for (Object[] ob : data) {
			dataset.setValue(ob[0].toString(), new Double(ob[1].toString()));
		}
		// 2. create Jfree Chart obj using ChartFactory
		// (title, dataset, legend, tooltip, url)

		JFreeChart chart = ChartFactory.createPieChart3D("LocationReport", dataset, true, true, false);

		// 3.save as Image
		try {
			ChartUtilities.saveChartAsJPEG(new File(path + "/reportFileLoc.jpg"), chart, 300, 300);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void generateBarChart(String path, List<Object[]> data) {

		// crete dataset
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (Object[] ob : data) {
			dataset.setValue(new Double(ob[1].toString()), ob[0].toString(), "");

		}
		// 2. Create JFreeChart Object by using ChartFactory
		JFreeChart chart = ChartFactory.createBarChart3D("Location Report", "Loction Types", "count", dataset);

		// 3.save as Image

		try {
			ChartUtilities.saveChartAsJPEG(new File(path + "/reportBarLoc.jpg"), chart, 300, 300);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
