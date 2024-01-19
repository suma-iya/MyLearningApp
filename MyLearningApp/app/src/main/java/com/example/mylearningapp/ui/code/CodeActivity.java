package com.example.mylearningapp.ui.code;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mylearningapp.R;

public class CodeActivity extends AppCompatActivity {

    private static final String[][] codeContent = {
            {
                    // Code content for chapter 1
                    "\n" +
                            "\n" +
                            "// A C++ program to find a peak element \n" +
                            "#include <bits/stdc++.h> \n" +
                            "using namespace std; \n" +
                            "  \n" +
                            "// Find the peak element in the array \n" +
                            "int findPeak(int arr[], int n) \n" +
                            "{ \n" +
                            "    // first or last element is peak element \n" +
                            "    if (n == 1) \n" +
                            "        return 0; \n" +
                            "    if (arr[0] >= arr[1]) \n" +
                            "        return 0; \n" +
                            "    if (arr[n - 1] >= arr[n - 2]) \n" +
                            "        return n - 1; \n" +
                            "  \n" +
                            "    // check for every other element \n" +
                            "    for (int i = 1; i < n - 1; i++) { \n" +
                            "  \n" +
                            "        // check if the neighbors are smaller \n" +
                            "        if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) \n" +
                            "            return i; \n" +
                            "    } \n" +
                            "} \n" +
                            "  \n" +
                            "// Driver Code \n" +
                            "int main() \n" +
                            "{ \n" +
                            "    int arr[] = { 1, 3, 20, 4, 1, 0 }; \n" +
                            "    int n = sizeof(arr) / sizeof(arr[0]); \n" +
                            "    cout << \"Index of a peak point is \" << findPeak(arr, n); \n" +
                            "    return 0; \n" +
                            "} ",
                    "\n" +
                            "\n" +
                            "// Iterative C++ program to reverse an array \n" +
                            "#include <bits/stdc++.h> \n" +
                            "using namespace std; \n" +
                            "  \n" +
                            "/* Function to reverse arr[] from start to end*/\n" +
                            "void rvereseArray(int arr[], int start, int end) \n" +
                            "{ \n" +
                            "    while (start < end) \n" +
                            "    { \n" +
                            "        int temp = arr[start];  \n" +
                            "        arr[start] = arr[end]; \n" +
                            "        arr[end] = temp; \n" +
                            "        start++; \n" +
                            "        end--; \n" +
                            "    }  \n" +
                            "}      \n" +
                            "  \n" +
                            "/* Utility function to print an array */\n" +
                            "void printArray(int arr[], int size) \n" +
                            "{ \n" +
                            "   for (int i = 0; i < size; i++) \n" +
                            "   cout << arr[i] << \" \"; \n" +
                            "  \n" +
                            "   cout << endl; \n" +
                            "}  \n" +
                            "  \n" +
                            "/* Driver function to test above functions */\n" +
                            "int main()  \n" +
                            "{ \n" +
                            "    int arr[] = {1, 2, 3, 4, 5, 6}; \n" +
                            "      \n" +
                            "    int n = sizeof(arr) / sizeof(arr[0]);  \n" +
                            "  \n" +
                            "    // To print original array  \n" +
                            "    printArray(arr, n); \n" +
                            "      \n" +
                            "    // Function calling \n" +
                            "    rvereseArray(arr, 0, n-1); \n" +
                            "      \n" +
                            "    cout << \"Reversed array is\" << endl; \n" +
                            "      \n" +
                            "    // To print the Reversed array \n" +
                            "    printArray(arr, n); \n" +
                            "      \n" +
                            "    return 0; \n" +
                            "} \n",

                    "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            " \n" +
                            "struct Pair {\n" +
                            "    int min;\n" +
                            "    int max;\n" +
                            "};\n" +
                            " \n" +
                            "Pair getMinMax(int arr[], int n)\n" +
                            "{\n" +
                            "    Pair minmax;\n" +
                            " \n" +
                            "    sort(arr, arr + n);\n" +
                            " \n" +
                            "    minmax.min = arr[0];\n" +
                            "    minmax.max = arr[n - 1];\n" +
                            " \n" +
                            "    return minmax;\n" +
                            "}\n" +
                            " \n" +
                            "int main()\n" +
                            "{\n" +
                            "    int arr[] = { 1000, 11, 445, 1, 330, 3000 };\n" +
                            "    int arr_size = sizeof(arr) / sizeof(arr[0]);\n" +
                            " \n" +
                            "    Pair minmax = getMinMax(arr, arr_size);\n" +
                            " \n" +
                            "    cout << \"Minimum element is \" << minmax.min << endl;\n" +
                            "    cout << \"Maximum element is \" << minmax.max << endl;\n" +
                            " \n" +
                            "    return 0;\n" +
                            "}",
                    "#include <stdio.h> \n" +
                            "  \n" +
                            "void swap(int* xp, int* yp) \n" +
                            "{ \n" +
                            "    int temp = *xp; \n" +
                            "    *xp = *yp; \n" +
                            "    *yp = temp; \n" +
                            "} \n" +
                            "  \n" +
                            "// Function to perform Selection Sort \n" +
                            "void selectionSort(int arr[], int n) \n" +
                            "{ \n" +
                            "    int i, j, min_idx; \n" +
                            "  \n" +
                            "    // One by one move boundary of \n" +
                            "    // unsorted subarray \n" +
                            "    for (i = 0; i < n - 1; i++) { \n" +
                            "        // Find the minimum element in \n" +
                            "        // unsorted array \n" +
                            "        min_idx = i; \n" +
                            "        for (j = i + 1; j < n; j++) \n" +
                            "            if (arr[j] < arr[min_idx]) \n" +
                            "                min_idx = j; \n" +
                            "  \n" +
                            "        // Swap the found minimum element \n" +
                            "        // with the first element \n" +
                            "        swap(&arr[min_idx], &arr[i]); \n" +
                            "    } \n" +
                            "} \n" +
                            "  \n" +
                            "// Function to print an array \n" +
                            "void printArray(int arr[], int size) \n" +
                            "{ \n" +
                            "    int i; \n" +
                            "    for (i = 0; i < size; i++) \n" +
                            "        printf(\"%d \", arr[i]); \n" +
                            "    printf(\"\\n\"); \n" +
                            "} \n" +
                            "  \n" +
                            "// Driver code \n" +
                            "int main() \n" +
                            "{ \n" +
                            "    int arr[] = { 0, 23, 14, 12, 9 }; \n" +
                            "    int n = sizeof(arr) / sizeof(arr[0]); \n" +
                            "    printf(\"Original array: \\n\"); \n" +
                            "    printArray(arr, n); \n" +
                            "  \n" +
                            "    selectionSort(arr, n); \n" +
                            "    printf(\"\\nSorted array in Ascending order: \\n\"); \n" +
                            "    printArray(arr, n); \n" +
                            "  \n" +
                            "    return 0; \n" +
                            "}",

                    "\n" +
                            "\n" +
                            "// C++ program to find K'th smallest element\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            " \n" +
                            "// Function to return K'th smallest element in a given array\n" +
                            "int kthSmallest(int arr[], int N, int K)\n" +
                            "{\n" +
                            "    // Sort the given array\n" +
                            "    sort(arr, arr + N);\n" +
                            " \n" +
                            "    // Return k'th element in the sorted array\n" +
                            "    return arr[K - 1];\n" +
                            "}\n" +
                            " \n" +
                            "// Driver's code\n" +
                            "int main()\n" +
                            "{\n" +
                            "    int arr[] = { 12, 3, 5, 7, 19 };\n" +
                            "    int N = sizeof(arr) / sizeof(arr[0]), K = 2;\n" +
                            " \n" +
                            "    // Function call\n" +
                            "    cout << \"K'th smallest element is \"\n" +
                            "         << kthSmallest(arr, N, K);\n" +
                            "    return 0;\n" +
                            "}"

            },

            {
                    // Code content for chapter 2
                    "// C++ code for the above approach:\n" +
                            "#include <iostream>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "void rotate(int arr[], int n)\n" +
                            "{\n" +
                            "\n" +
                            "\t// i and j pointing to first and last\n" +
                            "\t// element respectively\n" +
                            "\tint i = 0, j = n - 1;\n" +
                            "\twhile (i != j) {\n" +
                            "\t\tswap(arr[i], arr[j]);\n" +
                            "\t\ti++;\n" +
                            "\t}\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint arr[] = { 1, 2, 3, 4, 5 }, i;\n" +
                            "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\n" +
                            "\t// Function Call\n" +
                            "\tcout << \"Given array is \\n\";\n" +
                            "\tfor (i = 0; i < n; i++)\n" +
                            "\t\tcout << arr[i] << \" \";\n" +
                            "\n" +
                            "\trotate(arr, n);\n" +
                            "\n" +
                            "\tcout << \"\\nRotated array is\\n\";\n" +
                            "\tfor (i = 0; i < n; i++)\n" +
                            "\t\tcout << arr[i] << \" \";\n" +
                            "\n" +
                            "\treturn 0;\n" +
                            "}\n",
                    "// C++ program to Find the missing element\n" +
                            "\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "void findMissing(int arr[], int N)\n" +
                            "{\n" +
                            "\tint i;\n" +
                            "\tint temp[N + 1];\n" +
                            "\tfor(int i = 0; i <= N; i++){\n" +
                            "\ttemp[i] = 0;\n" +
                            "\t}\n" +
                            "\n" +
                            "\tfor(i = 0; i < N; i++){\n" +
                            "\ttemp[arr[i] - 1] = 1;\n" +
                            "\t}\n" +
                            "\n" +
                            "\n" +
                            "\tint ans;\n" +
                            "\tfor (i = 0; i <= N ; i++) {\n" +
                            "\t\tif (temp[i] == 0)\n" +
                            "\t\t\tans = i + 1;\n" +
                            "\t}\n" +
                            "\tcout << ans;\n" +
                            "}\n" +
                            "\n" +
                            "/* Driver code */\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint arr[] = { 1, 3, 7, 5, 6, 2 };\n" +
                            "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\tfindMissing(arr, n);\n" +
                            "}\n",
                    "// C++ implementation of simple method to find count of\n" +
                            "// pairs with given sum K.\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            " \n" +
                            "// Returns number of pairs in arr[0..n-1] with sum equal\n" +
                            "// to 'K'\n" +
                            "int getPairsCount(int arr[], int n, int K)\n" +
                            "{\n" +
                            "    // Initialize result\n" +
                            "    int count = 0;\n" +
                            " \n" +
                            "    // Consider all possible pairs and check their sums\n" +
                            "    for (int i = 0; i < n; i++)\n" +
                            "        for (int j = i + 1; j < n; j++)\n" +
                            "            if (arr[i] + arr[j] == K)\n" +
                            "                count++;\n" +
                            " \n" +
                            "    return count;\n" +
                            "}\n" +
                            " \n" +
                            "// Driver function to test the above function\n" +
                            "int main()\n" +
                            "{\n" +
                            "    int arr[] = { 1, 5, 7, -1 };\n" +
                            "    int n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "    int K = 6;\n" +
                            "    cout << \"Count of pairs is \"\n" +
                            "         // Function Call\n" +
                            "         << getPairsCount(arr, n, K);\n" +
                            "    return 0;\n" +
                            "}\n" +
                            " "
            },
            {
                    // Code content for chapter 3
                    "// C++ program to print all elements that\n" +
                            "// appear more than once.\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "// function to find repeating elements\n" +
                            "vector<int> duplicates(int arr[], int n)\n" +
                            "{\n" +
                            "\t// To store duplicates numbers.\n" +
                            "\tvector<int> ans;\n" +
                            "\n" +
                            "\t// First check all the values that are\n" +
                            "\t// present in an array then go to that\n" +
                            "\t// values as indexes and increment by\n" +
                            "\t// the size of array\n" +
                            "\tfor (int i = 0; i < n; i++) {\n" +
                            "\t\tint index = arr[i] % n;\n" +
                            "\t\tarr[index] += n;\n" +
                            "\t}\n" +
                            "\n" +
                            "\t// Now check which value exists more\n" +
                            "\t// than once by dividing with the size\n" +
                            "\t// of array\n" +
                            "\tfor (int i = 0; i < n; i++) {\n" +
                            "\t\tif ((arr[i] / n) >= 2)\n" +
                            "\t\tans.push_back(i);\n" +
                            "\t}\n" +
                            "return ans;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint arr[] = { 1, 6, 3, 1, 3, 6, 6 };\n" +
                            "\tint arr_size = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\n" +
                            "\tcout << \"The repeating elements are: \\n\";\n" +
                            "\n" +
                            "\t// Function call\n" +
                            "\tvector<int> ans = duplicates(arr, arr_size);\n" +
                            "\tfor (auto x : ans)\n" +
                            "\t\tcout << x << \" \";\n" +
                            "\n" +
                            "\treturn 0;\n" +
                            "}\n",
                    "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "int partition(int arr[],int low,int high)\n" +
                            "{\n" +
                            "//choose the pivot\n" +
                            "\n" +
                            "int pivot=arr[high];\n" +
                            "//Index of smaller element and Indicate\n" +
                            "//the right position of pivot found so far\n" +
                            "int i=(low-1);\n" +
                            "\n" +
                            "for(int j=low;j<=high;j++)\n" +
                            "{\n" +
                            "\t//If current element is smaller than the pivot\n" +
                            "\tif(arr[j]<pivot)\n" +
                            "\t{\n" +
                            "\t//Increment index of smaller element\n" +
                            "\ti++;\n" +
                            "\tswap(arr[i],arr[j]);\n" +
                            "\t}\n" +
                            "}\n" +
                            "swap(arr[i+1],arr[high]);\n" +
                            "return (i+1);\n" +
                            "}\n" +
                            "\n" +
                            "// The Quicksort function Implement\n" +
                            "\t\t\t\n" +
                            "void quickSort(int arr[],int low,int high)\n" +
                            "{\n" +
                            "// when low is less than high\n" +
                            "if(low<high)\n" +
                            "{\n" +
                            "\t// pi is the partition return index of pivot\n" +
                            "\t\n" +
                            "\tint pi=partition(arr,low,high);\n" +
                            "\t\n" +
                            "\t//Recursion Call\n" +
                            "\t//smaller element than pivot goes left and\n" +
                            "\t//higher element goes right\n" +
                            "\tquickSort(arr,low,pi-1);\n" +
                            "\tquickSort(arr,pi+1,high);\n" +
                            "}\n" +
                            "}\n" +
                            "\t\t\t\n" +
                            "\n" +
                            "int main() {\n" +
                            "int arr[]={10,7,8,9,1,5};\n" +
                            "int n=sizeof(arr)/sizeof(arr[0]);\n" +
                            "// Function call\n" +
                            "quickSort(arr,0,n-1);\n" +
                            "//Print the sorted array\n" +
                            "cout<<\"Sorted Array\\n\";\n" +
                            "for(int i=0;i<n;i++)\n" +
                            "{\n" +
                            "\tcout<<arr[i]<<\" \";\n" +
                            "}\n" +
                            "return 0;\n" +
                            "}\n",
                    "#include <iostream>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "// Function to find the intersection of two arrays\n" +
                            "void FindIntersection(int arr1[], int arr2[], int temp[],\n" +
                            "\t\t\t\t\tint m, int n, int& k)\n" +
                            "{\n" +
                            "\tint i = 0, j = 0;\n" +
                            "\t// vector to store the intersection of the arr1[] and\n" +
                            "\t// arr2[]\n" +
                            "\twhile (i < m && j < n) {\n" +
                            "\t\t// ith element can not be common element\n" +
                            "\t\tif (arr1[i] < arr2[j]) {\n" +
                            "\t\t\ti++;\n" +
                            "\t\t}\n" +
                            "\n" +
                            "\t\t// jth element can not be common element\n" +
                            "\t\telse if (arr2[j] < arr1[i]) {\n" +
                            "\t\t\tj++;\n" +
                            "\t\t}\n" +
                            "\n" +
                            "\t\t// if arr1[i] == arr2[j]\n" +
                            "\t\telse {\n" +
                            "\t\t\ttemp[k] = arr1[i];\n" +
                            "\t\t\ti++;\n" +
                            "\t\t\tj++;\n" +
                            "\t\t\tk++;\n" +
                            "\t\t}\n" +
                            "\t}\n" +
                            "}\n" +
                            "\n" +
                            "int main()\n" +
                            "{\n" +
                            "\n" +
                            "\tint arr1[] = { 1, 5, 10, 20, 40, 80 };\n" +
                            "\tint arr2[] = { 6, 7, 20, 80, 100 };\n" +
                            "\tint arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };\n" +
                            "\tint n1 = sizeof(arr1) / sizeof(arr1[0]);\n" +
                            "\tint n2 = sizeof(arr2) / sizeof(arr2[0]);\n" +
                            "\tint n3 = sizeof(arr3) / sizeof(arr3[0]);\n" +
                            "\n" +
                            "\t// temp array to store the common elements of arr1 and\n" +
                            "\t// arr2 arrays\n" +
                            "\tint temp[200000];\n" +
                            "\n" +
                            "\t// ans array to store the common elements of temp and\n" +
                            "\t// arr3 arrays (i.e common elements of all 3 arrays)\n" +
                            "\tint ans[200000];\n" +
                            "\n" +
                            "\tint k = 0;\n" +
                            "\n" +
                            "\t// function call to find the temp array\n" +
                            "\tFindIntersection(arr1, arr2, temp, n1, n2, k);\n" +
                            "\tint tempSize = k;\n" +
                            "\tk = 0;\n" +
                            "\n" +
                            "\t// function call to find the ans array.\n" +
                            "\tFindIntersection(arr3, temp, ans, n3, tempSize, k);\n" +
                            "\tcout << \"Common elements present in arrays are : \\n\";\n" +
                            "\n" +
                            "\tfor (int i = 0; i < k; i++) {\n" +
                            "\t\tcout << ans[i] << \" \";\n" +
                            "\t}\n" +
                            "\tcout << endl;\n" +
                            "\n" +
                            "\treturn 0;\n" +
                            "}\n" +
                            "\n"
            },
            {
                    // Code content for chapter 4
                    "// Including necessary header files\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "// Function to find the index of first repeating element in\n" +
                            "// an array\n" +
                            "int firstRepeatingElement(int arr[], int n)\n" +
                            "{\n" +
                            "\t// Nested loop to check for repeating elements\n" +
                            "\tfor (int i = 0; i < n; i++) {\n" +
                            "\t\tfor (int j = i + 1; j < n; j++) {\n" +
                            "\t\t\t// If a repeating element is found, return its\n" +
                            "\t\t\t// index\n" +
                            "\t\t\tif (arr[i] == arr[j]) {\n" +
                            "\t\t\t\treturn i;\n" +
                            "\t\t\t}\n" +
                            "\t\t}\n" +
                            "\t}\n" +
                            "\t// If no repeating element is found, return -1\n" +
                            "\treturn -1;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\t// Initializing an array and its size\n" +
                            "\tint arr[] = { 10, 5, 3, 4, 3, 5, 6 };\n" +
                            "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\t// Finding the index of first repeating element\n" +
                            "\tint index = firstRepeatingElement(arr, n);\n" +
                            "\n" +
                            "\t// Checking if any repeating element is found or not\n" +
                            "\tif (index == -1) {\n" +
                            "\t\tcout << \"No repeating element found!\" << endl;\n" +
                            "\t}\n" +
                            "\telse {\n" +
                            "\t\t// Printing the first repeating element and its\n" +
                            "\t\t// index\n" +
                            "\t\tcout << \"First repeating element is \" << arr[index]\n" +
                            "\t\t\t<< endl;\n" +
                            "\t}\n" +
                            "\n" +
                            "\treturn 0;\n" +
                            "}\n",

                    "// Simple CPP program to find first non-\n" +
                            "// repeating element.\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "int firstNonRepeating(int arr[], int n)\n" +
                            "{\n" +
                            "\t// Loop for checking each element\n" +
                            "\tfor (int i = 0; i < n; i++) {\n" +
                            "\t\tint j;\n" +
                            "\t\t// Checking if ith element is present in array\n" +
                            "\t\tfor (j = 0; j < n; j++)\n" +
                            "\t\t\tif (i != j && arr[i] == arr[j])\n" +
                            "\t\t\t\tbreak;\n" +
                            "\t\t// if ith element is not present in array\n" +
                            "\t\t// except at ith index then return element\n" +
                            "\t\tif (j == n)\n" +
                            "\t\t\treturn arr[i];\n" +
                            "\t}\n" +
                            "\treturn -1;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint arr[] = { 9, 4, 9, 6, 7, 4 };\n" +
                            "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\tcout << firstNonRepeating(arr, n);\n" +
                            "\treturn 0;\n" +
                            "}\n",
                    "\n" +
                            "\n" +
                            "// C++ program for above approach\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            " \n" +
                            "/* This function sets the values of\n" +
                            "*x and *y to non-repeating elements\n" +
                            "in an array arr[] of size n*/\n" +
                            "vector<int> get2NonRepeatingNos(int nums[], int n)\n" +
                            "{\n" +
                            " \n" +
                            "    sort(nums, nums + n);\n" +
                            " \n" +
                            "    vector<int> ans;\n" +
                            "    for (int i = 0; i < n - 1; i = i + 2) {\n" +
                            "        if (nums[i] != nums[i + 1]) {\n" +
                            "            ans.push_back(nums[i]);\n" +
                            "            i = i - 1;\n" +
                            "        }\n" +
                            "    }\n" +
                            " \n" +
                            "    if (ans.size() == 1)\n" +
                            "        ans.push_back(nums[n - 1]);\n" +
                            " \n" +
                            "    return ans;\n" +
                            "}\n" +
                            " \n" +
                            "/* Driver code */\n" +
                            "int main()\n" +
                            "{\n" +
                            "    int arr[] = { 2, 3, 7, 9, 11, 2, 3, 11 };\n" +
                            "    int n = sizeof(arr) / sizeof(*arr);\n" +
                            "    vector<int> ans = get2NonRepeatingNos(arr, n);\n" +
                            "    cout << \"The non-repeating elements are \" << ans[0]\n" +
                            "         << \" and \" << ans[1];\n" +
                            "}\n"
            },
            {
                    // Code content for chapter 5
                    "// C++ implementation to count subarrays with equal number of 1's and 0's\n" +
                            "#include <bits/stdc++.h>\n" +
                            "\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "// function to count subarrays with\n" +
                            "// equal number of 1's and 0's\n" +
                            "int countSubarrWithEqualZeroAndOne(int arr[], int n)\n" +
                            "{\n" +
                            "\t// 'um' implemented as hash table to store\n" +
                            "\t// frequency of values obtained through\n" +
                            "\t// cumulative sum\n" +
                            "\tunordered_map<int, int> um;\n" +
                            "\tint curr_sum = 0;\n" +
                            "\n" +
                            "\t// Traverse original array and compute cumulative\n" +
                            "\t// sum and increase count by 1 for this sum\n" +
                            "\t// in 'um'. Adds '-1' when arr[i] == 0\n" +
                            "\tfor (int i = 0; i < n; i++) {\n" +
                            "\t\tcurr_sum += (arr[i] == 0) ? -1 : arr[i];\n" +
                            "\t\tum[curr_sum]++;\n" +
                            "\t}\n" +
                            "\n" +
                            "\tint count = 0;\n" +
                            "\t// traverse the hash table 'um'\n" +
                            "\tfor (auto itr = um.begin(); itr != um.end(); itr++) {\n" +
                            "\n" +
                            "\t\t// If there are more than one prefix subarrays\n" +
                            "\t\t// with a particular sum\n" +
                            "\t\tif (itr->second > 1)\n" +
                            "\t\t\tcount\n" +
                            "\t\t\t\t+= ((itr->second * (itr->second - 1)) / 2);\n" +
                            "\t}\n" +
                            "\n" +
                            "\t// add the subarrays starting from 1st element and\n" +
                            "\t// have equal number of 1's and 0's\n" +
                            "\tif (um.find(0) != um.end())\n" +
                            "\t\tcount += um[0];\n" +
                            "\n" +
                            "\t// required count of subarrays\n" +
                            "\treturn count;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver program to test above\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint arr[] = { 1, 0, 0, 1, 0, 1, 1 };\n" +
                            "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\tcout << \"Count = \"\n" +
                            "\t\t<< countSubarrWithEqualZeroAndOne(arr, n);\n" +
                            "\treturn 0;\n" +
                            "}\n",
                    "/* C++ program to rearrange\n" +
                            "positive and negative integers\n" +
                            "in alternate fashion while keeping\n" +
                            "the order of positive and negative numbers. */\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "// Utility function to right rotate all elements between\n" +
                            "// [outofplace, cur]\n" +
                            "void rightrotate(int arr[], int n, int outofplace, int cur)\n" +
                            "{\n" +
                            "\tchar tmp = arr[cur];\n" +
                            "\tfor (int i = cur; i > outofplace; i--)\n" +
                            "\t\tarr[i] = arr[i - 1];\n" +
                            "\tarr[outofplace] = tmp;\n" +
                            "}\n" +
                            "\n" +
                            "void rearrange(int arr[], int n)\n" +
                            "{\n" +
                            "\tint outofplace = -1;\n" +
                            "\n" +
                            "\tfor (int index = 0; index < n; index++) {\n" +
                            "\t\tif (outofplace >= 0) {\n" +
                            "\t\t\t// find the item which must be moved into the\n" +
                            "\t\t\t// out-of-place entry if out-of-place entry is\n" +
                            "\t\t\t// positive and current entry is negative OR if\n" +
                            "\t\t\t// out-of-place entry is negative and current\n" +
                            "\t\t\t// entry is positive then right rotate\n" +
                            "\t\t\t//\n" +
                            "\t\t\t// [...-3, -4, -5, 6...] --> [...6, -3, -4,\n" +
                            "\t\t\t// -5...]\n" +
                            "\t\t\t//\t ^\t\t\t\t\t\t ^\n" +
                            "\t\t\t//\t |\t\t\t\t\t\t |\n" +
                            "\t\t\t//\t outofplace\t -->\t outofplace\n" +
                            "\t\t\t//\n" +
                            "\t\t\tif (((arr[index] >= 0) && (arr[outofplace] < 0))\n" +
                            "\t\t\t\t|| ((arr[index] < 0)\n" +
                            "\t\t\t\t\t&& (arr[outofplace] >= 0))) {\n" +
                            "\t\t\t\trightrotate(arr, n, outofplace, index);\n" +
                            "\n" +
                            "\t\t\t\t// the new out-of-place entry is now 2 steps\n" +
                            "\t\t\t\t// ahead\n" +
                            "\t\t\t\tif (index - outofplace >= 2)\n" +
                            "\t\t\t\t\toutofplace = outofplace + 2;\n" +
                            "\t\t\t\telse\n" +
                            "\t\t\t\t\toutofplace = -1;\n" +
                            "\t\t\t}\n" +
                            "\t\t}\n" +
                            "\n" +
                            "\t\t// if no entry has been flagged out-of-place\n" +
                            "\t\tif (outofplace == -1) {\n" +
                            "\t\t\t// check if current entry is out-of-place\n" +
                            "\t\t\tif (((arr[index] >= 0) && (!(index & 0x01)))\n" +
                            "\t\t\t\t|| ((arr[index] < 0) && (index & 0x01))) {\n" +
                            "\t\t\t\toutofplace = index;\n" +
                            "\t\t\t}\n" +
                            "\t\t}\n" +
                            "\t}\n" +
                            "}\n" +
                            "\n" +
                            "// A utility function to print an array 'arr[]' of size 'n'\n" +
                            "void printArray(int arr[], int n)\n" +
                            "{\n" +
                            "\tfor (int i = 0; i < n; i++)\n" +
                            "\t\tcout << arr[i] << \" \";\n" +
                            "\tcout << endl;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\n" +
                            "\tint arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };\n" +
                            "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\n" +
                            "\tcout << \"Given array is \\n\";\n" +
                            "\tprintArray(arr, n);\n" +
                            "\t\n" +
                            "// Function Call\n" +
                            "\trearrange(arr, n);\n" +
                            "\n" +
                            "\tcout << \"Rearranged array is \\n\";\n" +
                            "\tprintArray(arr, n);\n" +
                            "\n" +
                            "\treturn 0;\n" +
                            "}\n",
                    "#include <iostream>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "void swap(int &a, int &b) {\n" +
                            "    int temp = a;\n" +
                            "    a = b;\n" +
                            "    b = temp;\n" +
                            "}\n" +
                            "\n" +
                            "void rearrange(int arr[], int n) {\n" +
                            "    int i = -1;\n" +
                            "    for (int j = 0; j < n; j++) {\n" +
                            "        if (arr[j] < 0) {\n" +
                            "            i++;\n" +
                            "            swap(arr[i], arr[j]);\n" +
                            "        }\n" +
                            "    }\n" +
                            "\n" +
                            "    int pos = i + 1, neg = 0;\n" +
                            "    while (pos < n && neg < pos && arr[neg] < 0) {\n" +
                            "        swap(arr[neg], arr[pos]);\n" +
                            "        pos++;\n" +
                            "        neg += 2;\n" +
                            "    }\n" +
                            "}\n" +
                            "\n" +
                            "void printArray(int arr[], int n) {\n" +
                            "    for (int i = 0; i < n; i++) {\n" +
                            "        cout << arr[i] << \" \";\n" +
                            "    }\n" +
                            "}\n" +
                            "\n" +
                            "int main() {\n" +
                            "    int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};\n" +
                            "    int n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\n" +
                            "    rearrange(arr, n);\n" +
                            "    printArray(arr, n);\n" +
                            "\n" +
                            "    return 0;\n" +
                            "}\n"
            },
            {
                    // Code content for chapter 6
                    "\n" +
                            "\n" +
                            "// C++ program to find if\n" +
                            "// there is a zero sum subarray\n" +
                            "#include <iostream>\n" +
                            "using namespace std;\n" +
                            " \n" +
                            "bool subArrayExists(int arr[], int n)\n" +
                            "{\n" +
                            "    for (int i = 0; i < n; i++) {\n" +
                            "       \n" +
                            "        // starting point of the sub arrray and\n" +
                            "        // sum is initialized with first element of subarray\n" +
                            "        // a[i]\n" +
                            "        int sum = arr[i];\n" +
                            "        if (sum == 0)\n" +
                            "            return true;\n" +
                            "        for (int j = i + 1; j < n; j++) {\n" +
                            "           \n" +
                            "            // we are finding the sum till jth index\n" +
                            "            // starting from ith index\n" +
                            "            sum += arr[j];\n" +
                            "            if (sum == 0)\n" +
                            "                return true;\n" +
                            "        }\n" +
                            "    }\n" +
                            "    return false;\n" +
                            "}\n" +
                            " \n" +
                            "// Driver's code\n" +
                            "int main()\n" +
                            "{\n" +
                            "    int arr[] = { -3, 2, 3, 1, 6 };\n" +
                            "    int N = sizeof(arr) / sizeof(arr[0]);\n" +
                            " \n" +
                            "    // Function call\n" +
                            "    if (subArrayExists(arr, N))\n" +
                            "        cout << \"Found a subarray with 0 sum\";\n" +
                            "    else\n" +
                            "        cout << \"No Such Sub Array Exists!\";\n" +
                            "    return 0;\n" +
                            "}\n" +
                            " ",
                    "// C++ program to print largest contiguous array sum\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "int maxSubArraySum(int a[], int size)\n" +
                            "{\n" +
                            "\tint max_so_far = INT_MIN, max_ending_here = 0;\n" +
                            "\n" +
                            "\tfor (int i = 0; i < size; i++) {\n" +
                            "\t\tmax_ending_here = max_ending_here + a[i];\n" +
                            "\t\tif (max_so_far < max_ending_here)\n" +
                            "\t\t\tmax_so_far = max_ending_here;\n" +
                            "\n" +
                            "\t\tif (max_ending_here < 0)\n" +
                            "\t\t\tmax_ending_here = 0;\n" +
                            "\t}\n" +
                            "\treturn max_so_far;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver Code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };\n" +
                            "\tint n = sizeof(a) / sizeof(a[0]);\n" +
                            "\n" +
                            "\t// Function Call\n" +
                            "\tint max_sum = maxSubArraySum(a, n);\n" +
                            "\tcout << \"Maximum contiguous sum is \" << max_sum;\n" +
                            "\treturn 0;\n" +
                            "}\n",
                    "// C++ program to find large\n" +
                            "// factorials using BigInteger\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "#define ull unsigned long long\n" +
                            "\n" +
                            "// Returns Factorial of N\n" +
                            "ull factorial(int N)\n" +
                            "{\n" +
                            "\n" +
                            "\t// Initialize result\n" +
                            "\tull f = 1; // Or BigInt 1\n" +
                            "\n" +
                            "\t// Multiply f with 2, 3, ...N\n" +
                            "\tfor (ull i = 2; i <= N; i++)\n" +
                            "\t\tf *= i;\n" +
                            "\n" +
                            "\treturn f;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver method\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint N = 20;\n" +
                            "\tcout << factorial(N) << endl;\n" +
                            "}\n" +
                            "\n" +
                            "// This code is contributed by phasing17\n"
            },
            {
                    // Code content for chapter 7
                    "// C++ program to find Maximum Product Subarray\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "/* Returns the product of max product subarray.*/\n" +
                            "int maxSubarrayProduct(int arr[], int n)\n" +
                            "{\n" +
                            "\t// Initializing result\n" +
                            "\tint result = arr[0];\n" +
                            "\n" +
                            "\tfor (int i = 0; i < n; i++) {\n" +
                            "\t\tint mul = arr[i];\n" +
                            "\t\t// traversing in current subarray\n" +
                            "\t\tfor (int j = i + 1; j < n; j++) {\n" +
                            "\t\t\t// updating result every time\n" +
                            "\t\t\t// to keep an eye over the maximum product\n" +
                            "\t\t\tresult = max(result, mul);\n" +
                            "\t\t\tmul *= arr[j];\n" +
                            "\t\t}\n" +
                            "\t\t// updating the result for (n-1)th index.\n" +
                            "\t\tresult = max(result, mul);\n" +
                            "\t}\n" +
                            "\treturn result;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint arr[] = { 1, -2, -3, 0, 7, -8, -2 };\n" +
                            "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\tcout << \"Maximum Sub array product is \"\n" +
                            "\t\t<< maxSubarrayProduct(arr, n);\n" +
                            "\treturn 0;\n" +
                            "}\n" +
                            "\n" +
                            "// This code is contributed by Aditya Kumar (adityakumar129)\n",
                    "// C++ implementation of the above approach\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "#define ll long long\n" +
                            "\n" +
                            "// Function to calculate gcd(a, b)\n" +
                            "int gcd(int a, int b)\n" +
                            "{\n" +
                            "\tif (b == 0)\n" +
                            "\t\treturn a;\n" +
                            "\treturn gcd(b, a % b);\n" +
                            "}\n" +
                            "\n" +
                            "// Function to return max length of subarray\n" +
                            "// that satisfies the condition\n" +
                            "int maxLengthSubArray(const int* arr, int n)\n" +
                            "{\n" +
                            "\tint maxLen = -1;\n" +
                            "\tfor (int i = 0; i < n - 1; i++) {\n" +
                            "\t\tfor (int j = i + 1; j < n; j++) {\n" +
                            "\t\t\tll lcm = 1LL * arr[i];\n" +
                            "\t\t\tll product = 1LL * arr[i];\n" +
                            "\n" +
                            "\t\t\t// Update LCM and product of the\n" +
                            "\t\t\t// sub-array\n" +
                            "\t\t\tfor (int k = i + 1; k <= j; k++) {\n" +
                            "\t\t\t\tlcm = (((arr[k] * lcm)) / \n" +
                            "\t\t\t\t\t\t(gcd(arr[k], lcm)));\n" +
                            "\t\t\t\tproduct = product * arr[k];\n" +
                            "\t\t\t}\n" +
                            "\n" +
                            "\t\t\t// If the current sub-array satisfies \n" +
                            "\t\t\t// the condition\n" +
                            "\t\t\tif (lcm == product) {\n" +
                            "\n" +
                            "\t\t\t\t// Choose the maximum\n" +
                            "\t\t\t\tmaxLen = max(maxLen, j - i + 1);\n" +
                            "\t\t\t}\n" +
                            "\t\t}\n" +
                            "\t}\n" +
                            "\n" +
                            "\treturn maxLen;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint arr[] = { 6, 10, 21 };\n" +
                            "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\tcout << maxLengthSubArray(arr, n);\n" +
                            "\treturn 0;\n" +
                            "}\n",
                    "// C++ program to implement the approach\n" +
                            "\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "// GCD function\n" +
                            "int gcd(int x, int y)\n" +
                            "{\n" +
                            "\tif (x == 0)\n" +
                            "\t\treturn y;\n" +
                            "\treturn gcd(y % x, x);\n" +
                            "}\n" +
                            "\n" +
                            "// Function to find sum\n" +
                            "int findsum(int N)\n" +
                            "{\n" +
                            "\tint i, hcf, sum = 0, lcm;\n" +
                            "\n" +
                            "\tfor (i = 1; i <= N; i++) {\n" +
                            "\n" +
                            "\t\t// Returning the gcd of two numbers\n" +
                            "\t\thcf = gcd(i, N);\n" +
                            "\n" +
                            "\t\t// Calculating lcm using lcm*hcf=\n" +
                            "\t\t// value1*value2.\n" +
                            "\t\tlcm = (i * N) / hcf;\n" +
                            "\t\tsum += pow(i, N - i) * lcm;\n" +
                            "\t}\n" +
                            "\treturn sum;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver function\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint N = 5;\n" +
                            "\n" +
                            "\t// Function call\n" +
                            "\tcout << findsum(N) << endl;\n" +
                            "\treturn 0;\n" +
                            "}\n"
            },
            {
                    // Code content for chapter 8
                    "// C++ program to find longest\n" +
                            "// contiguous subsequence\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "// Returns length of the longest\n" +
                            "// contiguous subsequence\n" +
                            "int findLongestConseqSubseq(int arr[], int n)\n" +
                            "{\n" +
                            "\tint ans = 0, count = 0;\n" +
                            "\n" +
                            "\t// sort the array\n" +
                            "\tsort(arr, arr + n);\n" +
                            "\n" +
                            "\tvector<int> v;\n" +
                            "\tv.push_back(arr[0]);\n" +
                            "\n" +
                            "\t// insert repeated elements only once in the vector\n" +
                            "\tfor (int i = 1; i < n; i++) {\n" +
                            "\t\tif (arr[i] != arr[i - 1])\n" +
                            "\t\t\tv.push_back(arr[i]);\n" +
                            "\t}\n" +
                            "\t// find the maximum length\n" +
                            "\t// by traversing the array\n" +
                            "\tfor (int i = 0; i < v.size(); i++) {\n" +
                            "\n" +
                            "\t\t// Check if the current element is equal\n" +
                            "\t\t// to previous element +1\n" +
                            "\t\tif (i > 0 && v[i] == v[i - 1] + 1)\n" +
                            "\t\t\tcount++;\n" +
                            "\t\t// reset the count\n" +
                            "\t\telse\n" +
                            "\t\t\tcount = 1;\n" +
                            "\n" +
                            "\t\t// update the maximum\n" +
                            "\t\tans = max(ans, count);\n" +
                            "\t}\n" +
                            "\treturn ans;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint arr[] = { 1, 2, 2, 3 };\n" +
                            "\tint n = sizeof arr / sizeof arr[0];\n" +
                            "\tcout << \"Length of the Longest contiguous subsequence \"\n" +
                            "\t\t\t\"is \"\n" +
                            "\t\t<< findLongestConseqSubseq(arr, n);\n" +
                            "\treturn 0;\n" +
                            "}\n",
                    "// C++ code to implement the approach\n" +
                            "\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "// Function to find the minimum value\n" +
                            "int findMin(int arr[], int n)\n" +
                            "{\n" +
                            "\tint min_ele = arr[0];\n" +
                            "\n" +
                            "\t// Traversing over array to\n" +
                            "\t// find minimum element\n" +
                            "\tfor (int i = 0; i < n; i++) {\n" +
                            "\t\tif (arr[i] < min_ele) {\n" +
                            "\t\t\tmin_ele = arr[i];\n" +
                            "\t\t}\n" +
                            "\t}\n" +
                            "\n" +
                            "\treturn min_ele;\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\tint arr[] = { 5, 6, 1, 2, 3, 4 };\n" +
                            "\tint N = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\n" +
                            "\t// Function call\n" +
                            "\tcout << findMin(arr, N) << endl;\n" +
                            "\treturn 0;\n" +
                            "}\n",
                    "// CPP program to check whether\n" +
                            "// the array is circularly sorted\n" +
                            "\n" +
                            "#include <bits/stdc++.h>\n" +
                            "using namespace std;\n" +
                            "\n" +
                            "// Function to check whether\n" +
                            "// array is circularly sorted\n" +
                            "bool checkCircularSorted(int arr[], int n)\n" +
                            "{\n" +
                            "\n" +
                            "\t// cnt variable will store count of\n" +
                            "\t// arr[i-1] > arr[i]\n" +
                            "\tint cnt = 0;\n" +
                            "\n" +
                            "\tfor (int i = 1; i < n; i++) {\n" +
                            "\n" +
                            "\t\t// increase cnt if arr[i-1] > arr[i]\n" +
                            "\t\tif (arr[i - 1] > arr[i]) {\n" +
                            "\t\t\tcnt++;\n" +
                            "\t\t}\n" +
                            "\t}\n" +
                            "\n" +
                            "\t// if cnt > 1 then false\n" +
                            "\t// else true\n" +
                            "\tif (cnt == 1) {\n" +
                            "\t\t// check first and last element.\n" +
                            "\t\treturn arr[0] > arr[n-1];\n" +
                            "\t}\n" +
                            "\telse {\n" +
                            "\t\treturn false;\n" +
                            "\t}\n" +
                            "}\n" +
                            "\n" +
                            "// Driver code\n" +
                            "int main()\n" +
                            "{\n" +
                            "\n" +
                            "\t// Given array\n" +
                            "\tint arr[] = { 23, 34, 45, 12, 17, 19 };\n" +
                            "\n" +
                            "\t// size of array\n" +
                            "\tint N = sizeof(arr) / sizeof(arr[0]);\n" +
                            "\n" +
                            "\t// Calling function to check\n" +
                            "\t// cirularly sorted array\n" +
                            "\tbool result = checkCircularSorted(arr, N);\n" +
                            "\n" +
                            "\t// Print result\n" +
                            "\tif (result) {\n" +
                            "\t\tcout << \"Array is circularly sorted\";\n" +
                            "\t}\n" +
                            "\telse {\n" +
                            "\t\tcout << \"Array is not circularly sorted\";\n" +
                            "\t}\n" +
                            "}\n"
            }
            // Add more chapters with code content here
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_code);

        String codeCategory = getIntent().getStringExtra("codeCategory");
        int itemIndex = getIntent().getIntExtra("itemIndex", 0);

        WebView codeWebView = findViewById(R.id.codeWebView);
        WebSettings webSettings = codeWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        codeWebView.setWebViewClient(new WebViewClient());

        // Load the HTML content with styling applied using WebView settings
        String htmlCode = "<html><body style='background-color: #2E2E2E;'>"
                + "<pre style='color: #CCCCCC; font-family: monospace; font-size: 14px; padding: 8px;'>"
                + codeContent[getIndexForCategory(codeCategory)][itemIndex] // Display the selected code content
                + "</pre></body></html>";

        codeWebView.loadDataWithBaseURL(null, htmlCode, "text/html", "utf-8", null);
    }

    private int getIndexForCategory(String codeCategory) {
        if ("chapter1".equals(codeCategory)) return 0;
        if ("chapter2".equals(codeCategory)) return 1;
        if ("chapter3".equals(codeCategory)) return 2;
        if ("chapter4".equals(codeCategory)) return 3;
        if ("chapter5".equals(codeCategory)) return 4;
        if ("chapter6".equals(codeCategory)) return 5;
        if ("chapter7".equals(codeCategory)) return 6;
        if ("chapter8".equals(codeCategory)) return 7;

        // Add more chapters as needed

        return 0; // Default to the first category
    }

}
