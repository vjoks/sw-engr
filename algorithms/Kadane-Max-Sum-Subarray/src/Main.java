/*
The MIT License (MIT)
Copyright (c) 2016 VO

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO T
HE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

/*
logic based on Kadane's Alogrithm by tracking max sum of prior subarrays

    T = o(n)
    S = O(1)
*/

import java.util.*;

class KadaneMaxSubSequence {

    private ArrayList<Integer> myarraylist = new ArrayList<Integer>();

    public  KadaneMaxSubSequence () {

        // Instruction:  add required interger elements to test
        // add elements to the array list
        myarraylist.add(5);
        myarraylist.add(-2);
        myarraylist.add(1);
        myarraylist.add(3);
        myarraylist.add(-4);
        myarraylist.add(2);

        System.out.println(" Kadane;s array : " + myarraylist);

    }

    public int MaxSubSequence () {
        if (myarraylist.size() == 0  || myarraylist.isEmpty() ) {
            System.out.println(" no valid max sum of subarray found because of empty or null list.");
            return Integer.MIN_VALUE;
        }

        int maxSoFar = myarraylist.get(0);
        int currentMax = myarraylist.get(0);

        for (int i =1; i <myarraylist.size(); i++) {

            // calculcate current max ending here
            if (currentMax <0)
                currentMax = myarraylist.get(i);
            else
                currentMax += myarraylist.get(i);


            //calculate max So far
            if (currentMax > maxSoFar)
                maxSoFar = currentMax;

        }
        System.out.println(" Found Max sum of subarray " + maxSoFar);
        return maxSoFar;
    }

}

public class Main {

    public static void main(String[] args) {

        KadaneMaxSubSequence myarray = new KadaneMaxSubSequence();  // instatiate the Kadane's array object
        myarray.MaxSubSequence();
    }
}
