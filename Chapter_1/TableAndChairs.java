public class TableAndChairs {
    public static void main(String[] args) {
         int i, j;

        for (i = 1; i <= 6; i++){
            for (j = 1; j<=22; j++){
                if((i<=2)&&(j==1||j==22))
                {
                  System.out.print("X");
                }
                else if((i==3)&&(j==1||j>=7 && j<=16||j==22))
                {
                  System.out.print("X");
                }
                else if((i==4) && (j<=5||j==7||j==16||j>=18))
                {
                  System.out.print("X");
                }
                else if ((i==5||i==6)&&(j==1||j==5||j==7||j==16||j==18||j==22))
                {
                  System.out.print("X");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}