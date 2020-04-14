import java.util.*;
public class BubbleSort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		bubblesort(a,n);
	}
	public static void bubblesort(int a[],int n){
		for(int i=0;i<n;i++){
			int flag=0;
			for(int j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					flag=1;
				}
			}
			if(flag==0)break;
		}
		for (int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}