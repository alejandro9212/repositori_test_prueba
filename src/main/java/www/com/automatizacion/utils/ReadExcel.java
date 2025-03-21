package www.com.automatizacion.utils;

import org.junit.Assert;

import java.util.List;

public class ReadExcel {
    private ExcelReader reader;

    public ReadExcel () {
        this.reader = new ExcelReader();
    }



public List<List<String>> cargarDatos(String filePath) {
    List<List<String>> data = reader.readExcelData(filePath);
    if (data == null || data.isEmpty()) {
        throw new RuntimeException("Los datos del Excel no pudieron ser cargados o están vacíos.");
    }
    return data;



}
}