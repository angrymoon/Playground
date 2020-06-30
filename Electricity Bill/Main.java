

#include<iostream>

using namespace std;

int main()

{

  int n,ans;

  cin>>n;

  if(n<=200)

    ans=n*0.5;

  else if(n<=400)

    ans=(n*0.65)+100;

  else if(n<=600)

    ans=(n*0.8)+200;

  else

    ans=(n*1.25)+425;

  

  cout<<"Rs."<<ans;

}