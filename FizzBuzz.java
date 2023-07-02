public class FizzBuzz{
    public static void main(String[] args){
      //1から順に100まで表示
      //3の倍数はFizz,5の倍数はBuzz,3と5両方の倍数はFizzBuzzと表示
      int loopCount = 100;
      int numFizz = 3;
      int numBuzz = 5;
      String strFizz = "Fizz";
      String strBuzz = "Buzz";

      for (int i = 1; i <= loopCount; i++){
        if (i % (numFizz * numBuzz) == 0){
          System.out.println(strFizz + strBuzz);
        }else if(i % numFizz == 0){
          System.out.println(strFizz);
        }else if(i % numBuzz == 0){
          System.out.println(strBuzz);
        }else{
          System.out.println(i);
        }
      }
    }
}