public class Main{
    public static void main(String[]args){
        int total = 0 ;
        a: for(int i = 0; i < 5; i++){
            b:for(int j = 0 ; j < 5; j++){
                if(i % 2 == 0) continue a;
                if(3 < j) break b;
                total += j;
            }
        }
        System.out.println(total);
    }
}

//いよいよ、明後日試験です！まるで受験生のようです！
//徹夜が予想されますが、再受験無料なので気負わず行きたいと思います！