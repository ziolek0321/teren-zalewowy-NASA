package Algorithm;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ImplementationOfAlgorithm {

	public DataHolder imp() throws FileNotFoundException {
		
		DataHolder dataHolder = new DataHolder();
		Algorithm algorithm = new Algorithm();
		
		
		algorithm.startCalculation();
		
		dataHolder.setStartPosition(algorithm.getStartPosition());
		dataHolder.setWaterDirection(algorithm.getWaterDirections());
		dataHolder.setMaxMinLatLon(algorithm.maxMinLatLon());
		dataHolder.setWaterDirection(algorithm.getWaterDirections());
		dataHolder.setCoordinateList(algorithm.getCoordinateList());
		dataHolder.setLength_tab(algorithm.getLengthTab());
		dataHolder.setWidth_tab(algorithm.getWidthTab());
		dataHolder.setSlat_source(algorithm.getSlat_source());
		dataHolder.setSlon_source(algorithm.getSlon_source());
		
		ArrayList<Double> coordinateList = algorithm.getCoordinateList();
		String[][] waterDirection2 = algorithm.getWaterDirections();
			
		return dataHolder;

	}

}