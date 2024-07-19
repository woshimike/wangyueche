package com.example.ft2.util;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.example.ft2.vo.EthLandVo;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ExcelExportUtils {

    public static void exportExcel(List<EthLandVo> list) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        File file = new File("d:\\"+"eth"+sdf.format(new Date())+".xlsx");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(null, "eth"), EthLandVo.class, list);
        try {
            workbook.write(fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileOutputStream.close();
            workbook.close();
        }
    }

}
