public class Continue {

    public static void main(String[] args) {

        int i=1;

        System.out.println();
        while(i<=10){
            if(i==4||i==9){
                i++;
                continue;
            }
            System.out.printf(" %d",i);
            i++;
        }

        System.out.println();
        for(int j=1; j<=10; j++){
            if(j==5) continue;
            System.out.print(" "+j);
        }

    }

}
