class test1{
    public static void main(String[] args) {
        int var1 = 5, var2 = 5;

        // 5 is displayed
        // Then, var1 is increased to 6.
        System.out.println(var1++);

        // var2 is increased to 6
        // Then, var2 is displayed
        for(int i=0;i<5;i++){
        System.out.println(++var2);
        }
    }
}