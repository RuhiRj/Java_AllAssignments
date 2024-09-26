package assignment7;

public class Distance {
    int km;
    int m;
    int cm;
    void setDistance(int km,int m,int cm){
        this.km=km;
        this.m=m;
        this.cm=cm;
    }
    void showDistance(){
        System.out.println("distance km is = " +km);
        System.out.println("distance m is = " +m);
        System.out.println("distance cm is = " +cm);
    }
     Distance addTwoDistance(Distance d){
        Distance temp=new Distance();
        temp.cm=cm+d.cm;
         temp.m= temp.cm/100+m+d.m;
         temp.cm=temp.cm%100;
        temp.km= temp.m/1000+km+d.km;
        temp.m = temp.m%1000;
        return temp;
    }
}
class DistanceMain{
    public static void main(String[] args){
        Distance d1=new Distance();
        Distance d2=new Distance();
        Distance d3=new Distance();
        d2.setDistance(23,55,67);
        d1.setDistance(23,45,233);
        d1.showDistance();
        d3=d1.addTwoDistance(d2);
        d3.showDistance();
    }
}
