import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;

    public RandomListFacade(ListFilter listFilter, ListPrinter listPrinter, RandomList randomList) {
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomList = randomList;
    }

    public void printRandomEvenList(){
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
        this.randomList = new RandomList();
        System.out.println("List ban đầu:");
        List<Integer> list = this.randomList.generateList(20,0,100);
        this.listPrinter.printList(list);
        System.out.println("List sau khi lọc:");
        List<Integer> list1 = this.listFilter.filterOdd(list);
        this.listPrinter.printList(list1);
    }
}
