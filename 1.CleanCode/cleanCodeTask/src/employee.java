public class employee
{
    String a;
    Integer b;

    Integer salary()
    {
        return b;
    }

    Integer timeoffbalance(String type)
    {
        int s;
        if (type.equals("NORMAL"))
        {
            s = 200;
            // ....
        }
        else if (type.equals("CUSTOM"))
        {
            s = 300;
            // ....
        }
        else
        {
            s = 400;
            // ....
        }
        return s;
    }

    void printbalance()
    {
        System.out.println(timeoffbalance(a));
    }

}
