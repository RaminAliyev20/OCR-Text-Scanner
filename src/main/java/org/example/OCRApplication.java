package org.example;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class OCRApplication {

    public static void main(String[] args) {
        // Şəkil faylının yeri
        File imageFile = new File("C:\\Users\\Ramin\\IdeaProjects\\" +
                "OcrExample1\\src\\main\\resources\\TextPhoto2.jpg"); // Şəkilin yolunu düzgün qeyd edin

        // Tesseract instansiyası yaradılır
        ITesseract tesseract = new Tesseract();

        // Tesseract-ın quraşdırıldığı yeri qeyd edin
        tesseract.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata"); // tessdata qovluğunun yeri

        // Dil seçimi (məsələn, İngilis dili üçün "eng")
        tesseract.setLanguage("eng");

        try {
            // Şəkildən mətn oxunur
            String result = tesseract.doOCR(imageFile);
            System.out.println("OCR nəticəsi: ");
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println("OCR zamanı səhv baş verdi: " + e.getMessage());
        }
    }
}
