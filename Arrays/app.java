// public class app {


// public static void PrintArray(int arr[]){
// arr[0] = 23;

// System.out.print("[ ");
// for(int i : arr){

// System.out.print(   i + " ");

// }
// System.out.print(" ] ");
// System.out.println();
// }

// public static void PlusOne(int num){
//     num += 1;
//     System.out.println(num);
// }


//     public static void main(String[] args) {
       
// //*   Decelaring array 
// //    ? Valid
// // ! Invalid tarika hai ye 
// //   * Accessing array element and updating array element
// // ? array as parameter 
// //  ? sending array as argument in the function / methods 
// //  * array as argument in function , now array is passed as  reference not as value , that is  it is called by reference 
// // Loops on array

// // int arr[] = {2,3,4,5} ;
// // int[] arr = {2,3,4,5,677,78};
// // int arr []  = new int[20];
// // int [] arr   = new int[20];
// int arr    []= new int[20];



// // System.out.print("[ ");
// // for(int i : arr){

// // System.out.print(   i + " ");

// // }
// // System.out.print(" ] ");
// // System.out.println();


// // ! Invalid tarika hai ye 
// //  int arr[];
// //  int arr[20]; = new int[]
// // int arr[] = /int{2,3,4,5};
// // int arr[] = new  int{2,3,4,5};


// // System.out.print(arr);


// // arr[0]= 23;
// // arr[10] = 99;
// // System.out.print(arr[0]);
// // System.out.print("[ ");
// // for(int i : arr){

// // System.out.print(   i + " ");

// // }
// // System.out.print(" ] ");
// // System.out.println();





// // ? array as parameter 


// //   * Accessing array element and updating array element

// //  ? sending array as argument in the function / methods 

// int arr234[] = {2,3,4,5};

// // PrintArray(arr234);

// // System.out.println(" this is printin in main  ");
// // System.out.print("[ ");
// // for(int i : arr234){

// // System.out.print(   i + " ");

// // }
// // System.out.print(" ] ");
// // System.out.println();
// // PrintArray(new int[20]);

// // ! invalid 
// // PrintArray(new []int{2,3,43});
// // PrintArray(int[20]);
// // PrintArray(int[20] {2,3,4});
// // PrintArray(new int[4]{2,3,4,5});

// // ! array is always called by  reference 

// // int num = 20 ;
// // PlusOne(num);
// // System.out.print( "this is printing in main " +num);


// //  * array as argument in function , now array is passed as  reference not as value , that is  it is called by reference 
// // ! invlaid


// // Loops on array 
// int arr12 [] = {2,3,4,5};


// // for(int i = 0 ;  i < arr12.length ; i++){

// //     System.out.print(arr12[i]);
// // }

// // for(int i : arr12){ // i in arrayname 
// //     System.out.print(i);

// // }


//     }
// }


