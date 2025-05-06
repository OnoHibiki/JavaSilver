public class Main {
    public static void main(String[]args){
        try {
            FirstException ex;
            // insert
            throw ex;
        } catch(FirstException ex){}
    }
}

class FirstException extends RuntimeException{
    FirstException(){}
    FirstException(Throwable cause){super(cause);}
    FirstException(String message){super(message);}
}
class SecondException extends FirstException{
    SecondException(Throwable cause){super(cause);}
}