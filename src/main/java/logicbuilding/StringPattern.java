package main.java.logicbuilding;

//Input --> "abcb"
//Output --> "a , ab , abc, abcb , b , bc , bcb , c , cb , b"
public class StringPattern {
    public static void main(String[] args) {
        patternOptimize();
    }

    static void patternBrute(){
        String s = "abcb";

        for (int i=0 ; i<= s.length()- 1; i++){
            String temp = "";
            for (int j=i ; j<= s.length()- 1; j++){
                temp += s.charAt(j);
                System.out.print(temp);
                System.out.print(",");
            }
        }
    }

    static void patternOptimize(){
        String s = "abcb";

        for (int i=0 ; i<= s.length()- 1; i++){
            String temp = "";
            for (int j=i+1 ; j<= s.length(); j++){
                temp = s.substring(i,j);
                System.out.print(temp+",");
            }
        }
    }
}
