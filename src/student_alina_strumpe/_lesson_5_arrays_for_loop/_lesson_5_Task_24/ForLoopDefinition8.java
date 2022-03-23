package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_24;

import java.util.Arrays;

public class ForLoopDefinition8 {

    public static void main(String[] args){
        for(int i=0; i< 20;i +=2){
            System.out.print("i"+i+"\n");
        }
        for(int j=20;j>0;j--){
            System.out.print("j"+j);
        }
        for(int k=1; k<=10;k *=2){  // 2 4 8
            System.out.print("k"+k+"\n");
        }
        for(double l=20; l>1 ;l /=2){
            System.out.print("l"+l+"\n");
        }
        for(int n=20; n>1; n /=2){
            System.out.print("n"+n);
        }
    }
}
