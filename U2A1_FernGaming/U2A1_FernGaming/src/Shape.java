/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Niegel
 */
import java.util.ArrayList; // import the ArrayList class

public abstract class Shape {
        protected double unitPrice;
        protected ArrayList<Double> dimensionList = new ArrayList<Double>();
        public abstract String getType();

        public abstract double calculateArea();

        public double calculateCost() {
            return calculateArea() * unitPrice;
        }

        public ArrayList<Double> getDimensionList() {
            return dimensionList;
        }

        public void setDimensionList(ArrayList<Double> dimensionList) {
            this.dimensionList = dimensionList;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }
    }
    
    
    
    

    class Rectangle extends Shape {
        @Override
        public double calculateArea() {
            // Assuming dimensions are length and width
            if (dimensionList.size() >= 2) {
                double length = dimensionList.get(0);
                double width = dimensionList.get(1);
                return length * width;
            } else {
                return 0.0; // Handle insufficient dimensions
            }
        }
        @Override
        public String getType() {
            return "Rectangle";
        }
   }

    class Parallelogram extends Shape {
       @Override
       public double calculateArea() {
           // Assuming dimensions are base and height
           if (dimensionList.size() >= 2) {
               double base = dimensionList.get(0);
               double height = dimensionList.get(1);
               return base * height;
           } else {
               return 0.0; // Handle insufficient dimensions
           }
       }
        @Override
        public String getType() {
            return "Parallelogram";
        }
   }

    class Triangle extends Shape {
        @Override
        public double calculateArea() {
            // Assuming dimensions are base and height
            if (dimensionList.size() >= 2) {
                double base = dimensionList.get(0);
                double height = dimensionList.get(1);
                return 0.5 * base * height;
            } else {
                return 0.0; // Handle insufficient dimensions
            }
        }
        @Override
        public String getType() {
            return "Triangle";
        }
}

    class Circle extends Shape {
        @Override
        public double calculateArea() {
            // Assuming dimension is radius
            if (dimensionList.size() >= 1) {
                double radius = dimensionList.get(0);
                return Math.PI * radius * radius;
            } else {
                return 0.0; // Handle insufficient dimensions
            }
        }
        @Override
        public String getType() {
            return "Circle";
        }
}

    class Donut extends Shape {
        private double innerRadius;

        public void setInnerRadius(double innerRadius) {
            this.innerRadius = innerRadius;
    }

    @Override
    public double calculateArea() {
        // Assuming dimensions are outer radius and inner radius
        if (dimensionList.size() >= 2) {
            double outerRadius = dimensionList.get(0);
            return Math.PI * (outerRadius * outerRadius - innerRadius * innerRadius);
        } else {
            return 0.0; // Handle insufficient dimensions
        }
    }
        @Override
        public String getType() {
            return "Donut";
        }
}
