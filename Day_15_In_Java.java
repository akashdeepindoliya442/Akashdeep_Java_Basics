public class Day_15_In_Java {
    public static void main(String[] args) {
        int [][] Arr={{44,55,23,48},
                      {21,42,68,92}};
                      for(int i=0;i<Arr.length;i++){
                        for(int j=0;j<Arr[i].length;j++){
                            System.out.print(Arr[i][j]);
                            System.out.print(" ");
                        }
                        System.out.println("");
                      }
    }
}