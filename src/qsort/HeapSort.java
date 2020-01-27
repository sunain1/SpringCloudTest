package qsort;

public class HeapSort {
    private static void heapSort(int[] arr) {
        int len = arr.length -1;
        for(int i = len/2 - 1; i >=0; i --){ //�ѹ���
            heapAdjust(arr,i,len);
        }
        while (len >=0){
            swap(arr,0,len--);    //���Ѷ�Ԫ����β�ڵ㽻���󣬳��ȼ�1��βԪ�����
            heapAdjust(arr,0,len);    //�ٴζԶѽ��е���
        }
    }
 
public static  void heapAdjust(int[] arr,int i,int len){
    int left,right,j ;
    while((left = 2*i+1) <= len){    //�жϵ�ǰ���ڵ�������ڵ㣨�����޺��ӽڵ㣬leftΪ��ڵ㣩
        right = left + 1;  //�ҽڵ�
        j = left;   //j"ָ��ָ����ڵ�"
        if(j < len && arr[left] < arr[right])    //�ҽڵ������ڵ�
            j ++;     //��ǰ��"ָ��"ָ���ҽڵ�
        if(arr[i] < arr[j])    //�����ڵ��뺢�ӽڵ㽻�����������ifΪ�棬��arr[j]Ϊ�ҽڵ㣬���Ϊ��arr[j]��Ϊ��ڵ㣩
            swap(arr,i,j);
        else         //˵���Ⱥ��ӽڵ㶼��ֱ������ѭ�����
            break;
        i = j;
    }
}
    public static  void swap(int[] arr,int i,int len){
             int temp = arr[i];
              arr[i] = arr[len];
             arr[len] = temp;
    }
    public static void main(String[] args) {
        int array[] = {20,50,20,40,70,10,80,30,60};
        System.out.println("����֮ǰ��");
        for(int element : array){
            System.out.print(element+" ");
        }
        heapSort(array);
        System.out.println("\n����֮��");
        for(int element : array){
            System.out.print(element+" ");
        }
    }
}