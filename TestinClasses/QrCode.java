package TestinClasses;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.*;


public class QrCode {

    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\owais\\OneDrive\\Desktop\\QR.jpg");
        String url="www.facebook.com";
        ByteArrayOutputStream out= QRCode.from(url).to(ImageType.JPG).stream();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(out.toByteArray());
        fileOutputStream.close();
        System.out.println("QR Code generated");
    }

}
