// By RRS Creations 
public class LoveProposal implements Runnable {
    
    public void run() {
       char[][] data={
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,39,32,46,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,39,32,32,46,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,32,46,58,58,44,32,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,46,32,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,64,64,64,64,64,64,64,64,58,58,58,58,58,58,58,58,58,58,58,64,64,64,64,64,64,64,64,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,46,32,58,58,58,39,32,58,58,58,58,64,64,64,64,64,32,46,32,32,32,32,32,64,64,64,64,64,58,58,58,58,58,64,64,64,64,64,32,32,32,46,32,32,32,64,64,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,44,32,39,46,58,58,58,58,58,64,64,64,46,32,32,32,32,32,32,32,46,32,32,32,32,32,64,64,64,58,64,64,64,32,32,32,46,32,32,32,32,32,32,32,46,32,32,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,39,32,46,58,58,58,58,58,58,58,64,64,64,32,32,32,46,32,32,32,46,32,32,32,46,32,32,32,46,32,32,64,46,32,32,32,46,32,32,32,46,32,32,32,46,32,32,32,46,32,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,32,46,32,46,32,46,32,32,32,46,32,46,32,46,32,32,32,46,32,46,32,46,32,32,32,46,32,46,32,46,32,32,32,46,32,46,32,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,32,46,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,32,46,32,46,32,58,32,46,32,46,32,58,32,42,42,42,42,58,32,46,42,42,42,42,32,46,32,46,32,58,32,46,32,46,32,58,32,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,32,58,32,46,46,46,32,58,32,46,46,42,42,32,32,32,32,42,32,32,32,32,42,42,32,58,32,46,46,46,32,58,32,46,46,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,46,32,46,58,46,32,46,58,46,32,42,42,32,32,32,32,32,32,32,32,32,42,42,58,46,32,46,58,46,32,46,58,46,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,58,46,46,46,58,46,46,46,58,46,42,42,32,32,32,32,32,32,32,42,42,46,46,46,58,46,46,46,58,46,46,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,64,58,46,58,46,58,46,58,46,58,42,42,32,32,32,42,42,58,46,58,46,58,46,58,46,58,64,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,32,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,64,58,58,58,46,58,58,58,46,58,42,58,46,58,58,58,46,58,58,58,64,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,46,32,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,64,124,58,46,58,124,58,46,58,124,58,46,58,124,64,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,32,58,58,58,58,46,32,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,64,124,58,124,58,124,58,124,64,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,32,58,58,58,58,46,32,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,64,33,124,33,64,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,32,58,58,58,58,58,32,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,64,33,64,64,58,58,58,58,58,58,58,58,58,58,58,58,58,58,39,32,96,58,58,58,58,32,58,58,58,58,58,32,58,58,58,58,58,32,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,64,58,58,58,58,58,58,58,58,58,58,58,58,32,58,58,58,32,46,58,46,96,58,58,58,32,58,58,58,58,58,32,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,46,32,96,58,58,32,58,58,58,32,58,58,58,46,32,58,58,58,32,58,58,58,32,32,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,46,32,96,32,58,58,58,32,58,58,58,58,58,32,58,58,58,46,32,32,46,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,32,58,58,58,46,32,58,58,58,58,32,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,32,58,58,58,58,58,46,96,39,39,46,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,32,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,32,32,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58}
 };
	// PURPLE LOVE
       for(int i=0;i<data.length;i++){
           try {
              
             for(int x=0;x<data[i].length;x++){               
                     Thread.sleep(8);
                     System.out.print(ConsoleColors.PURPLE_BOLD +data[i][x]+ConsoleColors.RESET);
             }
               System.out.println();
           
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
	   System.out.println(ConsoleColors.CYAN_BOLD +"                                YOUR SMILE "+ConsoleColors.RESET);
	   //YELLOW
	   for(int i=0;i<data.length;i++){
           try {
              
             for(int x=0;x<data[i].length;x++){               
                     Thread.sleep(7);
                     System.out.print(ConsoleColors.YELLOW_BOLD +data[i][x]+ConsoleColors.RESET);
             }
               System.out.println();
           
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
	   System.out.println(ConsoleColors.WHITE_BOLD +"                                YOUR EYES "+ConsoleColors.RESET);
	   //RED LOVE
	   for(int i=0;i<data.length;i++){
           try {
              
             for(int x=0;x<data[i].length;x++){               
                     Thread.sleep(6);
                     System.out.print(ConsoleColors.RED_BOLD +data[i][x]+ConsoleColors.RESET);
             }
               System.out.println();
           
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
	   System.out.println(ConsoleColors.PURPLE_BOLD +"                                YOUR HAIR "+ConsoleColors.RESET);
	   //GREEN LOVE
	   for(int i=0;i<data.length;i++){
           try {
              
             for(int x=0;x<data[i].length;x++){               
                     Thread.sleep(5);
                     System.out.print(ConsoleColors.GREEN_BOLD +data[i][x]+ConsoleColors.RESET);
             }
               System.out.println();
           
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
	   System.out.println(ConsoleColors.BLUE_BOLD +"                                THE WAY YOU BREATHE"+ConsoleColors.RESET);
	   // WHITE LOVE
	   for(int i=0;i<data.length;i++){
           try {
              
             for(int x=0;x<data[i].length;x++){               
                     Thread.sleep(4);
                     System.out.print(ConsoleColors.WHITE_BOLD +data[i][x]+ConsoleColors.RESET);
             }
               System.out.println();
           
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
	   System.out.println(ConsoleColors.GREEN_BOLD +"                                THE WAY YOU LOOK "+ConsoleColors.RESET);
	   // CYAN LOVE
	   for(int i=0;i<data.length;i++){
           try {
              
             for(int x=0;x<data[i].length;x++){               
                     Thread.sleep(3);
                     System.out.print(ConsoleColors.CYAN_BOLD +data[i][x]+ConsoleColors.RESET);
             }
               System.out.println();
           
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
	   System.out.println(ConsoleColors.YELLOW_BOLD +"FINALLY I WANT YOU TO LIVE WITH ME FOREVER AND I PROMISE, THE DAY I WILL GO ON \nKNEES FOR ANOTHER GIRL... IS THE DAY I WILL TIE A SHOE LACE FOR OUR DAUGHTER. !!! "+ConsoleColors.RESET);
    }
    public static void main(String[] RRSCreations) {
        new Thread(new LoveProposal()).start();       
    }
}



//Colors Class
class ConsoleColors {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
}
