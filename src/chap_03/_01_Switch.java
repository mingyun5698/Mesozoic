package chap_03;

public class _01_Switch {

	public static void main(String[] args) {
        int x = 1;
        x++;

        { // start of block
             int y = 2;
             y++;
             x++;
        } // end of block
        x++;
      // y++; out of scope
   }

}