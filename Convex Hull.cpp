#include <bits/stdc++.h>



using namespace std;



// To find orientation of ordered triplet (p, q, r).

// The function returns following values

// 0 --> p, q and r are colinear

// 1 --> Clockwise

// 2 --> Counterclockwise

int orientation(pair<int,int> p, pair<int,int> q, pair<int,int> r)

{

    int val = (q.second - p.second) * (r.first - q.first) -

              (q.first - p.first) * (r.second - q.second);



    if (val == 0) return 0;  // colinear

    return (val > 0)? 1: 2; // clock or counterclock wise

}



// Prints convex hull of a set of n points.

void convexHull(pair<int,int> points[], int n)

{

    // There must be at least 3 points

    if (n < 3) return;



    // Initialize Result

    vector<pair<int,int>> hull;



    // Find the leftmost point

    int l = 0;

    for (int i = 1; i < n; i++)

        if (points[i].first < points[l].first)

            l = i;



    // Start from leftmost point, keep moving counterclockwise

    // until reach the start point again.  This loop runs O(h)

    // times where h is number of points in result or output.

    int p = l, q;

    do

    {

        // Add current point to result

        hull.push_back(points[p]);



        // Search for a point 'q' such that orientation(p, x,

        // q) is counterclockwise for all points 'x'. The idea

        // is to keep track of last visited most counterclock-

        // wise point in q. If any point 'i' is more counterclock-

        // wise than q, then update q.

        q = (p+1)%n;

        for (int i = 0; i < n; i++)

        {

           // If i is more counterclockwise than current q, then

           // update q

           if (orientation(points[p], points[i], points[q]) == 2)

               q = i;

        }



        // Now q is the most counterclockwise with respect to p

        // Set p as q for next iteration, so that q is added to

        // result 'hull'

        p = q;



    } while (p != l);  // While we don't come to first point



    // Print Result

    sort(hull.begin(),hull.end());

    for (int i = 0; i < hull.size()-1; i++)

 {



     cout << hull[i].first << " "

              << hull[i].second <<", ";}



 cout << hull[hull.size()-1].first << " "

              << hull[hull.size()-1].second ;

}



// Driver program to test above functions

int main()

{

    int n;

    cin>>n;

    pair<int,int> p[n];int w,r;

    for(int i=0;i<n;i++){

        cin>>w>>r;

        p[i].first=w;

        p[i].second=r;

    }

    convexHull(p, n);

    return 0;

}
