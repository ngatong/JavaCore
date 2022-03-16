public class BTVN169 {
    public static int  timso(int []a){
        int i, min=a[0];
        for (i=0;i<a.length;i++)
        {
            if (a[i]%2!=0 && a[i]<min)
            {
                min=a[i];
            }
        }

        return min;
    }
    public static int max(int []b){
        int i, max=b[0];
        for (i=0;i<b.length;i++)
        {
            if (b[i]>=max)
            {
                max=b[i];
            }
        }

        return max;
    }
public static void inmang(int []arr){
        int i;
    for (i=0;i<arr.length;i++)
    System.out.print(arr[i] +", ");
}
    public static void main(String[] args) {
        int i,j = 0;
        int []a={8,9,4,7,5,3,2,6};
        int []b= new int[6];
        System.out.println("Mảng ban đầu là: ");
        inmang(a);
        System.out.printf("\nSố lẻ nhỏ nhất của mảng là: %d",timso(a));


        while (j < b.length)   {
            for(i=0;i<a.length;i++)    {
                if (a[i] % 2 == 0 && a[i] < timso(a)) {
                    b[j] = a[i];
                    j++;
                }
            }
        }
        System.out.printf("\nSố chẵn lớn nhất nhỏ hơn %d là %d",timso(a),max(b));

    }
}
