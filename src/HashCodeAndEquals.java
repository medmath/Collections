import java.util.*;

public class HashCodeAndEquals {





    public static class Player implements Comparable<Player>{
        private String name;
        private int ID;

        public Player(String name, int ID) {
            this.name = name;
            this.ID=ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }


        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", ID=" + ID +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Player player = (Player) o;
            return ID == player.ID &&
                    name.equals(player.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, ID);
        }

     @Override
     public int compareTo(Player o) {
//         if(this.ID>o.ID)
//             return 1;
//         else if(this.ID<o.ID)
//             return -1;
//
//
//            return 0;

         //if(this.name.compareTo(o.name))
             return this.name.compareTo(o.name);

     }
 }


    public static void main(String[] args) {

Player player1= new Player("Tevfik",10);
Player player2= new Player("Hasan",15);
Player player3= new Player("Tevfk",10);

        Set<Player> hashSet= new HashSet<>();
        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);

        for (Player p:hashSet
             ) {
            System.out.println( p.toString());
        }

        System.out.println(player1.hashCode());
        System.out.println(player2.hashCode());
        System.out.println(player3.hashCode());
        System.out.println(player1.hashCode());

        System.out.println(player1.equals(player1));

        List<Player> ls= new ArrayList<>();
        ls.add(new Player("Oguz",21));
        ls.add(new Player("Ferdi",22));
        ls.add(player2);
        Collections.sort(ls);
        System.out.println(ls.toString());

    }






}
