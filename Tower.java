public class Tower {


    static void hanoi_tower(int cout, char start, char middle, char end){
        if (cout == 1){
            System.out.printf("%d from %S to %S\n", cout, start, end);
            return;
        }
        hanoi_tower(cout-1, start, end, middle);
        System.out.printf("%d from %S to %S\n", cout, start, end);
        hanoi_tower(cout-1, middle, start, end);
    }


    public static void main(String[] args) {
        int cout = 3;
        hanoi_tower(cout, 'A', 'B', 'C');
    }
}