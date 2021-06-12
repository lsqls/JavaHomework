import java.io.*;

public class CutFile {
    public static void main(String[] args) {
        cutFile("C:\\Users\\Master\\OneDrive\\桌面\\solution\\java课\\src\\log.txt",4);
    }

    private static void cutFile(String sourceFileName, int numOfPieces)  {
        FileInputStream fis = null;
        File file = null;
        try {

            file = new File(sourceFileName);
            fis = new FileInputStream(file);

            int outFileLen=(int) file.length()/numOfPieces;
            byte[] b = new byte[outFileLen];


            int len = 0;
            int name = 1;
            while ((len = fis.read(b)) != -1) {
                String outFileName=sourceFileName+"."+name;
                FileOutputStream fos = new FileOutputStream( outFileName);
                fos.write(b, 0, len);
                fos.close();
                name++;
            }


        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
