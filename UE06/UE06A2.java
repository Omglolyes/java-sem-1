package UE06;

public class UE06A2 {
    public static boolean checkNum(int[] nums) {
        if (nums.length > 0 && nums[0] == nums[nums.length - 1])
            return true;
        return false;
    } 

    public static int count(int[] nums, int value) {
        int i = 0;
        for (int x : nums) {
            if (x == value)
                i++;
        }
        return i;
    }
    

    public static void FeldGeneriegren(){
        int feld[][] = new int[8][8];

        for(int zeile = 0; zeile < feld.length; zeile++){
            for (int spalte = 0; spalte < feld[0].length; spalte ++){
                feld[zeile][spalte] = zeile + spalte + 2;
                if(feld[zeile][spalte] < 10)
                    System.out.print("0" + feld[zeile][spalte] + " ");
                else 
                    System.out.print(feld[zeile][spalte] + " ");
            }
            System.out.println("");
        }

    }
    public static void main(String args[]){
        FeldGeneriegren();
    }
}
