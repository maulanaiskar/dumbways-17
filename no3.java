public class no3 {
    public static void main(String[] args) {
        drawline("Dumbways");
        drawline("Cool");
    }

    public static void drawline(String kalimat){
        for (int i = 0; i < kalimat.length(); i++) {
            for (int j = 0; j < kalimat.length(); j++) {
                if (i==j){
                    System.out.print(kalimat.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
