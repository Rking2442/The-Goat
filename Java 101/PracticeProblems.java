public class PracticeProblems {
    static countOccurances [int arr, int n] ( 
int count = 0; 
for (int num : arr)_ { 
    if (num == n) { 
        count += 1; 

    }
})
    
}
static int whooshArray(int[] arr) { 
int[] whoosh = new int[arr.length]; 
int j = 0; 
for (int i = arr.length - 1; i >= 0; i--) { 
    whoosh[j] = arr[i]; 
    j++; 
}
}

static double add(double[][] grid) { 
    double sum = 0; 
    for (int i = 0; i < grid.length; i++) { 
        for (int j = 0; j < grid[i].length; j++) { 
            sum += grid[i][j]; 
            

        } 
        return sum; 
    }

}
public static int fibo(int n) { 
    if (n==0) { 
        return 0; 
    } else if (n==1) { 
        return 1; 
    } else { 
        return fibo(n-1) + fibo(n-2); 

    }
}

