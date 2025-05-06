class FirstException extends Exception{}
class SubFirstException extends FirstException{}
class SecondException extends RuntimeException{}

public class Main{
    public static void main(String[]args){
        try{
            execute(5%2);
        }catch(SubFirstException | SecondException e){
            System.out.println("SubFirst | Second");
        }catch (FirstException e){
            System.out.println("First");
        } catch (Exception e){
            System.out.println("Ex");
        }
    }

    public static void execute(int value) throws Exception{
        switch (value) {
            case 1 -> throw new FirstException();
            case 2 -> throw new SubFirstException();
            case 3 -> throw new SecondException();
            default-> throw new RuntimeException();
        }
    }
}