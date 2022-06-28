public class ManagerAfisha {
    private AfishaRepository repository;
    private int countOfItems;

    public ManagerAfisha() {
        this.countOfItems = 10;

    }

    public ManagerAfisha(int amount) {
        this.countOfItems = amount;
    }

    public void add(AfishaItems item) {
        repository.save(item);
    }

    public AfishaItems[] managerGetItems() {
         return repository.getItems();
    }

    public AfishaItems[] managerFindAll() {
       return  repository.findAll();
    }

    public AfishaItems[] findLast() {
        AfishaItems[] tmp = repository.getItems();
        int lengthNewArray;
        lengthNewArray = Math.min(tmp.length, this.countOfItems);
        AfishaItems[] countOfLast = new AfishaItems[lengthNewArray];
        for (int i = 0; i < countOfLast.length; i++) {
            countOfLast[i] = tmp[tmp.length - 1 - i];
        }
        return countOfLast;
    }
}