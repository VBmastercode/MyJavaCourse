public class Main {

    public static void main (String[] args) {

        try {
            Plant pl = new Plant("rose", "blue", 5);
            System.out.println(pl);
            Plant pl1 = new Plant("Lopuh", "green", 5);
            System.out.println(pl1);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();
        }

        @Override
        public String toString () {
            return "Plant is " + Plant.Type + Plant.Color + "!";
        }

    }

}


