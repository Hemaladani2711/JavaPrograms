public class SubtractProductAndSum {
    public int result(int n){
        return productOfDigits(n) - sumOfDigits(n);
    }
    public int productOfDigits(int n){
        int product=1;
        while(n>0){
            product *= n/10;
            System.out.println(""+product);
        }
        return product;
    }
    public int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum += n/10;
            System.out.println(""+sum);

        }
        return sum;
    }
}
