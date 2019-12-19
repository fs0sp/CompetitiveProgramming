/*This is a function problem.You only need to complete the function given below*/
//User function Template for C++
/*Function to swap array elements
* arr : array input
* sizeof_array : number of elements in array
*/
void swapElements(int arr[], int sizeof_array){

// Your code here
	int temp;
	for(int ind = 0;ind < sizeof_array;ind++){
		if((ind+2) == sizeof_array) break;
		temp = arr[ind];
		arr[ind] = arr[ind+2];
		arr[ind+2] = temp;
	}

}