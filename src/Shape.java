class Shape
{
    void Draw()
    {
        System.out.println("Drawing a shape");
    }
}


class Circle extends Shape
{
    @Override
    void Draw()
    {
        System.out.println("Drawing a circle");
    }
}


class Rectangle extends Shape
{
    @Override
    void Draw()
    {
        System.out.println("Drawing a rectangle");
    }
}