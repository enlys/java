package helllo;
import java.util.*;
public class shuzu {
	public static void main(String args[]){
        System.out.println("���ü�������5������");
        int [] array =new int[10];
        Scanner sc=new Scanner(System.in);

        //ͨ������������������
        for(int i=0;i<array.length-5;i++){
            array[i]=sc.nextInt();
        }
        //��������
        System.out.print("ԭ����Ϊ:");
        for(int a:array){
            System.out.print("  "+a);
        }
        //ɾ����ָ��λ�õ�����
        System.out.println("\n������Ҫɾ����λ�ã� ��Χ��0---"+(array.length-1));
        int index=sc.nextInt();
        delete(index,array);//����delete����
        //ɾ��֮��ı���
        System.out.println("ɾ��֮��ı�����");
        for(int i=0;i<array.length;i++){
            System.out.print("  "+array[i]);
        }
    }
     //����������ǣ�һ����ʼ�����򳤶�ȷ��������Ҫɾ��������Ԫ�أ����ҳ���Ҳ����ɾ�����ı䣬��Ҫ���½�������
     /**
*ɾ����ʽ1
*/
    public static int[] delete(int index, int array[]) {
        //�����ɾ����ʵ���Ǹ���ǰһλ
        int[] arrNew = new int[array.length - 1];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.arraycopy(array, 0, arrNew, 0, arrNew.length);
        return arrNew;
    }
/**
*ɾ����ʽ2
*/
    public int[] delete2(int index, int array[]) {
        //�����ɾ����ʵ���Ǹ���ǰһλ
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
