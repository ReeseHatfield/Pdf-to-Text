
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.*;

public class Driver {
    public static void main(String[] args) {

        new GUI();

        PDDocument pd;
        BufferedWriter wr;



        try{
            File input = new File("src/main/resources/inputPDF/Reeses_Thingy.pdf");
            File output = new File("src/main/resources/outputTxt/memoirOutput.txt");

            pd = PDDocument.load(input);
            PDFTextStripper stripper = new PDFTextStripper();
            wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
            stripper.writeText(pd, wr);
            if(pd != null){
                pd.close();
            }

            wr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
