public class PokeCard {
    int val;
    String color;

    PokeCard(int val,String color){
        this.val = val;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("[%d,%s]",val,color);
    }

    @Override
    public boolean equals(Object obj) {//判断两个对象是否相等的方法
        if(obj == null){
            return false;
        }

        if(!(obj instanceof PokeCard)){
            return false;
        }

        PokeCard other = (PokeCard)obj;

        return this.val == other.val
                && this.color.equals(other.color);
    }
}
