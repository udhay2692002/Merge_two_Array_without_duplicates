import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class mergearrays {

    public static void main(String[] args)
    {
        Set<Integer> merge=new HashSet<>();

        int a[]={1,2,3,4,5,6,7};
        int b[]={3,4,5,6,7,8,9,10};

        for (int num:a) {

            merge.add(num);
        }

        for (int num2:b) {

            merge.add(num2);
        }

        int len=merge.size();
        int[] arry=new int[len];
        int index=0;

        for (int ad:merge) {

            arry[index]=ad;
            index++;
        }

        for (int diplay:arry) {
            System.out.println(diplay);
        }


    }
}
