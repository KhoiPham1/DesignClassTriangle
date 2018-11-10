public class Triangle extends Shape {
    private String color;
    public Triangle(){}

    public Triangle(double side1,double side2, double side3,String color ){
        super(side1,side2,side3);
        this.color=color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public double getP(){
        return getPerimeter()/2;
    }

    public double getArea(){
        return Math.sqrt(getP()*(getP()-side1)*(getP()-side2)*(getP()-side3));
    }

    @Override
    public String toString(){
        return "Side1: "+getSide1()
                +" Side2: "+getSide2()
                +" Side3: "+ getSide3()
                +" Color: "+getColor()
                +" Perimeter: "+getPerimeter()
                +" Area: "+ getArea();
    }



}
