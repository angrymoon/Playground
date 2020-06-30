#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  long a;
  int count=0;
  cin>>a;
  do{
    a=a/10;
    count++;
  }
  while(a>0);
  cout<<count;
}
