public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.addLast(new String("Полина"));
        linkedList.addLast(new String("Критсина"));
        linkedList.addLast(new String("Вика"));
        linkedList.addLast(new String("Марина"));
        linkedList.addLast(new String("Ксюша"));
        System.out.println(linkedList.getSize());
//        linkedList.add(1, 1);
//        System.out.println(linkedList.getSize());
        System.out.println(linkedList.getLastNode());
        linkedList.removeLast();
        System.out.println(linkedList.getLastNode());
//        System.out.println(linkedList.getElementByIndex(1));
    }


}
