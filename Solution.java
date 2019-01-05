class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArrays = merge(nums1, nums2);
		      printArray(mergedArrays);
        int mid = (int) mergedArrays.length /2;

        if (mergedArrays.length % 2  == 0){
          System.out.println(mergedArrays[mid]);
          System.out.println(mergedArrays[mid-1]);
            double left = (double)mergedArrays[mid-1];
            double right = (double) mergedArrays[mid];
            return (left + right) / 2.0;

        } else {
          System.out.println(mergedArrays[mid]);
            return mergedArrays[mid];
        }

    }

    public static int[] merge (int[] sorted1, int[] sorted2){

        int c1 = 0;
        int c2 = 0;
        int sum = sorted1.length + sorted2.length;
        int[] merged = new int[sum];
        for (int i  = 0; i< sum; i++){
            if (c1 < sorted1.length && c2 < sorted2.length ){

                if(sorted1[c1] <= sorted2[c2]){
                    merged[i] = sorted1[c1];
                    c1++;
                } else{
                    merged[i] = sorted2[c2];
                    c2++;
                }
            } else if (c1 < sorted1.length && c2 >= sorted2.length ) {
                    merged[i] = sorted1[c1];
                    c1++;
            } else {
                merged[i] = sorted2[c2];
                c2++;

            }
          }
        return merged;
       }

	   public static void printArray(int[] a)  {
		   for (int i = 0; i< a.length; i++){
				System.out.println("["+ i+ "] = " + a[i]);

		   }



	   }
	   public static void main(String[] args){
		   int[] a = {1, 3};
		   int[] b = {2,4};
		   double c = findMedianSortedArrays(a,b);
       System.out.println(c);
	   }

}
