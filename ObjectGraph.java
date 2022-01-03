import java.io.*;
class DogGraph implements Serializable {
    CatGraph c= new CatGraph();
}
class CatGraph implements Serializable {
    RatGraph r = new RatGraph();
}
class RatGraph implements  Serializable{
   transient int i=20;

}
public class ObjectGraph {
    public static void main(String[] args) throws Exception {
        DogGraph d= new DogGraph();
        FileOutputStream fos= new FileOutputStream("ObjGraph.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(d);
        FileInputStream fis=new FileInputStream("ObjGraph.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogGraph d2 =(DogGraph) ois.readObject();
        System.out.println(d2.c.r.i);


    }
}
