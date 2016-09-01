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
logic based on The Boyer-Moore Majority Vote Algorthim
*/

import java.util.*;


class MajorityElement {
    private int index_current_element;  // index to value of current element to compare
    private ArrayList<String> mylist = new ArrayList<String>();
    public int index_majority_element;  // index to majortiy element



    public MajorityElement () {
        index_current_element = 0;
        index_majority_element = 0;

        // Instruction:  add required elements to test
        // add elements to the array list
        mylist.add("A");
        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        //mylist.add("A");


    }

    public int find_candidate () {
        int count = 0;  // counter for voting

        for ( int i = 0; i < mylist.size() ; i++) {
            if ( mylist.get(index_majority_element) == mylist.get(i))
                count++;
            else
                count--;
            if (count == 0) {
                index_majority_element = i;
                count = 1;
            }   // if count

        }  // for i

        return index_majority_element;
    }


    public void check_and_print_majority () {
        int count = 0;

        System.out.println(" Input elements " + mylist);

        for ( int i = 0; i < mylist.size() ; i++) {
            if (mylist.get(index_majority_element) == mylist.get(i))
                count++;
        }

        if (count > mylist.size()/2)
            System.out.println("Majority Element is " + mylist.get(index_majority_element));
        else
            System.out.println("No majority element found.");
    }
}

public class Main {

    public static void main(String[] args) {

        MajorityElement myelement = new MajorityElement();  // instatiate element
        myelement.find_candidate();   // call the function to find the majority candidate
        myelement.check_and_print_majority();   // call the function to verify and print majority candiate
    }
}
