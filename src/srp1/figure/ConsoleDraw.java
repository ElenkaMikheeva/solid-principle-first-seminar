package srp1.figure;

public class ConsoleDraw {
    public void draw(int side) {
        StringBuilder builder = new StringBuilder();
        builder.append("* ".repeat(Math.max(0, side)));
        System.out.println(builder);
        for (int i = 0; i < side; i++) {
            if (i < side - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < side - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
