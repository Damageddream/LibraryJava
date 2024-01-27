package exercises.localclasses;

public class SortableApp {
    public static void main(String[] args) {
        int [] tab = {2, 30 ,500, -20, 2};
        Sortable sort = new Sortable(){

            @Override
            public void sortable(int[] tab) {
                if(tab == null){
                    throw new NullPointerException();
                }
                if(tab.length == 0){
                    throw new IllegalArgumentException("Tablica mus miec conajmniej 1 liczbę");
                }
                for (int i = 0; i < tab.length-1; i++) {
                    for (int j = 0; j < tab.length-1; j++) {
                        if(tab[j] > tab[j+1]){
                            int temp = tab[j];
                            tab[j] = tab[j+1];
                            tab[j+1] = temp;
                        }
                    }
                }
            }

        };
    sort.sortable(tab);
        for (int i : tab) {
            System.out.println(i);
        }
    }

}
