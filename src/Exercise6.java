import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Exercise6{
    public static void main(String[] args) {
        String[] words={"banana","telecommunication","programming","bupt"};
        
        Scanner scanner=new Scanner(System.in);

        int selectIndex=0;
        
        do{
            String word=words[selectIndex++];
            HashMap<Character,List<Integer>> chIndex=new HashMap<>();

            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(chIndex.containsKey(ch)){
                    chIndex.get(ch).add(i);
                }
                else{
                    List<Integer> iList=new ArrayList<>();
                    iList.add(i);
                    chIndex.put(ch, iList);
                }
            }
            
            

            HashSet<Character> correct=new HashSet<>();
            char[] ans=new char[word.length()];
            Arrays.fill(ans, '*');
            int miss=0;
            while(correct.size()<chIndex.size()){
                System.out.print("Enter a letter in word "+String.valueOf(ans));
                String input=scanner.next();
                char inputChar=input.charAt(0);
                if(correct.contains(inputChar)){
                    System.out.println(inputChar+"is already in the word");
                }
                else if(chIndex.containsKey(inputChar)){
                    for(int index:chIndex.get(inputChar)){
                        ans[index]=inputChar;
                    }
                    correct.add(inputChar);
                }
                else{
                    System.out.println(inputChar+"is not in the word");
                    miss++; 
                }
                
            }
            System.out.println("The word is"+word+".You missed"+miss+"time");
            System.out.println("Do you want to guess another word? Enter y or n");

        }
        while(selectIndex<words.length&&scanner.next().equals("y"));
        scanner.close();

        
    }
}