import java.util.Scanner;

class SortAnalysis{

public static void display(int[] arr,int n){
  for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
  }
  System.out.println();
}

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int k=n;
    for(int i=0;i<n;i++,k--){
      a[i]=k;

  }
  //display(a,n);

  int count=0;//number of swaps
  int j=0;
  for(int i=1;i<n;i++){
    int v=a[i];
    j=i-1;
    while(j>=0 && a[j]>v){
        count++;
        a[j+1]=a[j];
        j--;
    }
    a[j+1]=v;
  }

//display(a,n);
System.out.println("Total number of swaps: "+count);
}
}
