import java.io.*;
class Dog implements Serializable
{
    int i;
    int j;
    Dog(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}
public class SerialiseDemo {
    public static  void main(String[] args)throws Exception {
        Dog d1= new Dog(10,20);
        //The following three lines preform serialization
        //Writes the binary data to the file
        FileOutputStream fos=new FileOutputStream("myfile.txt");
        //converts the object to binary data
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        FileInputStream fis = new FileInputStream("myfile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();

        System.out.println(d2.i+"----------------"+d2.j);
    }
}
