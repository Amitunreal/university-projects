import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author <Name>
 * @since 24/01/2016
 * 
 *        GridMonitor class implements {@link GridMonitorInterface} as specified
 *        in the project details and defines each and every API present in that
 *        interface as instructed.
 *
 */
public class GridMonitor implements GridMonitorInterface {
	Scanner scan = null;
	int rows, columns;
	final double[][] baseDataArray;
	double[][] dataSumArray;
	double[][] dataAvgArray;
	double[][] deltaArray;
	boolean[][] dangerArray;

	/**
	 * Parameterized Constructor for GridMonitor class which takes sample grid
	 * as input. In case the filename parameter does not exist
	 * {@link FileNotFoundException} will be thrown.
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public GridMonitor(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		scan = new Scanner(file);
		rows = scan.nextInt();
		columns = scan.nextInt();
		baseDataArray = new double[rows][columns];
		dataSumArray = new double[rows][columns];
		dataAvgArray = new double[rows][columns];
		deltaArray = new double[rows][columns];
		dangerArray = new boolean[rows][columns];
		initBaseDataArray();
	}

	/**
	 * Initializes the Actual data grid from the provide input file
	 */
	private void initBaseDataArray() {
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				baseDataArray[i][j] = scan.nextDouble();
	}

	/**
	 * Returns the actual base data grid.
	 */
	@Override
	public double[][] getBaseGrid() {
		double[][] data = new double[rows][columns];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				data[i][j] = baseDataArray[i][j];
		return data;
	}

	/**
	 * Return the data grid of sum of surrounding cells of every cell.
	 */
	@Override
	public double[][] getSurroundingSumGrid() {
		double sum = 0.0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Cell to the left
				if (j - 1 < 0) {
					sum += baseDataArray[i][j];
				} else {
					sum += baseDataArray[i][j - 1];
				}
				// Cell to the top
				if (i - 1 < 0) {
					sum += baseDataArray[i][j];
				} else {
					sum += baseDataArray[i - 1][j];
				}
				// Cell to the right
				if (j + 1 > columns - 1) {
					sum += baseDataArray[i][j];
				} else {
					sum += baseDataArray[i][j + 1];
				}
				// Cell to the bottom
				if (i + 1 > rows - 1) {
					sum += baseDataArray[i][j];
				} else {
					sum += baseDataArray[i + 1][j];
				}
				dataSumArray[i][j] = sum;
				sum = 0.0;
			}
		}
		return dataSumArray;
	}

	/**
	 * Returns the data grid of average of surrounding cells of every cell
	 */
	@Override
	public double[][] getSurroundingAvgGrid() {
		getSurroundingSumGrid();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				dataAvgArray[i][j] = dataSumArray[i][j] / 4;
			}
		}
		return dataAvgArray;
	}

	/**
	 * Returns the allowed delta deviation for every cell.
	 */
	@Override
	public double[][] getDeltaGrid() {
		getSurroundingAvgGrid();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				deltaArray[i][j] = dataAvgArray[i][j] / 2;
			}
		}
		return deltaArray;
	}

	/**
	 * Returns the grid of danger status of every cell.
	 */
	@Override
	public boolean[][] getDangerGrid() {
		getDeltaGrid();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (baseDataArray[i][j] < deltaArray[i][j]
						|| baseDataArray[i][j] > (dataAvgArray[i][j] + deltaArray[i][j])) {
					dangerArray[i][j] = true;
				} else {
					dangerArray[i][j] = false;
				}
			}
		}
		return dangerArray;
	}

	/**
	 * Returns String representation of GridMonitor instance with provided input
	 * data.
	 */
	@Override
	public String toString() {
		StringBuffer stb = new StringBuffer(
				"GridMonitor : [\nGrid Size : {" + rows + "*" + columns + "} \nGrid Data : {\n");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (j == 0 && columns != 1)
					stb.append("{" + baseDataArray[i][j] + ", ");
				else if (j == columns - 1)
					stb.append(baseDataArray[i][j] + "}");
				else
					stb.append(baseDataArray[i][j] + ", ");
			}
			if (i != rows - 1)
				stb.append(",\n");
		}
		stb.append("}\n]");
		return stb.toString();
	}
}