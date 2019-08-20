import java.util.*;

public class Main {
    public static void  swap(List<PokeCard> list,int i,int j){
        PokeCard n = list.get(i);
        PokeCard m = list.get(j);
        list.set(i,m);
        list.set(j,n);
    }
    public static void main(String[] args) {
        List<PokeCard> list = new ArrayList<>(52);

        String[] color = {"红心","黑桃","梅花","方片"};

        for(int i = 0;i < 4;i ++){
            for(int j = 1;j <= 13;j ++){
                PokeCard card = new PokeCard(j,color[i]);
                list.add(card);
            }
        }

        //System.out.println(list);

        Random random = new Random(20190812);

        for(int  i = 51;i > 0;i --){
            int j = random.nextInt(i);
            swap(list,i,j);
        }
        //System.out.println(list);
        ArrayList<PokeCard> A = new ArrayList<>();
        ArrayList<PokeCard> B = new ArrayList<>();
        ArrayList<PokeCard> C = new ArrayList<>();
        for(int i = 0;i < 15;i ++){
            PokeCard card = list.remove(list.size() - 1);
            switch (i % 3){
                case 0:
                    A.add(card);break;
                case 1:
                    B.add(card);break;
                case 2:
                    C.add(card);break;
            }
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);


        PokeCard heartA = new PokeCard(1,"红心");

        for(PokeCard card : A){
            if(card.equals(heartA)){

                System.out.println("包含");
            }
        }
//        if(A.contains(heartA)){
//            System.out.println("包含");
//        }else{
//            System.out.println("不包含");
//        }
        /**
         * 错误写法
         *  for(PokeCard card : A){
         *             if(card.equals(heartA)){
         *                 A.remove(heartA);
         *             }
         *         }
          */

    }
}

