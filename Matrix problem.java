import java.io.*;
import java.util.*;



class Main {
	public static void main (String[] args)throws IOException {

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      String ar[] = br.readLine().split(" ");
                      int n = Integer.parseInt(ar[0]);
                      int k = Integer.parseInt(ar[1]);
					  int a[][] = new int[n][n];
					  int sum=0,one_c=0;
                      for(int i=0;i<n;i++)
                      {
                          String arr[] = br.readLine().split(" ");
						  sum=0;
                          for(int j=0;j<n;j++)
                          {
                             int value=Integer.parseInt(arr[j]);
							 if(value==1)
							 one_c++;
							 sum=sum+value;
							 a[i][j]=sum;
                          }
                      }
					  for(int j=0;j<n;j++)
					  {
						  sum=0;
                          for(int i=0;i<n;i++)
						  {
                            sum=sum+a[i][j];
							a[i][j]=sum;
						  }
					  }

					if(k>=one_c)
					  {

						  System.out.println(n);

					  }
					else {
						int ans = 1;
						for(int len=1;len<=n;len++)
						{
							boolean flag= false;
						for(int i=len;i<n;i++)
						{
							for(int j=len;j<n;j++)
							{
								if(j-i==0)
								{
                                  if(a[i][j]<=k)
								  {
									  ans = Math.max(ans,ans+1);
									  flag=true;
									  break;
								  }

								}
								else if(j>i)
								{
									if(i==ans)
									{
										if(a[i][j]-a[i][j-ans-1]<=k)
										{
											ans=Math.max(ans,ans+1);
											flag = true;
											break;
										}
									}
									else {
										if(a[i][j]-a[i][j-ans-1]-a[i-ans-1][j]+a[i-ans-1][j-ans-1] <=k)
                                         {
											 ans = Math.max(ans,ans+1);
											 flag=true;
											 break;
										 }
									}
								}
								 if(i>ans) {

									if(j==ans)
									{
										if(a[i][j]-a[i-ans-1][j]<=k)
										{
											ans=Math.max(ans,ans+1);
											flag = true;
											break;
										}
									}
									else {
										if(a[i][j]-a[i-ans-1][j]-a[i][j-ans-1]+a[i-ans-1][j-ans-1] <=k)
                                         {
											 ans = Math.max(ans,ans+1);
											 flag=true;
											 break;
										 }
									}

								}
							}
							if(flag==true) break;
						}
						if(flag==false) break;
					}
					System.out.println(ans);
				}

	}
}
