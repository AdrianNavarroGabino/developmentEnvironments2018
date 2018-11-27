/*
 * Author: Adrián Navarro Gabino
 * 
 * Description: Programs that, when you enter a car license plate, shows the
 * next one.
 */  

#include <iostream>

using namespace std;

int main()
{
    int number;
    string letters;
    
    char letter1;
    char letter2;
    char letter3;
    
    do
    {
        cin >> number >> letters;
        
        if(number < 9999)
        {
            number++;
            
            printf("%04d", number);
            cout << " " << letters << endl;
        }
        else if(number == 9999 && letters != "ZZZ")
        {
            number = 0;
            
            letter1 = letters[0];
            letter2 = letters[1];
            letter3 = letters[2];
            
            if(letter3 != 'Z')
            {
                if(letter3 != 'D' && letter3 != 'H' && letter3 != 'N' &&
                    letter3 != 'T')
                {
                    letter3 = (letter3 + 1);
                }
                else
                {
                    letter3 = (letter3 + 2);
                }
            }
            else if(letter2 != 'Z')
            {
                if(letter2 != 'D' && letter2 != 'H' && letter2 != 'N' &&
                    letter2 != 'T')
                {
                    letter2 = (letter2 + 1);
                }
                else
                {
                    letter2 = (letter2 + 2);
                }
                
                letter3 = 'B';
            }
            else if(letter1 != 'Z')
            {
                if(letter1 != 'D' && letter1 != 'H' && letter1 != 'N' &&
                    letter1 != 'T')
                {
                    letter1 = (letter1 + 1);
                }
                else{
                    letter1 = (letter1 + 2);
                }
                
                letter2 = 'B';
                letter3 = 'B';
            }
            
            printf("%04d", number);
            cout << " " << letter1 << letter2 << letter3 << endl;
        }
    } while(number != 9999 || letters != "ZZZ");
}
