#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    vector<int> nums = {0, 0, 0, 0, 0};
        cout << "Enter 5 integers: " << endl;
        for(int i = 0; i < 5; i++){
            cin >> nums[i];
        }
        sort(nums.begin(), nums.end());
            cout << "The sorted elements: ";
            for(int i = 0; i < 5; i++){
                cout << nums[i] << " ";
            }
            cout << endl;
                auto it = nums.begin();
                cout << "The smallest element: " << *it << endl;

                cout << "The largest element: " << nums[4] << endl;

                int sum = 0;
               for(auto i = 0; i < nums.size(); i++){
                sum += nums[i];
                
               }
               cout << "The total of all elements: " << sum << endl;

               
                cout << "The average of all elements is: " << sum / nums.size() << endl;

    return 0;
}


/* Prompt the user for 5 integer values
Stores the elements in a vector
Displays the sorted elements
Displays the smallest element
Displays the largest element
Displays the total of all elements
Displays the average of all the elements
*/