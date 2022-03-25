package day21;

public class CustomInterfacePractice implements Adapter.ItemClickListener {

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new CustomInterfacePractice());
        adapter.onButtonClicked();
    }

    @Override
    public void onItemClicked(int position) {
        System.out.println("On item clicked " + position);

    }
}
