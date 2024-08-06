public class animal{
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

public class perro extends Animal{
    @override
    public void hacer sonido() {
        System.out.prontln("El perro ladra");
    }
}

public class main {
    public static void main(String^[]args) {
    Animal miAnimal= new Perro();
    miAnimal.hacerSonido();
    }
}