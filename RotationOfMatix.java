//Time complexity = O(M*N) where m=ar.length; and n=ar[i].length;
//Space Complexity = O(1) , no extra space is used.
public class RotationOfMatix {
    public static void main(String[] args) {
        int ar[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        //Step 1: Rotaing the array.
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i;j<ar[i].length;j++)
            {
                int temp=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }
        //Step 2: Swap between left element with right element.
        for(int i=0;i<ar.length;i++)
        {
            int li=0;
            int ri=ar[0].length-1;
            while (li<ri) {
                int temp=ar[i][li];
                ar[i][li]=ar[i][ri];
                ar[i][ri]=temp;

                li++;
                ri--;
            }
        }
        //Step 3: Print array values.
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }   
}