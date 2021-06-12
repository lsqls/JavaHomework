import java.io.*;
public class BitOutputStream extends FilterOutputStream{
    int buffer = 0;
    int cnt = 0;
    final int MAX_BIT_NUM = 8;
    public BitOutputStream(OutputStream out){
        super(out);
    }
    public void writeBit(char bit)throws IOException{
        buffer = buffer|((bit&0x01)<<(MAX_BIT_NUM- 1 - cnt));
        cnt = (cnt+1)%8;
        if (cnt == 0) {
            write(buffer);
            buffer = 0;
        }
    }
    public void  writeBit(String bit)throws IOException{
        for (int i=0;i<bit.length();i++){
            writeBit(bit.charAt(i));
        }
    }
    public void  close() throws IOException{
        super.close();
    }
    public void  flush()throws IOException{
        if (cnt!=0)
            write(buffer);
        super.flush();
    }
    public static void main(String args[])throws IOException{
        try( BitOutputStream bos = new BitOutputStream(new FileOutputStream("testBit.txt")))
        {
            for(int i=0;i<10;i++){
                bos.writeBit('0');
                bos.writeBit('1');
            }
            bos.writeBit("01010101010101011");
        }
    }
}