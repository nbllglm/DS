package Main;


import Mine.Linklist.LinkListTwoWay_gz;
import Mine.sort.BubbleSort;
import Mine.sort.InsertSort;
import Mine.sort.SelectSort;
import Mine.sort.ShellSort;

public class Main {
    public static void main(String[] args) {

//        SequenceList_gz sequenceList_gz=new SequenceList_gz<>(10);
//        sequenceList_gz.add("1");
//        sequenceList_gz.add("4");
//        sequenceList_gz.toString();
//        sequenceList_gz.insert(1,"2");
//        sequenceList_gz.toString();
//        sequenceList_gz.insert(2,"3");
//        sequenceList_gz.toString();
//        sequenceList_gz.remove(1);
//        sequenceList_gz.toString();

//        String[] Strings={"1","2","3","4","5","6","7","8"};
//        String[] Strings={"4","7"};
//        SeqList seqList=new SeqList(Strings);
//        Josephus_gz josephus_gz=new Josephus_gz(seqList,"1",3);
//        josephus_gz.doLogic1();
//        josephus_gz.doLogic2(seqList.search("1"));
//
//        Linklist_gz linklistGz=new Linklist_gz<>();
//        linklistGz.insert("A");
//        System.out.println( linklistGz.toString());
//        linklistGz.insert(1,"B");
//        linklistGz.insert("C");
//        System.out.println( linklistGz.toString());
//        linklistGz.remove(1);
//        System.out.println( linklistGz.toString());
//        System.out.println(linklistGz.indexOf("C"));asd

//        LinkListTwoWay_gz linkListTwoWay_gz = new LinkListTwoWay_gz();
//        linkListTwoWay_gz.add("A");
//        linkListTwoWay_gz.add("C");
//        linkListTwoWay_gz.add("D");
//        linkListTwoWay_gz.insert(1, "B");
//        linkListTwoWay_gz.insert(0, "*");
//        linkListTwoWay_gz.insert(99, "*");
//        linkListTwoWay_gz.remove(2);
//        linkListTwoWay_gz.indexOf("D");
//        System.out.println("测试");

        int[] data = {6, 20, 4, 37, 4, 7, 9, 2, 1, 8};
        //BubbleSort.sort(data);
        //SelectSort.sort(data);
        //InsertSort.sort(data);
        ShellSort.sort(data);
    }
}
