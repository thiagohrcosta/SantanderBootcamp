public class Main {

  public static void main(String[] args){

    // Array ===================================
    int[] meuArray = {1,2,3,4,5,6,7};
    meuArray[0] = 10;

    System.out.println(meuArray.length);
    System.out.println(meuArray[0]);

    for(int i = 0; i < 7; i++){
      System.out.println("O valor é: " + meuArray[i]);
    }

    // Array multidimensional ===============================

    int[][] meuArrayMulti = {{1,2,3,4}, {5,6,7,8}};
    for(int i = 0; i < meuArrayMulti.length; i++){
      for(int j = 0; j <meuArrayMulti[i].length; j++){
        System.out.println(meuArrayMulti[i][j]);
      }
    }
  }

}
