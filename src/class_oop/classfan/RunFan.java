package class_oop.classfan;

public class RunFan {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Fan quat1 = new Fan(SLOW,false,10,"Green");
        Fan quat2 = new Fan(MEDIUM,true,5,"Red");
        System.out.println(quat1.getSpeed() + " "+quat1.getOn() +" "+quat1.getRadius() +" "+quat1.getColor());
        System.out.println(quat2.getSpeed() + " "+quat2.getOn() +" "+quat2.getRadius() +" "+quat2.getColor());
    }
    }
