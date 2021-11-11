class problem05_6_2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while(num >0){
            if(num%2==0){
                num++;
                continue;
            }
                
            sum += num;
            if(sum>1000){
                System.out.println(num);
                System.out.println(sum);
                break;
            }
            num++;
        }
    }    
}
    