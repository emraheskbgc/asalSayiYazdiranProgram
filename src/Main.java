public class Main {
    public static void main(String[] args) {

        
        for (int i=2; i<=100; i++){
            boolean isCase= false;
            for (int j=2; j < i; j++){
                if (i % j == 0){
                    isCase =true;
                    break;
                }
            }
            if (isCase==false){
                System.out.println(i);


            }
        }


    }
}
