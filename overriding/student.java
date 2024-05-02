package overriding;

public class student extends person {
      String nim;

    public String getNim()
    {
        return nim;
    }

    public void identity()
    {
        System.out.println("NIM :" +getNim());
    }
}

