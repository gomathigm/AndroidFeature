package com.example.inaki.androidserviceexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondActivity extends AppCompatActivity implements View .OnClickListener{
    private Button btnNavigation;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.navigation);
        btnNavigation = findViewById(R.id.buttonStartActivity);
        btnNavigation.setOnClickListener(this);

        List al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(30);
        al.add(10);
        al.add(2);


        int index = Collections.binarySearch(al, 50,
                Collections.reverseOrder());

        System.out.println("Found at index arraylist" + index);

        int iArr[] = {2, 1, 9, 6, 4};
        Arrays.sort(iArr);
      int index1= Arrays.binarySearch(iArr,9 );

      /*  Collections.sort(al);
        Collections.reverse(al);*/


        System.out.println("Found at array " + index1);

/*
        int sum = 0;
        int i = 2;
        while (i<max) {
            sum+=i;
            if (sum > max) {
                break;
            }
            i+=2;
        }
        System.out.print("Value=" + sum);*/


        /*for(int i=0; i<max; i=i+2){
            sum+=i;
        }*/


        int length = 50;

        for (int i = 1; i<length;i++){

        /*
         * In For loop it given 1 to 50 Number. If we divide any number by 2
         * and reminder is 0 then the number is even, otherwise it is odd.
         */

        if (i % 2 == 0) {
            Log.v("log_tag", "InEvenNumber" + i);
        } else {
            Log.v("log_tag", "OddNumber" +i);
        }
    }


        Set<String> store = new HashSet<>();
        String names[] = {"ab", "cd", "fg", "hi", "jk"};
        for (String name : names) { if (store.add(name) == false) { // your duplicate element
            System.out.println("duplicate Name = " + name);
             } }




        /*sort array */
        Integer iArr1[] = {2, 1, 9, 6, 4};
        /*int iArr[] = {2, 1, 9, 6, 4};
        Arrays.sort(iArr);*/
        Arrays.sort(iArr1, Collections.reverseOrder());
        System.out.println("The sorted int array is:");
        for (int number : iArr1) {
            System.out.println("Number = " + number);
        }


      /*  static int arr[] = {12,3,4,15};

        // method for sum of elements in an array
        static int sum()
        {
            int sum = 0; // initialize sum
            int i;

            // Iterate through all elements and add them to sum
            for (i = 0; i < arr.length; i++)
                sum +=  arr[i];

            return sum;
        }

        // Driver method
        public static void main(String[] args)
        {
            System.out.println("Sum of given array is " + sum());
        }*/
        }



    /**
     *
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        if(v == btnNavigation) {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }


    }
}
