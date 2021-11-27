package DEVJ110;



public class Main {
    public static void main(String[] args) throws CloneNotSupportedException  {
        try {
            User origin =new User(15,"Миха",false);
            User orig = new User(10,"Андрей",true);
            System.out.println(origin);
            User copy=(User) origin.clone();
            System.out.println(copy);
            System.out.println(orig);

            System.out.println(copy.hashCode() );
            System.out.println(origin.hashCode() );
            System.out.println(orig.hashCode() );
            System.out.println(origin.equals(copy)
            );

        } catch (UserException1 e) {
            e.printStackTrace();
        }

    }


    }






