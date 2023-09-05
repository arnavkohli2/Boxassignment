public class Box
{

    private int side;


    public Box(int side)
    {
        this.side = side;
    }


    public int calculateArea()
    {
        return 6 * side * side;
    }

    public int calculateVolume()
    {
        return side * side * side;
    }
}


