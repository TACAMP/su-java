public class Fizzbuzz{
    public static void main( String [] args ){
        fizzbuzz();
        names();
        }
    
    public static void fizzbuzz(){
        for (int i=1;i <= 100;i++){
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void names(){
        String names[] = {"yamada","oizumi"};
        System.out.println(names[0]);
    }
}