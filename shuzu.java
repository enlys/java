package helllo;
import java.util.*;
public class shuzu {
	public static void main(String args[]){
        System.out.println("请用键盘输入5个数：");
        int [] array =new int[10];
        Scanner sc=new Scanner(System.in);

        //通过键盘向数组输入数
        for(int i=0;i<array.length-5;i++){
            array[i]=sc.nextInt();
        }
        //遍历数组
        System.out.print("原数组为:");
        for(int a:array){
            System.out.print("  "+a);
        }
        //删除在指定位置的数字
        System.out.println("\n输入你要删除的位置： 范围在0---"+(array.length-1));
        int index=sc.nextInt();
        delete(index,array);//调用delete方法
        //删除之后的遍历
        System.out.println("删除之后的遍历：");
        for(int i=0;i<array.length;i++){
            System.out.print("  "+array[i]);
        }
    }
     //数组的特性是，一旦初始化，则长度确定，所以要删除数组中元素，并且长度也随着删除而改变，则要重新建立数组
     /**
*删除方式1
*/
    public static int[] delete(int index, int array[]) {
        //数组的删除其实就是覆盖前一位
        int[] arrNew = new int[array.length - 1];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.arraycopy(array, 0, arrNew, 0, arrNew.length);
        return arrNew;
    }
/**
*删除方式2
*/
    public int[] delete2(int index, int array[]) {
        //数组的删除其实就是覆盖前一位
        int[] arrNew = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (i < index) {
                arrNew[i] = array[i];
            } else {
                arrNew[i] = array[i + 1];
            }
        }
        return arrNew;
    }




}
