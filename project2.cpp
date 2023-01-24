#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Class1{
    public:
       vector<int> nums{0, 0, 0, 0 ,0};

       void getNumbers(){
cout << "Enter 5 integers: " << endl;
        for(int i = 0; i < 5; i++){
            cin >> nums[i];
        }
}

void displaySorted(){
        sort(nums.begin(), nums.end());
        cout << "The sorted elements are: ";
         for(int i = 0; i < 5; i++){
                cout << nums[i] << " ";\
         }
            cout << endl;
}

void displaySmallest(){
    auto it = nums.begin();
    cout << "The smallest element: " << *it << endl;
}

void displayLargest(){
    cout << "The largest element: " 
    << *max_element(nums.begin(), nums.end()) << endl;
}

void displayTotal(){
         int sum = 0;
            for(auto i = 0; i < nums.size(); i++){
                sum += nums[i];
            }
            cout << "The total of all elements: " << sum << endl;
    
}

void displayAverage(){
int sum = 0;
               for(auto i = 0; i < nums.size(); i++){
                sum += nums[i];
               }
                    cout << "The average of all elements is: " 
                    << sum / nums.size() << endl;
               
}
};

int main(){
    Class1 user1;
   user1.getNumbers();
   user1.displaySorted();
   user1.displaySmallest();
   user1.displayLargest();
   user1.displayAverage();
    return 0;
}











/*Displays the sorted elements
Displays the smallest element
Displays the largest element
Displays the total of all elements
Displays the average of all the elements
*/
