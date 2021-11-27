#include <stdio.h>
# include <iostream>
using namespace std;

struct Array
{
    int *A;
    int size;
    int length;
} arr;

void display(struct Array arr){
    int i;
    for(i=0;i<arr.length;i++){
        cout<< endl<<arr.A[i];
    }
}

void append(struct Array *arr, int x){
    
    if(arr->length<arr->size){
        arr->A[arr->length++]=x;
    }
    
}

void insert(struct Array *arr, int p, int x){
    
    int i;
    if(arr->length<arr->size && p>=0 && p<=arr->length){
        for(i=arr->length;i>p;i--){
            arr->A[i]=arr->A[i-1];
        }
        arr->A[p]=x;
        arr->length++;
    }
    
}

int linearSearch(struct Array arr , int value){
    int i;
    for(i=0;i<arr.length;i++){
        if(arr.A[i]==value){
            return i;
        }
    }
    return -1;
}

void Delete(struct Array *arr,int index){
    int i;
    if(arr->length>0){
        for(i=index;i<arr->length;i++){
            arr->A[i]=arr->A[i+1];
        }
        arr->length--;
    }
}

int binarySearch(struct Array arr , int key){
    int l,h,mid; 
    l=0;
    h=arr.length-1;
    while(l<=h){
    mid=(l+h)/2;
    if(key==arr.A[mid]){
        return mid;
    }
    else if(arr.A[mid]>key){
        h=mid-1;
    }
    else{
        l=mid+1;
    }
    }
    return -1;
}

int RBinSearch(struct Array arr, int key,int l,int h){
    int mid;
    if(l<=h){
        mid=(l+h)/2;
        if(arr.A[mid]==key) return mid;
        else if(arr.A[mid]>key) return RBinSearch(arr,key,l,mid-1);
        else return RBinSearch(arr,key,mid+1,h);
    }
    return -1;
}

int main() {
    int i,n;
	std::cout << "Enter size of array" << std::endl;
	std::cin >> arr.size;
	arr.A=new int[arr.size];
	arr.length=0;
	
	cout<<"Enter the no. of numbers";
	cin>>n;
	
	for(i=0;i<n;i++){
	    cin>>arr.A[i];
	}
		arr.length=n;
		insert(&arr,9,99);
		Delete(&arr,0);
// 	append(&arr,10);

	display(arr);
// 	cout<<endl<<linearSearch(arr,1);
	cout<<endl<<binarySearch(arr,9);

	
	return 0;
}