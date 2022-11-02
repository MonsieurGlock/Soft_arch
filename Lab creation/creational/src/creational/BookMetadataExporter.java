package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {
//ทำหน้าที่คล้าย creator
//ต้องสร้าง factory เป็น class เพิ่ม
    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.
        BookMetadataFormatter res = make();
        for (Book book : books) {
            res.append(book);
        }
        stream.println(res.getMetadataString());

    }
    public abstract BookMetadataFormatter make();
}
