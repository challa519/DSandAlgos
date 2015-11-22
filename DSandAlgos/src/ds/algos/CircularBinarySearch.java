package ds.algos;

public class CircularBinarySearch {
	
	public static int search(int a[], int left, int right, int x) {
		int mid = (left + right) / 2;
		if (x == a[mid]) { // Found element
			return mid;
		}
		if (right < left) {
			return -1;
		}
		
		/* While there may be an inflection point due to the rotation, either the left or 
		 * right half must be normally ordered.  We can look at the normally ordered half
		 * to make a determination as to which half we should search. 
		 */
		if (a[left] < a[mid]) { // Left is normally ordered.
			if (x >= a[left] && x <= a[mid]) { //
				return search(a, left, mid - 1, x);
			} else {
				return search(a, mid + 1, right, x);
			}
		} else if (a[mid] < a[left]) { // Right is normally ordered.
			if (x >= a[mid] && x <= a[right]) {
				return search(a, mid + 1, right, x);
			} else {
				return search(a, left, mid - 1, x);
			}				
		} else if (a[left] == a[mid]) { // Left is either all repeats OR loops around (with the right half being all dups)
			if (a[mid] != a[right]) { // If right half is different, search there
				return search(a, mid + 1, right, x);
			} else { // Else, we have to search both halves
				int result = search(a, left, mid - 1, x); 
				if (result == -1) {
					return search(a, mid + 1, right, x); 
				} else {
					return result;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 9, 12, 17, 2, 4, 5 };

		System.out.println(search(a, 0, a.length - 1, 12));
		System.out.println(search(a, 0, a.length - 1, 4));
		
	}
	
	public int binarySearch(int a[],int low,int high, int search){
		int mid=(low+high)/2;
		if (a[mid]==search) return mid;
		if(search<a[mid])
			binarySearch(a,low,mid-1,search);
		else
			binarySearch(a,mid+1,high,search);

		return -1;
	}
	
	
	
}