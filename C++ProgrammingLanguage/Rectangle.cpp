/*
 * Author: Adrián Navarro Gabino
 * 
 * Description:
 * The program draws a rectangle with an input base and height.
*/

#include <iostream>

using namespace std;

int main()
{
    int rectangleBase, rectangleHeight;
    
    cout << "Enter the base:" << endl;
    cin >> rectangleBase;
    cout << "Enter the height" << endl;
    cin >> rectangleHeight;
    
    for(int row = 0; row < rectangleHeight; row++)
    {
        for(int column = 1; column <= rectangleBase; column++)
        {
            cout << "*";
        }
        cout << endl;
    }
}
