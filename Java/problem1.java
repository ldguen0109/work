class problem1{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        num1 = num2 = num3;  // 대입연산자 = 의 결합방향은 <- 이므로 num1,num2,num3 = 30이 된다.
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("num3 : " + num3);

    }
}