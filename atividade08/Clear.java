public class Clear {

    public static void clearConsole(){
        try {
            String so = System.getProperty("os.name");

            if (so.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("cls");
            }
        } catch (Exception e) {
            
        }
    }
}  
