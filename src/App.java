public class App {
    public static void main(String[] args) throws Exception {
        // Bài 4.1. Tính diện tích hihf tròn khi biết bán kính.
        double radius = 5;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Diện tích hình tròn có bán kính %.2f là %.2f\n", radius, area);

        // Bài 4.2. Tính tổng từ 1 đến n
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
           sum += i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);


    }
}
