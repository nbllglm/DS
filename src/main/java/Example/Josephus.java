package Example;

public class Josephus
{
    //����2.1������Josephus�����⡣
    //����Josephus�������⣬����ָ�������ȡ���ʼλ�á�����
    public Josephus(int number, int start, int distance)
    {
        System.out.print("Josephus("+number+","+start+","+distance+")��");
        SeqList<String> list = new SeqList<String>(number);
        //����˳����ʵ����Ԫ���������ַ��������췽������ָ��˳����������ʡ��ʱȡĬ��ֵ
        for (int i=0; i<number; i++)
            list.insert((char)('A'+i)+"");                 //˳����β���룬O(1)
        System.out.println(list.toString());               //����˳�����������ַ�����O(n)

        int i = start;                                     //������ʼλ��
        while (list.size()>1)                              //����һ��Ԫ��ʱѭ��������O(1)
        {
            i = (i+distance-1) % list.size();              //��ѭ����ʽ��˳�������б���
            System.out.print("ɾ��"+list.remove(i).toString()+"��");  //ɾ��iλ�ö�����O(n)
            System.out.println(list.toString());
        }
        System.out.println("����������"+list.get(0).toString());//get(0)����Ԫ�أ�O(1)
    }

    public static void main(String args[])
    {
        //ͼ2.2
        String values[]={"A","B","C","D","E"};
        SeqList<String> lista = new SeqList<String>(values);

        //����2.1������Josephus�����⡣
        new Josephus(5,0,2);
    }

    //2.3 ���Ա�����ʽ�洢��ʵ��
    //����Josephus�������⣬����ָ�������ȡ���ʼλ�á�����
/*    public Josephus(int number, int start, int distance)
    {
        System.out.print("Josephus("+number+","+start+","+distance+")��");
        SinglyList<String> list = new SinglyList<String>();//�����յ�����
        for (int i=number-1; i>=0; i--)
            list.insert(0, (char)('A'+i)+"");              //������ͷ���룬O(1)
        System.out.println(list.toString());               //����˳�����������ַ�����O(n)

        //���´�����Ч��
        int i = start;                                     //������ʼλ��
        while (list.count()>1)                             //����һ��Ԫ��ʱѭ��������O(1)
        {
            i = (i+distance-1) % list.count();             //��ѭ����ʽ��˳�������б���
            System.out.print("ɾ��"+list.remove(i).toString()+"��");  //ɾ��iλ�ö�����O(n)
            System.out.println(list.toString());
        }
        System.out.println("����������"+list.get(0).toString());//get(0)����Ԫ�أ�O(1)
    }*/
}

/*
�������н������£�
Josephus(5,0,2)��(A, B, C, D, E)
ɾ��B��(A, C, D, E)
ɾ��D��(A, C, E)
ɾ��A��(C, E)
ɾ��E��(C)
����������C

Josephus(5,0,2)��SeqList(A, B, C, D, E)
ɾ��B��SeqList(A, C, D, E)
ɾ��D��SeqList(A, C, E)
ɾ��A��SeqList(C, E)
ɾ��E��SeqList(C)
����������C

Josephus(5,0,2)��SinglyList(A,B,C,D,E)
ɾ��B��SinglyList(A,C,D,E)
ɾ��D��SinglyList(A,C,E)
ɾ��A��SinglyList(C,E)
ɾ��E��SinglyList(C)
����������C

*/
//@author��Yeheya��2014-9-7