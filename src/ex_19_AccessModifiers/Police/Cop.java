package ex_19_AccessModifiers.Police;

public class Cop {
    private int gun;
        String iCard;

        Cop(int bullet)
        {
            this.gun=bullet;
        }

        protected void canIshoot()
        {
            System.out.println("Yes, you can shoot!");
        }


    }


