package level01;

public class GetMean {
    public double GetMean(int[] arr) {
        double answer = 0;

        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        answer = answer/arr.length;
        return answer;
    }

    public static void main(String[] args) {
        GetMean gm = new GetMean();
        int[] arr = {1,2,3,4};
        System.out.println(gm.GetMean(arr));
    }

}
