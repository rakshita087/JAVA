public class Removeduplicate {
        public static int removeDuplicates(int[]arr,int n) {
            if(n==0||n==1)
{
                return n;

            }
            int temp[]=new int[n];
            int j=0;
            for(int i=0;i<n-1;i++){
                if(arr[i]!=arr[i+1]){
                    temp[j++]=arr[i];
                }

            }
       temp[j++]=arr[n-1];
       for( int i=0;i<j;i++){
        arr[i]=temp[i];
       }
       return j;
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,20,56};
        int  length=arr.length;
        int i;
        length=removeDuplicates(arr,length);
        for(i=0;i<length;i++){
            System.out.println(arr[i]+"");
        }
    }
}