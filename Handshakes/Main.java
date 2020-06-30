#include<iostream>

using namespace std;

int main()

{

  int a,ans=0;

  cin>>a;

  a-=1;

  while(a>0){

    ans+=a;

    a--;

  }

  cout<<ans;

}

