package basics;

public class BreakAndContinue {

//    Use case of Break and Continue in Loops

    public static void main(String[] args) {

        int i = 0;
        while (true) {    // this loops work for infinite time
            if(i==3){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i=i+1;
            if(i>5){
                break;
            }
        }
    }
}
