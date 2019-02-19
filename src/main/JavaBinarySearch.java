package main;

public class JavaBinarySearch {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
       // for (int i = 0; i < array.length; i++) {
         //   array[i] = (int) (Math.random() * 10);
        //}
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        for (int i : array) {
            System.out.println(i);
        }

        //int temp=0;
        //for (int i = 0; i < array.length-1; i++) {
          //  for (int i1 = 1; i1 < array.length-i-1; i1++) {
            //    if(array[i]<array[i1])
              //      temp=array[i];
                //array[i]=array[i1];
                //array[i1]=temp;
            //}}
            int value=4;
            int pos=binarySearch(array,value);
            if(pos==-1)
            {
                System.out.println(value+" not found in array");
            }
            else{
                System.out.println(value+" fount at index "+pos);
            }

    }
    public static int binarySearch(int[] array,int value)
    {
        int beg=0;
        int end=array.length-1;
        int mid=(beg+end)/2;
        int pos=-1;
         while(beg<=end)
         {mid=(beg+end)/2;
             if(array[mid]==value)
             {
                 pos=mid;
                 break;
             }
             else if(array[mid]>value)
             {
                 end=mid-1;
             }
             else
                 beg=mid+1;
         }
         return pos;
    }
}
