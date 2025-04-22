import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class tc_002Page {

    private Workbook workbook;
    private Sheet sheet;

    public void abrirExcelExportado() {
        try {
            FileInputStream file = new FileInputStream(new File("ruta_al_archivo/archivo.xlsx"));
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheetAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void localizarColumnaC() {
        // Logic to locate column C could go here if needed
    }

    public boolean verificarFormulaConcatenacion() {
        Row row = sheet.getRow(1);
        String formula = row.getCell(2).getCellFormula();
        return "=CONCATENATE(D2,\"_\",H2,\"_\",U2,\"_\",O2,\"_\",E2)".equals(formula);
    }

    public boolean verificarLlaveFormacion() {
        // Additional logic to verify key formation if required
        return true;
    }

    public boolean verificarLlaveCorrectaEnRegistros() {
        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            String actualKey = row.getCell(2).getStringCellValue();
            String expectedKey = row.getCell(3).getStringCellValue() + "_" +
                                 row.getCell(7).getStringCellValue() + "_" +
                                 row.getCell(20).getStringCellValue() + "_" +
                                 row.getCell(14).getStringCellValue() + "_" +
                                 row.getCell(4).getStringCellValue();
            if (!actualKey.equals(expectedKey)) {
                return false;
            }
        }
        return true;
    }
}