class problem5 { 
    public static void main(String[] args) {
        double n1 = ((25 + 5) + (36 / 4) -72) * 5;
        double n2 = ((25 * 5) + (36 - 4) + 71) / 4;
        double n3 = (128 / 4) * 2;
   
        boolean result = n1 > n2 && n2 > n3;
        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);
        System.out.println("n3 : " + n3);
        System.out.println("result : " + result);
    }    
}
