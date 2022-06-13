package AsociacionYComposicion;

public class Main {
    public static void main(String[] args) {

        SmarthPhone smarthPhone = new SmarthPhone("Redmi Note 9",6000, "Xiaomi");

        Chip chip = new Chip("Entel",962528364);
        Chip chip1 = new Chip("Bitel", 971293618);

        smarthPhone.agregarChip(chip);
        smarthPhone.agregarChip(chip1);

        smarthPhone.mostrar();

    }
}
