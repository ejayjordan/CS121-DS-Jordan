public class recursionDemo {
    public int calcFactorial(int number) {
        if (number == 0) {
            System.out.println("Go!");
        } else {
            System.out.println(number);
            countDown(number - 1);
        }
    }
    public void countDown(int number){

    }
    public void printBackwards(char letter){
        if(letter == 'a'){
            System.out.println(letter);
        }
        else{
            System.out.println(letter);
            printBackwards(--letter);
        }
    }
}

