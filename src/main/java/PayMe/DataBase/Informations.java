package PayMe.DataBase;

public class Informations <T> {

    public Integer size = 0;
   public Object[] user = new Object[size];

    public void add(T item) {
        Object[] newValues = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            newValues[i] = user[i];
        }
        newValues[size] = item;
        user = newValues;
        size++;
    }

    public T get(int index) {
        return (T) user[index];
    }

    public void remove(T item){
        Object [] newValues=new Object[size-1];
        int k=0;
        boolean a=true;
        for (int i = 0; i <size; i++) {
            if(user[i].equals(item) && a){
                a=false;
                continue;
            }
            newValues[k++]=user[i];
        }
        user=newValues;
        size--;
    }

    public int getSize(){
        return user.length;
    }

    public void add(long num) {
        Object[] newValues = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            newValues[i] = user[i];
        }
        newValues[size] = num;
        user = newValues;
        size++;
    }
    }
