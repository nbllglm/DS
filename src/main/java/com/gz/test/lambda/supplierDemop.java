package com.gz.test.lambda;

import java.util.function.Supplier;

public class supplierDemop {

    public static void main(String[] args) {
//        asd(() -> {
//            return "a";
//        });
        int [] ints={1,2,4,5};
        System.out.println(sort(()->{
                        int temp=-999999;
                    for (int i=0;i<ints.length;i++){
                            if(ints[i]>=temp){
                                temp=ints[i];
                            }
                    }
                    return temp;
        }));

    }

//    static void asd(Supplier<String> stringSupplier) {
//        System.out.println(stringSupplier.get());
//    }

    static int sort(Supplier<Integer> supplier) {
            return supplier.get();
    }


}
