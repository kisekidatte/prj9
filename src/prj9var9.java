public class prj9var9 {
    public static void main(String[] args) {
        Room room = new Room();
        Sofa Sofa1 = new Sofa("Backseda", 12000);
        room.addf(Sofa1);
        room.addf(new Sofa("Friheten", 20000));
        Closet Closet1 = new Closet("Hauga", 19999);
        room.addf(Closet1);
        room.printRoom();
        System.out.println("Количество диванов= " + room.countSofa() + " Количество шкафов= " + room.countCloset());
    }
}