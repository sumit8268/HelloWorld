import java.util.Scanner;

class SelectionSort{

  public static void display(int[] arr,int n){
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void swap(int[] a,int i,int min){
    int temp=a[i];
    a[i]=a[min];
    a[min]=temp;
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int k=n;
    for(int i=0;i<n;i++,k--){
      a[i]=k;
  }

  for(int i=0;i<n-1;i++){
    int min=i;
    for(int j=i+1;j<n;j++){
      if(a[min]>a[j]) min=j;
    }
    swap(a,i,min);
  }

  display(a,n);
  }
}
