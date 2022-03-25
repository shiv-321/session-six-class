package day21;

public class Adapter {
    private ItemClickListener itemClickListener;

    public Adapter(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
    public void onButtonClicked(){
        System.out.println("On button clicked");
        this.itemClickListener.onItemClicked(0);
    }

    interface ItemClickListener{
        void onItemClicked(int position);
    }
}
