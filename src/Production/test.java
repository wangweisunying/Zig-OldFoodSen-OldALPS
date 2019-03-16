/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Production;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Wei Wang
 */
public class test {

    static class Axis {

        int x;
        int y;

        Axis(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            return this.x == ((Axis) o).x && this.y == ((Axis) o).y;
        }

        @Override
        public int hashCode() {
            return x * 10000 + y;
        }
    }

    public static void main(String[] args) {
       
        String s = "1901280014\n" +
"1902060273\n" +
"1902070009\n" +
"1902070015\n" +
"1902090137\n" +
"1902090140\n" +
"1902090141\n" +
"1902090144\n" +
"1902090145\n" +
"1902090163\n" +
"1902090165\n" +
"1902090166\n" +
"1902090167\n" +
"1902090169\n" +
"1902090173\n" +
"1902090177\n" +
"1902090181\n" +
"1902100001\n" +
"1902110021\n" +
"1902110022\n" +
"1902110024\n" +
"1902110025\n" +
"1902110037\n" +
"1902110038\n" +
"1902110039\n" +
"1902110040\n" +
"1902110042\n" +
"1902120016\n" +
"1902120021\n" +
"1902120035\n" +
"1902120037\n" +
"1902120046\n" +
"1902120047\n" +
"1902120051\n" +
"1902120053\n" +
"1902120055\n" +
"1902120064\n" +
"1902120065\n" +
"1902120066\n" +
"1902120072\n" +
"1902120078\n" +
"1902120080\n" +
"1902120084\n" +
"1902120092\n" +
"1902120096\n" +
"1902120099\n" +
"1902120101\n" +
"1902120103\n" +
"1902120105\n" +
"1902120109\n" +
"1902120116\n" +
"1902120117\n" +
"1902120120\n" +
"1902120137\n" +
"1902120145\n" +
"1902120191\n" +
"1902120195\n" +
"1902120201\n" +
"1902120230\n" +
"1902120245\n" +
"1902120250\n" +
"1902120251";
        String[] arr = s.split("\n");
        for(String str : arr){
            System.out.println(str + ",");
        }
        
        
    }

    public List<Integer> subarraySum(int[] nums) {
        List<Integer> res = new ArrayList();
        if (nums.length == 0) {
            return res;
        }
        if (nums.length == 1 && nums[0] == 0) {
            res.add(0);
            res.add(0);
        }
        boolean found = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (found) {
                break;
            }
            int sum = nums[i];
            if (sum == 0) {
                res.add(i);
                res.add(i);
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == 0) {
                    res.add(i);
                    res.add(j);
                    found = true;
                    break;
                }
            }
        }
        return res;
    }
    
}
