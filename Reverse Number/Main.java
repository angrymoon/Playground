#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  
  
  int a;
  cin>>a;
  int rno=0;
  while (a>0)
  {
    int b=a%10;
    a=a/10;
    cout<<b;
  }
	return 0;
}