public class NullPointerExample {
    public static void main(String[] args) {
        String name = null;
        if (name != null) {
            System.out.println("Chiều dài tên là: " + name.length());
        } else {
            System.out.println("Biến name chưa được khởi tạo!");
        }
    }
}

