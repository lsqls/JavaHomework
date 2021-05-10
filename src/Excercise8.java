import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Excercise8 {
    static String[] split(String word,String delimiters){
        List<String> ret=new LinkedList<>();

        HashSet<Character> delimiterSet=new HashSet<>();
        if(delimiters.length()>1){
            for(int i=1;i<delimiters.length()-1;i++){
                delimiterSet.add(delimiters.charAt(i));
            }
        }
        else {
            delimiterSet.add(delimiters.charAt(0));
        }

        int curPos=0,preD=-1;

        while (curPos<word.length()){
            char curChar=word.charAt(curPos);
            if(delimiterSet.contains(curChar)){
                ret.add(word.substring(preD+1,curPos));
                ret.add(String.valueOf(curChar));
                preD=curPos;
            }
            curPos++;
        }
        return ret.toArray(new String[ret.size()]);

    }

    public static void main(String[] args) {
        String [] ret=split("a?b?gf#e","[?#]");
        System.out.println(Arrays.toString(ret));
        ret=split("ab#12#453","#");
        System.out.println(Arrays.toString(ret));
    }

}
