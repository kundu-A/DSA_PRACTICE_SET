import java.util.Scanner;

public class AreaUnderHistogram_Stack {
    public static int areaCheaker(int ar[]){
        int[] previous=new int[ar.length-1];
        int[] next=new int[ar.length-1];
        //Finding any smaller data is present previously.
        int k=0;
        previous[k++]=-1;
        for(int i=1;i<ar.length-1;i++){
            int flag=0;
            for(int j=i-1;j>=0;j--){
                if(ar[j]<ar[i]){
                    previous[k++]=j;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                previous[k++]=-1;
        }
        //Finding ay smaller data is present in next position or not.
        k=0;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    next[k++]=j;
                    break;
                }
            }
        }
        //Finding width by using "next-previous-1"
        //Here "next" array works as to store width of rectangles.
        for(int i=0;i<next.length;i++){
            next[i]=next[i]-previous[i]-1;
        }
        //Finding the area of rectangle
        //Here "previous" array works as to store area of rectangles.
        for(int i=0;i<previous.length;i++){
           previous[i]=next[i]*ar[i]; 
        }
        //Finding the Maximum Area from those rectangle areas.
        int max=previous[0];
        for (int i : previous) {
            if(i>max)
                max=i;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter elements in the array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();

        int maxArea=areaCheaker(ar);
        System.out.println("Maximum area under the histogram= "+maxArea);
        sc.close();
    }
}
