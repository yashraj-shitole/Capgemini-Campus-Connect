public class AreaOfShapes{

    public static void main(String[] args) {
        

        float print=0;

        // AreaOfCircle circle= new AreaOfCircle();
        // print=(float)circle.area(2);

        // AreaOfRectangle rectangle=new AreaOfRectangle();
        // print=(float)rectangle.area(2, 4);


        // AreaOfSquare square=new AreaOfSquare();
        // print=(float)square.area(5);

        // AreaOfTriangle triangle= new AreaOfTriangle();
        // print=(float)triangle.area(4f, 9.8f);


        System.out.println("AREA = "+print);
    }



}


class AreaOfCircle{

    float area(float radius){
        return 3.14159265359f*radius*radius;
    }
}

class AreaOfSquare{

    float area(float side){
        return side*side;
    }
}

class AreaOfRectangle{

    float area(float length, float width){
        return length*width;
    }
}

class AreaOfTriangle{

    float area(float base, float height){
        return (base*height)/2;
    }
}