// !   +++ 2D arrays && 3D arrays 
public class  app{
    public static void main(String[] args){

        
  int [] arr = {2,3,4,5} ; 



//   int [] [] arr2d = {2,3,4},{ 4,5,6};


// arr2d[0][0] = 10;

//   System.out.println(arr2d[0]);

// int [] [] arr2d = {
//     {2,3,4},
//     { 10,5,16}
//     };

    // int [] [] arrwithsize = new int[3][3];
    // System.out.print(arrwithsize);


// System.out.print("[ ");

// for(int[] arr23 : arr2d){
// for(int j : arr23 ){
// System.out.print(   j + " ");
// }
// System.out.println(   );
// }
// System.out.print(" ] ");
// System.out.println();


// for(int i = 0 ; i < arr2d.length ; i++){
//     for(int j = 0 ; j < arr2d[i].length ; j++){

// System.out.print(arr2d[i][j]  + " ");
//     }
// System.out.println();
    
// }

int [][][] arr3d = {
    {
        {10,20,30},
        {20,20,30}
    },
    {
        {10,20,30},
        {20,20,30}
    },
};

// arr3d[0][0][1] = 40;
// System.out.print(arr3d[0][0][1]);


// System.out.print("[ ");

// for(int[][] arr23 : arr3d){

// for(int  j[] : arr23 ){

// for(int k : j ){

// System.out.print(k  + " ");
// }
// System.out.println(   );
// }
// System.out.println(   );
// }
// System.out.print(" ] ");
// System.out.println();

//  ! T o(n2)

// byte [][][] arr4d = new byte[2][3][4];

// int arrsid []= {2,3,4,5};
// int max = Integer.MAX_VALUE;
// for (int i : arrsid){
// sum+= i ;
// }
// System.out.println(Integer.MIN_VALUE);
 


// 3 reverse Arrays

int arrsid[] = { 2,3,4,5,8475,};

int revArray[]= new int[arrsid.length];
for(int i = 0 ; i < arrsid.length  ; i++){

    revArray[arrsid.length - 1 - i] = arrsid[i];

}

// // for(int i :revArray){
// //     System.out.print(i + " ");
// // }
//  int target = 4 ;
//  int count= 0 ;

// for(int i = 0 ; i < arrsid.length; i++){
// if(arrsid[i] == target){

//     count++ ;
// }
//     }
// System.out.println(" count of " + target + " is : " + count);


//  1 . elements 
// 2,  if  condition -- > max 
//  3, if condition -- > max= 0 
// 4. loop , if condition -- > max


// int ls []= {2,3,4,5,6,7};
// int max = Integer.MIN_VALUE; 
// int maxPrev = Integer.MIN_VALUE;

// for(int i=0; i<ls.length; i++){

// if(ls[i] > max){
//     maxPrev = max;
//     max = ls[i];
// }

// }

// System.out.println(max);
// System.out.println(maxPrev);

// int ls []= {2,3,4,5,6,7};
// //  sum of elements at even indexes 

// int sum = 0 ;
// for(int i = 0; i < ls.length; i++){

// if( i%2 ==0){
//     sum += ls[i]; 
// }

// }

// System.out.println(sum);

// 7. **Check if Array is Sorted:**  
//    **Input:** `arr = {1, 2, 3, 4, 5}`  
//    **Output:** `true` (indicating the array is sorted)  
//    **Hint:** Compare each element with the next one to check if the array is sorted in ascending order.


// int ls []= {2,3,7,5};

// boolean sorted = true;
// for(int i=0 ; i < ls.length ; i++) {
// if(i != ls.length - 1){
//     if(ls[i] > ls[i+1] ){
//         sorted = false;
//         break;
//     }  
// }
// }
// System.out.println(sorted);

//  int users[][] = {
//     {1,2,3},  
//     {4,5,6},
//     {7,8,9},
//  };

//  int usersTrans[][] = new int[users.length][users[1].length];

//  for( int i=0; i<users.length; i++){

//     for(int j=0; j<users[i].length; j++){
       
//       users[j][i] =  users[i][j];
       


//     }
//  }

//   for( int i=0; i<users.length; i++){

//     for(int j=0; j<users[i].length; j++){
       

//        System.out.print(users[i][j] + " ");
  
       


//     }
//        System.out.println();
//  }



// int users[][] = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9},
// };

// int usersTrans[][] = new int[users[0].length][users.length];

// for (int i = 0; i < users.length; i++) {
//     for (int j = 0; j < users[i].length; j++) {
//         usersTrans[j][i] = users[i][j];
//     }
// }

// for (int i = 0; i < usersTrans.length; i++) {
//     for (int j = 0; j < usersTrans[i].length; j++) {
//         System.out.print(usersTrans[i][j] + " ");
//     }
//     System.out.println();
// }


//  ! not creating temp array 
int users[][] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9},
};

// Assuming the matrix is square
int n = users.length;

for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
    
        int temp = users[i][j];
        users[i][j] = users[j][i];
        users[j][i] = temp;
    }
}

// Print the transposed matrix
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print(users[i][j] + " ");
    }
    System.out.println();
}





    }
}







