package io.mittal.code;

public class SortArrayWith012 {

}
class Solution
{
    public static void sort012(int a[], int n)
    {
        int mid=0;
        int low=0;
        int high=n-1;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else{
                
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
                
            }
